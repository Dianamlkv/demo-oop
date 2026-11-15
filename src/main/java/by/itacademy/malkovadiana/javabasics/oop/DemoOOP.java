package by.itacademy.malkovadiana.javabasics.oop;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class DemoOOP {
    static void main(String[] args) {
        Faker faker = new Faker();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).setId(i + 1);
            customers.get(i).setSurname(faker.name().lastName());
            customers.get(i).setName(faker.name().firstName());
            customers.get(i).setPatronymic(faker.name().firstName());//в фейкере нет отчества :(
            customers.get(i).setAddress(faker.address().fullAddress());
            customers.get(i).setNumberOfCard(faker.finance().creditCard());
            customers.get(i).setNumberOfBankAccount(faker.finance().iban());
        }

        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Info about customer with ID = " + customers.get(i).getId()
                    + ":\n\t Surname: " + customers.get(i).getSurname()
                    + "\n\t Name: " + customers.get(i).getName()
                    + "\n\t Patronymic: " + customers.get(i).getPatronymic()
                    + "\n\t Address: " + customers.get(i).getAddress()
                    + "\n\t Credit card number: " + customers.get(i).getNumberOfCard()
                    + "\n\t Bank account number: " + customers.get(i).getNumberOfBankAccount());
        }

        Book book = new Book();
        book.setId(10593526);
        book.setName("К востоку от Эдема");
        book.setAuthor("Джон Стейнбек");
        book.setPublishingHouse("АСТ");
        book.setPublishingYear(2022);
        book.setPages(960);
        book.setPrice(23_54);
        int bookId = book.getId();
        String bookName = book.getName();
        String bookAuthor = book.getAuthor();
        String bookPublishingHouse = book.getPublishingHouse();
        int bookPublishingYear = book.getPublishingYear();
        int bookPages = book.getPages();
        int bookPrice = book.getPrice();
        System.out.println("Info about book with ID = " + bookId
                + ":\n\tName: " + bookName
                + "\n\tAuthor(s): " + bookAuthor
                + "\n\tPublishing house: " + bookPublishingHouse
                + "\n\tPublishing year: " + bookPublishingYear
                + "\n\tPages: " + bookPages
                + "\n\tPrice = " + bookPrice + " Br");

        Car car1 = new Car();
        Car car2 = new Car();
        car1.setId(142679173);
        car2.setId(138694535);
        car1.setBrand("Audi");
        car2.setBrand("Mercedes-Benz E-Класс");
        car1.setModel("A6 C8");
        car2.setModel("W213, S213, C238");
        car1.setYear(2018);
        car2.setYear(2022);
        car1.setColor("чёрный");
        car2.setColor("серый");
        car1.setPrice(117101);
        car2.setPrice(131964);
        car1.setRegistrationNumber("5357 AB-1");
        car2.setRegistrationNumber("9728 AB-7");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Info about car with ID = " + cars.get(i).getId()
                    + ":\n\t Barnd: " + cars.get(i).getBrand()
                    + "\n\t Model: " + cars.get(i).getModel()
                    + "\n\t Year: " + cars.get(i).getYear()
                    + "\n\t Color: " + cars.get(i).getColor()
                    + "\n\t Price = " + cars.get(i).getPrice()
                    + "\n\t Registration number: " + cars.get(i).getRegistrationNumber());

        }

        User user = new User();
        user.setName("Ivan");
        System.out.println("Users name: " + user.getName());
        Student student = new Student();
        student.setName("Masha");
        student.setGrant(120);
        System.out.println("Students name: " + student.getName()
                +"\nGrant = "+student.getGrant()
                +"\nIncome = "+student.getIncome());
        Person person = new Person();
        person.setName("Katya");
        person.setGrant(130);
        person.setSalary(2200);
        System.out.println("Persons name: " + person.getName()
                +"\nGrant = "+person.getGrant()
                +"\nSalary = "+person.getSalary()
                +"\nIncome = "+person.getIncome());
    }
}
