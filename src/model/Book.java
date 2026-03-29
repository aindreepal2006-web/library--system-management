package model;

public class Book {
    public int id;
    public String name;
    public String author;
    public boolean issued;

    // Constructor to initialize the Book object
    public Book(int id, String name, String author, boolean issued) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.issued = issued;
    }

    // Overriding toString() to display book details easily
    @Override
    public String toString() {
        return id + "," + name + "," + author + "," + issued;
    }
} 
    

