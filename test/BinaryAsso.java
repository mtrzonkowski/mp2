/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import mp2.Mecz;
import mp2.Sedzia;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mtrzonkowski
 */
public class BinaryAsso {

    private Sedzia sedzia1;
    private Sedzia sedzia2;
    private Sedzia sedzia3;

    private Mecz mecz1;
    private Mecz mecz2;
    private Mecz mecz3;
    private Mecz mecz4;

    @Before
    public void setUp() {
        sedzia1 = new Sedzia("Michał", "Trzonkowski", "Zakole Wiktorowo", new Date(1983, 05, 17), "PBL12345/2002", new Date(2002, 01, 02));
        sedzia2 = new Sedzia("Radosła", "Wichrowski", "Warszaw", new Date(1981, 12, 13), "PBL09876/2005", new Date(2005, 05, 10));
        sedzia3 = new Sedzia("Paweł", "Darmofalski", "Mińsk Mazowiecki", new Date(1987, 9, 30), "PBL12345/2010", new Date(2010, 12, 10));

        mecz1 = new Mecz(null, new Date(2015, 6, 1));
        mecz2 = new Mecz(null, new Date(2015, 7, 2));
        mecz3 = new Mecz(null, new Date(2015, 9, 3));
        mecz4 = new Mecz(null, new Date(2015, 8, 9));

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testMeczSedziaNull() {
        assertNull(mecz1.getSedzia());
        assertNull(mecz2.getSedzia());
        assertNull(mecz3.getSedzia());
        assertNull(mecz4.getSedzia());
    }

    @Test
    public void testAddSedziaMecz() {
        assertNull(mecz1.getSedzia());
        assertTrue(sedzia1.getLiczbaMeczy() == 0);

        System.out.println(mecz1);
        System.out.println(sedzia1);
        System.out.println(mecz1.getSedzia());
        System.out.println(sedzia1.showListaMeczy());
        System.out.println("-----------------------------------------------");
        
        mecz1.setSedzia(sedzia1);
        
        System.out.println(mecz1);
        System.out.println(sedzia1);
        System.out.println(mecz1.getSedzia());
        System.out.println(sedzia1.showListaMeczy());
        System.out.println(sedzia2.showListaMeczy());
        System.out.println("-----------------------------------------------");

        sedzia2.addMecz(mecz2);
        mecz3.setSedzia(sedzia2);

        assertEquals(sedzia1,mecz1.getSedzia());
        assertTrue(sedzia1.getLiczbaMeczy() != 0);
        assertFalse(sedzia2.getMeczeList().contains(mecz1));
        assertTrue(sedzia2.getMeczeList().contains(mecz2));

        mecz2.setSedzia(sedzia1);
        sedzia2.addMecz(mecz1);
        
        
        System.out.println(mecz1);
        System.out.println(sedzia1);
        System.out.println(mecz1.getSedzia());
        System.out.println(sedzia1.showListaMeczy());
        System.out.println(sedzia2.showListaMeczy());
        
        
        
        System.out.println(sedzia1.showListaMeczy());
        System.out.println(sedzia2.showListaMeczy());
        
        
    }
}
