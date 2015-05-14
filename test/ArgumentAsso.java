/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import mp2.Druzyna;
import mp2.Zawodnik;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mtrzonkowski
 */
public class ArgumentAsso {

    Zawodnik zawodnik1;
    Zawodnik zawodnik2;
    Druzyna druzyna1;
    Druzyna druzyna2;

    public ArgumentAsso() {
    }

    @Before
    public void setUp() {
        zawodnik1 = new Zawodnik("Michał", "Trzonkowski", "Zakole Wiktorowo 30a", new Date(1983, 5, 17));
        zawodnik2 = new Zawodnik("Radosław", "Wichrowski", "Warszawa grochów", new Date(1981, 12, 12));
        druzyna1 = new Druzyna("Cytrynowa śmierć", new Date(2012, 10, 01));
        druzyna2 = new Druzyna("Brzeszczotem po klacie", new Date(2013, 2, 15));
        
    }

    @Test
    public void testZawodnikAddRemoveDruzyna(){
        
        zawodnik1.addDruzyna(druzyna1);
        zawodnik2.addDruzyna(druzyna1);
        zawodnik1.addDruzyna(druzyna1);
        zawodnik2.addDruzyna(druzyna1);

        assertEquals(1,zawodnik1.getZawodnikWDrużynie().size());
        assertEquals(1,zawodnik2.getZawodnikWDrużynie().size());
        assertEquals(2,druzyna1.getZawodnicyWDruzynie().size());
        assertEquals(0,druzyna2.getZawodnicyWDruzynie().size());
        
        zawodnik1.addDruzyna(druzyna2);
        zawodnik2.addDruzyna(druzyna2);
       
        assertEquals(2,zawodnik1.getZawodnikWDrużynie().size());
        assertEquals(2,zawodnik2.getZawodnikWDrużynie().size());
        assertEquals(2,druzyna1.getZawodnicyWDruzynie().size());
        assertEquals(2,druzyna2.getZawodnicyWDruzynie().size());

        zawodnik1.removeDrużyna(druzyna2);
        
        assertEquals(1,zawodnik1.getZawodnikWDrużynie().size());
        assertEquals(2,zawodnik2.getZawodnikWDrużynie().size());
        assertEquals(2,druzyna1.getZawodnicyWDruzynie().size());
        assertEquals(1,druzyna2.getZawodnicyWDruzynie().size());

    }
    
    @Test
    public void testDruzynaAddRemoveZawodnik(){
        druzyna2.addZawodnik(zawodnik2);
        druzyna2.addZawodnik(zawodnik1);
        druzyna2.addZawodnik(zawodnik2);
        druzyna2.addZawodnik(zawodnik1);

        assertEquals(1,zawodnik1.getZawodnikWDrużynie().size());
        assertEquals(1,zawodnik2.getZawodnikWDrużynie().size());
        assertEquals(0,druzyna1.getZawodnicyWDruzynie().size());
        assertEquals(2,druzyna2.getZawodnicyWDruzynie().size());

        druzyna1.addZawodnik(zawodnik2);
        druzyna1.addZawodnik(zawodnik1);
        
        assertEquals(2,zawodnik1.getZawodnikWDrużynie().size());
        assertEquals(2,zawodnik2.getZawodnikWDrużynie().size());
        assertEquals(2,druzyna1.getZawodnicyWDruzynie().size());
        assertEquals(2,druzyna2.getZawodnicyWDruzynie().size());
        
        druzyna2.removeZawodnik(zawodnik1);

        assertEquals(1,zawodnik1.getZawodnikWDrużynie().size());
        assertEquals(2,zawodnik2.getZawodnikWDrużynie().size());
        assertEquals(2,druzyna1.getZawodnicyWDruzynie().size());
        assertEquals(1,druzyna2.getZawodnicyWDruzynie().size());
        
    }
    
}
