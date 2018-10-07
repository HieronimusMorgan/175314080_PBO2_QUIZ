/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jarkom
 */
public class Klinik {
    
    private String idKlinik;
    private String namaKlinik;
    
    public Klinik() {
    }
    
    public Klinik(String idKlinik, String namaKlinik) {
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }
    
    public String getIdKlinik() {
        return idKlinik;
    }
    
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    
    public String getNamaKlinik() {
        return namaKlinik;
    }
    
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    
    public ArrayList<Dokter> getDaftarDokter() {
        RumahSakit a = new RumahSakit();
        return a.getDaftarDokter();
    }
    
    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        RumahSakit a = new RumahSakit();
        a.setDaftarDokter(daftarDokter);
    }
    
    public void tambahDokter(Dokter dokter) {
        RumahSakit a = new RumahSakit();
        if (a.cariDokter(dokter.getNama()) == -1) {
            a.tambahDokter(dokter);
        } else {
            JOptionPane.showMessageDialog(null, "Dokter " + dokter.getNama() + " Sudah Ada !");
        }
        
    }
}
