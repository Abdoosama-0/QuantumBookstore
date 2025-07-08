/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author abdo
 */
import java.time.Year;
import java.util.*;
/**
 * book inventory manager
 * addBook
 * removeOutdatedBooks
 * buyBook
 */

public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();//not arrayList because each book has a unique id =>isbn

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("***add book***");
        System.out.println("Quantum book store - Book added: " + book.getTitle());
    }

    public List<Book> removeOutdatedBooks(int maxYears) {
        System.out.println("***remove outdated books***");
        List<Book> removed = new ArrayList<>();
        int currentYear = Year.now().getValue();

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (currentYear - entry.getValue().getYear() > maxYears) {
                removed.add(entry.getValue());
                iterator.remove();
                System.out.println("Quantum book store - Removed outdated: " + entry.getValue().getTitle()+ "\tisbn: " +entry.getValue().getIsbn() );
              
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        System.out.println("***buy book***");
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Quantum book store - Book not found: " + isbn);
        }
        if (!book.isPurchasable()) {
            throw new IllegalStateException("Quantum book store - Book is not available for purchase.");
        }
        double amount = book.buy(quantity, email, address);
        System.out.println("Quantum book store - Purchase complete. Amount: " + amount);
  
        return amount;
    }
}
