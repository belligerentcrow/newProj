import java.util.ArrayList;
import java.util.List;

public class Giardiniere {
    private String name;
    private List<Integer> foglieRaccolte = new ArrayList<>(); 
    private boolean occupied = false;
    private List<Pianta> pianteCurate= new ArrayList<>();
    private int numPianteCurateNow = 0;

    public Giardiniere(String n){
        name = n;
    }

    public void curriculum(){
        System.out.println("--start curriculum--");
        System.out.println("name: " + name);
        System.out.println("job: " + occupied);
        System.out.println("piante attualmente in cura: " + numPianteCurateNow);
        System.out.println("Curated Plants: ");
        for(Integer i: foglieRaccolte){
            System.out.println("Leaves of" + foglieRaccolte.indexOf(i)+i);
        }
        System.out.println();
        for(Pianta p : pianteCurate){
            p.identifica();
        }
        System.out.println("--end curriculum--");
    }
    
    public void setOccupation(boolean jobStatus){
        occupied = jobStatus; 
    }

    public boolean getStatus(){
        return occupied;
    }

    public String getName(){
        return name;
    }

    public void startCare(Pianta p){
        if(!pianteCurate.contains(p)){
            ++numPianteCurateNow;
            pianteCurate.add(p);
            setOccupation(true);
            System.out.println("Plant "+ p.getType()+" added to care of" + name + "!");
        }else{
            System.out.println(name + " is already taking care of this "+ p.getType());
        }
    }

    public void stopCare(Pianta p){
        if(pianteCurate.contains(p)){
            --numPianteCurateNow;
            pianteCurate.remove(p);
            setOccupation(false);
            System.out.println(name + " has stopped caring for this " + p.getType());
        }else{
            System.out.println(name + " isn't taking care of this " + p.getType());
        }
    }

    public void innaffiaPianta(double water, Pianta p){
        if(pianteCurate.contains(p)){
            p.getInnaffiato(water);
            System.out.println("Watering "+p.getType()+"...");
        }else{
            startCare(p);
            p.getInnaffiato(water);
            System.out.println("Watering "+p.getType()+"...");
        }
    }

    public void raccogliFoglie(Pianta p, int index, String m){
        foglieRaccolte.set(index, p.cediFoglie(m));
        System.out.println("Gathering from " + p.getType()+ "...");
    }

    public int getFoglie(int index){
        return foglieRaccolte.get(index);
    }
}
