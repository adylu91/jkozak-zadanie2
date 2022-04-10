package pl.adamdylus;

public class Kadry {
    private Pracownik[] pracownicy_;
    private int zatrudnienie_;

    public Kadry() {
        this.pracownicy_ = new Pracownik[100];
        this.zatrudnienie_ = this.pracownicy_.length;
    }
}
