import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Carro> lista = new ArrayList<Carro>();
        
        lista.add(new Troller());
        lista.add(new Volkswagen());            

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
    }
}
