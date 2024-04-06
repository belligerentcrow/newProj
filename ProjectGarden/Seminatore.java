import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Seminatore {
    private static List<Pianta> miePiante = new ArrayList<>(); 
    
    public static Pianta getPianta(boolean p){
        if (p){ 
            int r = new Random().nextInt(2);
            Pianta rosm = new Rosmarino(r);
            miePiante.add(rosm);
            return rosm;
        }else {
            int r = new Random().nextInt(3);
            Pianta al = new Aloe(r);
            miePiante.add(al);
            return al;
        }
    }    
}
