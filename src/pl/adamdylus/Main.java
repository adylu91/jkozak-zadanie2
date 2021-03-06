package pl.adamdylus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	    Pracownik pracownik1 = new Pracownik("Adam", "Dylus",4999.0, 'M', 4);
        System.out.println(pracownik1.czyPracujeWDziale(3));
        System.out.println(pracownik1.toString());
        Kadry k = new Kadry();
        for(int i=0; i<10; i++) {
            k.dodajPracownika(pracownik1);
        }
        k.dodajPracownikaInteraktywnie();
        k.importujZPlikuTekstowego("pracownicy.txt");
        System.out.println("Sredni zarobek: " + k.sredniZarobek());
        System.out.println("Sredni zarobek dla dzia?u: " + k.sredniZarobek(4));
        System.out.println("Wyswietl dzialy:" + k.dajDzialy());
        k.pisz();
        k.zapiszDoPliku();
        k.odczytZPliku();
    }
}
