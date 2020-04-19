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
public interface ISoSanh {
    public int SoSanh(T o1, T o2 )
    {
        if(o1 > o2){
            return 1;
        }else if(o1 == o2 ){
            return 0;
        }else{
            return -1;
        }
        
    }
}
