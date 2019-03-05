/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab5_2;

public class Exam {
    
    private String name,date,type;
    private int percentage,numOfQuestion,duration;

    public Exam() {
        this.name="No Name";
        this.percentage=0;
        this.date="Null";
        this.numOfQuestion=0;
        this.type="Null";
        this.duration=0;
        
    }

    public Exam(String name, String date, String type, int percentage, int numOfQuestion, int duration) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.percentage = percentage;
        this.numOfQuestion = numOfQuestion;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getNumOfQuestion() {
        return numOfQuestion;
    }

    public void setNumOfQuestion(int numOfQuestion) {
        this.numOfQuestion = numOfQuestion;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    public void display(){
        
        System.out.println("Name: "+name);
        System.out.println("Percentage: "+percentage);
        System.out.println("Date: "+date);
        System.out.println("Number of question: "+numOfQuestion);
        System.out.println("Type: "+type);
        System.out.println("Duration: "+duration+"\n");
    }
    
    public void increaseDuration(){
        if(this.numOfQuestion>30){
            this.duration=this.duration+15;
        }
        else if(this.duration>20 && this.duration<30){
            this.duration=this.duration+10;
            
        }
    }
    
    public void changePercantege(){
        
   
        if(this.type.equals("LAB")){
                   this.percentage=this.percentage+10;
        }
         else {
                    this.percentage=this.percentage+5;

        }
        }
}