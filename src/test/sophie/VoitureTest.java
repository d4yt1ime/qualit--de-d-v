package sophie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoitureTest {
    @Test
    public void testVoiture(){
        Voiture v = new Voiture("T-Roc", 40000);
        assertEquals("T-Roc", v.getMarque());
        assertEquals(40000, v.getPrix());
    }
}
