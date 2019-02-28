/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab6_q1;

public class Museum {
    
    int number;
    String name;
    double entrance_price;
    String holiday;
    String city;

    public Museum(String name, double entrance_price, String holiday, String city) {
        this.name = name;
        this.entrance_price = entrance_price;
        this.holiday = holiday;
        this.city = city;
        this.number=(int) ((Math.random()*20)+1);
    }

    @Override
    public String toString() {
        return "----Museum----" + "\nNumber=" + number + "\nName=" + name + "\nEntrance_price=" + entrance_price + "\nHoliday=" + holiday + "\nCity=" + city;
    }
    
}

