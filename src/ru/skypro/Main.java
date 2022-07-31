package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor(20, 30, 40);
        harryPotter.setStudentName("Гарри Поттер");
        harryPotter.setTransgressionDistance(70);
        harryPotter.setPowerOfMagic(50);

        Gryffindor hermioneGranger = new Gryffindor(40, 20,25);
        hermioneGranger.setStudentName("Гермиона Грейнджер");
        hermioneGranger.setTransgressionDistance(40);
        hermioneGranger.setPowerOfMagic(45);

        Gryffindor ronWeasley = new Gryffindor(35, 20,35);
        ronWeasley.setStudentName("Рон Уизли");
        ronWeasley.setTransgressionDistance(51);
        ronWeasley.setPowerOfMagic(49);

        Slytherin dracoMalfoy = new Slytherin(7, 16, 10, 7, 8);
        dracoMalfoy.setStudentName("Драко Малфой");
        dracoMalfoy.setTransgressionDistance(31);
        dracoMalfoy.setPowerOfMagic(39);

        Slytherin grahamMontagu = new Slytherin( 6, 17, 11, 6, 9);
        grahamMontagu.setStudentName("Грэхэм Монтегю");
        grahamMontagu.setTransgressionDistance(41);
        grahamMontagu.setPowerOfMagic(39);

        Slytherin gregoryGoyle = new Slytherin( 6, 14, 12, 4, 2);
        gregoryGoyle.setStudentName("Грегори Гойл");
        gregoryGoyle.setTransgressionDistance(51);
        gregoryGoyle.setPowerOfMagic(27);

        Hufflepuff zachariasSmith = new Hufflepuff( 6, 13, 7);
        zachariasSmith.setStudentName("Захария Смит");
        zachariasSmith.setTransgressionDistance(21);
        zachariasSmith.setPowerOfMagic(59);

        Hufflepuff cedricDiggory = new Hufflepuff(5, 14,10);
        cedricDiggory.setStudentName("Седрик Диггори");
        cedricDiggory.setTransgressionDistance(51);
        cedricDiggory.setPowerOfMagic(59);

        Hufflepuff justinFinchFletchley = new Hufflepuff( 7, 15, 6);
        justinFinchFletchley.setStudentName("Джастин Финч-Флетчли");
        justinFinchFletchley.setTransgressionDistance(61);
        justinFinchFletchley.setPowerOfMagic(19);

        Ravenclaw zhouChang = new Ravenclaw(8, 12, 20, 10);
        zhouChang.setStudentName("Чжоу Чанг");
        zhouChang.setTransgressionDistance(51);
        zhouChang.setPowerOfMagic(29);

        Ravenclaw padmaPatil = new Ravenclaw(7, 13, 17, 11);
        padmaPatil.setStudentName("Падма Патил");
        padmaPatil.setTransgressionDistance(31);
        padmaPatil.setPowerOfMagic(79);

        Ravenclaw marcusBelby = new Ravenclaw(6, 14, 19, 7);
        marcusBelby.setStudentName("Маркус Белби");
        marcusBelby.setTransgressionDistance(61);
        marcusBelby.setPowerOfMagic(49);

        System.out.println(harryPotter);
        harryPotter.compare(ronWeasley);
        zachariasSmith.compare(cedricDiggory);
        zhouChang.compare(padmaPatil);
        dracoMalfoy.compare(grahamMontagu);
        harryPotter.compareTwo(dracoMalfoy);
    }
}
