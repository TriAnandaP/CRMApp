/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author user
 */
public class Cicilan implements Comparable<Cicilan>{
    private String kodeCicilan;
    private Nasabah nasabah;
    private Date jatuhTempo;
    private double hargaBarang;
    private double uangMuka;
    private double bungaTahunan;
    private int durasiKredit;
    private double jumlahCicilan;
    private double limit;
    private String keterangan;

    public Cicilan() {
    }

    public Cicilan(String kodeCicilan, 
            Nasabah nasabah, 
            Date jatuhTempo, 
            double hargaBarang, 
            double uangMuka, 
            double bungaTahunan, 
            int durasiKredit) {
        this.kodeCicilan = kodeCicilan;
        this.nasabah = nasabah;
        this.jatuhTempo = jatuhTempo;
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.bungaTahunan = bungaTahunan;
        this.durasiKredit = durasiKredit;
    }

    public String getKodeCicilan() {
        return kodeCicilan;
    }

    public void setKodeCicilan(String kodeCicilan) {
        this.kodeCicilan = kodeCicilan;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public Date getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(Date jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public double getUangMuka() {
        return uangMuka;
    }

    public void setUangMuka(double uangMuka) {
        this.uangMuka = uangMuka;
    }

    public double getBungaTahunan() {
        return bungaTahunan;
    }

    public void setBungaTahunan(double bungaTahunan) {
        this.bungaTahunan = bungaTahunan;
    }

    public int getDurasiKredit() {
        return durasiKredit;
    }

    public void setDurasiKredit(int durasiKredit) {
        this.durasiKredit = durasiKredit;
    }

    public double getJumlahCicilan() {
        return jumlahCicilan;
    }

    public double getLimit() {
        return limit;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public double hitungPokokKredit(){
        return hargaBarang - uangMuka;
    }

    public double hitungBungaKredit(){
        double bungaKredit;
        bungaKredit = (hitungPokokKredit() * (bungaTahunan/100.0) * (durasiKredit/12.0));
        
        return bungaKredit;
    }
    
    public double hitungTotalKredit(){
        return hitungPokokKredit() + hitungBungaKredit();
    }
    
    public double hitungKreditPerBulan(){
         jumlahCicilan = hitungTotalKredit() / durasiKredit;
         if(jumlahCicilan<limit){
             keterangan = "Disetujui";
         }else if(jumlahCicilan>limit){
             keterangan = "Ditolak";
         }
         
         return jumlahCicilan;
    }
    
    public double hitungLimitKredit(double totalPenghasilanNasabah, int jumlahTanggunganNasabah){
        limit = (totalPenghasilanNasabah / (jumlahTanggunganNasabah + 1));
        
        return limit;
    }
 
    public String cekValidasi(){
        if(jumlahCicilan<limit){
            return keterangan = "Disetujui";
        }else{
            return keterangan = "Ditolak";
        }
    }

    @Override
    public int compareTo(Cicilan o) {
        return kodeCicilan.compareTo(o.kodeCicilan);
    }
}
