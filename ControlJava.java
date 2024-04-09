package ControlTestJava;
import java.util.HashSet;
import java.util.Scanner;

public class ControlJava {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        // -Создать множество ноутбуков.
            Notebook notebook1 = new Notebook("Lenovo", 16, 512, "Windows 11 Home SL", "черный");
            System.out.println(notebook1);
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
        HashMap<Integer, Object> filter = searchNote();
        HashMap<Integer, Notebook> result = (findNote(filter, notebooks));
        if (result.isEmpty()) {
            System.out.println("Нет подходящих ноутбуков.");
        } else {
            System.out.println(result.values());
        }

        scanner.close();
    }

    // создаем коллекцию Map из критериев, которые интересуют пользователя
    public static HashMap<Integer, Object> searchNote() {
        HashMap<Integer, Object> search = new HashMap<>();
        System.out.println("Введите запросы по критериям, если критерий неважен, поставьте 0");
        search.put(1, getSearchBrand());// методы, запрашивающие критерии, ниже
        search.put(2, getSearchRam());
        search.put(3, getSearchSdd());
        search.put(4, getSearchOs());
        search.put(5, getSearchColor());
        return search;
    }

    // создаем метод, который сравнивает существующие ноутбуки с запросом
    public static HashMap<Integer, Notebook> findNote(HashMap<Integer, Object> search, HashSet<Notebook> notebooks) {
        HashMap<Integer, Notebook> findNote = new HashMap<>();
        int mapKey = 1;
        for (Notebook notebook : notebooks) {
            boolean isFind = true;
            for (Map.Entry<Integer, Object> entry : search.entrySet()) {
                int key = entry.getKey();
                if (key == 1) {
                    String brand = entry.getValue().toString();
                    if (!notebook.getBrand().equals(brand) || brand != "0") {
                        isFind = false;
                    }
                } else if (key == 2) {
                    int ram = (int) entry.getValue();
                    if (notebook.getRam() < ram) {
                        isFind = false;
                    }
                } else if (key == 3) {
                    int sdd = (int) entry.getValue();
                    if (notebook.getSdd() < sdd) {
                        isFind = false;
                    }
                } else if (key == 4) {
                    String os = entry.getValue().toString();
                    if (!notebook.getOs().equals(os)|| os != "0") {
                        isFind = false;
                    }
                } else {
                    String color = entry.getValue().toString();
                    if (!notebook.getColor().equals(color) || color != "0") {
                        isFind = false;
                    }
                }
                if(isFind == false){
                    break;
                }
            }
            if (isFind = true) {
                findNote.put(mapKey, notebook);
                mapKey++;
            }

        }
        return findNote;

    }

    // создаем методы, запращивающие критерии:
    public static String getSearchBrand() {
        System.out.println("Введите название бренда:");
        String input = scanner.nextLine();
        return input;
    }

    public static Integer getSearchRam() {
        System.out.println("Введите минимальный объем оперативной памяти: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static Integer getSearchSdd() {
        System.out.println("Введите минимальный объем жесткого диска: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
    public static String getSearchOs() {
        System.out.println("Введите операционную систему:");
        String input = scanner.next();
        return input;
    }

    public static String getSearchColor() {
        System.out.println("Введите цвет:");
        String input = scanner.next();
        return input;
    }
}
            
//            Notebook searchnote;
//            searchnote = setRequest();
//            for (Notebook note : notebooks) {
//                if(searchnote.equals(note)){
//                    System.out.println(note);
//                }
//                else System.out.println("Ноутбук не найден");
//            }
//            scanner.close();
//    }
//
//// Создаем ноутбук по запросу,  с которым будем сравнивать существующие ноутбуки
//
//
//    public static Notebook setRequest() {
//        System.out.println("Введите запрашиваемые критерии, если критерий неважен, введите 0");
//        Notebook searchNotebook = new Notebook(getSearchBrand(), getSearchRam(), getSearchSdd(), getSearchOs(), getSearchColor());
//        System.out.println(searchNotebook);
//        return searchNotebook;
//    }
//
//    public static String getSearchBrand() {
//        System.out.println("Введите название бренда:");
//        String input = scanner.nextLine();
//        if(input == "0"){
//            return null;
//        }
//        else return input;
//    }
//    public static Integer getSearchRam() {
//        System.out.println("Введите минимальный объем оперативной памяти:");
//        int input = scanner.nextInt();
//        if(input == 0){
//            return null;
//        }
//        else return input;
//    }
//
//    public static Integer getSearchSdd() {
//        System.out.println("Введите минимальный объем жесткого диска:");
//        int input = scanner.nextInt();
//        if(input == 0){
//            return null;
//        }
//
//        else return input;
//    }
//
//    public static String getSearchOs() {
//        System.out.println("Введите операционную систему:");
//        String input = scanner.nextLine();
//        if(input == "0"){
//            return null;
//        }
//        else return input;
//    }
//
//    public static String getSearchColor() {
//        System.out.println("Введите цвет:");
//        String input = scanner.nextLine();
//        if(input == "0"){
//            return null;
//        }
//        else return input;
//    }
//
//
//   }
//
