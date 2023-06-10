public class Main {



    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 65, 74, 60, 78, 90);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 95, 88, 54, 61, 72);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 52, 50, 68, 65, 85);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        Metods.printSeparator();
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 63, 74, 86, 44, 79, 45);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 51, 53, 46, 81, 63, 79);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 55, 56, 79, 66, 41, 86);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);
        Metods.printSeparator();
        Рufflepuff zachariahSmith = new Рufflepuff("Zachariah Smith", 51, 44, 78, 56, 40);
        Рufflepuff cedricDiggory = new Рufflepuff("Cedric Diggory", 77, 66, 90, 65, 89);
        Рufflepuff justinFinchFletchley = new Рufflepuff("Justin Finch-Fletchley", 66, 65, 34, 88, 75);
        System.out.println(zachariahSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        Metods.printSeparator();
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 69, 72, 87, 56, 45, 66);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 55, 67, 96, 35, 46, 87);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 56, 78, 64, 32, 56, 58);
        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        Metods.printSeparator();


    }
}