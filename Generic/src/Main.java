import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Troller veiculos = new Troller();
        Volkswagen veiculos1 = new Volkswagen();

        ArrayList<String> lista = new ArrayList<>();

        lista.add(veiculos1.Ecosport());
        lista.add(veiculos.Troller());
        lista.add(veiculos1.Gol());
        

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        // System.out.println(lista.get(2));
    }
}
