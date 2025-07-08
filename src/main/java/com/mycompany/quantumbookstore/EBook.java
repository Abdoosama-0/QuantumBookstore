/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author abdo
 */
public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }
    
    public String getFileType(){
    return fileType;
}
      @Override
        public boolean isPurchasable() {
        return true;
    }


    @Override
    public double buy(int quantity, String email, String address) {
        MailService.sendTo(email);
        return price * quantity;
    }
}

