package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class SubjectDatabase {

    private List<Subject> subjectList = new ArrayList<>();
    private int subjectCounter = 1;
    public void addSubject(Subject subject){
        subject.setId(subjectCounter);
        subjectList.add(subject);
        subjectCounter++;
    }

    public List<Subject> getActivityList() {
        return subjectList;

    }


    public Subject getSubjectById(Integer id) {
        for (Subject element : subjectList) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    public List<Subject> getSubjectList(String name, Integer ects, String room, String exam) {
        if (name == null && ects == null && room == null && exam == null) {
            return subjectList;
        }
        List<Subject> filteredSubjects = new ArrayList<Subject>();
        for (Subject element : subjectList) {
            if (element.getName().equals(name) && element.getEcts().equals(ects) && element.getRoom().equals(room) && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            } else if (element.getName().equals(name) && ects == null && room == null && exam == null) {
                filteredSubjects.add(element);
            } else if (name == null && element.getEcts().equals(ects) && room == null && exam == null) {
                filteredSubjects.add(element);
            } else if (name == null && ects == null && element.getRoom().equals(room) && exam == null) {
                filteredSubjects.add(element);
            } else if (name == null && ects == null && room == null && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            } else if (element.getName().equals(name) && element.getEcts().equals(ects) && room == null && exam == null) {
                filteredSubjects.add(element);
            } else if (element.getName().equals(name) && element.getEcts().equals(ects) && element.getRoom().equals(room) && exam == null) {
                filteredSubjects.add(element);
            } else if (element.getName().equals(name) && element.getEcts().equals(ects) && room == null && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            } else if (element.getName().equals(name) && ects == null && element.getRoom().equals(room) && exam == null) {
                filteredSubjects.add(element);
            } else if (element.getName().equals(name) && ects == null && room == null && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            } else if (name == null && element.getEcts().equals(ects) && element.getRoom().equals(room) && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            } else if (name == null && element.getEcts().equals(ects) && element.getRoom().equals(room) && exam == null) {
                filteredSubjects.add(element);
            } else if (name == null && element.getEcts().equals(ects) && room == null && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            } else if (name == null && ects == null && element.getRoom().equals(room) && element.getExam().equals(exam)) {
                filteredSubjects.add(element);
            }
        }
            return filteredSubjects;

        }


    public boolean deleteById(Integer id) {
        Subject toDelete = null;
        for (Subject element : subjectList){
            if (element.getId().equals(id)) {
                toDelete = element;
            }
        }
        return subjectList.remove(toDelete);
    }

    public void deleteAll() {
        subjectList.clear();
    }
}
