package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane; // есть у льва грива или нет

    public Lion(String sex) throws Exception { //конструктор класса Lion, он может выбрасывать исключение
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    // Feline feline = new Feline(); //Создан объект класса Feline и сохраняется в переменную feline

    public int getKittens() {
        return super.getKittens(); // Метод возвращает количество котят, используя метод getKittens
    }

    public boolean doesHaveMane() {
        return hasMane; // Метод doesHaveMane возвращает значение переменной hasMane, которое указывает, есть ли у льва грива
    }

    public List<String> getFood() throws Exception {
        return super.getFood("Хищник"); // Метод getFood() вызывает метод getFood("Хищник") и возвращает список продуктов питания, которые ест лев. Этот метод также может выбрасывать исключение.
    }
}
