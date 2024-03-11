/*Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> registro = new ArrayList<>();
        registro.add(new Student("Fabrizio", 26));
        registro.add(new Student("Nicola", 30));
        registro.add(new Student("Patrizia", 29));
        System.out.println(registro);
        registro.add(new Student("Alberto", 29));
        registro.add(new Student("Alessandro", 27));
        registro.add(new Student("Valeria", 28));
        registro.add(new Student("Angela", 31));
        System.out.println(registro);
    }
}
