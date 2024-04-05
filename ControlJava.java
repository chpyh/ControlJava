package ControlTestJava;
import java.util.HashSet;
import java.util.Scanner;

public class ControlJava {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        // -Создать множество ноутбуков.
            Notebook notebook1 = new Notebook("Lenovo", 16, 512, "Windows 11 Home SL", "черный");
            Notebook notebook2 = new Notebook("Asus", 16, 512, "не установлена", "черный");
            Notebook notebook3 = new Notebook("Apple", 8, 256, "macOS", "серебристый");
            Notebook notebook4 = new Notebook("HP",  8, 512, "Windows 11 Home SL", "серебристый");
            Notebook notebook5 = new Notebook("Acer",  16, 512, "не установлена", "серый");
            Notebook notebook6 = new Notebook("Dell", 8, 512, "Linux", "серый");
            Notebook notebook7 = new Notebook("Hier", 16, 512, "не установлена", "черный");

            //System.out.println(cat1);
            //System.out.println(cat2);
            //System.out.println(cat3);
            HashSet<Notebook> notebooks = new HashSet<Notebook>();
            
            notebooks.add(notebook1);
            notebooks.add(notebook2);
            notebooks.add(notebook3);
            notebooks.add(notebook4);
            notebooks.add(notebook4);
            notebooks.add(notebook5);
            notebooks.add(notebook6);
            notebooks.add(notebook7);
            
            Notebook searchnote;
            searchnote = setRequest();
            for (Notebook note : notebooks) {
                if(searchnote.equals(note)){
                    System.out.println(note);
                }
            }
            scanner.close();

    }

// Создаем ноутбук по запросу,  с которым будем сравнивать существующие ноутбуки
    

    public static Notebook setRequest() {
        System.out.println("Введите запрашиваемые критерии, если критерий неважен, введите 0");
        Notebook searchNotebook = new Notebook(getSearchBrand(), getSearchRam(), getSearchSdd(), getSearchOs(), getSearchColor());
        return searchNotebook;
    }

    public static String getSearchBrand() {
        System.out.println("Введите название бренда:");
        String input = scanner.nextLine();
        if(input == "0"){
            return null;
        }
        else return input;
    }
    public static Integer getSearchRam() {
        System.out.println("Введите минимальный объем оперативной памяти:");
        int input = scanner.nextInt();
        if(input == 0){
            return null;
        }
        else return input;
    }

    public static Integer getSearchSdd() {
        System.out.println("Введите минимальный объем жесткого диска:");
        int input = scanner.nextInt();
        if(input == 0){
            return null;
        }
        
        else return input;
    }
    public static String getSearchOs() {
        System.out.println("Введите операционную систему:");
        String input = scanner.nextLine();
        
        if(input == "0"){
            return null;
        }
        else return input;
    }

    public static String getSearchColor() {
        System.out.println("Введите цвет:");
        String input = scanner.nextLine();
        if(input == "0"){
            return null;
        }
        else return input;
    }

   }

