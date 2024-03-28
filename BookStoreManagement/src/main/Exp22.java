package main;
import core.*;
import inventory.*;
public class Exp22 {

	public static void main(String[] args) {
		Book sampleBook = new Book("Book name", "Hirali","5012869",2300);
		InventoryManagement inventoryManagement = new InventoryManagement();
		inventoryManagement.addBook(sampleBook);
		
		Book retrieveBook = inventoryManagement.getBookDetails("5012869");
		if(retrieveBook != null) {
			System.out.println("Book Details:\nTitle: " + retrieveBook.getTitle()
			                   + "\nAuthor: " + retrieveBook.getAuthor()
			                   + "\nISBN: " + retrieveBook.getIsbn()
			                   + "\nPrice: " + retrieveBook.getPrice());
		}
		
		inventoryManagement.updateStockLevel("5012869", 50);
	}

}