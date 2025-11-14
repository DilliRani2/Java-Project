👇

📚 Library Management System (Mini Project 1)

This is a simple Library Management System built in Java using IntelliJ IDEA.
It allows users to add books, add members, issue books, return books with fines, and view the inventory.
The system also logs every important action into a log file.

🚀 Features
✔️ Add Books

Store book details like:

Book ID

Title

Author

Availability status

✔️ Add Members

Register members with:

Member ID

Name

Borrowed book records

✔️ Issue Books

Checks if the book exists

Checks if the book is already issued

Checks if the member is valid

Logs every issued book in a library_log.txt file

✔️ Return Books

Validates if the member actually borrowed the book

Marks book as returned

Calculates fine (₹2 per late day)

Logs the return with fine amount

✔️ Show Inventory

Displays all books with:

ID

Title

Author

Status (Available / Issued)

✔️ Log File Support

Every operation is automatically logged with a timestamp:

library_log.txt

✔️ Custom Exceptions

Handled using two user-defined exceptions:

BookNotAvailableException

InvalidReturnException

🧩 Project Structure
MiniProject/
 ├── Book.java
 ├── Member.java
 ├── library.java
 ├── BookNotAvailableException.java
 ├── InvalidReturnException.java
 └── LibraryManagementSystem.java

▶️ How to Run (IntelliJ IDEA)

Open IntelliJ IDEA

Create a new Java project

Copy all class files into the src folder

Run the LibraryManagementSystem main file

Use the menu to manage books and members

📺 Sample Menu
===== Library Menu =====
1. Add a Book
2. Add a Member
3. Issue a Book
4. Return a Book
5. Show Inventory
6. Exit

📘 Example Output
Enter Book ID: B10
Enter Title: Java Programming
Enter Author: James
Book Added Successfully!

Enter Book ID to Issue: B10
Enter Member ID: M101
✅ Book Issued Successfully!

📝 What I Learned

This project helped me understand:

Java Classes & Objects

HashMap for storing records

Custom exceptions

File handling and logging

Command-line menu-driven programs

Clean OOP design
