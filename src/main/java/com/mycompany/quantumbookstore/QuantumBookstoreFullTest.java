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
        BookStore store = new BookStore();

        Book paperBook = new PaperBook("P001", "Java Mastery", 2024, 150.0, "Ahmed Ali", 10);
        Book ebook = new EBook("E001", "Learn Spring", 2025, 100.0, "Sara Gamal", "pdf");
        Book ShowcaseBook = new ShowcaseBook("D001", "History of Quantum", 2010, 0.0, "Dr. Nader");

        store.addBook(paperBook);
        store.addBook(ebook);
        store.addBook(ShowcaseBook);

       store.removeOutdatedBooks(5); // removes books older than 5 years

        store.buyBook("P001", 2, "user@mail.com", "Cairo, Egypt");
        store.buyBook("E001", 1, "another@mail.com", null);

    }
}


