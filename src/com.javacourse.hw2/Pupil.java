package com.javacourse.hw2;

public class Pupil {

    private int _age; //возраст
    private String _name; //имя
    private int _classroom; //номер
    private int _rating; //рейтинг

    public void answer() { //отвечаем у доски
        System.out.println("Now I will answer in the boards , but I need to prepare");
        prepare();
        System.out.println("I answered at the board, I got five points!");
    }

    public void eat() {
        System.out.println("I'm hungry, so I'll eat");
        System.out.println("Now I'm eating");
        System.out.println("I'm not hungry now!");
    }

    private void prepare() { //готовимся отвечать
        System.out.println("Now I'm preparing");
        System.out.println("I'm ready to answer!");
    }

    public int getAge() { //гетер возраста
        return _age;
    }

    public void setAge(int age) { //сетер возраста
        if (age > 0 && age < 150) _age = age;
        else _age = 17;
    }

    public String getName() { //гетер имени
        return _name;
    }

    public void setName(String name) { //сетер имени
        if (name != "") _name = name;
        else _name = "Student";
    }

    public int getClassroom() { //гетер комнаты
        return _classroom;
    }

    public void setClassroom(int classroom) { //сетер комнаты
        if (classroom > 0 && classroom < 20) _classroom = classroom;
        else _classroom = 10;
    }

    public int getRating() { //гетер рейтинга
        return _rating;
    }

    public void setRating(int rating) { //сетер рейтинга
        if (rating > 0 && rating <= 5) _rating = rating;
        else _rating = 2;
    }
}