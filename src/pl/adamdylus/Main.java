package pl.adamdylus;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	    Pracownik pracownik1 = new Pracownik("Adam", "Dylus",4999.0, 'M', 4);
        System.out.println(pracownik1.czyPracujeWDziale(3));
        System.out.println(pracownik1.toString());
        Kadry k = new Kadry();
        for(int i=0; i<101; i++) {
            k.dodajPracownika(pracownik1);
        }
    }
}
