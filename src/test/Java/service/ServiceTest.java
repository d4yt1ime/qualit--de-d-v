package service;

import data.Voiture;
import org.junit.jupiter.api.Test;
import service.Service;

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
        Voiture v3 = new Voiture("T-Roc", 30000);
        Voiture v4 = new Voiture("T-Roc", 10000);
        Voiture v5 = new Voiture("T-Roc", 5000);
        Voiture v6 = new Voiture("Audi", 1000000);
        s.ajouter(v1);
        s.ajouter(v2);
        assertEquals(80000,s.prix());
        s.ajouter(v3);
        s.ajouter(v4);
        s.ajouter(v5);
        assertEquals(118750,s.prix());
        s.ajouter(v6);
        assertEquals(1105000,s.prix());
    }
}
