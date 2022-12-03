package it.develhope;

abstract class CollegePerson implements TeachingPerson,LearningPerson {
    //Variabili
    String name;
    String surname;
    int collegeId;

    //Metodo
    public void goToCollege(){
       System.out.println("Nome: " + name+ "\tCognome: " + surname + "\tId: " + collegeId);
    }

}

