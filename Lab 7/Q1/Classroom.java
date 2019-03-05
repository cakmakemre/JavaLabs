/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab7_q1;

/**
 *
 * @author Emre Çakmak
 * 
 */
public class Classroom {
    
    private String name;
    private int capacity;
    private int height;
    private int weight;
    private boolean projector;
    private static int totalClassroom;
    private static final int MAX_HEIGHT=200;

    public Classroom(String name, int capacity, int height, int weight, boolean projector) {
        this.name = name;
        this.capacity = capacity;
        this.height = height;
        this.weight = weight;
        this.projector = projector;
        totalClassroom++;
    }

    public String getName() {
        return name;
    }

    public static int getTotalClassroom() {
        return totalClassroom;
    }

    public static int getMAX_HEIGHT() {
        return MAX_HEIGHT;
    }

  
    public double calculateArea(){
        
        return height*weight;
    }
    
    public double calculatePetimeter(){
        return 2*(height+weight);
    }
    
      @Override
    public String toString() {
        return "\nClassroom Info" + "\nName=" + name + "\nCapacity=" + capacity + "\nHeight=" + height + "\nWeight=" + weight + "\nProjector=" + projector;
    }
    
    
}
