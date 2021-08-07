

class ReversedString {
    public StringBuilder toReverse (String value) {
        StringBuilder builtValue = new StringBuilder(value);
        return builtValue.reverse();
    }
}

class PalindromeChecker {

    boolean isPalindromeValue (int k) {
        String strValue = Integer.toString(k);
        String reversedStrValue = new ReversedString()
            .toReverse(strValue)
            .toString();

        if (strValue.equals(reversedStrValue)) {
            System.out.println("Value " + k + " is palindrome");
            return true;
        } else {
            System.out.println("Value " + k + " is not palindrome");
            return false;
        }
        
    }
    
}

public class TestJava {
    public static void main(String[] args) throws Exception {
        new PalindromeChecker().isPalindromeValue(323);
        new PalindromeChecker().isPalindromeValue(-45);
    }
}
