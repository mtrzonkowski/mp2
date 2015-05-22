/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mtrzonkowski
 */
public class CompositionAsso {

    private Pole pole1;
    private Pole pole2;
    private Pole pole3;
    String nazwaSektora1 = "Psi sektor nazwa1";
    String nazwaSektora2 = "Psi sektor nazwa2";
    String opisSektor1 = "Same dalmatyńczyki";
    String opisSektor2 = "Same ratlerki";
    int szerokosc = 10;
    int dlugosc = 20;

    @Before
    public void setUp() {
        pole1 = new Pole("Psie pole", "ul. Internautów 78 09-055 Ameryka");
        pole2 = new Pole("Kocie pole", "ul. Kosmonautów 96 65-585 Azja");
        pole3 = new Pole("Kanarkowe pole", "ul. Astronautów 32 13-131 Afryka");
    }

    @Test
    public void testCreateSektor() throws Exception {

        pole1.newSektor(nazwaSektora1, opisSektor1, szerokosc, dlugosc);
        pole2.newSektor(nazwaSektora1, opisSektor1, szerokosc, dlugosc);

        assertTrue(pole1.getSektory().containsKey(nazwaSektora1));
        assertTrue(pole2.getSektory().containsKey(nazwaSektora1));
        assertFalse(pole1.getSektor(nazwaSektora1).equals(pole2.getSektor(nazwaSektora1)));
        assertFalse(pole2.getSektor(nazwaSektora1).equals(pole1.getSektor(nazwaSektora1)));
    }
    @Test
    public void testRemoveSektor() throws Exception{
        assertEquals(pole1.getSektory().size(), 0);
        pole1.newSektor(nazwaSektora2, opisSektor2, szerokosc, dlugosc);
        assertEquals(pole1.getSektory().size(), 1);
        pole1.removeSektor(pole1.getSektor(nazwaSektora2));
        assertEquals(pole1.getSektory().size(), 0);
    }
    
}
