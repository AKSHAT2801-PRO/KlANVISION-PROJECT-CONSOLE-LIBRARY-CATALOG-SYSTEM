package com.akshat;
import com.akshat.Library.Book;
import com.akshat.Library.BookStock;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to KLANVISION Library Catalog System");
        Scanner sc = new Scanner(System.in);
        BookStock stock = new BookStock();
        while (true){
            sc.reset();
            System.out.println("Choose the option to perform");
            System.out.println("1. Add New Book");
            System.out.println("2. Search Book");
            System.out.println("3. List All Books");
            System.out.println("4. View Book Details");
            System.out.println("5. Remove Book");
            System.out.println("0. Exit");
            System.out.print("Option: " );
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("1. Add New Book");
                    Book b = new Book();
                    sc.nextLine();
                    while (true) {
                        try {
                            System.out.print("Enter Book Id: ");
                            String id = sc.nextLine();
                            boolean valid = stock.validateId(Integer.parseInt(id));
                            if(valid)
                            b.setId(Integer.parseInt(id));
                            else{
                                System.out.println("Book Id Already Exists");
                                throw new Exception();
                            }
                            break; // valid input
                        } catch (Exception e) {
                            System.out.println("Invalid Book ID! Please enter a number.");
                        }
                    }


                    System.out.print("Enter Book Title: ");
                    b.setTitle(sc.nextLine());

                    System.out.print("Enter Book Author: ");
                    b.setAuthor(sc.nextLine());

                    System.out.print("Enter Book Category: ");
                    b.setCategory(sc.nextLine());
                    stock.addBook(b);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("2. Search Book");
                    System.out.print("Enter Book Title or Author Name: ");
                    Book book = stock.searchBook(sc.nextLine());
                    System.out.println(book);
                    break;

                case 3:
                    System.out.println("3. List All Books");
                    List<Book> books = stock.getBookStock();
                    for (Book book1 : books){
                        System.out.println(book1);
                    }
                    break;

                case 4:
                    System.out.println("4. View Book Details");
                    System.out.println("Enter Book Id");
                    stock.viewBookDetails(sc.nextInt());
                    break;

                case 5:
                    System.out.println("5. Remove Book");
                    System.out.println("Enter Book Id");
                    stock.removeBook(sc.nextInt());
                    break;

                default:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}