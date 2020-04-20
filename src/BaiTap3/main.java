/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) throws ParseException {
        DSSV ds = new DSSV();
        SinhVien sv1= new SinhVien();
        SinhVien sv2= new SinhVien();
        SinhVien sv3= new SinhVien();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        sv1.SinhVien("Nguyen Minh Hoang", date.parse("06/08/1999"), (float) 6.5);
        sv2.SinhVien("Pham Van Toan", date.parse("30/06/1999"), (float) 8.0);
        sv3.SinhVien("Cao Thi Thap", date.parse("04/11/1999"), (float) 7.5);
        ds.nhapds(sv1);
        ds.nhapds(sv2);
        ds.nhapds(sv3);
        
       
        
        System.out.println("danh sách dinh viên sắp xếp theo tên");
        ds.setSS(new SoSanhTheoTen());
        ds.sapSep();
        ds.inDS();
        System.out.println("---------------------------------------");
        System.out.println("danh sách dinh viên sắp xếp theo điểm");
        ds.setSS(new SoSanhTheoDiem());
        ds.sapSep();
        ds.inDS();
    }
}
