# Library Management System

A Java-based Library Management System that allows users to add, borrow, return, and view books. This project is designed to help manage a collection of books and track their availability.

## Features

- **Add Books**: Add new books to the library collection.
- **Borrow Books**: Borrow books by their ISBN if available.
- **Return Books**: Return borrowed books by ISBN.
- **View All Books**: View details of all books in the library.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or above installed.
- **Visual Studio Code** (or any other Java IDE): This project can be developed and run on VS Code or any Java-supporting IDE.

## Usage

1. **Add a Book**:
   - Use the `addBook(Book book)` method to add a new book to the library.
   
2. **Borrow a Book**:
   - Use the `borrowBook(String isbn)` method with the ISBN of the book to borrow it. If the book is available, it will be marked as borrowed.

3. **Return a Book**:
   - Use the `returnBook(String isbn)` method with the ISBN of the book to return it.

4. **View All Books**:
   - Use the `viewAllBooks()` method to display details of all books in the library.

## Example

```java
Library library = new Library();

// Add a book
library.addBook(new Book("123456789", "Effective Java", "Joshua Bloch"));

// Borrow a book
library.borrowBook("123456789");

// Return a book
library.returnBook("123456789");

// View all books
library.viewAllBooks();
```
