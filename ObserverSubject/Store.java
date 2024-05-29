import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Store implements Observer {
        @Override
        public void update(Subject s, Object o) {
            List<Persona> l = (List<Persona>) o;
            String nom;
            try (FileWriter f = new FileWriter("nomi.txt")) {
                for (Persona p : l) {
                    nom = p.getNome() + "\t" + p.getCognome() +
                    "\t" + p.getTelefono();
                    f.write(nom + "\n");
                }
            } catch (IOException e) { }
        }
    }