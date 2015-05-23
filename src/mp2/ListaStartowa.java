/*S
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
    public int getSizeListy(){
        return this.druzyny.size();
    }
 
    public HashMap<Integer, Druzyna> getDruzyny() {
        return druzyny;
    }

    public void setDruzyny(HashMap<Integer, Druzyna> druzyny) {
        this.druzyny = druzyny;
    }

    public boolean fullListaStartowa() {
        if (MAX_LICZBA_DRUZYN -  druzyny.size()> 0) {
            return false;
        } else {
            return true;
        }
    }

    public void addDruzyna(Druzyna druzyna) {
        if (!fullListaStartowa()) {
            if (!druzyny.containsKey(druzyna.getNumerStartowy())) {
                druzyny.put(druzyna.getNumerStartowy(), druzyna);
                druzyna.addListaStartowa(this);
            }
        } else {
            System.out.println("Lista startowa " + this.nazwa + " jest już pełna");
        }
    }

    public void removeDruzyna(Druzyna druzyna) {
        if (druzyny.containsKey(druzyna.getNumerStartowy())) {
            druzyny.remove(druzyna.getNumerStartowy());
            druzyna.removeListaStartowa(this);
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
                this.getDruzyny().get(numerStartowy).getListyStartowe().remove(this);
            }
            druzyny.clear();
        }
    }
}
