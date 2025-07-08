/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstore;

/**
 *
 * @author abdo
 */
public abstract class Book {
    // Basic book information
    private String isbn;
    private String title;
    private int year;
    private double price;
    private String author;
    // Constructor to initialize book details
    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }
    // Getters to access book data
    public String getIsbn() { return isbn; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    // Abstract method: subclasses decide if the book can be bought
    public abstract boolean isPurchasable();
    // Abstract method: defines how the book is bought 
    public abstract double buy(int quantity, String email, String address);


    // Print basic info about the book
    @Override
    public String toString() {
        return "Quantum book store - ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Year: " + year + ", Price: " + price;
    }
}

