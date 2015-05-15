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

    private int liczbaDruzyn = 0;

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

    public boolean fullListaStartowa() {
        if (MAX_LICZBA_DRUZYN - liczbaDruzyn > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void addDruzyna(Druzyna druzyna) {
        if (!fullListaStartowa()) {
            if (!druzyny.containsValue(druzyna)) {
                liczbaDruzyn++;
                druzyny.put(liczbaDruzyn, druzyna);
                druzyna.getNumeryStartowe().put(this, liczbaDruzyn);
            }
        } else {
            System.out.println("Lista startowa " + this.nazwa + " jest już pełna");
        }
    }

    public void removeDruzyna(Druzyna druzyna) {
        if (druzyny.containsValue(druzyna)) {
            druzyny.remove(druzyna.getNumeryStartowe().get(this));
            druzyna.getNumeryStartowe().remove(this);
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

    public void destroyListaStartowa() {
        if (!this.getDruzyny().isEmpty()) {
            for (Integer numerStartowy : druzyny.keySet()) {
                removeDruzyna(druzyny.get(numerStartowy));
            }
        }
    }
}
