package Task1;
/*
Creating a singleton using a Private Constructor and a Public Static Method:
1.Declare a static field to hold the single instance.
2.Mark the constructor private.
3.Provide a public static method to return the instance.
 */
public class SingletonClassMethod2 {
    //Public static final field to hold a single instance
    public static final SingletonClassMethod2 INSTANCE = new SingletonClassMethod2();
    //Private field
    private String message;
    //Private constructor
    private SingletonClassMethod2() {
    }
    //Method to get instance
    public SingletonClassMethod2 getInstance() {
        return INSTANCE;
    }
    //Method to print message
    public void printMessage(){
        System.out.println("Greetings from single instance.");
    }
    //Main class
    public static void main(String[] args) {
        //Get reference to the instance
        SingletonClassMethod2 singleton3 = SingletonClassMethod2.INSTANCE;
        System.out.println("Singleton3 reference: " +singleton3);
        singleton3.printMessage();
        //Get another refernce to the instance
        SingletonClassMethod2 singleton4 = SingletonClassMethod2.INSTANCE;
        System.out.println("Singleton4 reference: " +singleton4);
        singleton4.printMessage();
        //Check if both singletons point to the same reference
        if(singleton3 == singleton4){
            System.out.println("Both singletons point to the same refernce.");
        }else{
            System.out.println("Each singleton point to different refernce.");
        }
    }
}
