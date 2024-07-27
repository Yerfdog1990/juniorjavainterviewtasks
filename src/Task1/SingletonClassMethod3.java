package Task1;
/*
Enum Singleton:
1.Ensures thread-safety and serialization safety by default.
2.Easy to implement and less error-prone.
 */
public enum SingletonClassMethod3 {
    INSTANCE;
    //Method to print message
    public void printMessage(){
        System.out.println("Hello from the single instance.");
    }
    //Main method
    public static void main(String[] args) {
        //Get reference to the single instance
        SingletonClassMethod3 singletone5 = SingletonClassMethod3.INSTANCE;
        System.out.println("Singleton 5 refernce: " +singletone5);
        //Get another reference to the single instance
        SingletonClassMethod3 singletone6 = SingletonClassMethod3.INSTANCE;
        System.out.println("Singleton 6 refernce: " +singletone6);

        //Call method to print message
        singletone5.printMessage();
        singletone6.printMessage();

        //Check if both singleton point to the same reference
        if(singletone5 == singletone6){
            System.out.println("Both singletons point to the same reference.");
        }else{
            System.out.println("Each singleton point to different reference. ");
        }
    }
}
