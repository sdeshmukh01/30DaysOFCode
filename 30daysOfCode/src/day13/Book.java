package day13;

/**
 * Created by himu on 3/3/2018.
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

}
