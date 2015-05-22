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
    private HashMap<String, Sektor> sektory = new HashMap<String, Sektor>();

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
        if (!sektory.containsValue(sektor)) {
            if (sektor.getPole() == null) {
                this.sektory.put(sektor.getSektorNazwa(), sektor);
            } else {
                throw new Exception("Sektor " + sektor.getSektorNazwa() + " należy do pola " + sektor.getPole().getNazwa());
            }
        }
    }

    public void newSektor(String sektorNazwa, String sektorOpis, int dlugosc, int szerokosc) throws Exception {
        this.sektory.put(sektorNazwa, Sektor.createSektor(this, sektorNazwa, sektorOpis, dlugosc, szerokosc));
    }

    public void removeSektor(Sektor sektor) {
        if (!sektory.containsKey(sektor)) {
            sektor.destroySektor();
            this.sektory.remove(sektor.getSektorNazwa());
        }
    }

    public Sektor getSektor(String nazwaSektora) {
        return this.sektory.get(nazwaSektora);
    }

    public HashMap<String, Sektor> getSektory() {
        return sektory;
    }

    @Override
    public String toString() {
        String output = "Pole " + this.nazwa + " składa się z sektorów:\n";
        for (String nazwa : sektory.keySet()) {
            output += "\t" + sektory.get(nazwa) + "\n";
        }
        return output;
    }
}
