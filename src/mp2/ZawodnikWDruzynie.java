/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class ZawodnikWDruzynie {
    
    private Zawodnik zawodnik;
    private Druzyna druzyna;    
    private String pozycja;
    private Date dataPrzystapienia;
    private Date dataOdejscia=null;

    public ZawodnikWDruzynie(Zawodnik zawodnik, Druzyna druzyna) {
        this.zawodnik = zawodnik;
        this.druzyna = druzyna;
        zawodnik.getZawodnikWDrużynie().add(this);
        druzyna.getZawodnicyWDruzynie().add(this);
    } 

    public void removeZawodnik(){
        zawodnik.getZawodnikWDrużynie().remove(this);
        this.zawodnik=null;
    }
    public void removeDruzyna(){
        druzyna.getZawodnicyWDruzynie().remove(this);
        this.druzyna=null;
    }
    
    
    public Zawodnik getZawodnik() {
        return zawodnik;
    }

    public void setZawodnik(Zawodnik zawodnik) {
        this.zawodnik = zawodnik;
    }

    public Druzyna getDruzyna() {
        return druzyna;
    }

    public void setDruzyna(Druzyna druzyna) {
        this.druzyna = druzyna;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public Date getDataPrzystapienia() {
        return dataPrzystapienia;
    }

    public void setDataPrzystapienia(Date dataPrzystapienia) {
        this.dataPrzystapienia = dataPrzystapienia;
    }

    public String getDataOdejscia() {
        if(dataOdejscia!=null){
            return zawodnik.toString()+" odszedł z drużyny "+druzyna.toString()+" dnia "+dataOdejscia.toString();
        }else{
            return zawodnik.toString()+" nadal jest w drużynie "+druzyna.toString();
        }
    }

    public void setDataOdejscia(Date dataOdejscia) {
        this.dataOdejscia = dataOdejscia;
    }

    public boolean isZawodnikActive(){
        if(dataOdejscia!=null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void destroyZawodnikWDruzynie(){
        removeZawodnik();
        removeDruzyna();
 
    }
    
}
