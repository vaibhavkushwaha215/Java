import java.util.Scanner;
public class Username_Entry {
    public static void  main (String[] args) {
        /*
        Conditions for username:
        Length : 4-12
        Mustn't Contain: space or _
         */
        // Initialize
        String Username;
        boolean hasInvalidChar;
        boolean isCorrectLength;
        Scanner scanner = new Scanner(System.in);

        //Input and Conditions
        System.out.println("Please Enter Username");
        Username = scanner.nextLine();
        hasInvalidChar = Username.contains(" ") || Username.contains("_");
        isCorrectLength = Username.length() <= 12 && Username.length() >= 4;

        //Check
        if (hasInvalidChar && !isCorrectLength) {
            System.out.println("Username cannot contain Spaces or Underscores");
            System.out.println("Username must be within 4-12 characters");
        } else if (!isCorrectLength) {
            System.out.println("Username must be within 4-12 characters");
        } else if (hasInvalidChar) {
            System.out.println("Username cannot contain Spaces or Underscores");
            }
        else {
            System.out.println("User Created");
        }
    }
}