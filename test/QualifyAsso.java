/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import mp2.Druzyna;
import mp2.ListaStartowa;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mtrzonkowski
 */
public class QualifyAsso {

    private Druzyna druzyna1;
    private Druzyna druzyna2;
    private Druzyna druzyna3;

    private ListaStartowa ls1;
    private ListaStartowa ls2;

    public QualifyAsso() {
    }

    @Before
    public void setUp() {
        druzyna1 = new Druzyna("Czerwone Gacie Martyny", new Date(2012, 2, 5));
        druzyna2 = new Druzyna("Błękitne Figi Kasi", new Date(2013, 9, 15));
        druzyna3 = new Druzyna("Czarne Stringi Karola", new Date(2015, 1, 1));

        ls1 = new ListaStartowa("Wiek", "18-25", 20);
        ls2 = new ListaStartowa("Płeć", "Tylko laski", 2);
    }

    @Test
    public void druzynaAddRemoveListy() {
        assertEquals(0,ls1.getDruzyny().size());

        ls1.addDruzyna(druzyna1);
        assertEquals(1,ls1.getDruzyny().size());

        ls1.addDruzyna(druzyna2);
        assertEquals(2,ls1.getDruzyny().size());
        ls1.addDruzyna(druzyna2);
        assertEquals(2,ls1.getDruzyny().size());

        ls1.addDruzyna(druzyna3);
        assertEquals(3,ls1.getDruzyny().size());
        
        ls1.removeDruzyna(druzyna1);
        assertEquals(2,ls1.getDruzyny().size());
        assertFalse(ls1.getDruzyny().containsValue(druzyna1));
        assertFalse(druzyna1.getListyStartowe().containsKey(ls1));

        druzyna3.removeListaStartowa(ls1);
        assertEquals(1,ls1.getDruzyny().size());
        assertFalse(ls1.getDruzyny().containsValue(druzyna3));
        assertFalse(druzyna3.getListyStartowe().containsKey(ls1));
    }
    
    @Test
    public void maxSizeDruzyna(){
        ls2.addDruzyna(druzyna1);
        ls2.addDruzyna(druzyna2);
        
        assertEquals(2,ls2.getDruzyny().size());
        assertEquals(2,ls2.getLiczbaDruzyn());
        
        ls2.addDruzyna(druzyna3);

        assertEquals(2,ls2.getDruzyny().size());
        assertEquals(2,ls2.getLiczbaDruzyn());
        
        druzyna3.addListaStartowa(ls2);
        
        assertEquals(2,ls2.getDruzyny().size());
        assertEquals(2,ls2.getLiczbaDruzyn());
    }
}