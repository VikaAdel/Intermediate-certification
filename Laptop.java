// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

package Intermediate_Certification;

import java.util.*;

public class Laptop {
    // Поля класса Laptop
    private String model; // Модель ноутбука
    int ram; // Оперативная память (ОЗУ)
    private int hdd; // Объем жесткого диска
    private String os; // Операционная система
    private String color; // Цвет

    // Конструктор класса Laptop
    public Laptop(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public Laptop(String string, String string2, int i, int j) {
        
    }

    // Методы доступа к полям класса Laptop
    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод для отображения информации о ноутбуке
    @Override
    public String toString() {
        String s = "";
        s = "Модель: " + model + "\n";
        s = s + "     Цвет: " + color + "\n";
        s = s + "     ОЗУ: " + Integer.toString(ram) + "\n";
        s = s + "     ЖД: " + hdd + "\n";
        s = s + "     Операционная система: " + os + "\n";

        return s;

    }
}