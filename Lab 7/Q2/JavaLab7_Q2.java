/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab7_q2;

import java.util.Scanner;

/**
 *
 * @author Emre Çakmak
 */


public class JavaLab7_Q2 {
          
    public static void display(Cargo c1){
            System.out.println("Cargo Information");
            System.out.println("Name: "+c1.getName());
            System.out.println("Website: "+c1.getWebsite());
            System.out.println("Phone: "+c1.getPhone());
            System.out.println("Number of Branch: "+c1.getNumOfBranch());
        }
       
    public static double calculatePrice(Cargo c1,double gr){
            
        double price=0;
        if(c1.getNumOfBranch()>20){
            price=gr*5;
            
        }
        else{
            price=gr*3.5;
        }
        
        return price;
          
       }
        
        
    
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     int n,gr;
     double price;
             
     System.out.println("Enter how many cargo info is entered: ");
     n=sc.nextInt();
     
     for(int i=0;i<n; i++){
         Cargo c1= new Cargo();
         c1.getInput();
         
         System.out.println("Enter packet gr:");
         gr=sc.nextInt();
         
         display(c1);
         
         price=calculatePrice(c1,gr);
         System.out.println(c1.getName()+" send your "+"packet "+price+" TL");
     }
        
        
        System.out.println("Total number of braches for all cargo: "+Cargo.getTotalNumOfCargoBranch());
        
  
      
        
    }
   
}
