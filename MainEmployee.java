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
import java.text.DecimalFormat;
import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount, istri = 0, anak,menu;
        int TETAPi = 0, MANAGERi = 0, NONPNSi = 0, staffi = 0;
        System.out.println("=======================================");
        System.out.println("    Program Penghitung Gaji Pegawai");
        System.out.println("=======================================");
        Employee.setGajiPokok(2500000);
        PegawaiTetap[] TETAP = new PegawaiTetap[100];
        Manager[] MANAGER = new Manager[20];
        PegawaiTidakTetap[] NONPNS = new PegawaiTidakTetap[20];
        Employee[] Staff = new Employee[20];
            System.out.println("    Menu Program");
            System.out.println("(1) Tambah Data");
            System.out.println("(2) Tampil Data");
            System.out.println("(0) Keluar Program");
            do{
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\n        INFO ID PEGAWAI ");
                    System.out.println("Pegawai Tetap       : 1xxxx");
                    System.out.println("Manager             : 11xx");
                    System.out.println("Pegawai Tidak Tetap : 2xxxx");
                    System.out.println("____________________________");
                    System.out.print("Inputkan Id Pegawai : ");
                    String id = input.next();
                    System.out.print("Nama : ");
                    String nama = input.next();
                    System.out.print("Jabatan : ");
                    String jabatan = input.next();
                    System.out.print("Punya Suami/Istri?(y/n): ");
                    String istri1 = input.next();
                    if ("Y".equalsIgnoreCase(istri1)) {
                        istri = 1;
                        System.out.print("Jumlah Anak : ");
                        anak = input.nextInt();
                    } else {
                        istri = 0;
                        anak = 0;
                    }
                    System.out.print("Tahun Masuk Kerja : ");
                    int tahunKerja = input.nextInt();
                    char[] cekId = id.toCharArray();
                    if (cekId[0] == '2') {
                        System.out.print("Lama Jam Kerja(perhari): ");
                        int time = input.nextInt();
                        NONPNS[NONPNSi] = new PegawaiTidakTetap(nama, id, jabatan, istri, anak, tahunKerja, time);
                        NONPNSi++;
                    } else if (cekId[0] == '1' && cekId[1]=='1') {
                        MANAGER[MANAGERi] = new Manager(nama, id, jabatan, istri, anak, tahunKerja);
                        MANAGERi++;
                    } else if (cekId[0] == '1') {
                        TETAP[TETAPi] = new PegawaiTetap(nama, id, jabatan, istri, anak, tahunKerja);
                        TETAPi++;
                    } else {
                        Staff[staffi] = new Employee(nama, id, jabatan, istri, anak, tahunKerja);
                    } break;
                case 2:
                    int n = 1;
                    System.out.println("======================================");
                    System.out.println("     Daftar Informasi Gaji Karyawan");
                    System.out.println("======================================");
                    for (Manager MANAGER1 : MANAGER) {
                        if (MANAGER1 != null) {
                            System.out.println("Karyawan "+n++);
                            System.out.println("ID Pegawai      : "+MANAGER1.getId());
                            System.out.println("Nama Pegawai    : "+MANAGER1.getNama());
                            System.out.println("Status Pegawai  : "+MANAGER1.getStatus());
                            System.out.println("Jabatan         : "+MANAGER1.getJabatan());
                            System.out.println("Lama Kerja      : "+MANAGER1.getLamaKerja()+" tahun");
                            System.out.println("Gaji Pokok      : Rp "+MANAGER1.getGajiPokok());
                            System.out.println("Bonus           : Rp "+MANAGER1.getBonus());
                            System.out.println("Tunjangan       : Rp "+MANAGER1.getTunjangan());
                            System.out.println("Tunjangan Istri : Rp "+MANAGER1.getTunjanganIstri());
                            System.out.println("Tunjangan Anak  : Rp "+MANAGER1.getTunjanganAnak());
                            System.out.println("Tunj. Jabatan   : Rp "+MANAGER1.getTunjanganJabatan());
                            System.out.println("Total Gaji      : Rp "+MANAGER1.getGaji());
                            System.out.println("___________________________________________");
                        }
                    }
                    for (PegawaiTetap TETAP1 : TETAP) {
                        if (TETAP1 != null) {
                            System.out.println("Karyawan "+n++);
                            System.out.println("ID Pegawai      : "+TETAP1.getId());
                            System.out.println("Nama Pegawai    : "+TETAP1.getNama());
                            System.out.println("Status Pegawai  : "+TETAP1.getStatus());
                            System.out.println("Jabatan         : "+TETAP1.getJabatan());
                            System.out.println("Lama Kerja      : "+TETAP1.getLamaKerja()+" tahun");
                            System.out.println("Gaji Pokok      : Rp "+TETAP1.getGajiPokok());
                            System.out.println("Bonus           : Rp "+TETAP1.getBonus());
                            System.out.println("Tunjangan       : Rp "+TETAP1.getTunjangan());
                            System.out.println("Tunjangan Istri : Rp "+TETAP1.getTunjanganIstri());
                            System.out.println("Tunjangan Anak  : Rp "+TETAP1.getTunjanganAnak());
                            System.out.println("Total Gaji      : Rp "+TETAP1.getGaji());
                            System.out.println("___________________________________________");
                            }
                    }
                    for (Employee Staff1 : Staff) {
                        if (Staff1 != null) {
                            System.out.println("Karyawan "+n++);
                            System.out.println("ID Pegawai      : "+Staff1.getId());
                            System.out.println("Nama Pegawai    : "+Staff1.getNama());
                            System.out.println("Status Pegawai  : "+Staff1.getStatus());
                            System.out.println("Jabatan         : "+Staff1.getJabatan());
                            System.out.println("Lama Kerja      : "+Staff1.getLamaKerja()+" tahun");
                            System.out.println("Total Gaji      : Rp "+Staff1.getGaji());
                            System.out.println("___________________________________________");
                        }
                    }
                    for (PegawaiTidakTetap NONPNS1 : NONPNS) {
                        if (NONPNS1 != null) {
                            System.out.println("Karyawan "+n++);
                            System.out.println("ID Pegawai      : "+NONPNS1.getId());
                            System.out.println("Nama Pegawai    : "+NONPNS1.getNama());
                            System.out.println("Status Pegawai  : "+NONPNS1.getStatus());
                            System.out.println("Jabatan         : "+NONPNS1.getJabatan());
                            System.out.println("Lama Kerja      : "+NONPNS1.getLamaKerja()+" tahun");
                            System.out.println("Gaji Pokok      : Rp "+NONPNS1.getGajiPokok());
                            System.out.println("Uang Lembur     : Rp "+NONPNS1.getLembur());
                            System.out.println("Total Gaji      : Rp "+NONPNS1.getGaji());
                            System.out.println("___________________________________________");
                        }
                    }
                    break;
                case 0 :
                    System.out.println("Terimakasih telah menggunakan program ini");
                    break;
            }
        } while (menu!=3);
    }
}

    

