public class Cliente {
    public static Creatore myCreatore = new Creatore();
    public static void main(String[] args) {

        // test all the functionalities of the project -- todo
        System.out.println("hello world");

        myCreatore.inizialize();
        Giardiniere gard1 = myCreatore.azienda.getGiardiniere();
        gard1.startCare(myCreatore.seminatore.getPianta());
        myCreatore.exploreAzienda();
        myCreatore.exploreSeminatore();
    }
}
