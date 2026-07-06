import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        //Initialization
        double num1,num2,num3;
        //Calculator
        Scanner scanner= new Scanner(System.in);
        System.out.println("""

        ----------Welcome to Calculator----------
        Please enter what would you like to do?
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
         5.Remainder
         6. Exit
        """);

        boolean flag = true;
        while(flag) {
            int meth = scanner.nextInt();
            if (meth == 6){
                flag = false;
            }
            switch (meth) {
                case 1, 2, 3, 4, 5 , 6-> {
                    System.out.println("Please enter the first number");
                    num1 = scanner.nextDouble();

                    System.out.println("Please enter the second number");
                    num2 = scanner.nextDouble();

                    num3 = switch (meth) {
                        case 1 -> num1 + num2;
                        case 2 -> num1 - num2;
                        case 3 -> num1 * num2;
                        case 4 -> num1 / num2;
                        case 5 -> num1 % num2;
                        case 6 -> 0;
                        default -> throw new AssertionError(); // unreachable
                    };

                    System.out.printf("The output is %.2f%n", num3);
            }

            default -> System.out.println("Invalid Method");
        }}
            /*  This can be used there as well
            System.out.printf(
                flag ? "The output is %.2f%n" : "Invalid Method%n",
                num3
            );
             */
    }
}