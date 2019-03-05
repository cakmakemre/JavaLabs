/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab5a;

public class Cosmeticss {

    private String name;
    private double price;
    private String ingredients;
    private String expire_date;
    private String brand;
    private int grammage;

    
   public Cosmeticss() {
        this.name="Vaseline";
        this.price=2.0;
        this.ingredients="Aqua,Glycerinn,SLS";
        this.brand="Unilever";
        this.expire_date="2020";
        this.grammage=100;
    }

    public Cosmeticss(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
     public Cosmeticss(String nameof, String expire_date) {
        this.name = nameof;
        this.expire_date = expire_date;
    }

    public String getName() {
        return name;
    }
    
    //Setname method.
    public void setName(String name) {
        this.name = name;
    }
    
    //Display Method.
    public void display(){
            
        System.out.println("******** COSMETICS INFO ********");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Ingredients"+ingredients);
        System.out.println("Expire date: "+expire_date);
        System.out.println("Brand: "+brand);
        System.out.println("Gramage: "+grammage+"\n");
       
}
}
