/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author hoang
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{
   
    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
       
       if(o1.hoTen.length()>o2.hoTen.length())
       {
           return 1;
       }else
           return 0;
       
    }
    
    
}
