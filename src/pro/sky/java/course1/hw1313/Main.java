package pro.sky.java.course1.hw1313;

import pro.sky.java.course1.hw1313.Author;
import pro.sky.java.course1.hw1313.Book;

public class Main {
    public static void main(String[] args) {
        Author spenser = new Author("Spenser", "Johnson");
        Author strofilov = new Author("Yriy", "Strofilov");
        Author axat = new Author("Federico", "Axat");

        Book cheese = new Book(spenser, "Where id my Cheese", 1998);
        Book running = new Book(strofilov, "Not about running", 2019);
        Book amnesia = new Book(axat, "Amnesia", 2018);

        cheese.setPublicationYear(1998);

        System.out.println(cheese);
        System.out.println(running);
        System.out.println(amnesia);
    }
}