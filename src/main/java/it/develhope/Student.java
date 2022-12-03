package it.develhope;

public class Student extends CollegePerson {
    //variables
    int academicYear;

    //Construct
    public Student(String name, String surname, int id, int year) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        academicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Studiando...");
    }
    @Override
    public void teachToOtherPeople(){}
}

