# PCCCS495 – Term II Project

## Project Title
Smart Library Management System – simple, clear, professional, and easy to remember.

## Problem Statement (max 150 words)
A Library Management System (LMS) is designed to overcome the limitations of traditional manual library operations. In many libraries, book records, student details, and issue-return transactions are maintained on paper or basic systems, leading to inefficiency, errors, and data mismanagement. It becomes difficult to track book availability, manage due dates, and maintain accurate records of issued and returned books. Additionally, manual processes are time-consuming and increase the workload on librarians, while also creating a risk of data loss or duplication.

The proposed system aims to develop a computerized solution using Java that automates key library functions such as book management, student registration, book issuing, and returning. The system will ensure accuracy, improve efficiency, and provide quick access to information. By implementing proper data handling and structured architecture, the LMS will enhance user experience, reduce manual effort, and provide a reliable and scalable solution for modern library management needs.---

## Target User
1)Librarian (Primary User)
Add/remove books
Issue/return books
Manage students
Track overdue books
2) Students (Secondary User)
Search books
Check availability
View issued books---

## Core Features
Book Management:
Add new books
Remove books
Update book details
Search books (by title/ID)
Student Management:
Register student
View student details
 Transaction Management:
Issue book
Return book
Track due dates
Fine Management (Optional Advanced Feature):
Calculate fine for late return
Search System
Fast search using ID/title
User Interface (Console / GUI):
Provides interaction between user and system.
Functions:
Menu-driven system
Easy navigation options
 Purpose:
Makes system user-friendly
Simplifies operations
Modular Design (OOP Based):
System is divided into multiple classes.
Features:
Separate classes for Book, Student, Library
Reusable and maintainable code
Purpose:
Easy to update and expand
Data Validation & Error Handling:
 Ensures system reliability.
 Functions:
Prevent issuing unavailable books
Avoid duplicate student IDs
Handle invalid inputs
 Purpose:
Reduces system errors
Improves data integrity 
Record Tracking System:
 Maintains all transaction history.
Functions:
Track issued books
View overdue books
Maintain logs of activities
 Purpose:
Helps librarian monitor system usage
Provides accountability

## OOP Concepts Used
1.Exception Handling
Exception handling is used to manage runtime errors and prevent the program from crashing.
 In LMS:
Handles invalid inputs (wrong book ID, student ID)
Prevents issuing a book that is not available
Manages unexpected errors during operations
 Benefit:
Ensures the system runs smoothly and is user-friendly and stable.
2. Collections Framework
Collections are used to store and manage groups of objects dynamically.
 In LMS:
Stores list of books
Stores list of students
Manages issued/returned records
Benefit:
Provides efficient data handling, easy searching, and flexible storage.
 3. Inheritance
Inheritance allows one class to reuse properties of another class.
In LMS:
A common User class can be extended by Student or Librarian
Benefit:
Reduces code duplication and improves reusability.
 4. Abstraction
Abstraction means hiding complex internal logic and showing only essential features.
 In LMS:
User only sees options like:
Issue Book
Return Book
Internal working is hidden
 Benefit:
Makes the system simple and easy to use. 

## Proposed Architecture Description
Layer:                 Description:                                                                      Responsibility:
Model        Handles data and core logic of the system.                              Manage books, students, transactions.
View       Provides userinterface (menu-driven / display output).                      Show options and results to user.
Controller       Controller Acts as a bridge between Model and View                                 Process input and control system flow


+-----------------+       1      *       +----------------+
|     Library     |----------------------|      Book      |
+-----------------+                      +----------------+
| -books: List<Book>|                    | -bookID: int   |
| -students: List<Student>|              | -title: String |
+-----------------+                      | -author: String|
| +addBook()      |                      | -availability: boolean |
| +removeBook()   |                      +----------------+
| +issueBook()    |
| +returnBook()   |
+-----------------+
        |
        | 1
        |
        * 
+-----------------+
|    Student      |
+-----------------+
| -studentID: int |
| -name: String   |
| -issuedBooks: List<Book> |
+-----------------+
| +register()     |
| +viewBooks()    |
+-----------------+
## How to Run
1.Install Java (JDK)
   Ensure Java is installed and configured.
2.Open Project in VS Code
   Open your project folder.
3.Go to Main File
   Navigate to Main.java.
4.Compile the Code
 Run:
javac Main.java
5.Run the Program
 Run:
java Main
 One-Line Summary
Install Java → Open project → Compile → Run Main.java.

## Git Discipline Notes
Git discipline ensures clean, regular, and meaningful commits representing each development step. Follow these rules: commit after completing each feature, write clear messages, avoid committing all code at once, maintain proper project structure, and include a README.md and .gitignore.

Minimum 10 Meaningful Commits:
1.Initial commit - Created project structure and folders
2.Added Main.java entry point
3.Added Book class with attributes and basic methods
4.Added Student class for user management
5.Added Library class to manage books and students
6.Implemented add and remove book functionality
7.Implemented student registration feature
8.Added book issuing functionality with validation
9.Added return book functionality and updated records
10.Implemented search functionality for books
Optional Extra Commits for Better Discipline:
11. Added exception handling for invalid inputs
12. Improved menu-driven user interface
13. Refactored code for readability and structure
14. Added README file with project details
15. Final commit - cleaned code and fixed minor bugs
.gitignore Recommendations:
*.class
*.log
*.DS_Store

Summary: Proper Git discipline with meaningful commits ensures version control, clarity, and professional project management.
