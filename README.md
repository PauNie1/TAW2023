# TAW2023 - Zaliczenie

**Dane do zaliczenia:**
```
 { "name": "Metodologie Obiektowe",
    "ects": 2,
    "room": "216",
    "exam": "tak" }
 { "name": "Testowanie oprogramowania",
    "ects": 1,
    "room": "216",
    "exam": "nie" }
 { "name": "Technologie i aplikacje webowe",
    "ects": 3,
    "room": "208",
    "exam": "nie"}
 { "name": "Zarządzanie projektem informatycznym",
    "ects": 2,
    "room": "216",
    "exam": "nie"}
 { "name": "Zaawansowane technologie bazodanowe",
    "ects": 3,
    "room": "208",
    "exam": "nie"}
 { "name": "Technologie komponentowe i sieciowe",
    "ects": 2,
    "room": "208",
    "exam": "tak"}
```
Scenariusz do wykonania:
1. Wprowadzenie przedmiotów do systemu w podanej kolejności:
- Nazwa: Metodologie obiektowe, ECTS: 2, Sala: 216, Egzamin: tak,
- Nazwa: Testowanie oprogramowania, ECTS: 1, Sala: 216, Egzamin: nie,
- Nazwa: Technologie i aplikacje webowe, ECTS: 3, Sala: 208, Egzamin: nie,
- Nazwa: Zarządzanie projektem informatycznym, ECTS: 2, Sala: 216, Egzamin: nie,
- Nazwa: Zaawansowane technologie bazodanowe, ECTS: 3, Sala: 208, Egzamin: nie,
- Nazwa: Technologie komponentowe i sieciowe, ECTS: 2, Sala: 208, Egzamin: tak
2. Pobranie wszystkich przedmiotów,
3. Pobranie przedmiotów, które mają egzamin,
4. Pobranie przedmiotów, które odbywają się w sali 216,
5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208,
6. Pobranie przedmiotu o identyfikatorze 3,
7. Pobranie przedmiotu o identyfikatorze 15,
8. Usunięcie przedmiotu o identyfikatorze 2,
9. Pobranie wszystkich przedmiotów,
10. Usunięcie wszystkich przedmiotów,
11. Pobranie wszystkich przedmiotów.

** Wykonanie zadania: **


```
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
"nazwa": "programowanie",
"priorytet": 10
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak
