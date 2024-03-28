package inventory;

import java.util.*;
import core.*;
public class InventoryManagement {
         private List<Book> books;
         
         public InventoryManagement()
         {
        	 this.books = new ArrayList<>();
        			 
         }
         public void addBook(Book book)
         {
        	 books.add(book);
         }
         public void updateStockLevel(String isbn, int newStockLevel) {
        	 for(Book book : books) {
        		 if(book.getIsbn().equals(isbn)) {
        			 System.out.println("Stock level updated for ISBN: " + isbn);
        			 return;
        		 }
        	 }
        	 System.out.println("Book with ISBN " + isbn +  " not found in inventory.");
        	 
         }
         public Book getBookDetails(String isbn) {
        	 for(Book book : books) {
        		 if(book.getIsbn().equals(isbn)) {
        			 return book;
        		 }
        	 }
        	 System.out.println("Book with ISBN " + isbn +  " not found in inventory.");
        	 return null;
         }
	

}