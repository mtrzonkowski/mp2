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
public class Druzyna {
    
    private String nazwa;
    private Date dataPowstania;
    private Date dataZawieszenia=null;

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

    public void setDataZawieszenia(Date dataZawieszenia) {
        this.dataZawieszenia = dataZawieszenia;
    }
    
    
}
