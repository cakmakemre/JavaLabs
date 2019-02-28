package lavalab6_additional;

import java.util.Scanner;

public class LavaLab6_Additional {

   
    public static void main(String[] args) {
    
    long number;
    number=(long) System.currentTimeMillis();
    System.out.println("The number System Clock = Millisecond method return is "+number);

    
    Time tm=new Time(number);
    tm.displayTime();
    
        System.out.println("Add (a) or Substract (s) time?: ");
        
        Scanner sc = new Scanner(System.in); 
        char inp = sc.next().charAt(0); 
        System.out.println("Your choice is -> "+inp);
        tm.changeTime(inp);
        
        
        

    
        
    }
    
}
