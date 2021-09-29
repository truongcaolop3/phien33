/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien33;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double m;
        long d,y;
        
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        
        double phutcuanam = 60*24*365;
        
        y = (long)(m/phutcuanam);
        d = (long)(m/60/24)%365;
        
        System.out.println((int)m + " minute = "+ y + " year " + d + " day ");
        
        
    }
    
}
