package MiniProject;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;

//1.Book.java
class Book{
    private String id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isIssued=false;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return String.format("Book ID: %s | Title: %s | Author: %s | Status: %s",
                id, title, author, isIssued ? "Issued" : "Available");
    }

}

//2.Member.java
class Member {
    private String memberId;
    private String name;
    private List<String> borrowedBookIds;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBookIds = new ArrayList<>();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<String> getBorrowedBookIds() { return borrowedBookIds; }

    public void borrowBook(String bookId) {
        borrowedBookIds.add(bookId);
    }

    public void returnBook(String bookId) {
        borrowedBookIds.remove(bookId);
    }

    @Override
    public String toString() {
        return String.format("Member ID: %s | Name: %s | Borrowed Books: %s",
                memberId, name, borrowedBookIds);
    }
}
//3. LibraryManagementSystem.java

class library {
    private HashMap<String, Book> inventory = new HashMap<>();
    private HashMap<String, Member> members = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getId(), book);
        logOperation("Added Book: " + book);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
        logOperation("Added Member: " + member);
    }

    public void issueBook(String bookId, String memberId) throws BookNotAvailableException {
        Book book = inventory.get(bookId);
        Member member = members.get(memberId);

        if (book == null || book.isIssued()) {
            throw new BookNotAvailableException("Book not available or doesn't exist!");
        }
        if (member == null) {
            throw new BookNotAvailableException("Member not found!");
        }

        book.setIssued(true);
        member.borrowBook(bookId);
        logOperation("Issued Book: " + bookId + " to Member: " + memberId);
    }

    public void returnBook(String bookId, String memberId, int daysLate) throws InvalidReturnException {
        Book book = inventory.get(bookId);
        Member member = members.get(memberId);

        if (book == null || member == null || !book.isIssued() || !member.getBorrowedBookIds().contains(bookId)) {
            throw new InvalidReturnException("Invalid return operation!");
        }

        book.setIssued(false);
        member.returnBook(bookId);

        double fine = (daysLate > 0) ? daysLate * 2.0 : 0;
        String msg = String.format("Returned Book: %s by Member: %s | Fine: ₹%.2f", bookId, memberId, fine);
        logOperation(msg);
        System.out.println(msg);
    }

    public void showInventory() {
        System.out.println("\nLibrary Inventory:");
        for (Book book : inventory.values()) {
            System.out.println(book);
        }
    }

    public void logOperation(String message) {
        try (FileWriter writer = new FileWriter("library_log.txt", true)) {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to log file.");
        }
    }
}

//4. Custom Exceptions
//BookNotAvailableException.java
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
//InvalidReturnException.java

class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) {
        super(message);
    }
}

//5. LibraryManagementSystem
public class LibraryManagementSystem {
        public static void main(String[] args) {
            library Library = new library();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n===== Library Menu =====");
                System.out.println("1. Add a Book");
                System.out.println("2. Add a Member");
                System.out.println("3. Issue a Book");
                System.out.println("4. Return a Book");
                System.out.println("5. Show Inventory");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter Book ID: ");
                            String id = sc.nextLine();
                            System.out.print("Enter Title: ");
                            String title = sc.nextLine();
                            System.out.print("Enter Author: ");
                            String author = sc.nextLine();
                            Library.addBook(new Book(id, title, author));
                            break;

                        case 2:
                            System.out.print("Enter Member ID: ");
                            String mid = sc.nextLine();
                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();
                            Library.addMember(new Member(mid, name));
                            break;

                        case 3:
                            System.out.print("Enter Book ID to Issue: ");
                            String bid = sc.nextLine();
                            System.out.print("Enter Member ID: ");
                            String memId = sc.nextLine();
                            Library.issueBook(bid, memId);
                            System.out.println("✅ Book Issued Successfully!");
                            break;

                        case 4:
                            System.out.print("Enter Book ID to Return: ");
                            String rbid = sc.nextLine();
                            System.out.print("Enter Member ID: ");
                            String rmid = sc.nextLine();
                            System.out.print("Enter Days Late (0 if none): ");
                            int days = sc.nextInt();
                            Library.returnBook(rbid, rmid, days);
                            break;

                        case 5:
                            Library.showInventory();
                            break;

                        case 6:
                            System.out.println("Exiting... Goodbye!");
                            sc.close();
                            return;

                        default:
                            System.out.println("Invalid option! Try again.");
                    }
                } catch (BookNotAvailableException | InvalidReturnException e) {
                    System.out.println("!!" + e.getMessage());
                } catch (Exception e) {
                    System.out.println("! Unexpected Error: " + e.getMessage());
                }
            }
        }
    }

