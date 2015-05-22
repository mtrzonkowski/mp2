/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mtrzonkowski
 */
public class Pole {

    private String nazwa;
    private String adres;
    private ArrayList<Sektor>sektory = new ArrayList<Sektor>();
    private static ArrayList<Sektor>wszystkieSektory = new ArrayList<Sektor>();

    public Pole(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void addSektor(Sektor sektor) throws Exception {
        if(wszystkieSektory.contains(sektor)){
                throw new Exception("Sektor "+sektor+" nalezydo "+sektor.getPole());
        }
        wszystkieSektory.add(sektor);
        if(!sektory.contains(sektor)){
            sektory.add(sektor);
        }
    }

    public void removeSektor(Sektor sektor) {
        if (sektory.contains(sektor)) {
            sektory.remove(sektor);
            wszystkieSektory.remove(sektor);
            sektor.destroySektor();
        }
    }

 
    public ArrayList<Sektor> getSektory() {
        return sektory;
    }

    public static ArrayList<Sektor> getWszystkieSektory() {
        return wszystkieSektory;
    }

    @Override
    public String toString() {
        String output = "Pole " + this.nazwa + " składa się z sektorów:\n";
        for (Sektor sektor : sektory) {
            output += "\t" + sektor + "\n";
        }
        return output;
    }
}
