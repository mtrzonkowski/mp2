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
    String nazwaSektora1="Psi sektor nazwa1";
    String opisSektor1="Same dalmatyńczyki";
    int szerokosc=10;
    int dlugosc=20;
    
  
    @Before
    public void setUp() {
        pole1=new Pole("Psie pole","ul. Internautów 78 09-055 Ameryka");
        pole2=new Pole("Kocie pole","ul. Kosmonautów 96 65-585 Azja");
        pole3=new Pole("Kanarkowe pole", "ul. Astronautów 32 13-131 Afryka");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test(expected=Exception.class)
     public void testCreateSektor() throws Exception {

         pole1.addSektor(Sektor.createSektor(pole1, nazwaSektora1, opisSektor1, szerokosc, dlugosc));
         pole2.addSektor(pole1.getSektor(nazwaSektora1));

         assertTrue(pole1.getSektory().containsKey(nazwaSektora1));
         assertFalse(pole2.getSektory().containsKey(nazwaSektora1));
     }
}
