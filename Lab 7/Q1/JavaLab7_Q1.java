package javalab7_q1;
import java.util.Scanner;

/**
 *
 * @author Emre Çakmak
 */

public class JavaLab7_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter classroom name: ");
        String name=sc.next();
        
        while(!name.equalsIgnoreCase("stop")){
            System.out.println("Enter " +name+ " capacity: ");
            int capacity=sc.nextInt();
            System.out.println("Enter " +name+ " height: ");
            int height=sc.nextInt();
            System.out.println("Enter " +name+ " weight: ");
            int weight=sc.nextInt();
            System.out.println("Enter " +name+ " projector: ");
            boolean projector=sc.nextBoolean();
            
            Classroom c1=new Classroom(name, capacity, height, weight, projector);
            System.out.println("\n"+c1);
            System.out.println("\nArea of "+c1.getName());
            System.out.println(c1.calculateArea());
            System.out.println("Perimeter of"+c1.getName());
            System.out.println(c1.calculatePetimeter());
            
            if(c1.calculatePetimeter()>Classroom.getMAX_HEIGHT()){
                System.out.println("HUGE CLASSROOM");
            }
            else
                System.out.println("NORMAL CLASSROOM");
            
            System.out.println("Enter classroom name:");
            name=sc.next();
            
        }
        
        System.out.println("Total number of classroom: "+Classroom.getTotalClassroom());
        
    }
    
}
