package com.javacourse.hw2;

public class Main {

    public static Pupil pupil = new Pupil(); //наследуем класс

    public static void main(String[] args) {

        pupil.setName("Nick"); //сетим имя
        System.out.println("Name set " + pupil.getName()); //получаем имя
        pupil.setAge(15); //сетим возраст
        System.out.println("Age set " + pupil.getAge()); //получаем возраст
        pupil.setClassroom(10); //сетим номер комнаты
        System.out.println("Classroom set " + pupil.getClassroom()); //получаем номер комнаты
        pupil.setRating(5); //сетим рейтинг
        System.out.println("Rating set " + pupil.getRating()); //получаем рейтинг

        pupil.answer(); //метод answer
        pupil.eat(); //кушаем

        //pupil.Eat() и pupil.Prepare недоступны потому что эти методы приватные
    }
}