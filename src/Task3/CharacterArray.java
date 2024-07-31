package Task3;

public class CharacterArray implements ReverseStringApp{
private String stringInput;

    public CharacterArray(String stringInput) {
        this.stringInput = stringInput;
    }

    @Override
    public char[] convertToArray() {
        char[] charArray = stringInput.toCharArray();
        return charArray;
    }

    @Override
    public char[] reverseArray() {
        char[] reversedCharArray = convertToArray();
        int left = 0;
        int right = reversedCharArray.length - 1;
        while (left < right){
            // Swap the characters at left and right indices
            char temp = reversedCharArray[left];
            reversedCharArray[left] = reversedCharArray[right];
            reversedCharArray[right] = temp;
            // Move the indices towards the center
            left++;
            right--;
        }
        return reversedCharArray;
    }

    @Override
    public char[] printArray() {
        char[] printedReversedCharArray = reverseArray();
        for(char c: printedReversedCharArray){
            System.out.print(c + "");
        }
        return printedReversedCharArray;
    }
}
