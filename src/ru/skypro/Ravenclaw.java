package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(int intelligence, int wisdom, int wit, int creativity) {
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compare(Ravenclaw student) {
        int powerOneStudent = this.getIntelligence() + this.getWisdom() + this.getWit()+this.getCreativity();
        int powerTwoStudent = student.getIntelligence()+ student.getWisdom() + student.getWit()+student.getCreativity();


        if (powerOneStudent > powerTwoStudent) {
            System.out.println("Студент " + this.getStudentName() + " лучший Когтевранец, чем " + student.getStudentName() + "!");
        } else if (powerOneStudent < powerTwoStudent) {
            System.out.println("Студент " + student.getStudentName() + " лучший Когтевранец, чем " + this.getStudentName() + "!");
        } else {
            System.out.println("Когтевранцы " + this.getStudentName() + " и " + student.getStudentName() + " равны по силе!");
        }
    }

    @Override
    public String toString() {
        return "Студент " +
                getStudentName() +
                ", факультет Когтевран" +
                ", колдовство " + getPowerOfMagic() +
                ", трансгрессия " + getTransgressionDistance() +
                ", ум " + intelligence +
                ", мудрость " + wisdom +
                ", остроумность " + wit +
                ", творчество " + creativity;
    }
}
