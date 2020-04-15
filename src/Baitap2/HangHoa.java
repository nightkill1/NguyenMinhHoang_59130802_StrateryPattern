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
public abstract class HangHoa {

    public HangHoa(String TenHH, int gia, String mota) {
        this.TenHH = TenHH;
        this.gia = gia;
        this.mota = mota;
    }
    
    public String TenHH;
    public int gia;
    public String mota;

    public String getTenHH() {
        return TenHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
    
}
