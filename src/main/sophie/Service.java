package sophie;

import java.util.ArrayList;
import java.util.List;

public class Service implements Statistique{
    List<Voiture> voitures = new ArrayList<>();

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y a pas de voiture.");
        }

        int nbDeVoitures = voitures.size();
        float prix = voitures.get(0).getPrix();

        double remise = 0;
        int maxRemise = 20000;
        double prixTotal = nbDeVoitures * prix;

        // Calcul de la remise
        remise = Math.min(maxRemise, prixTotal * 0.05 * (nbDeVoitures / 5));

        // Application de la remise
        prixTotal -= remise;

        return (int) prixTotal;
    }
}
