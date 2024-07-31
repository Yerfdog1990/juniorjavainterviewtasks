package Task2;

import java.util.NoSuchElementException;

public class PhoneNumberDecoder implements TaskDescription{
    @Override
    public int covertLetter(char letter) {
        letter = Character.toUpperCase(letter);
        switch (letter){
            case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default:
                throw new NoSuchElementException("Only English alphabetical letters are allowed.");
        }
    }
    @Override
    public String decodePhoneNumber(String phoneNumber) {
        StringBuilder decodedNumber = new StringBuilder();
        for(char ch : phoneNumber.toCharArray()){
            decodedNumber.append(covertLetter(ch));
        }
        return decodedNumber.toString();
    }
}
