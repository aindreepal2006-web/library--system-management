package service;

import java.util.*;
import model.Book;
import model.Student;
import util.FileHandler; 
 
 public class LibraryService {
    private List<Book> books;
    private List<Student> students;
private Map<Integer, Integer> issuedRecords; //bookId -> studentId

public LibraryService() {
    this.books = FileHandler.loadBooks();
    this.students = FileHandler.loadStudents();
    this.issuedRecords = new HashMap<>();
}

     // ------------------ BOOK METHODS ------------------

    public void addBook(int id, String name, String author) {
        books.add(new Book(id, name, author, false));
        FileHandler.saveBooks(books);
    }
    public void deleteBook(int id) {
        books.removeIf(b -> b.id == id);
        FileHandler.saveBooks(books);
    }

    public void searchBook(String name) {
        for (Book b : books) {
            if (b.name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(b.name + " found");
            }
        }
    }

    public void viewBooks() {
        for (Book b : books) {
            System.out.println(b.id + " | " + b.name + " | " + b.author + " | " + (b.issued ? "Issued" : "Available"));
        }
    }

    // ------------------ STUDENT METHODS ------------------

    public void addStudent(int id, String name, String address) {
        students.add(new Student(id, name, address));
        // This line saves the new student to data/students.txt
       util.FileHandler.saveStudents(students);
    
       System.out.println("Student added and saved succesfully!");
}
    

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
            return;
        }
        for (Student s : students) {
            System.out.println(s.id + " | " + s.name + " | " + s.address);
        }
    }

    // ------------------ TRANSACTION METHODS ------------------

    public void issueBook(int bookId, int studentId) {
        for (Book b : books) {
            if (b.id == bookId) {
                if (!b.issued) {
                    b.issued = true;
                    issuedRecords.put(bookId, studentId);
                    System.out.println("Book Issued to Student " + studentId);
                } else {
                    System.out.println("Book Not Available");
                }
                FileHandler.saveBooks(books);
                return;
            }
        }
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {
                b.issued = false;
                issuedRecords.remove(bookId);
                System.out.println("Book Returned");
                FileHandler.saveBooks(books);
                return;
            }
        }
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public Map<Integer, Integer> getIssuedRecords() {
        return issuedRecords;
    }
    public void setIssuedRecords(Map<Integer, Integer> issuedRecords) {
        this.issuedRecords = issuedRecords;
    }
}
