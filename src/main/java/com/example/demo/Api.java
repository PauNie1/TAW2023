package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api")
public class Api {

    @Autowired
    private SubjectDatabase subjectDatabase;

    @PostMapping(value = "subjects",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewSubject(@RequestBody Subject subject) { subjectDatabase.addSubject(subject); }

    @GetMapping(value = "subjects",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Subject> getSubjects(@Nullable @RequestParam("name") String name,@Nullable @RequestParam("ects") Integer ects,@Nullable @RequestParam("room") String room,@Nullable @RequestParam("exam") String exam) {
        return subjectDatabase.getSubjectList(name, ects, room, exam);
    }
    @GetMapping( value = "subjects/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getSubjectById(@PathVariable("id") Integer id) {
        Subject subject = subjectDatabase.getSubjectById(id);
        if (subject == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(subject);
        }
    }

    @DeleteMapping(value = "subjects/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id)

    { boolean isDelete = subjectDatabase.deleteById(id);
        if (isDelete) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "subjects")
    public void deleteAll() { subjectDatabase.deleteAll();}





}
