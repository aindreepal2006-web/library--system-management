package util;

import java.io.*;
import java.util.*;
import model.Book;
import model.Student;

public class FileHandler {

    // 1. Method to load books from the text file
    public static List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();
        try {
            File file = new File("data/books.txt");
            if (!file.exists()) return books;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                books.add(new Book(
                    Integer.parseInt(data[0]), 
                    data[1], 
                    data[2], 
                    Boolean.parseBoolean(data[3])
                ));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    // 2. Method to save the current list of books to the text file
    public static void saveBooks(List<Book> books) {
        try {
            File dir = new File("data");
            if (!dir.exists()) dir.mkdir();

            BufferedWriter bw = new BufferedWriter(new FileWriter("data/books.txt"));
            for (Book b : books) {
                bw.write(b.toString());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. NEW METHOD: Reads and displays the README.txt file
    public static void showReadme() {
        try {
            // Points to the doc folder
            File file = new File("doc/README.txt");
            if (!file.exists()) {
                System.out.println("Could not find README.txt in the doc/ folder.");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\n===== PROJECT DOCUMENTATION =====");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("==================================\n");
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    } // this is the end of showReadme()
    // --- ADD THE NEW CODE HERE ---

    public static List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File("data/students.txt");
            if (!file.exists()) return students;
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(Integer.parseInt(data[0]), data[1], data[2]));
            }
            br.close();
        } catch (Exception e) { e.printStackTrace(); }
        return students;
    }

    public static void saveStudents(List<Student> students) {
        try {
            // It is safer to ensure the directory exists here too
            File dir = new File("data");
            if (!dir.exists()) dir.mkdir();

            BufferedWriter bw = new BufferedWriter(new FileWriter("data/students.txt"));
            for (Student s : students) {
                bw.write(s.id + "," + s.name + "," + s.address);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

} // <--- This must remain the VERY last bracket of the file