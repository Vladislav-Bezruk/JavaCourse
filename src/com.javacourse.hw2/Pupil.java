package com.javacourse.hw2;

public class Pupil {

    private static int _age; //возраст
    private static String _name; //имя
    private static int _classroom; //номер
    private static int _rating; //рейтинг

    final static int defAge = 18; //стандартный возраст на случай невалидности
    final static String defName = "Bill"; //стандартное имя на случай невалидности
    final static int defClassroom = 5; //стандартный номер на случай невалидности
    final static int defRating = 4; //стандартный рейтинг на случай невалидности

    public void Answer() { //отвечаем у доски
        System.out.println("Now I will answer in the boards , but I need to prepare");
        Prepare();
        System.out.println("I'm hungry, so I'll eat");
        Eat();
        System.out.println("I answered at the board, I got five points!");
    }

    private void Prepare() { //готовимся отвечать
        System.out.println("Now I'm preparing");
        System.out.println("I'm ready to answer!");
    }

    private void Eat() { //кушаем
        System.out.println("Now I'm eating");
        System.out.println("I'm not hungry now!");
    }

    public int getAge() { //гетер возраста
        return _age;
    }

    public void setAge(int age) { //сетер возраста
        if (age > 0 && age < 150) _age = age;
        else _age = defAge;
    }

    public String getName() { //гетер имени
        return _name;
    }

    public void setName(String name) { //сетер имени
        if (name != "") _name = name;
        else _name = defName;
    }

    public int getClassroom() { //гетер комнаты
        return _classroom;
    }

    public void setClassroom(int classroom) { //сетер комнаты
        if (classroom > 0 && classroom < 20) _classroom = classroom;
        else _classroom = defClassroom;
    }

    public int getRating() { //гетер рейтинга
        return _rating;
    }

    public void setRating(int rating) { //сетер рейтинга
        if (rating > 0 && rating <= 5) _rating = rating;
        else _rating = defRating;
    }
}