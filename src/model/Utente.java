package model;

public class Utente {
    private int id;
    private String cognome;
    private String nome;
    private String dataNascita;
    private String email;
    private String password;

    public Utente(int id, String cognome, String nome, String dataNascita, String email, String password) {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.email = email;
        this.password = password;
    }

    public Utente() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
