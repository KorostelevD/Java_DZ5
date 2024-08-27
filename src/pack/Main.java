package pack;
import java.util.Scanner;


import pack.Worker;
import pack.Worker.Address;
import pack.Worker.Contacts;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Address та  Contacts
        Address address1 = new Address("Україна", "Дніпропетровська область", "місто Дніпро","проспект Олександра Поля", "98-Д", "45");
        Contacts contacts1 = new Contacts("worker1@gmail.com", "+38 (050) 154 31 16");

        Address address2 = new Address("Україна", "Київська область", "місто Київ","вулиця Бригадна", "11", "5");
        Contacts contacts2 = new Contacts("worker2@gmail.com", "+38 (050) 316 47 45");

        // Створення об'єктів класу Worker
        Worker worker1 = new Worker(1, "Коростельов", "Дмитро", 36, 1, address1, contacts1);
        Worker worker2 = new Worker(2, "Григоренко", "Ігор", 33, 5, address2, contacts2); // gender =  NOT_SPECIFIED, бо не попадає в даіпазон MIN MAX 0 - 2

        /* System.out.println(worker1);
        System.out.println(worker2);*/

        //вивід в консоль
        System.out.println();
        Colors.PINK.out("Працівники :");
        Colors.BLUE.out(worker1);
        Colors.GREEN.out(worker2);


        Scanner scanner = new Scanner(System.in);
        Colors currentColor = Colors.RESET;

        while (true) {
            System.out.print("Введіть текст або назву кольору (введіть 'exit' для виходу): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break; //вихід з циклу
            }

            try {
                // Перевіряємо, чи ввів користувач назву кольору
                currentColor = Colors.valueOf(input.toUpperCase());
                System.out.println("Колір змінено на: " + currentColor + input);

                System.out.println(worker1);
                System.out.println(worker2);

                System.out.println(Colors.RESET);


            } catch (IllegalArgumentException e) {
                // Якщо користувач ввів не назву кольору, просто виводимо текст в поточному кольорі
                System.out.println(currentColor + input + Colors.RESET);

            }
        }
        // Вывод объектов в консоль


    }
}