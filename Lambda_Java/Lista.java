package Lambda_Java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Lista {

    public static void main(String args[]){        
        ColecoesParte2();
    }

    public static void ColecoesParte2(){
        Scanner leia = new Scanner(System.in);
        ArrayList<Colecoes> lista = new ArrayList<Colecoes>();
        ArrayList<ColecoesFeminino> listaFeminino = new ArrayList<ColecoesFeminino>();

        char controle = 's';

        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite o teu sexo: ");
            String s = leia.next();
            
            System.out.println("Deseja cadastrar outra pessoa? s ou S para sim! ");
            controle = leia.next().charAt(0);

            if( s.equals("F") || s.equals("f")){
                ColecoesFeminino pf = new ColecoesFeminino(n, s);
                listaFeminino.add(pf);
            }else if(s.equals("M")  || s.equals("m") ){
                Colecoes p = new Colecoes(n, s);
                lista.add(p);
            } else {
                System.out.println("O sexo precisa ser informado corretamente!");
            }

        } while (controle == 's' || controle == 'S');

        //  System.out.println("*** Coleções Feminino SEM LAMBDA ***");
        // for(ColecoesFeminino j: listaFeminino){
        //     System.out.println(j);
        // }
        //  System.out.println("*** Coleções Feminino COM LAMBDA ***");
        // for(ColecoesFeminino j: listaFeminino){
        //     System.out.println(j);
        // }

        Stream<ColecoesFeminino> streamList = listaFeminino.stream()
        .filter(feminino -> feminino.getSexo().equals("f"));
        System.out.println(streamList);    
    }
}

