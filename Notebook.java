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
    private Integer ram;
    private Integer sdd;
    private String os;
    private String color;

    public Notebook(String brand, Integer ram, Integer sdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.sdd = sdd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSdd() {
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

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setSdd(Integer sdd) {
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

    @Override
    public boolean equals(Object obj) {
        if(this == obj || this == null){
           return true;
        }
        if(getClass()!= obj.getClass()){
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return (this.brand == notebook.brand) && (this.ram == notebook.ram) && (this.sdd== notebook.sdd) && (this.os== notebook.os) &&(this.color == notebook.color);
    }
    @Override
    public int hashCode() {
        
        return Objects.hash(brand, ram, sdd, os, color);
    }
}



    