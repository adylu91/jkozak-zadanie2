package pl.adamdylus;

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
}
