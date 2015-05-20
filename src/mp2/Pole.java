/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.ArrayList;

/**
 *
 * @author mtrzonkowski
 */
public class Pole {

    private String nazwa;
    private String adres;
    private ArrayList<Sektor> sektory;

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

    public void addSektor(){
        
    }
    public void addSektor(String sektorNazwa,String sektorOpis, int dlugosc,int szerokosc){
        
    }
    public void addSektor(Sektor sektor){
        if(!this.sektory.contains(sektor)){
    }

}
