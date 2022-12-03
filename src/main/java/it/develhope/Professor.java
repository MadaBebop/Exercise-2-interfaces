package it.develhope;

public class Professor extends CollegePerson {
    //Variabili
    String teachingSubject;

    //Constructor
    public Professor(String name, String surname, int collegeId, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Insegnando...");
    }

    @Override
    public void studyAtHome() {}
}
