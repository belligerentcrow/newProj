import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Azienda {
    public List<Giardiniere> mieiGiardinieri = new ArrayList<>();
    private static String[] names = {"Saro", "Sara", "Samwise", "Lucia", "Alice", "Giovanni", "Giovanna", "Jamie", "John"};
    private int numGiardinieri;
    public boolean noGardeners = true;

    public int getNumGiardinieri(){
        return numGiardinieri;
    }

    public void createFirstGiardiniere(){
        Giardiniere gard = new Giardiniere(generateName());
        noGardeners = false;
        ++numGiardinieri;
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
        ++numGiardinieri;
        return gard; 
    }

    private String generateName(){
        int r = new Random().nextInt(names.length);
        String s = names[r];
        return s;
    }
}
