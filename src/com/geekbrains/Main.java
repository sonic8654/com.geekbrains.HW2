package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 10));
        inteGer(10);
        System.out.println(rev(-10));
        hwDone("Success", 5);
        System.out.println(leapYear(2100));
    }

    private static boolean checkSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void inteGer(int c){
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean rev(int d){
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void hwDone(String string, int n){
        for (int i = n; i >= 0; i--) {
            System.out.println(string);
        }
    }
    public static boolean leapYear(int year){
        if (year % 4 == 0 && ((year / 100) % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
