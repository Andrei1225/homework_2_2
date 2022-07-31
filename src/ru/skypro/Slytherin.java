package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void compare(Slytherin student) {
        int powerOneStudent = this.getCunning() + this.getDetermination() + this.getAmbition()+
                this.getResourcefulness()+this.getLustForPower();
        int powerTwoStudent = student.getCunning()+ student.getDetermination() +
                student.getAmbition()+student.getResourcefulness()+student.getLustForPower();

        if (powerOneStudent > powerTwoStudent) {
            System.out.println("Студент " + this.getStudentName() + " лучший Слизеринец, чем " + student.getStudentName() + "!");
        } else if (powerOneStudent < powerTwoStudent) {
            System.out.println("Студент " + student.getStudentName() + " лучший Слизеринец, чем " + this.getStudentName() + "!");
        } else {
            System.out.println("Слизеринцы " + this.getStudentName() + " и " + student.getStudentName() + " равны по силе!");
        }
    }

    @Override
    public String toString() {
        return "Студент " +
                getStudentName() +
                ", факультет Слизерин" +
                ", колдовство " + getPowerOfMagic() +
                ", трансгрессия " + getTransgressionDistance() +
                ", хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + lustForPower;
    }
}
