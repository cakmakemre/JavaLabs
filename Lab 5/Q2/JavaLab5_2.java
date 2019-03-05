/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab5_2;

public class JavaLab5_2 {
    
    
    public static void main(String[] args) {
        Exam exams=new Exam("487Midterm","20/02/2019","LAB",20,21,135);
        exams.display();
        
        Exam exam2=new Exam("359Quiz1","25/03/2019","ESSAY",10,25,120);
        exam2.display();
        
        exams.changePercantege();
        exams.display();
        
        exam2.increaseDuration();
        exams.display();
    }
    
    
    
}
