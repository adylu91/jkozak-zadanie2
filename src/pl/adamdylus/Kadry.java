package pl.adamdylus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kadry {
    private Pracownik[] pracownicy_;
    private int zatrudnienie_;

    public Kadry() {
        this.pracownicy_ = new Pracownik[100];
        this.zatrudnienie_ = this.pracownicy_.length;
    }

    public void dodajPracownika(Pracownik pracownik){
        //sprawdź czy tablica nie jest pełna
        for(int i=0; i<pracownicy_.length; i++){
            if(pracownicy_[i] == null){
                break;
            }else if(i == pracownicy_.length-1 && pracownicy_[i] != null){
                System.out.println("Blad! dodano zbyt wielu pracownikow.");
                return;
            }
        }

        //jeśli nie jest pełna, przejdź do dodania pracownika
        for(int i=0; i<pracownicy_.length; i++){
            if(pracownicy_[i] == null){
                pracownicy_[i] = pracownik;
                System.out.println("Dodano pracownika numer: " + Math.addExact(i,1));
                break;
            }
        }
    }
    public void dodajPracownikaInteraktywnie(){
        String imie;
        String nazwisko;
        double placa;
        char plec;
        int dzial;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie pracownika:");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika:");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj place:");
        placa = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj plec:");
        plec = scanner.nextLine().charAt(0);
        System.out.println("Podaj dzial:");
        dzial = Integer.parseInt(scanner.nextLine());

        dodajPracownika(new Pracownik(imie,nazwisko,placa,plec,dzial));

    }
    public void importujZPlikuTekstowego(String nazwaPliku) throws FileNotFoundException {
        File plik = new File(nazwaPliku);
        Scanner odczyt = new Scanner(plik);
        String[] arr;
        int nextLineInt = 0;

        while(odczyt.hasNextLine()){
            arr = odczyt.nextLine().split(" ");
            dodajPracownika(new Pracownik(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3].charAt(0), Integer.parseInt(arr[4])));
            nextLineInt++;
        }
        System.out.println("Wczytano z pliku: " + nazwaPliku);
    }
}
