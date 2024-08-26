package pack;
import pack.Worker.Address;
import pack.Worker.Contacts;

public class Main {
    public static void main(String[] args) {


        // Создание объектов класса Address и Contacts
        Address address1 = new Address("Україна", "Дніпропетровська область", "місто Дніпро","проспект Олександра Поля", "98-Д", "45");
        Contacts contacts1 = new Contacts("worker1@gmail.com", "+38 (050) 154 31 16");

        Address address2 = new Address("Україна", "Київська область", "місто Київ","вулиця Бригадна", "11", "5");
        Contacts contacts2 = new Contacts("worker2@gmail.com", "+38 (050) 316 47 45");

        // Создание объектов класса Worker
        Worker worker1 = new Worker(1, "Коростельов", "Дмитро", 36, 1, address1, contacts1);
        Worker worker2 = new Worker(2, "Григоренко", "Ігор", 33, 5, address2, contacts2); // gender =  NOT_SPECIFIED, бо не попадає в даіпазон MIN MAX 0 - 2

        // Вывод объектов в консоль
        System.out.println(worker1);
        System.out.println(worker2);
    }
}