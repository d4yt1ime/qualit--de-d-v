package sophie;

import java.util.ArrayList;
import java.util.List;

public class Service implements Statistique{

    private ArrayList<Voiture> voitures;
    public Service() {this.voitures = new ArrayList<Voiture>();}

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
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
