import java.util.Random;


public class Creatore {

    public static Azienda azienda = new Azienda();
    public static Seminatore seminatore = new Seminatore();
    
    public void inizialize(){
        azienda.createFirstGiardiniere();
        // create first plant through seminatore
    }

    public static Giardiniere getGiardiniere(){ 
        if (azienda.noGardeners){
            azienda.createFirstGiardiniere();
        } 
        return getGiardiniere();
    }

    public static Pianta getPianta(boolean p){
        if (seminatore.noSeminatori){
            seminatore.createFirstPianta();
        }
        return getPianta();
    }    
}
