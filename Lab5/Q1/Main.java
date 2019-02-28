package javalab5a;

public class Main {

    public static void main(String[] args) {
        
        
        
        //Creating Objects in main.

        Cosmeticss cos = new Cosmeticss();   
        //cos.display();

        //Calling 
        Cosmeticss cos1 = new Cosmeticss("Powder", 121);
       //  cos1.display();

        Cosmeticss cos2 = new Cosmeticss("Cream", "2019");
        cos2.display();

        
        //Displaying objects
        

        //Setting name Toxic
        cos.setName("Toxic");
        
        //again display to see changes.
        //cos.display();

    }

}
