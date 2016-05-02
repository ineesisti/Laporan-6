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
public class PegawaiTidakTetap extends Employee {

    private double lembur;
    public PegawaiTidakTetap(String nama, String id, String jabatan, int istri, int anak, int tahunKerja, int time) {
        super( nama, id, jabatan, istri, anak, tahunKerja);
        if (time > 10) {
            lembur = 10000 * ((time - 10) * 30);
        }
    }

   
    public double getGaji() {
        double gajiPokok = super.getGaji();
        return gajiPokok + lembur;
    }
    
    public double getLembur(){
        return lembur;
    }

}