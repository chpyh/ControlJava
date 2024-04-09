// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.

package ControlTestJava;
import java.util.Objects;


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
            " ГБ, операционная система: " + os + 
            ", цвет: " + color;

    }

   @Override
   public int hashCode() {

       return Objects.hash(brand, ram, sdd, os, color);
   }
}



    