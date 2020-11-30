package com.javacourse.hw1;

import java.util.*;

public class Main {

    public static Scanner scan = new Scanner(System.in); //инициализация сканера

    public static void main(String[] args) {
        name();
        age();
        number();
    }

    public static void name() { //метод для имени
        System.out.println("Enter your name:");
        System.out.println(reverse(scan.nextLine())); //вывод реверс имени
    }

    public static String reverse(String a) { //метод для реверса
        StringBuilder b = new StringBuilder(a);
        b.reverse(); //сам реверс
        return b.toString();
    }

    public static void age() { //метод для возраста
        System.out.println("Enter your age:");
        caseAge(scan.nextInt()); //передача возраста в метод для сравнения
    }

    public static void caseAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative , pls try again"); //первое условие
            age();
        }
        if (age >= 0 && age < 18) System.out.println("Do your homework"); //второе условие
        if (age >= 18) System.out.println("Go to Poland for strawberries"); //третье условие
    }

    public static void number() {
        int[] arr = scanArr(); //читаем массив

        System.out.println("Max number = " + Arrays.stream(arr).max().getAsInt()); //находим максимальное число
        System.out.println("Min number = " + Arrays.stream(arr).min().getAsInt()); //находим минимальное число
    }

    public static int[] scanArr() {
        int[] scanArr = new int[5];

        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println("Enter " + i + " number:");
            scanArr[i - 1] = scan.nextInt(); //читаем сам массив чисел
        }
        return scanArr;
    }
}