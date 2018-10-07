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
public class RumahSakit {

    private String nama;
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<>();

    public RumahSakit() {
    }

    public RumahSakit(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

    public void tambahDokter(Dokter dokter) {
        if (cariDokter(dokter.getNama()) == -1) {
            daftarDokter.add(dokter);
        } else {
            JOptionPane.showMessageDialog(null, "Dokter " + dokter.getNama() + " Sudah Ada !");
        }
    }

    public int cariDokter(String nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).getNama().equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }

    public int cariKlinik(String nama) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNamaKlinik().equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void tambahKlinik(Klinik klinik) {
        if (cariKlinik(klinik.getNamaKlinik()) == -1) {
            daftarKlinik.add(klinik);
        } else {
            JOptionPane.showMessageDialog(null, "Klinik " + klinik.getNamaKlinik() + " Sudah Ada !");
        }

    }
}
