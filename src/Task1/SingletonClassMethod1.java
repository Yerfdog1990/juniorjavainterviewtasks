package Task1;

/*
Create a singleton using a Private Constructor and a Public Static Final Field:
1.Declare a static final field in the class to hold the single instance.
2.Mark the constructor private to prevent external instantiation.
3.This approach ensures that only one instance of the class is created, and provides a simple way to access the instance.
 */

public class SingletonClassMethod1 {
    //Declare a public static final field to store a single instance
    public static final SingletonClassMethod1 INSTANCE = new SingletonClassMethod1();
    //Private field
    private String message = "Greetings from the single instance.";
    //Private constructor
    private SingletonClassMethod1() {
    }
    //Method to get message
    public String getMessage() {
        return message;
    }
    //Main method
    public static void main(String[] args) {
        //Reference to the single instance
        System.out.println("Reference to the single instance:");
        SingletonClassMethod1 singleton1 = SingletonClassMethod1.INSTANCE;
        System.out.println("Singleton1 reference: " +singleton1);
        //Another reference to the single instance
        SingletonClassMethod1 singleton2 = SingletonClassMethod1.INSTANCE;
        System.out.println("Singleton2 reference: " +singleton2);
        //Call getMessage() method
        System.out.println("Print message:");
        System.out.println(singleton1.getMessage());
        System.out.println(singleton2.getMessage());

        //Check if both references point to the same instance
        System.out.println("Check if both references point to the same instance.");
        if(singleton1 == singleton2){
            System.out.println("Both refer to the same single instance.");
        }else{
            System.out.println("They refer to different instances.");
        }
    }
}
