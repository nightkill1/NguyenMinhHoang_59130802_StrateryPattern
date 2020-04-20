/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author hoang
 */
public class SinhVien {
    String hoTen;
    int y,m,d;
    Date ngaySinh;
    float diemTB;
    //Setter
    public void SinhVien(String hoTen, Date ngaySinh, float diemTB)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    //Getter
    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }
 
    public void XuatTTSV()
    {
        System.out.print("Họ Tên: "+ hoTen+ "\nNgày Sinh: " + ngaySinh + "\nđiểm TB: " + diemTB + "\n");
        
    }
}
