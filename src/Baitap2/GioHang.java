/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

import java.util.ArrayList;

/**
 *
 * @author hoang
 */
public class GioHang {
    IThanhToan TT;

    public void setTT(IThanhToan TT) {
        this.TT = TT;
    }

    public void setDSHH(ArrayList<HangHoa> DSHH) {
        this.DSHH = DSHH;
    }

    public IThanhToan getTT() {
        return TT;
    }

    public ArrayList<HangHoa> getDSHH() {
        return DSHH;
    }
    
    ArrayList<HangHoa> DSHH = new ArrayList<>();
    
    public int ThemHH(HangHoa hh)
    {
        DSHH.add(hh);
        return 1;
    }
    
    public int tienHang(){
        int tienHang = 0;
        for(int i = 0; i < DSHH.size(); i++){
            tienHang += DSHH.get(i).getGia();
        }
        return tienHang;
    }
    
    public double thanhToan( int tienHang){
        return TT.thanhToan(tienHang());
    }
    
    
    public String inDS(){
        int Tong = 0;
        String SP = "";
        
        for(int i = 0; i < DSHH.size(); i++){
            
            Tong++;
            HangHoa hangHoa = DSHH.get(i);
            SP +="Tên Sản Phẩm:\t\t" + hangHoa.getTenHH()+"\n" +
                    "Mô tả:\t\t\t"+hangHoa.mota + "\n" +
                    "Giá:\t\t\t"+hangHoa.getGia()+"\n---------------------------------------\n" ;
            
        }
        
        return  SP + "Số lượng sản phẩm: \t"+ Tong +"\n"+ "Tổng Tiền:\t\t" + thanhToan(Tong);
    }
}
