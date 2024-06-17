package data;

import data.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
    public void testVoiture() {
        Voiture v = new Voiture("T-Roc", 40000);
        assertEquals("T-Roc", v.getMarque());
        assertEquals(40000, v.getPrix());
    }
    @Test
    public void testMarque() {
        Voiture v = new Voiture("T-Roc", 40000);
        v.setMarque("T-Roc");
        assertEquals("T-Roc", v.getMarque());
    }
    @Test
    public void testPrix() {
        Voiture v = new Voiture("T-Roc", 40000);
        v.setPrix(5000);
        assertEquals(5000, v.getPrix());}
}
