package ProjectStudents;

public class Persona {
    private String nome, co;
    public void setNome(String n, String c){
        nome = n;
        co = c;
    }
    public void printAll(){
        System.out.println(nome + " " + co);
    }
}
