package lavalab6_additional;

import java.util.Scanner;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(long hour, long minute, long second) {
        this.hour = (int) hour;
        this.minute = (int) minute;
        this.second = (int) second;
    }

    Time() {

    }

    Time(long number) {
        hour = (int) (number / 1000 / 60 / 60);
        minute = (int) (number / 1000 / 60);
        second = (int) (number / 1000);
    }

    public void displayTime() {

        System.out.println("\nHour:" + hour + "\nMinute:" + minute + "\nSecond:" + second);
    }

    public void changeTime(char inp) {

        System.out.println("Enter the amount of the hour: ");
        Scanner sc = new Scanner(System.in);

        if (inp == 'a') {
            int sayi = sc.nextInt();
            this.hour = this.hour + sayi;

            System.out.println("Enter the amount of the minute: ");
            int sayi2 = sc.nextInt();
            this.minute = this.minute + sayi2;

            System.out.println("Enter the amonut of the second: ");
            int sayi3 = sc.nextInt();
            this.second = this.minute + sayi3;
        }
        else if(inp=='s'){
           int sayi = sc.nextInt();
            this.hour = this.hour - sayi;

            System.out.println("Enter the amount of the minute: ");
            int sayi2 = sc.nextInt();
            this.minute = this.minute - sayi2;

            System.out.println("Enter the amonut of the second: ");
            int sayi3 = sc.nextInt();
            this.second = this.minute - sayi3;
        }
            System.out.println("Time Has Changed!");

            System.out.println("Hours= " + this.hour);
            System.out.println("Minutes= " + this.minute);
            System.out.println("Seconds= " + this.second);

        }
       
    }
