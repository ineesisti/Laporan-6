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
public class PegawaiTetap extends Employee {

    public PegawaiTetap(String nama, String id, String jabatan, int istri, int anak, int tahunKerja) {
        super(nama, id, jabatan, istri, anak, tahunKerja);
    }

    @Override
    public double getGaji() {
        return super.getGaji() ;
    }
}
