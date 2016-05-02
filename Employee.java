/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Asus Laptop
 */

import java.util.*;
public class Employee {
    java.util.Calendar x = java.util.Calendar.getInstance();
    private static double gajiPokok;
    private String nama, id, jabatan, status = "Tidak Tetap";
    private double gaji=gajiPokok, bonus, tunjangan, tunjanganIstri, tunjanganAnak;
    private int istri, anak, tahunKerja, tahunskrg, lamaKerja;
    public Employee(String nama, String id, String jabatan, int istri, int anak, int tahunKerja) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.tahunKerja = tahunKerja;
        this.tahunskrg = x.get(Calendar.YEAR);
        this.lamaKerja = tahunskrg - tahunKerja;
        char[] cekId = id.toCharArray();
        if (cekId[0] == '1') {
            bonus();
            tunjangan();
            status = "Tetap ";
        }
    }
    public void bonus() {
        if ((lamaKerja >= 0) && (lamaKerja <= 5)){
            bonus = 0;
            gaji += bonus;
        } 
        else if (lamaKerja <= 10){
            bonus = 0.05 * gajiPokok;
            gaji += bonus;
        }
        else if(lamaKerja > 10){
            bonus = 0.1 * gajiPokok;
            tunjangan = 0.1 * gajiPokok;
            gaji += bonus;
            gaji += tunjangan;
        } else {
            bonus = 0;
            lamaKerja = 0;
        }
    }
    
    public void tunjangan() {
        if (istri > 0) {
                tunjanganIstri = 0.1 * gaji;
                gaji += tunjanganIstri;
                if (anak == 1) {
                    tunjanganAnak = 0.15 * gaji;
                    gaji += tunjanganAnak;
                } else if (anak == 2) {
                    tunjanganAnak = (0.15 * gaji) * 2;
                    gaji += tunjanganAnak;
                } else if (anak >= 3) {
                    tunjanganAnak = (0.15 * gaji) * 3;
                    gaji += tunjanganAnak;
                 } else {
                    tunjanganAnak=0;
                    gaji += tunjanganAnak;
                }
                
        }
    }
    
    public String getNama() {
        return nama;
    }
    public double getGaji() {
        return gaji;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getId() {
        return id;
    }
    public int getIstri() {
        return istri;
    }
    public int getAnak() {
        return anak;
    }
    public int getTahunSekarang() {
        return tahunskrg;
    }
    public int getLamaKerja() {
        return lamaKerja;
    }
    public String getStatus() {
        return status;
    }    
    public static void setGajiPokok(int gajiPokok) {
        Employee.gajiPokok = gajiPokok;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public double getTunjangan(){
        return tunjangan;
    }
    public double getTunjanganIstri(){
        return tunjanganIstri;
    }
    public double getTunjanganAnak(){
        return tunjanganAnak;
    }
}

 
    

