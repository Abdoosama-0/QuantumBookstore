/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstore;

/**
 *
 * @author abdo
 */
public class ShowcaseBook extends Book{
    
       // Constructor to initialize a showcase book
       public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }
    // Showcase books are not meant to be sold
         @Override
    public boolean isPurchasable() {
        return false;
    }
    // If someone tries to buy this type, throw an exception
    @Override
    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store - Showcase books are not for sale.");
    }
}
