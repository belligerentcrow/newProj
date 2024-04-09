import java.util.Random;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seminatore {
    public List<Pianta> miePiante = new ArrayList<>(); 
    private int numPiante;
    private static String[] pianteTipiPossibili = {"Rosmarino", "Aloe"};
    private static List<String> listaPianteTipiPossibili = new ArrayList<>(Arrays.asList(pianteTipiPossibili));
    
    private String generateType(){
        int r = new Random().nextInt(pianteTipiPossibili.length);
        String s = pianteTipiPossibili[r];
        return s;
    }

    public int getNumPiante(){
        return numPiante;
    }

    //select randomly
    public Pianta getPianta(){
        /*try{
        Class<?> cls = Class.forName(generateType());
        Constructor<?> cnstr = cls.getConstructor(new Class[]{});
        Pianta p = (Pianta) cnstr.newInstance();
        miePiante.add(p);
        ++numPiante;
        return p;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e){
            e.printStackTrace();
        }*/ 
        int r = new Random().nextInt(listaPianteTipiPossibili.size());
        Pianta p2 = getPianta(listaPianteTipiPossibili.get(r)); 
        miePiante.add(p2);
        ++numPiante;
        return p2;
    }

    //select a type of plant -- if exists.
    public Pianta getPianta(String p){
        Pianta pl;
        if (listaPianteTipiPossibili.contains(p)){
            try {
            Class<?> clazz = Class.forName(p);
            Constructor<?> cnstr = clazz.getConstructor(new Class[]{});
            pl = (Pianta) cnstr.newInstance();
            miePiante.add(pl);
            ++numPiante;
            return pl;    
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }
            System.out.println("Invalid string name! Returning random plant...");
            return getPianta();
            
    }
}
