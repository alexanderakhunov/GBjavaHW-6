import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(16, 500, "linux", "black");
        Laptop laptop2 = new Laptop(16, 2000, "linux", "white");
        Laptop laptop3 = new Laptop(8, 450, "Windows", "red");
        Laptop laptop4 = new Laptop(8, 250, "Windows", "green");
        Laptop laptop5 = new Laptop(16, 500, "linux", "white");
        Laptop laptop6 = new Laptop(16, 2000, "linux", "black");
        Laptop laptop7 = new Laptop(4, 500, "Windows", "white");
        Laptop laptop8 = new Laptop(4, 500, "Windows", "black");
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        boolean work = true;
        while (work) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите цифру: \n 1 - RAM \n 2 - capacity Hard Disk \n 3 - OS \n 4 - Color \n" +
                    " 5 - Показать результаты");
            int numbConsole = sc1.nextInt();
            int String;
            if (numbConsole <= 5) {
                switch (numbConsole) {
                    case (1):
                        System.out.println("Введите объем RAM: \n 4 GB \n 8 GB \n 16 GB ");
                        int capacityRAM = sc1.nextInt();
                        laptops.removeIf(laptop -> capacityRAM != laptop.getRAM());
                        break;
                    case (2):
                        System.out.println("Введите объем HD: \n 250 GB \n 450 GB \n 500 GB \n 2000 GB  ");
                        int capacityHD = sc1.nextInt();
                        laptops.removeIf(laptop -> capacityHD != laptop.getCapacityHardDisk());
                        break;
                    case (3):
                        System.out.println("Введие операционную систему: \n windows \n linux ");
                        sc1.nextLine();
                        String os = sc1.nextLine();
                        laptops.removeIf(laptop -> (!(os.equals(laptop.getColor()))));
                        break;
                    case (4):
                        System.out.println("Введите цвет: \n black \n white \n red \n green");
                        sc1.nextLine();
                        String color = sc1.nextLine();
                        laptops.removeIf(laptop -> (!(color.equals(laptop.getColor()))));
                        break;
                    case (5):
                        work = false;
                }
            }
        }
        if (laptops.size() > 0) {
            for (Laptop laptop : laptops) {
                System.out.println(laptop);
            }
        } else {
            System.out.println("Ничего не нашли");
        }
    }
}