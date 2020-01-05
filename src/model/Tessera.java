package model;

public class Tessera {

    private int ID;
    private String dataInizio;
    private String dataScadenza;

    public Tessera(int ID, String dataInizio, String dataScadenza) {
        this.ID = ID;
        this.dataInizio = dataInizio;
        this.dataScadenza = dataScadenza;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
}
