package it.develhope;

public class Main {
    public static void main(String[] args) {
        //Creazione dei tre oggetti sottoclasse
        Student student1 = new Student("Riccardo", "Mahdavi", 143262, 2022);
        Professor professor1 = new Professor("Carlo", "Casiglia", 143263, "Java");
        Assistant assistant1 = new Assistant("Marco", "Adornato", 143264, false);

        //goToCollege
        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();

        //Chiamata a varie funzioni override
        //Studente
        student1.studyAtHome();
        //Professore
        professor1.teachToOtherPeople();
        //Assistant
        assistant1.studyAtHome();
        assistant1.teachToOtherPeople();
    }
}