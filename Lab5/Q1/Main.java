package javalab5a;

public class Main {

    public static void main(String[] args) {
        
        
        
        //Creating Objects in main.

        Cosmetics cos = new Cosmetics();   
        //cos.display();

        //Calling 
        Cosmetics cos1 = new Cosmetics("Powder", 121);
        cos1.display();

        Cosmetics cos2 = new Cosmetics("Cream", "2019");
        cos2.display();
        

        //Setting name Toxic
        cos.setName("Toxic");
        
        //again display to see changes.
        cos.display();

    }

}
