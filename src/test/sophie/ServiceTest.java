package sophie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ServiceTest {

    @Test
    public void testService{
        Service s = new Service();

        Voiture v1 = new Voiture("T-Roc", 10);
        Voiture v2 = new Voiture("T-Roc", 20);
        Voiture v3 = new Voiture("T-Roc", 20);

        s.ajouter(v1);
        s.ajouter(v1);
        s.ajouter(v1);


    }
}
