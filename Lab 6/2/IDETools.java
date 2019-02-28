/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab6_q2;

import java.util.Scanner;


public class IDETools {
    private String name;
    private double version;
    private String suppertedLanguages;
    private String drawbacks;

    public IDETools() {
        this.name = name;
        this.version = version;
        this.suppertedLanguages = suppertedLanguages;
        this.drawbacks = drawbacks;
    }

  

    @Override
    public String toString() {
        return "IDETools" + "\nName=" + name + "\nVersion=" + version + "\nUppertedLanguages=" + suppertedLanguages + "\nDrawbacks=" + drawbacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getSuppertedLanguages() {
        return suppertedLanguages;
    }

    public void setSuppertedLanguages(String suppertedLanguages) {
        this.suppertedLanguages = suppertedLanguages;
    }

    public String getDrawbacks() {
        return drawbacks;
    }

    public void setDrawbacks(String drawbacks) {
        this.drawbacks = drawbacks;
    }

    public void getInput(int i) {
         Scanner input=new Scanner(System.in);
       
        
          System.out.println("Enter "+i+". IDE name");
          name=input.nextLine();
          System.out.println("Enter version:");
          version=input.nextDouble();
          input.skip("\n");
          System.out.println("Enter sup language");
          suppertedLanguages=input.nextLine();
          System.out.println("Enter Drawbacks");
          drawbacks=input.nextLine();
        
        
    }
   
    
}
