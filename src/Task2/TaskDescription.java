package Task2;
/*
2.Write a simple phone number word decoder. Create a Java app that can accept a contact
number with letters and then convert it to a number with digits only
 */
public interface TaskDescription {
    //Method to covert the letter to number
    char covertLetter(char letter);
    //Method to decode the phone number
    String decodePhoneNumber(String phoneNumber);
}
