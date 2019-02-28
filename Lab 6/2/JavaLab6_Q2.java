/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab6_q2;

import java.util.Scanner;


public class JavaLab6_Q2 {

    public static void main(String[] args) {
        
    IDETools ide=new IDETools();
    
    
    Scanner input=new Scanner(System.in);
    System.out.println("How many IDE TOOLs do you want to enter:");
       
    int sayi;
       sayi=input.nextInt();
       for (int i=1;i<=sayi;i++)
       {
           ide.getInput(i);
           System.out.println(ide);
       }
        
        
    }

        
    }
   

