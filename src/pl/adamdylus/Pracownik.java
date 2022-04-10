package pl.adamdylus;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private Double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, Double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    @Override
    public String toString(){
        System.out.println("Adam");
        return "";
    }

    public boolean czyPracujeWDziale(int numerDzialu){
        return numerDzialu==dzial;
    }
}
