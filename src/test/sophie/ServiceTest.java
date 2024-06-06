package sophie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceTest {

    @Test
    public void testService(){
        Service s = new Service();
        Voiture v = new Voiture("T-Roc", 10);
        s.ajouter(v);
        assertEquals(v,s.getVoiture().get(0));
    }

    @Test
    public void testPrix(){
        Service s = new Service();
        Voiture v1 = new Voiture("T-Roc", 40000);
        Voiture v2 = new Voiture("T-Roc", 40000);
        s.ajouter(v1);
        s.ajouter(v2);
        s.prix();

    }
}
