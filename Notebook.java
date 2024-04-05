// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.

package ControlTestJava;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Notebook {
    private String brand;
    private int ram;
    private int sdd;
    private String os;
    private String color;

    public Notebook(String brand, int ram, int sdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.sdd = sdd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getSdd() {
        return sdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSdd(int sdd) {
        this.sdd = sdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {

        return "Бренд: " + brand + 
            ",  оперативная память: " + ram + 
            " ГБ , объем жесткого диска: " + sdd +
            " ГБ, операционная система: " + os + ", цвет: " + color;

    }

    public boolean contains(Object value) {
        
    }   
}



    // public int optionsNumber() {
    //     System.out.println("Введите цифру, соответствующую необходимому критерию:\n" + //
    //             "    1 - Бренд\n" + //
    //             "    2 - Оперативная память\n" + //
    //             "    3 - Объем железного диска\n" + //
    //             "    4 - Операционная система\n" + //
    //             "    5 - Цвет");
    //     Scanner scanner = new Scanner(System.in);
    //     int number = scanner.nextInt();
    //     return number;
    // }

    // создаем коллекции map для хранения пар: число/фильтр - необходимое значение
    //public HashMap<Integer, Object> setRequest() {

        // HashMap<Integer, Object> request = new HashMap<>();
        // int question = 1;
        // // запрашиваем, сколько критериев собирается вводить пользователь
        // System.out.println("Сколько критериев будет для поиска подходящего компьютера");
        // Scanner scanner = new Scanner(System.in);
        // int optionsCount = scanner.nextInt();

        // // вызываем метод, который запросит у пользователи интересующие его критерии и
        // // их значения. сохраним их в виде коллекции
        // while (question <= optionsCount) {
        //     if (optionsNumber() == 1) {
        //         System.out.println("Введите название бренда:");
        //     } else if (optionsNumber() == 2) {
        //         System.out.println("Введите минимальный объем оперативной памяти:");
        //     } else if (optionsNumber() == 3) {
        //         System.out.println("Введите минимальный объем жесткого диска:");
        //     } else if (optionsNumber() == 4) {
        //         System.out.println("Введите операционную систему:");
        //     } else if (optionsNumber() == 5) {
        //         System.out.println("Введите цвет:");
        //     }

        //     scanner = new Scanner(System.in);
        //     String input = scanner.next();
        //     request.put(optionsNumber(), input);
        //     question += 1;
        // }
        // // возвращаем запрос пользователя в виде коллекции
        // return request;
    


// @Override
// public boolean equals(Object obj) {
// if(this == obj){
// return true;
// }
// if(this == null || getClass()!= obj.getClass()){
// return false;
// }
// Notebook Note = (Notebook) obj;
// return (this.age == cat.age) && (this.color == cat.color) && (this.gender==
// cat.gender) && (this.name == cat.name);
// }

// }
