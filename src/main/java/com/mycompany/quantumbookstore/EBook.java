/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstore;

/**
 *
 * @author abdo
 */
public class EBook extends Book {
    private String fileType;
    // Constructor to create an eBook with file type
    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }
    // Returns the file type (EX: pdf)
    public String getFileType(){
    return fileType;
}
      // eBooks are always purchasable (no stock limit)
      @Override
        public boolean isPurchasable() {
        return true;
    }

    // Handles the buy of an eBook
    @Override
    public double buy(int quantity, String email, String address) {
        MailService.sendTo(email);
        return getPrice() * quantity;
    }
}

