/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author abdo
 */
public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract boolean isPurchasable();
    public abstract double buy(int quantity, String email, String address);
//    public  double buy(int quantity, String email);


    @Override
    public String toString() {
        return "Quantum book store - ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Year: " + year + ", Price: " + price;
    }
}

