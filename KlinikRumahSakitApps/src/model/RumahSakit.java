/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class RumahSakit {

    private String nama;
   
   private ArrayList<Dokter> daftarDokter  = new ArrayList<>();
    private ArrayList<Klinik> daftarKlinik  = new ArrayList<>();

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

   

  

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public void tambahDokter(Dokter dokter) {
        daftarDokter.add(dokter);

    }

    public Dokter cariDokter(String Nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (Nama == null ? daftarDokter.get(i).getNama() == null
                    : Nama.equals(daftarDokter.get(i).getNama())) {
                return daftarDokter.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

    public Klinik cariKlinik(String Nama) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (Nama == null ? daftarKlinik.get(i).getNamaKlinik() == null
                    : Nama.equals(daftarKlinik.get(i).getNamaKlinik())) {
                return daftarKlinik.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

   

   

}
