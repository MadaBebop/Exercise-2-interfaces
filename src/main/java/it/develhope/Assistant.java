package it.develhope;

public class Assistant extends CollegePerson {

    //variablili
    boolean isGoingToBeAPhD;

    //Constructor
    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        isGoingToBeAPhD = willBeAPhD;
    }


    @Override
    public void studyAtHome() {
        System.out.println("Studiando!");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Insegno pure!");
    }
}
