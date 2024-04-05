package ControlTestJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ControlJava {
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
            findNotebooks(notebooks, setRequest());
    }
    
    // делаем метод, который запрашивает у пользователя, какие критерии ему важны и
    // возвращает ответ в виде целого числа
    //Создаем метод, который создает коллекцию "критерий : значение"
    //создаем коллекции map для хранения пар: число/фильтр - необходимое значение
    /**
     * @return
     */
    public static Notebook setRequest() {
        Scanner scanner = new Scanner(System.in);
        Notebook  noteRequest = new Notebook(null, 0, 0, null, null);
        int questions = 0;
        // вызываем метод, который запросит у пользователи интересующие его критерии и
        // их значения. сохраним их в виде коллекции
        while (questions <= 5){
            if (optionsNumber() == 1) {
                System.out.println("Введите название бренда:");
                String input = scanner.nextLine();
               getBrand
                brand = input;
            } else if (optionsNumber() == 2) {
                System.out.println("Введите минимальный объем оперативной памяти:");
                int input = scanner.nextInt();
            } else if (optionsNumber() == 3) {
                System.out.println("Введите минимальный объем жесткого диска:");
                int input = scanner.nextInt();
            } else if (optionsNumber() == 4) {
                System.out.println("Введите операционную систему:");
                String input = scanner.nextLine();
            } else if (optionsNumber() == 5) {
                System.out.println("Введите цвет:");
                String input = scanner.nextLine();
            }

            request.put(optionsNumber(), input);
            question ++;
        }
        // возвращаем запрос пользователя в виде коллекции
        return request;
    }

    //создаем метод, который запрашивает у пользователя, какие критерии его интересюут
    public static Integer optionsNumber() {
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n" + //
                "    1 - Бренд\n" + //
                "    2 - Оперативная память\n" + //
                "    3 - Объем железного диска\n" + //
                "    4 - Операционная система\n" + //
                "    5 - Цвет");
        @SuppressWarnings("resource")
        int number = new Scanner(System.in).nextInt();
        return number;
    }

    // пишем метод, который сравнивает значения поиска с элементами коллекции ноутбуков
    public Notebook findNotebooks(HashSet<Notebook> notebooks, HashMap<Integer, Object> request){
        int result = 0;
        for(Notebook element : notebooks){
            for (Map.Entry<Integer, Object> entry: request.entrySet()){
                if(element.contains(entry.getValue())) result++;
            }
            if(result == request.size()){
                return element;
            }
                
            }
        return null;        
        
    }
}


