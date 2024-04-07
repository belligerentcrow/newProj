public class Creatore {

    public static Azienda azienda = new Azienda();
    public static Seminatore seminatore = new Seminatore();
    
    public void inizialize(){
        azienda.createFirstGiardiniere();
        seminatore.getPianta();
    }

    public static Giardiniere getGiardiniere(){ 
        if (azienda.noGardeners){
            azienda.createFirstGiardiniere();
        } 
        return getGiardiniere();
    }

    public static Pianta getPiantaS(String s){
        return seminatore.getPianta(s);
    }

    public static Pianta getPiantaS(){
       return seminatore.getPianta();
    }

    public void exploreAzienda(){
        System.out.println("Exploring my azienda ...\n");
        for(Giardiniere g : azienda.mieiGiardinieri){
            g.curriculum();
        }
        System.out.println("\nExploration over!");
    }

    public void exploreSeminatore(){
        System.out.println("Exoloring my seminatore ...\n");
        for(Pianta p : seminatore.miePiante){
            p.identifica();
        }
        System.out.println("\nExploration over!");
    }

}
