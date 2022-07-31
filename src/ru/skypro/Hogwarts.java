package ru.skypro;

public class Hogwarts {
    private String studentName;
    private int powerOfMagic;
    private int transgressionDistance;

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void compareTwo(Hogwarts student) {
        int powerOneStudent = this.getPowerOfMagic() + this.getTransgressionDistance();
        int powerTwoStudent = student.getPowerOfMagic() + student.getTransgressionDistance();

        if (powerOneStudent > powerTwoStudent) {
            System.out.println("Студент " + this.getStudentName() + " обладает большей мощностью магии, чем " + student.getStudentName() + "!");
        } else if (powerOneStudent < powerTwoStudent) {
            System.out.println("Студент " + student.getStudentName() + " обладает большей мощностью магии, чем " + this.getStudentName() + "!");
        } else {
            System.out.println("Студенты " + this.getStudentName() + " и " + student.getStudentName() + " равны по мощности магии!");
        }
    }
}
