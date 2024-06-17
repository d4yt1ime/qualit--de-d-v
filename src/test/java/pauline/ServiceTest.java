package pauline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    @Test
    public void testService() {
        Service s = new Service();
        Voiture v = new Voiture("Volvo",40000);
        s.ajouter(v);
        assertEquals(v,s.getVoitures().get(0));

    }

    @Test
    public void testPrix() {
        Service s = new Service();
        Voiture v1 = new Voiture("Volvo",40000);
        Voiture v2 = new Voiture("Audi",40000);
        Voiture v3 = new Voiture("Mercedes",30000);
        Voiture v4 = new Voiture("BMW",20000);
        Voiture v5 = new Voiture("Porsche",5000);
        Voiture v6 = new Voiture("Ferrari",1000000);

        s.ajouter(v1);
        s.ajouter(v2);
        assertEquals(80000,s.prix());
        s.ajouter(v3);
        s.ajouter(v4);
        s.ajouter(v5);
        assertEquals(128250,s.prix());
        s.ajouter(v6);
        assertEquals(1115000,s.prix());




    }
}
