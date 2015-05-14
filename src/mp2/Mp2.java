/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Mp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zawodnik zawodnik1;
        Zawodnik zawodnik2;
        Druzyna druzyna1;
        Druzyna druzyna2;

        zawodnik1 = new Zawodnik("Michał", "Trzonkowski", "Zakole Wiktorowo 30a", new Date(1983, 5, 17));
        zawodnik2 = new Zawodnik("Radosław", "Wichrowski", "Warszawa grochów", new Date(1981, 12, 12));
        druzyna1 = new Druzyna("Cytrunowa śmierć", new Date(2012, 10, 01));
        druzyna2 = new Druzyna("Brzeszczotem po klacie", new Date(2013, 2, 15));

        zawodnik1.addDruzyna(druzyna1);
        zawodnik2.addDruzyna(druzyna1);
        zawodnik1.addDruzyna(druzyna1);
        zawodnik2.addDruzyna(druzyna1);

        druzyna2.addZawodnik(zawodnik2);
        druzyna2.addZawodnik(zawodnik1);
   
        System.out.print(druzyna1.printZawodnicy());
        System.out.print(druzyna2.printZawodnicy());

        druzyna2.removeZawodnik(zawodnik1);
        zawodnik1.removeDrużyna(druzyna1);
        
        System.out.print(druzyna1.printZawodnicy());
        System.out.print(druzyna2.printZawodnicy());
        
        Pole pole1 =new Pole();
        
        
    }

}
