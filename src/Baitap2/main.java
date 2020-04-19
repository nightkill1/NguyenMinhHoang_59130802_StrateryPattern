/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

/**
 *
 * @author hoang
 */
public class main {
    
    
    public static void main(String[] args) {
        GioHang gh = new GioHang();
        GioHang gh2 = new GioHang();
        
        
        HangHoa hh1 = new HangHoa ("Iphone 6", 6000 ,"điện thoại") {};
        HangHoa hh2 = new HangHoa ("MSI GL7000", 20000 ,"Laptop") {};
        HangHoa hh3 = new HangHoa ("Logitech P300", 1500 ,"Tai Nghe") {};
        HangHoa hh4 = new HangHoa ("SamSung Note7", 14000 ,"điện thoại") {};
        HangHoa hh5 = new HangHoa ("MacBook pro", 40000 ,"Laptop") {};
        HangHoa hh6 = new HangHoa ("SoundMax", 1500 ,"Loa") {};
        gh.ThemHH(hh1);
        gh.ThemHH(hh2);
        gh.ThemHH(hh3);
        gh2.ThemHH(hh4);
        gh2.ThemHH(hh5);
        gh2.ThemHH(hh6);
        
        gh.setTT(new ThanhToanOnline());
        gh2.setTT(new ThanhToanCOD());
        
        System.out.println("\t \t \t -------Giỏ Hàng 1------ \t \t \t ");
        System.out.println(gh.inDS());
        
        System.out.println("\t \t \t -------Giỏ Hàng 2------ \t \t \t ");
        System.out.println(gh2.inDS());
        
    }
    
    
    
    
    
}
