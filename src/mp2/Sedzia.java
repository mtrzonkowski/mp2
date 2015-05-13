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
public class Sedzia extends Osoba {

    private String numerLicencji;
    private Date dataUzyskaniaLicencji;
    private ArrayList<Mecz> mecze;

    public Sedzia(String imie, String nazwisko, String adres, Date dataUrodzenia, String numerLicencji, Date dataUzyskaniaLicencji) {
        super(imie, nazwisko, adres, dataUrodzenia);
        this.numerLicencji = numerLicencji;
        this.dataUzyskaniaLicencji = dataUzyskaniaLicencji;
        mecze = new ArrayList<>();
    }

    public String getNumerLicencji() {
        return numerLicencji;
    }

    public void setNumerLicencji(String numerLicencji) {
        this.numerLicencji = numerLicencji;
    }

    public Date getDataUzyskaniaLicencji() {
        return dataUzyskaniaLicencji;
    }

    public void setDataUzyskaniaLicencji(Date dataUzyskaniaLicencji) {
        this.dataUzyskaniaLicencji = dataUzyskaniaLicencji;
    }

    public void addMecz(Mecz mecz) {
        if (!mecze.contains(mecz)) {
            this.mecze.add(mecz);
            mecz.setSedzia(this);
        }
    }

    public void removeMecz(Mecz mecz) {
        if (mecze.contains(mecz)) {
            this.mecze.remove(mecz);
            if (!mecz.isSedziaNull()) {
                mecz.setSedzia(null);
            }
        }
    }

    public ArrayList<Mecz> getMeczeList() {
        return mecze;
    }

    public int getLiczbaMeczy() {
        return mecze.size();
    }

    public String showListaMeczy() {
        String output = "Sedzia " + this.getImie() + " " + this.getNazwisko() + " sędziuje następujące mecze:\n";
        for (Mecz mecz : mecze) {
            output += mecz + "\n";
        }
        return output;
    }

}
