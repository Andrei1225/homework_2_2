package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int hardWork, int loyalty, int honesty) {
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compare(Hufflepuff student) {
        int powerOneStudent = this.hardWork + this.loyalty + this.getHonesty();
        int powerTwoStudent = student.hardWork + student.loyalty + student.getHonesty();


        if (powerOneStudent > powerTwoStudent) {
            System.out.println("Студент " + this.getStudentName() + " лучший Пуффендуец, чем " + student.getStudentName() + "!");
        } else if (powerOneStudent < powerTwoStudent) {
            System.out.println("Студент " + student.getStudentName() + " лучший Пуффендуец, чем " + this.getStudentName() + "!");
        } else {
            System.out.println("Пуффендуйцы " + this.getStudentName() + " и " + student.getStudentName() + " равны по силе!");
        }
    }

    @Override
    public String toString() {
        return "Студент " +
                getStudentName() +
                ", факультет Пуффендуй" +
                ", колдовство " + getPowerOfMagic() +
                ", трансгрессия " + getTransgressionDistance() +
                ", трудолюбие " + hardWork +
                ", верность " + loyalty +
                ", честность " + honesty;
    }
}
