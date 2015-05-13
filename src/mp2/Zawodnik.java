/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Zawodnik extends Osoba{
    
    private ArrayList<GraczWDruzynie> graczWDrużynie;
    

    public Zawodnik(String imie, String nazwisko, String adres, Date dataUrodzenia) {
        super(imie, nazwisko, adres, dataUrodzenia);
    }
    
    
    public void addDruzyna(Druzyna druzyna){
        
    }
    
    public void removeDrużyna(Druzyna druzyna){
        
    }
}
