/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author abdo
 */
public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }
        public int getStock(){
                 return stock;
        }
         @Override
           public boolean isPurchasable() {
        return stock > 0;
    }

  
     @Override
    public double buy(int quantity, String email, String address) {
        if(stock <=0){
        throw new IllegalStateException("Quantum book store - book out off stock");
        }
        if (stock < quantity) {
            throw new IllegalStateException("Quantum book store - Not enough stock for paper book");
        }
        stock -= quantity;
        ShippingService.sendTo(address);
        return price * quantity;
    }
}
