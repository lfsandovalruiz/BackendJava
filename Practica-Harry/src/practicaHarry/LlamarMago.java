package practicaHarry;

public class LlamarMago {
    public static void main(String[] args) {
        HarryPotter harry = new HarryPotter("Gryffindor", "Male", "Harry Potter", "Dementor");
        HermioneGranger hermione = new HermioneGranger("Gryffindor", "Female", "Hermione Granger", "none");
        RonaldWeasley ron = new RonaldWeasley("Gryffindor", "Male", "Ronald Weasley", "Aragog");
        GinevraWeasley ginny = new GinevraWeasley("Gryffindor", "Female", "Ginevra Weasley", "Lord Voldemort");
        NevilleLongbottom neville = new NevilleLongbottom("Gryffindor", "Male", "Neville Longbottom", "Severus Snape");

        System.out.println(harry.printState());
        System.out.println(hermione.printState());
        System.out.println(ron.printState());
        System.out.println(ginny.printState());
        System.out.println(neville.printState());

    }
}
