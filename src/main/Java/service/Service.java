package service;

import data.Voiture;

import java.util.ArrayList;

public class Service implements Statistique {

    private ArrayList<Voiture> voitures;
    public Service() {this.voitures = new ArrayList<Voiture>();}

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y a pas de voiture.");
        }

        int prixTotal = 0;
        for (int i=0; i < this.voitures.size(); i++){
            prixTotal += this.voitures.get(i).getPrix();
        }
        int percentage = this.voitures.size()/5;
        int remise = prixTotal*(percentage*5)/100;
        if (remise > 20000){
            remise = 20000;
        }
        return prixTotal-remise;
    }

    public ArrayList getVoiture(){

        return this.voitures;
    }
}
