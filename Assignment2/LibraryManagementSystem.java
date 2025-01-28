package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
  private String id;
  private String title;

  public Book(String id, String title) {
    this.id = id;
    this.title = title;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String toString() {
    return "Book ID: " + id + "\nTitle: " + title;
  }
}

class LibraryHashTable {
  private final int SHELVES = 13;
  private List<Book>[] table;

  public LibraryHashTable() {
    table = new List[SHELVES];
    for (int i = 0; i < SHELVES; i++) {
      table[i] = new ArrayList<>();
    }

    Book[] sampleBooks = {
        new Book("B001", "The Great Gatsby"),
        new Book("B002", "To Kill a Mockingbird"),
        new Book("B003", "1984"),
        new Book("B004", "Pride and Prejudice"),
        new Book("B005", "The Catcher in the Rye"),
        new Book("B006", "Lord of the Flies"),
        new Book("B007", "Animal Farm"),
        new Book("B008", "Brave New World"),
        new Book("B009", "The Hobbit"),
        new Book("B010", "Jane Eyre")
    };

    for (Book book : sampleBooks) {
      addBook(book);
    }
  }

  private int hash(String id) {
    return Math.abs(id.hashCode()) % SHELVES;
  }

  public void addBook(Book book) {
    int index = hash(book.getId());
    table[index].add(book);
    System.out.println("Book added successfully to shelf " + index);
  }

  public Book searchBook(String id) {
    int index = hash(id);
    for (Book book : table[index]) {
      if (book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }

  public List<Book> getAllBooksSorted() {
    List<Book> allBooks = new ArrayList<>();
    for (List<Book> shelf : table) {
      allBooks.addAll(shelf);
    }
    allBooks.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    return allBooks;
  }
}

public class LibraryManagementSystem {
  private static final Scanner scanner = new Scanner(System.in);
  private static final LibraryHashTable library = new LibraryHashTable();

  public static void main(String[] args) {
    while (true) {
      displayMenu();
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> addBook();
        case 2 -> searchBook();
        case 3 -> displayAllBooks();
        case 4 -> {
          System.out.println("Exiting system...");
          return;
        }
        default -> System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void displayMenu() {
    System.out.println("\n=== Library Management System ===");
    System.out.println("1. Add a new book");
    System.out.println("2. Search for a book");
    System.out.println("3. Display all books");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
  }

  private static void addBook() {
    System.out.print("Enter book ID: ");
    String id = scanner.nextLine();
    System.out.print("Enter title: ");
    String title = scanner.nextLine();

    library.addBook(new Book(id, title));
  }

  private static void searchBook() {
    System.out.print("Enter book ID to search: ");
    String id = scanner.nextLine();
    Book book = library.searchBook(id);

    if (book != null) {
      System.out.println("Book found: " + book);
    } else {
      System.out.println("Book not found!");
    }
  }

  private static void displayAllBooks() {
    List<Book> sortedBooks = library.getAllBooksSorted();
    System.out.println("\nAll Books (Sorted by Title):");
    sortedBooks.forEach(System.out::println);
  }
}
