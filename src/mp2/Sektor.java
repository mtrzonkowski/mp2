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
public class Sektor {
    
        private static ArrayList<Sektor> sektorEkstensje=new ArrayList<Sektor>();
        
        private Pole pole;       
        private String sektorNazwa;
        private String sektorOpis;
        private int dlugosc;
        private int szerokosc;
        private ArrayList<Mecz> mecze;


        private Sektor(Pole pole,String sektorNazwa, String sektorOpis, int dlugosc, int serokosc) {
            this.pole=pole;
            this.sektorNazwa = sektorNazwa;
            this.sektorOpis = sektorOpis;
            this.dlugosc = dlugosc;
            this.szerokosc = serokosc;
            pole.addSektor(this);
        }

        public static Sektor createSektor(Pole pole,String sektorNazwa,String sektorOpis, int dlugosc,int szerokosc) throws Exception{
            if(pole!=null){
                Sektor sektor=new Sektor(pole,sektorNazwa,sektorOpis,dlugosc,szerokosc);
                sektorEkstensje.add(sektor);
                return sektor;
            }
            else{
                throw new Exception("Nie można dodać sektora do niczego");
            }
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
