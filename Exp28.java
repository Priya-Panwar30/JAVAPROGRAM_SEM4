package Prac;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Exp28 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception example.");
        } catch (MyException ex) {
            System.out.println("Caught the custom exception:");
            System.out.println(ex.getMessage());
        }
    }
}