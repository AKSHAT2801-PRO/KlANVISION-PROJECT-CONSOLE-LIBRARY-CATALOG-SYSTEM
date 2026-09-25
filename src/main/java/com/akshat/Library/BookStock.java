package com.akshat.Library;

import java.util.ArrayList;
import java.util.List;

public class BookStock {
    private List<Book> bookStock;

    public BookStock() {
        this.bookStock = new ArrayList<Book>();
    }

    public List<Book> getBookStock() {
        return bookStock;
    }

    public void addBook(Book b){
        bookStock.add(b);
        System.out.println("Book Added Successfully!!!");
    }
    public void removeBook(int book_id){
        for (int i=0;i< bookStock.size();i++){
            if (bookStock.get(i).getId() == book_id){
                bookStock.remove(i);
                System.out.println("Book Removed Successfully!!!");
                return;
            }
        }
    }

    public Book searchBook(String query){
        for (Book book : bookStock){
            if (book.getTitle().equals(query) || book.getAuthor().equals(query)) {
                return book;
            }
        }
        System.out.println("No such Book found!!!");
        return new Book();
    }

    public void viewBookDetails(int book_id){
        for (Book book : bookStock){
            if (book.getId() == book_id) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("No Such Book Found!!!");
    }

    public boolean validateId(int id){
        for (Book book : bookStock){
            if(book.getId() == id){
                return false;
            }
        }
        return true;
    }



}
