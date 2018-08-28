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
public class Tokobuku {
    public int id_barang;
    public String nama_barang;
    public int harga_barang;
    public String merk_barang;
    
    public Tokobuku(int id_brg,String nama_brg, int harga_brg, String merk_brg )
    {
        this.id_barang = id_brg;
        this.nama_barang = nama_brg;
        this.harga_barang = harga_brg;
        this.merk_barang = merk_brg;
     
    }
    
    public void info()
    {   
        
        System.out.println("ID barang     : "+this.id_barang);
        System.out.println("Nama Barang   : "+this.nama_barang);
        System.out.println("Harga Barang  : "+this.harga_barang);
        System.out.println("Merk Barang   : "+this.merk_barang);
    }
           
}
