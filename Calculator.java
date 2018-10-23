//Hello, Github!
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        //Identifying variables for inputs
        Scanner response=new Scanner(System.in);
        double firstOperand;
        double secondOperand;
        double answer;
        int choice;

        //Asks user for input operands
        System.out.println("Enter first operand: ");
        firstOperand=response.nextDouble();
        System.out.println("Enter second operand: ");
        secondOperand=response.nextDouble();

        //Display Calculator menu
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division \n");

        //Asks user which method they would like to use
        System.out.println("Which operation do you want to perform? ");
        choice=response.nextInt();

        //Evaluates method based on user's method choice and operand inputs
        //Adds operands
        if (choice==1){
            answer=firstOperand+secondOperand;
            System.out.println("The result of the operation is "+answer+". Goodbye!");
        }
        //Subtracts operands
        else if (choice==2){
            answer=firstOperand-secondOperand;
            System.out.println("The result of the operation is "+answer+". Goodbye!");
        }
        //Multiplies operands
        else if (choice==3){
            answer=firstOperand*secondOperand;
            System.out.println("The result of the operation is "+answer+". Goodbye!");
        }
        //Divides operands
        else if (choice==4){
            answer=firstOperand/secondOperand;
            System.out.println("The result of the operation is "+answer+". Goodbye!");
        }
        //Identifies invalid method choice
        else if (choice <= 0 || choice > 4){
            System.out.println("Error: Invalid selection! Terminating program.");
        }

    }
}
