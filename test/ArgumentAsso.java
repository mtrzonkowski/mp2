/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import mp2.Druzyna;
import mp2.Zawodnik;
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
    public void test() {
        
        
        
        zawodnik1.addDruzyna(druzyna1);
        zawodnik2.addDruzyna(druzyna1);
        zawodnik1.addDruzyna(druzyna1);
        zawodnik2.addDruzyna(druzyna1);

        druzyna2.addZawodnik(zawodnik2);
        druzyna2.addZawodnik(zawodnik1);
        druzyna2.addZawodnik(zawodnik2);
        druzyna2.addZawodnik(zawodnik1);
        
        
        System.out.print(druzyna1.printZawodnicy());
        System.out.print(druzyna2.printZawodnicy());
        
        druzyna2.removeZawodnik(zawodnik1);

        System.out.print(druzyna1.printZawodnicy());
        System.out.print(druzyna2.printZawodnicy());
    }
}
