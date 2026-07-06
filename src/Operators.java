import java.util.Scanner;
public class Operators {

    /*
                # Operators in Java
                ## Arithmetic Operators
                - Addition
                - Subtraction
                - Multiplication
                - Division
                - Exponents

                ## Logical Operators
                - AND Operator :  &&
                - OR Operator :  ||
                - NOT Operator :  !
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        double temp = scanner.nextDouble();
        boolean isSunny = true;

        if(temp <= 50 && temp >= 0){  // AND Operator
            System.out.println("The temperature is fine");
            if (!isSunny){           //NOT Operator
                System.out.println("Its not sunny outside");
            }
        }
        else if (temp >= 50 || temp<= 0){ //OR Operator
            System.out.println("The temperature ISNT fine");
        }
    }
}
