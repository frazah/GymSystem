package model;

public class Atleta extends Utente{

    private Tessera tesseraIscrizione;


    public Atleta(int id, String cognome, String nome, String dataNascita, String email, String password, Tessera tessera) {
        super(id, cognome, nome, dataNascita, email, password);
        this.tesseraIscrizione = tessera;
    }

    public Tessera getTesseraIscrizione() {
        return tesseraIscrizione;
    }

    public void setTesseraIscrizione(Tessera tesseraIscrizione) {
        this.tesseraIscrizione = tesseraIscrizione;
    }
}
