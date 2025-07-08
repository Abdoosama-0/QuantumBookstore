/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantumbookstore;

/**
 *
 * @author abdo
 */
public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        // Create a new bookstore instance
        BookStore store = new BookStore();
        
        // Create different types of books
        Book paperBook = new PaperBook("P001", "Java Mastery", 2024, 150.0, "Ahmed Ali", 10);
        Book ebook = new EBook("E001", "Learn Spring", 2025, 100.0, "Sara Gamal", "pdf");
        Book ShowcaseBook = new ShowcaseBook("D001", "History of Quantum", 2010, 0.0, "Dr. Nader");
        // Add books to the store
        store.addBook(paperBook);
        store.addBook(ebook);
        store.addBook(ShowcaseBook);
        // Remove books older than 5 years
        store.removeOutdatedBooks(5);
        // Buy 2 copies of the paper book
        store.buyBook("P001", 2, "user@mail.com", "Cairo, Egypt");
       
        // Buy 1 copy of the eBook (no shipping address needed)
        store.buyBook("E001", 1, "another@mail.com", null);
    }
}


