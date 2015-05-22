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

    private String nazwaSektora1 = "Psi sektor nazwa1";
    private String nazwaSektora2 = "Psi sektor nazwa2";
    private String opisSektor1 = "Same dalmatyńczyki";
    private String opisSektor2 = "Same ratlerki";
    private int szerokosc = 10;
    private int dlugosc = 20;

    @Before
    public void setUp() throws Exception {
        pole1 = new Pole("Psie pole", "ul. Internautów 78 09-055 Ameryka");
        pole2 = new Pole("Kocie pole", "ul. Kosmonautów 96 65-585 Azja");
        pole3 = new Pole("Kanarkowe pole", "ul. Astronautów 32 13-131 Afryka");
        
    }

    @Test
    public void testCreateSektor() throws Exception {
        Sektor sek1=Sektor.createSektor(pole1, opisSektor1, opisSektor1, dlugosc, szerokosc);
        Sektor sek2=Sektor.createSektor(pole2, opisSektor1, opisSektor1, dlugosc, szerokosc);
        
        assertTrue(pole1.getSektory().contains(sek1));
        assertTrue(pole2.getSektory().contains(sek2));
    }

    @Test
    public void testRemoveSektor() throws Exception{
        assertEquals(pole1.getSektory().size(), 0);
        
        
        Sektor sek1=Sektor.createSektor(pole1, opisSektor1, opisSektor1, dlugosc, szerokosc);
        assertEquals(1,pole1.getSektory().size() );
        Sektor sek2=Sektor.createSektor(pole2, opisSektor2, opisSektor1, dlugosc, szerokosc);
        assertEquals(1,pole1.getSektory().size() );
        
        pole1.removeSektor(sek1);
        assertEquals(0,pole1.getSektory().size());
    }
   
    
    @Test(expected = Exception.class)
    public void testOneOwner() throws Exception{
        assertEquals(0, pole1.getSektory().size());
        Sektor sek1=Sektor.createSektor(pole1, nazwaSektora1, opisSektor1, dlugosc, szerokosc);
        pole2.addSektor(sek1);
        
 
    }
    
}
