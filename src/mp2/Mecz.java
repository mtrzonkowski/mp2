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
public class Mecz {
    
    private Sedzia sedzia;
    
    private Date dataMeczu;

    
    public Mecz(Sedzia sedzia, Date dataMeczu) {
        this.sedzia = sedzia;
        this.dataMeczu = dataMeczu;
    }

    public boolean isSedziaNull(){
        if(sedzia!=null)return false;
        else return true;
    }
    public Sedzia getSedzia() {
        return sedzia;
    }

    public void setSedzia(Sedzia sedzia) {
        if(this.sedzia!=null && this.sedzia!=sedzia){
            this.getSedzia().removeMecz(this);
        }
        this.sedzia=sedzia;
        if(sedzia!=null){
            sedzia.addMecz(this);
        }    
    }
    
    
}
