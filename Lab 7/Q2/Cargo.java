/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab7_q2;

import java.util.Scanner;


/**
 *
 * @author emre
 * 
 */
public class Cargo {
    
    private String name;
    private String website;
    private String phone;
    private int numOfBranch;
    private static int totalNumOfCargoBranch=0;

    
    //Default
    public Cargo() {
        this("null","null","null",0);
    }

    
    //NonDefault
    public Cargo(String name, String website, String phone, int numOfBranch) {
        this.name = name;
        this.website = website;
        this.phone = phone;
        this.numOfBranch = numOfBranch;
        totalNumOfCargoBranch+=numOfBranch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumOfBranch() {
        return numOfBranch;
    }

    public void setNumOfBranch(int numOfBranch) {
        this.numOfBranch = numOfBranch;
    }
    
     public void getInput() {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Cargo Name: ");
        this.name = sc.nextLine();
         System.out.println("Enter Web Site: ");
        this.website = sc.next();
         System.out.println("Enter Phone:");
        this.phone = sc.next();
         System.out.println("How Many Branch?: ");
        this.numOfBranch = sc.nextInt();
        totalNumOfCargoBranch+=numOfBranch;
    }
    
    
    public static int getTotalNumOfCargoBranch() {
        return totalNumOfCargoBranch;
    }
    
    
    
}
