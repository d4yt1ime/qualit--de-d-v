package sophie;

public class Voiture {
    private String marque;
    private float prix;

    public Voiture(String m, float p){
        this.marque=m;
        this.prix=p;
    }

    public String getMarque(){
        return this.marque;
    }
    public float getPrix(){
        return this.prix;
    }
}
