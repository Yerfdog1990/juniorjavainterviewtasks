package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Main method
    public static void main(String[] args) {
        PhoneNumberDecoder phoneNumberDecoder = new PhoneNumberDecoder();
        Scanner userInput = new Scanner(System.in);
       while(true){
           try{
               System.out.println("Enter a contact number with letters:");
               String inputPhoneNumber = userInput.nextLine();
               String decodedPhoneNumber = phoneNumberDecoder.decodePhoneNumber(inputPhoneNumber);
               System.out.printf("Decoded phone number: %s", decodedPhoneNumber);
               break;
           }catch (InputMismatchException e){
               System.out.println("Only string of letters is allowed. Try again, but be cautious this time!");
               userInput.next();
           }
       }
    }
}
