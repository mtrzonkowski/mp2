/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class Druzyna {
    
    private String nazwa;
    private Date dataPowstania;
    private Date dataZawieszenia=null;
    private ArrayList<ZawodnikWDruzynie> zawodnicyWDruzynie=new ArrayList<ZawodnikWDruzynie>();
    
    public Druzyna(String nazwa, Date dataPowstania) {
        this.nazwa = nazwa;
        this.dataPowstania = dataPowstania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(Date dataPowstania) {
        this.dataPowstania = dataPowstania;
    }

    public String Zawieszenie() {
        if(dataZawieszenia!=null){
            return "Drużyna nie jest zawieszona";
        }
        else{
            return "Drużyna zawieszona od dnia "+dataZawieszenia;
        }
    }

    public ArrayList<ZawodnikWDruzynie> getZawodnicyWDruzynie() {
        return zawodnicyWDruzynie;
    }

    
        
    public void setDataZawieszenia(Date dataZawieszenia) {
        this.dataZawieszenia = dataZawieszenia;
    }
    
    
    public void addZawodnik(Zawodnik zawodnik){
       boolean nieMaAsocjacji = true;
        if(!zawodnicyWDruzynie.isEmpty()){
            for (ZawodnikWDruzynie zawodnikWDruzynie : zawodnicyWDruzynie) {
                if(zawodnikWDruzynie.getZawodnik()==zawodnik && zawodnikWDruzynie.isZawodnikActive()){
                    nieMaAsocjacji=false;
                }
            }
        }
        if(nieMaAsocjacji){
            new ZawodnikWDruzynie(zawodnik, this);
        }
    }
    
    public ArrayList<Zawodnik> getZawodnicy(){
        ArrayList<Zawodnik> zawodnicy=new ArrayList<Zawodnik>();
        for(ZawodnikWDruzynie zawodnikWDruzynie : zawodnicyWDruzynie){
            zawodnicy.add(zawodnikWDruzynie.getZawodnik());
        }
        return zawodnicy;
    }
    
    public String printZawodnicy(){
        String output="W drużynie "+this.getNazwa()+" są zawodnicy:\n";
        for(ZawodnikWDruzynie zawodnikWDruzynie : zawodnicyWDruzynie){
            output+="\t"+zawodnikWDruzynie.getZawodnik()+"\n";
        }
        return output;
    }
    
}
