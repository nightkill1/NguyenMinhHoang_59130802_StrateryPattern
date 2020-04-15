/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author hoang
 */
public class Chia implements Tinh{
   
    @Override
    public float Tinh(float a, float b) {
        if(b==0)
        {
            System.out.println("Lỗi Chương trình...");
            return 0;
        }else
        {
            return a / b;
           
        }
        
    }
    
}
