package main;

import java.util.Scanner;
import service.LibraryService; // This connects Main to your logic

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService lib = new LibraryService();

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Add Student");
            System.out.println("6. View Students");
            System.out.println("7. Search Book");
            System.out.println("8. Delete Book");
            System.out.println("9. Exit");
            System.out.println("10. View README (Docs)"); // Added Option 10 to Menu

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(id, name, author);
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    lib.issueBook(bid, sid);
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int sid2 = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String addr = sc.nextLine();
                    lib.addStudent(sid2, sname, addr);
                   //Calls LibraryService logic
                    break;

                case 6:
                // Calls LibraryService to list all students // Calls LibraryService to list all students
                    lib.viewStudents();
                    break;

                case 7:
                    System.out.print("Enter Book Name: ");
                    sc.nextLine(); // Consume newline
                    lib.searchBook(sc.nextLine());
                    break;

                case 8:
                    System.out.print("Enter Book ID to delete: ");
                    lib.deleteBook(sc.nextInt());
                    break;

                case 9:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break; // Good practice to include break

                case 10:
                    // This calls the method you added to FileHandler.java
                    util.FileHandler.showReadme();
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}