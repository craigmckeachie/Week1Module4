package com.pluralsight;

public class MethodPractice {


    public static void main(String[] args) {
        String type = "Salsa";
        dance(type, 55);
        dance("Hip Hop", 77);
        dance("Break Dance", 22);
        dance("Tap", 43);

        sayHi("Mario");
        sayHi("Jada");
        sayHi("Malika");


        String whatICaught = fish();
        System.out.println(whatICaught);
//        OR
//        System.out.println(fish());


        int result = add(2,5);
        System.out.println(result);

    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }




    public static String fish(){
//        System.out.println("Get out fishing rod");
//        System.out.println("Bait the hook");
//        System.out.println("Cast");
//        System.out.println("Wait....forever");
        return "Humungous Catfish";
    }

    public static void dance(String typeOfDancing, int magicNumber){
        System.out.printf("I am %s dancing", typeOfDancing);
        System.out.println("Your magic number is:" + magicNumber);
        System.out.println();
    }

    public static void sayHi(String firstName){
        System.out.println("Hi " + firstName);
    }





}
