package pack;

//Клас Worker
public class Worker {
    //Поля класу Worker
    private int id;
    private String surname;
    private String name;
    private int age;
    private int gender;
    private Address address;
    private Contacts contacts;

    // Конструктор с параметрами
    public Worker(int id, String surname, String name, int age, int gender, Address address, Contacts contacts) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.setGender(gender); // Используем сеттер для установки значения пола
        this.address = address;
        this.contacts = contacts;
    }

    // Гетери та сетери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if (gender < Gender.MIN || gender > Gender.MAX) {
            this.gender = Gender.NOT_SPECIFIED;
        } else {
            this.gender = gender;
        }
    }

    public String getGenderAsString() {
        switch (gender) {
            case Gender.MALE:
                return "MALE";
            case Gender.FEMALE:
                return "FEMALE";
            case Gender.NOT_SPECIFIED:
            default:
                return "NOT_SPECIFIED";
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }


    //Додаємо метод to String
    @Override
    public String toString() {
        return "Worker #" + id + " (" +
                "id = " + id +
                "; Surname = " + surname +
                "; Name = " + name  +
                "; age = " + age +
                "; gender = " + getGenderAsString() + ";" + "\n" +
                "address = " + address + ";" + "\n"+
                "contacts=" + contacts + ")"+ "\n" ;
    }

    // Додаю вкладений клас Gender з набором статичних констант
    public static class Gender {
        public static final int NOT_SPECIFIED = 0;
        public static final int MALE = 1;
        public static final int FEMALE = 2;

        public static final int MIN = NOT_SPECIFIED;
        public static final int MAX = FEMALE;
    }

    // Додаємо вкладений клас Address з полями
    public static class Address {
        private String country;
        private String region;
        private String town;
        private String street;
        private String house;
        private String apartment;

        // Конструктор без параметрів
        public Address() {
        }

        // Конструктор з усіма параметрами
        public Address(String country, String region, String town, String street, String house, String apartment) {
            this.country = country;
            this.region = region;
            this.town = town;
            this.street = street;
            this.house = house;
            this.apartment = apartment;
        }

        // Гетери та сетери
        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getHouse() {
            return house;
        }

        public void setHouse(String house) {
            this.house = house;
        }

        public String getApartment() {
            return apartment;
        }

        public void setApartment(String apartment) {
            this.apartment = apartment;
        }

        // Перевизначення методу toString
        @Override
        public String toString() {
            return country + ", " + region + ", " + town + ", " + street + ", " + house + "/" + apartment;
        }
    }

    // Вкладений клас Contacts
    public static class Contacts {
        private String mail;
        private String phone;

        // Конструктор без параметрів
        public Contacts() {
        }

        // Конструктор з параметрами
        public Contacts(String mail, String phone) {
            this.mail = mail;
            this.phone = phone;
        }

        // Гетери та сетери
        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        // Перевизначення методу toString
        @Override
        public String toString() {
            return "Email: " + mail + ", Phone: " + phone;
        }
    }
}