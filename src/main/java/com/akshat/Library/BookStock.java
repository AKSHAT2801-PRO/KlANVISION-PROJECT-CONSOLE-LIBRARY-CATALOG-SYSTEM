package com.akshat.Library;

import java.util.List;

public class BookStock {
    private List<Book> bookStock;
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
                book.toString();
                return;
            }
        }
        System.out.println("No Such Book Found!!!");
    }


}
