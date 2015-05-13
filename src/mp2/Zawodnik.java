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
public class Zawodnik extends Osoba {

    private ArrayList<ZawodnikWDruzynie> zawodnikWDruzynach=new ArrayList<ZawodnikWDruzynie>();

    public Zawodnik(String imie, String nazwisko, String adres, Date dataUrodzenia) {
        super(imie, nazwisko, adres, dataUrodzenia);
        
    }

    public ArrayList<ZawodnikWDruzynie> getZawodnikWDrużynie() {
        return zawodnikWDruzynach;
    }

    public void addDruzyna(Druzyna druzyna) {
        boolean nieMaAsocjacji = true;
        if(!zawodnikWDruzynach.isEmpty()){
            for (ZawodnikWDruzynie zawodnikWDruzynie : zawodnikWDruzynach) {
                if(zawodnikWDruzynie.getDruzyna()== druzyna && zawodnikWDruzynie.isZawodnikActive()){
                    nieMaAsocjacji=false;
                }
            }
        }
        if(nieMaAsocjacji){
            new ZawodnikWDruzynie(this, druzyna);
        }
    }

    public void removeDrużyna(Druzyna druzyna) {

    }
}
