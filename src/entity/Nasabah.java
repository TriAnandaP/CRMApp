/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Nasabah {
    private String nama;
    private String umur;
    private String noKTP;
    private String jKelamin;
    private String kontak;
    private String alamat;
    private String status;
    private String pekerjaan;
    private String pendidikanTerakhir;
    private String email;
    private String kodePOS;
    private double gajiPokok;
    private double penghasilanTambahan;
    private double bonus;
    private int jumlahTanggungan;
    private double totPenghasilan;
    private List<Cicilan> cicilans = new ArrayList<>();

    public Nasabah() {
    }

    public Nasabah(String nama, String umur, String noKTP, String jKelamin, String kontak, String alamat, String status, String pekerjaan, String pendidikanTerakhir, String email, String kodePOS, double gajiPokok, double penghasilanTambahan, double bonus, int jumlahTanggungan) {
        this.nama = nama;
        this.umur = umur;
        this.noKTP = noKTP;
        this.jKelamin = jKelamin;
        this.kontak = kontak;
        this.alamat = alamat;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.email = email;
        this.kodePOS = kodePOS;
        this.gajiPokok = gajiPokok;
        this.penghasilanTambahan = penghasilanTambahan;
        this.bonus = bonus;
        this.jumlahTanggungan = jumlahTanggungan;
    }

    public Nasabah(List<Cicilan> cicilans){
        this.cicilans = cicilans;
    }

    public List<Cicilan> getCicilan() {
        return cicilans;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getjKelamin() {
        return jKelamin;
    }

    public void setjKelamin(String jKelamin) {
        this.jKelamin = jKelamin;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKodePOS() {
        return kodePOS;
    }

    public void setKodePOS(String kodePOS) {
        this.kodePOS = kodePOS;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getPenghasilanTambahan() {
        return penghasilanTambahan;
    }

    public void setPenghasilanTambahan(double penghasilanTambahan) {
        this.penghasilanTambahan = penghasilanTambahan;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    public double getTotPenghasilan() {
        return totPenghasilan;
    }
    
    
    public double totalPenghasilan(){
       return totPenghasilan = gajiPokok + penghasilanTambahan + bonus;
       
    }
    
}
