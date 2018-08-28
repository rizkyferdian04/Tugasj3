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
public class Transaksi extends Pembeli{
    
    public int total;
    
    public Transaksi(int id_pembeli,String nama_pembeli,String alamat,int 
            no_telp, int id_brg, String nama_brg,int harga_brg, 
            String merk_brg,int total)
    {
        super(id_pembeli,nama_pembeli,alamat,no_telp,id_brg, 
                nama_brg,harga_brg,merk_brg);
         
          this.total = total;
     }
     public void info()
         {
             
             super.info();
             System.out.println("Total         : "+this.total);
         }
 
    
    }

