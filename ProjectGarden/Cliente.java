public class Cliente {
    public static Creatore myCreatore = new Creatore();
    public static void main(String[] args) {

        // test all the functionalities of the project -- todo
        System.out.println("hello world");
        myCreatore.inizialize();
        Pianta plant1 = myCreatore.getPiantaS();
        Giardiniere gard1 = myCreatore.getGiardiniere();
        gard1.startCare(plant1);
        myCreatore.exploreAzienda();
        myCreatore.exploreSeminatore();
    }
}
