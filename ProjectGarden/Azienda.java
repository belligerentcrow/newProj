import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Azienda {
    private static List<Giardiniere> mieiGiardinieri = new ArrayList<>();
    private static String[] names = {"Saro", "Sara", "Samwise", "Lucia", "Alice", "Giovanni", "Giovanna", "Jamie", "John"};
    
    public boolean noGardeners = true;

    public void createFirstGiardiniere(){
        Giardiniere gard = new Giardiniere(generateName());
        noGardeners = false;
        mieiGiardinieri.add(gard);
    }

    public Giardiniere getGiardiniere(){
        Giardiniere gard;
        for(Giardiniere g : mieiGiardinieri){
            if (g.getStatus() == false){
                gard = g;
                return gard;
            }
        }
        gard = new Giardiniere(generateName());
        mieiGiardinieri.add(gard);
        return gard; 
    }

    private String generateName(){
        int r = new Random().nextInt(names.length);
        String s = names[r];
        return s;
    }
}
