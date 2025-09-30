package com.pluralsight;

public class IfExample {

    public static void main(String[] args) {

        int age = 76;
        bounce(age);
    }

    private static void bounce(int age) {
        if ( age >= 21 && age <=75 ){
            System.out.println("You can enter the bar.");
        }else if(age >= 75){
            System.out.println("Go home grandpa!");
        }
        else{
            System.out.println("Go home punk.");
        }
    }


}
