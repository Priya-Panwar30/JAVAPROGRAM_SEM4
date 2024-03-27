package Prac;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class Exp27 {
   
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
           
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            
            validateAge(13);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + ex.getMessage());
        }
        System.out.println("Rest of the code...");
    }
}