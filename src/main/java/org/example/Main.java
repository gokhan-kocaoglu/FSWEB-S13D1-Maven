package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("---------------");
        System.out.println(shouldWakeUp(true,14));
        System.out.println(shouldWakeUp(true,21));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(false,21));
        System.out.println("---------------");
        System.out.println(hasTeen(19,55,42));
        System.out.println(hasTeen(27,55,42));
        System.out.println(hasTeen(27,55,13));
        System.out.println(hasTeen(39,16,42));
        System.out.println("---------------");
        System.out.println(isCatPlaying(true,38));
        System.out.println(isCatPlaying(true,46));
        System.out.println(isCatPlaying(false,40));
        System.out.println(isCatPlaying(false,25));
        System.out.println("---------------");
        System.out.println(area(5,6));
        System.out.println(area(-1,9));
        System.out.println("---------------");
        System.out.println(area(5));
        System.out.println(area(-9));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }

        if (!isBarking) {
            return false;
        }

        return (clock < 8 || clock >= 20);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit= isSummer ? 45 : 35;
        return temp <= upperLimit && temp >= 25;
    }

    public static double area(double width, double height) {
       if( width < 0 || height<0){
           return -1;
       }

       return width*height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
