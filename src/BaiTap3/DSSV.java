/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hoang
 */
public class DSSV {
    ISoSanh<SinhVien> Sosanh;
    
    ArrayList<SinhVien> DSSinhVien = new ArrayList<>();
    public void sapSep()
    {
        
    }
    public void nhapds(SinhVien sv )
    {
        DSSinhVien.add(sv);
    }
    
    public void setSS(ISoSanh ss)
    {
        this.Sosanh = ss;
    }
    
    public void sapxep()
    {
        Arrays.sort(DSSinhVien.toArray());   
    }
    public void inDS()
    {
        SinhVien sv = new SinhVien();
        for(int i=0;i<DSSinhVien.size();i++)
        {
            DSSinhVien.get(i).XuatTTSV();
        }
    }
}
