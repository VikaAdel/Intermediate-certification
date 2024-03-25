package Intermediate_Certification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        List<Laptor> laptops = new ArrayList<>();
        laptops.add(new Laptor("Black", "Windows", 8, 500));
        laptops.add(new Laptor("White", "MacOS", 16, 256));
        laptops.add(new Laptor("Silver", "Linux", 4, 1000));

        Map<String, String> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Введите минимальное значение ОЗУ:");
                filters.put("ram", scanner.nextLine());
                break;
            case "2":
                System.out.println("Введите минимальный объем ЖД:");
                filters.put("hdd", scanner.nextLine());
                break;
            case "3":
                System.out.println("Введите операционную систему:");
                filters.put("os", scanner.nextLine());
                break;
            case "4":
                System.out.println("Введите цвет:");
                filters.put("color", scanner.nextLine());
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }

        for (Laptor laptor : laptops) {
            if (filters.containsKey("ram") && laptor.ram < Integer.parseInt(filters.get("ram"))) {
                continue;
            }
            if (filters.containsKey("hdd") && laptor.hdd < Integer.parseInt(filters.get("hdd"))) {
                continue;
            }
            if (filters.containsKey("os") && !laptor.os.equalsIgnoreCase(filters.get("os"))) {
                continue;
            }
            if (filters.containsKey("color") && !laptor.color.equalsIgnoreCase(filters.get("color"))) {
                continue;
            }
            System.out.println(laptor);
        }
    }
}