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
    
    private class Sektor{
        
        private String sektorNazwa;
        private String sektorOpis;
        private int dlugosc;
        private int serokosc;
        
        private ArrayList<Mecz> listaMeczy;

        public Sektor(String sektorNazwa, String sektorOpis, int dlugosc, int serokosc) {
            this.sektorNazwa = sektorNazwa;
            this.sektorOpis = sektorOpis;
            this.dlugosc = dlugosc;
            this.serokosc = serokosc;
        }
        
        
        
        private String getListaMeczyString(){
            String output="Lista meczy";
            if(listaMeczy.isEmpty()){
                output+=" jest pusta";
            }
            else{
                output+=":\n";
                for(Mecz mecz:listaMeczy){
                    output+=mecz.toString()+"\n";
                }
            }
            return output;
        }
        
    }
    
}
