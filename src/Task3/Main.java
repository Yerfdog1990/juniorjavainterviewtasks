package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while(true){
            System.out.print("Enter the string: ");
            String str = userInput.nextLine();
        if(str.isEmpty()){
            throw new InputMismatchException("Input is empty. Please enter a valid string.");
                }
        CharacterArray characterArray = new CharacterArray(str);
            System.out.println("Original string: " +str);
            System.out.print("Reversed string: " );
            characterArray.printArray();
            break;
            }
        userInput.close();
        }
    }

