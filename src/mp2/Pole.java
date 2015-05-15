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

    public void createSektor(String sektorNazwa, String sektorOpis, int dlugosc, int szerokosc) {
        sektory.add(new Sektor(sektorNazwa, sektorOpis, dlugosc, szerokosc));
    }

    private class Sektor {

        private String sektorNazwa;
        private String sektorOpis;
        private int dlugosc;
        private int szerokosc;

        private ArrayList<Mecz> mecze;

        public Sektor(String sektorNazwa, String sektorOpis, int dlugosc, int serokosc) {
            this.sektorNazwa = sektorNazwa;
            this.sektorOpis = sektorOpis;
            this.dlugosc = dlugosc;
            this.szerokosc = serokosc;
        }

        private void addMecz(Mecz mecz) {
            mecze.add(mecz);
//            mecz.
        }

        private void removeMecz(Mecz mecz){
            mecze.remove(mecz);
       
        }
        
        private ArrayList getMecze() {
            return mecze;
        }

        private String getListaMeczyString() {
            String output = "Lista meczy";
            if (mecze.isEmpty()) {
                output += " jest pusta";
            } else {
                output += ":\n";
                for (Mecz mecz : mecze) {
                    output += mecz.toString() + "\n";
                }
            }
            return output;
        }

    }

}
