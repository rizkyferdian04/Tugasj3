/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rizky17
 */
public class Pembeli extends Tokobuku{
    
    public int id_pembeli;
    public String nama_pembeli;
    public String alamat;
    public int no_telp;
    
    
    public Pembeli(int id_pembeli,String nama_pembeli,String alamat,int no_telp,
            int id_brg, String nama_brg,int harga_brg, String merk_brg)
    {
        super(id_brg, nama_brg,harga_brg,merk_brg);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    @Override
    public void info()
    {
        System.out.println("Id Pembeli    : " +this.id_pembeli);
        System.out.println("Nama Pembeli  : " +this.nama_pembeli);
        System.out.println("Alamat        : " +this.alamat);
        System.out.println("NO Telp       : " +this.no_telp);
        super.info();
        
    }
    
}
