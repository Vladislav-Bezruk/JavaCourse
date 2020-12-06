package com.javacourse.hw2;

public class Pupil {

    private int age; //возраст
    private String name; //имя
    private int classroom; //номер
    private int rating; //рейтинг

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
        return age;
    }

    public void setAge(int age) { //сетер возраста
        if (age > 0 && age < 150) this.age = age;
        else this.age = 17;
    }

    public String getName() { //гетер имени
        return name;
    }

    public void setName(String name) { //сетер имени
        if (name != "") this.name = name;
        else this.name = "Student";
    }

    public int getClassroom() { //гетер комнаты
        return classroom;
    }

    public void setClassroom(int classroom) { //сетер комнаты
        if (classroom > 0 && classroom < 20) this.classroom = classroom;
        else this.classroom = 10;
    }

    public int getRating() { //гетер рейтинга
        return rating;
    }

    public void setRating(int rating) { //сетер рейтинга
        if (rating > 0 && rating <= 5) this.rating = rating;
        else this.rating = 2;
    }
}