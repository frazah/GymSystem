package model;

import java.util.ArrayList;

public class Trainer extends Utente {

    private ArrayList<Integer> feedback;

    public Trainer(int id, String cognome, String nome, String dataNascita, String email, String password) {
        super(id, cognome, nome, dataNascita, email, password);
        feedback = new ArrayList<Integer>();
    }

    public void inserisciFeedback(int voto){

        feedback.add(voto);

    }

    public void rimuoviFeedback(int indice){
        feedback.remove(indice);
    }

    public ArrayList<Integer> getFeedback() {
        return feedback;
    }

    public void setFeedback(ArrayList<Integer> feedback) {
        this.feedback = feedback;
    }
}
