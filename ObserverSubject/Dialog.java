import java.util.ArrayList;
import java.util.List;

public class Dialog {
    private static final AddrBook book =
    new AddrBook();
    private static final Store st = new Store();
    private static final Persona p1 =*
    new Persona("Oliver", "Stone", "012345", "NY");
    public static void main(String[] args) {
    book.attach(st);
    book.insert(p1);
    }
    }