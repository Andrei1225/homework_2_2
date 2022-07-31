package ru.skypro;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(int nobility, int honor, int courage) {
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void compare(Gryffindor student) {
        int powerOneStudent = this.getCourage() + this.getHonor() + this.getNobility();
        int powerTwoStudent = student.getCourage() + student.getHonor() + student.getNobility();


        if (powerOneStudent > powerTwoStudent) {
            System.out.println("Студент " + this.getStudentName() + " лучший Гриффиндорец, чем " + student.getStudentName() + "!");
        } else if (powerOneStudent < powerTwoStudent) {
            System.out.println("Студент " + student.getStudentName() + " лучший Гриффиндорец, чем " + this.getStudentName() + "!");
        } else {
            System.out.println("Гриффиндорцы " + this.getStudentName() + " и " + student.getStudentName() + " равны по силе!");
        }
    }



    @Override
    public String toString() {
        return "Студент " +
                getStudentName() +
                ", факультет Гриффиндор" +
                ", колдовство " + getPowerOfMagic() +
                ", трансгрессия " + getTransgressionDistance() +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + courage;
    }
}
