package Prac;
class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(int productId, String productName, double price, String brand, String model) {
        super(productId, productName, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(int productId, String productName, double price, String size, String color) {
        super(productId, productName, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }
}

class Books extends Product {
    private String author;
    private int pageCount;

    public Books(int productId, String productName, double price, String author, int pageCount) {
        super(productId, productName, price);
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}

public class Exp20 {
    public static void main(String[] args) {
        // Creating objects for each class
        Electronics laptop = new Electronics(1, "Laptop", 899.99, "Dell", "Inspiron");
        Clothing shirt = new Clothing(2, "T-Shirt", 19.99, "Large", "Blue");
        Books novel = new Books(3, "The Great Gatsby", 12.99, "F. Scott Fitzgerald", 180);

        // Demonstrate polymorphism
        displayProductDetails(laptop);
        displayProductDetails(shirt);
        displayProductDetails(novel);
    }

    // Polymorphic method to display product details
    private static void displayProductDetails(Product product) {
        System.out.println("\nProduct Details:");
        product.displayDetails();
        System.out.println("---------------");
    }
}