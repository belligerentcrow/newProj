package Project1;
import java.io.IOException;

public class Client {
    
    public static void main(String[] args){
        Pagamenti p = new Pagamenti();
        try{
            p.leggiFile("csv", "importi");
        } catch (IOException e){}
        p.calcolaSomma();
        p.calcolaMassimo();
    }

}
