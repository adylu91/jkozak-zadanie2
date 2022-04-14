package pl.adamdylus;

import java.io.Serializable;

public class Pracownik implements Serializable {
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public Pracownik(String imie, String nazwisko, Double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    public Double getPlaca() {
        return placa;
    }

    public int getDzial() {
        return dzial;
    }

    @Override
    public String toString(){
        return imie + " " + nazwisko + " " + placa + " " + plec + " " + dzial;
    }

    public boolean czyPracujeWDziale(int numerDzialu){
        return numerDzialu == dzial;
    }
}
