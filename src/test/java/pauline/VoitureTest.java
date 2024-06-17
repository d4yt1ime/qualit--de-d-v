package pauline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {

    @Test
    public void testVoiture() {
        Voiture v = new Voiture("Volvo",40000);
        assertEquals("Volvo",v.getMarque());
        assertEquals(40000, v.getPrix());
    }

    @Test
    public void testMarque() {
        Voiture v2 = new Voiture("Porsche", 20000);
        v2.setMarque("Porsche");
        assertEquals("Porsche", v2.getMarque());
    }

    @Test
    public void testPrix() {
        Voiture v = new Voiture("Audi", 1000);
        v.setPrix(1000);
        assertEquals(1000,v.getPrix());
    }
}
