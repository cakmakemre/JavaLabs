/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab6_q1;

/**
 *
 * @author Emre Cakmak
 */

public class JavaLab6_Q1 {
    public static void main(String[] args) {
        
        Museum m1= new Museum("Cumhuriyet",6.0,"FRIDAY","Ankara");  
        Museum m2= new Museum("Mevlana",15.0,"MONDAY","Konya");  
        Museum m3= new Museum("Topkapi Sarayi",25.0,"NONE","Istanbul");  
        Museum m4= new Museum("Konuralp",5.0,"TUESDAY","DUZCE");  

       
        System.out.println(m1);
        System.out.println(m2); 
        System.out.println(m3);
        System.out.println(m4);

    }
    
}
