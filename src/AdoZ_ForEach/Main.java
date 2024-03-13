package AdoZ_ForEach;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List lista = new LinkedList();

        //Wstawia litery od A do Z
        for (char znak = 'A'; znak <= 'Z'; znak++)
        {
            lista.add(znak); //Dodanie do listy kolejnych liter alfabetu
        }

        System.out.println("Elementy od A do Z");
        lista.forEach(e -> System.out.print(e + ", ")); //Wyrażenie lambda

        Collections.reverse(lista); //odwrócenie listy

        System.out.println();

        System.out.println("Elementy od Z do A");
        lista.forEach(e -> System.out.print(e + ". ")); //Wyrażenie lambda
        
    }
}
