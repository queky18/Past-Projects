package com.aghweb.prototypestudentfriend.quiz;

/**
 * Created by Adrian on 03.03.2017.
 */

public class Questions {

    public String mQuestions[] = {

            "Cate materii avem semestrul asta?",
            "Ce limbaj ne place sa folosim ?",
            "Polymorphismul este... ",
            "Suprascrierea metodelor trebuie sa aiba acelas tip de return si argumente",
            "Variabilele de tip Object stocheaza..",
            "Cum se numeste termenul prin care ascunzi detaliile unui obiect de alte parti ale obiectului ?",
            "Daca nu e preluezi, care exceptie iti opreste programul din compilare ?",
            "Pentru un program cu numere mari si adaugari si stergeri, ar fi mai bine sa folosim..",
            "Ca si default, ce valoare are o variabila booleana ?",

    };

    private String mChoices[][] = {
            {"null", "2048", "7", "N-avem"},
            {"trupului", "franțuz", "JAVA", "Altă întrebare"},
            {"..o metoda cu implementari diferite", "..fiecare implementare cu metode diferite", "..o implementare cu metode diferite", "..ceva aici, ceva acolo"},
            {"Adevarat", "Fals", "Nu", "6:22"},
            {"Obiecte", "Clase", "Stringuri", "Referinte"},
            {"Polymorphism", "Encapsulation", "Inheritance", "Data Mining"},
            {"Runtime", "Checked", "Both cheched and runtime", "NullPointException"},
            {"ArrayList", "Vector", "LinkedList", "HashSet"},
            {"true", "false", "null", "0"}
    };

    private String mCorrectAnswers[] = {"7", "JAVA", "..o metoda cu implementari diferite", "Adevarat", "Referinte", "Encapsulation", "Checked", "LinkedList", "false"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }





}
