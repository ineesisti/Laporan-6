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
public class Manager extends PegawaiTetap {

    private double tunjanganJabatan;

    public Manager(String name, String id, String jobTitle, int wife, int child, int yearOfWork) {
        super(name, id, jobTitle, wife, child, yearOfWork);
        tunjanganJabatan = 0.1 * super.getGaji();
    }

    @Override
    public double getGaji() {
        double gaji = super.getGaji();
        return gaji + tunjanganJabatan;
    }
    
    public double getTunjanganJabatan () {
        return tunjanganJabatan;
    }

}
