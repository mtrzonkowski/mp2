/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.HashMap;

/**
 *
 * @author mtrzonkowski
 */
public class ListaStartowa {

    private final int MAX_LICZBA_DRUZYN;

    private String kryterium;
    private String nazwa;

    private int liczbaDruzyn = 1;

    private HashMap<Integer, Druzyna> druzyny = new HashMap<Integer, Druzyna>();

    public ListaStartowa(String kryterium, String nazwa, int MAX_LICZBA_DRUZYN) {
        this.MAX_LICZBA_DRUZYN = MAX_LICZBA_DRUZYN;
        this.kryterium = kryterium;
        this.nazwa = nazwa;
    }

    public String getKryterium() {
        return kryterium;
    }

    public void setKryterium(String kryterium) {
        this.kryterium = kryterium;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getLiczbaDruzyn() {
        return liczbaDruzyn;
    }

    public void setLiczbaDruzyn(int liczbaDruzyn) {
        this.liczbaDruzyn = liczbaDruzyn;
    }

    public HashMap<Integer, Druzyna> getDruzyny() {
        return druzyny;
    }

    public void setDruzyny(HashMap<Integer, Druzyna> druzyny) {
        this.druzyny = druzyny;
    }

    public void addDruzyna(Druzyna druzyna) {
        if (liczbaDruzyn < MAX_LICZBA_DRUZYN + 1) {
            if (!druzyny.containsValue(druzyna)) {
                druzyny.put(liczbaDruzyn++, druzyna);
                druzyna.getListyStartowe().add(this);
            }
        } else {
            System.out.println("Lista startowa " + this.nazwa + " jest już pełna");
        }
    }

    public void removeDruzyna(Druzyna druzyna) {
        if (druzyny.containsValue(druzyna)) {
            druzyna.getListyStartowe().remove(this);
            druzyny.remove(druzyna);
        }
    }

    public String printListaStartowa() {
        String output = "Lista startowa " + nazwa + "\n";
        if (this.getDruzyny().isEmpty()) {
            output += "jest pusta.\n";
        } else {
            for (Integer numerStartowy : druzyny.keySet()) {
                output += numerStartowy + "\t" + druzyny.get(numerStartowy) + "\n";
            }
        }
        return output;
    }
    
    public void destroyListaStartowa(){
        if (!this.getDruzyny().isEmpty()) {
            for (Integer numerStartowy : druzyny.keySet()) {
                removeDruzyna(druzyny.get(numerStartowy));
            }
        }
    }
}
