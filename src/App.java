import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("What do you want to do?\n [1]Calculator\n [2]BMI Index ");
        int x = sc.nextInt();
        //Calculator
        if (x == 1){
          System.out.print("Enter first number- ");
          int a = sc.nextInt();
          System.out.print("Enter second number- ");
          int b = sc.nextInt();
          //variable calculations
          int Cal_add = a+b;
          int Cal_sub= a-b;
          long Cal_multiply = a*b;
          float Cal_divide = a/b;     
          //if statements 
          System.out.print("What do you want to do?\n [1]Addition\n [2]Multiplication\n [3]Subtraction\n [4]Division? ");
          int Cal_ask = sc.nextInt();
          if (Cal_ask == 1) {
            System.out.println("The Answer is:- "+Cal_add);
          }
          else if (Cal_ask == 2) {
            System.out.println("The Answer is:- "+Cal_multiply);
          }
          else if (Cal_ask == 3) {
            System.out.println("The Answer is:- "+Cal_sub);
          }
          else if (Cal_ask == 4) {
            System.out.println("The Answer is:- " +Cal_divide);
          }
          else {
            System.out.println("Incorrect input");
          }
        }
        //BMI Index
        if (x == 2){
           System.out.print("Input your weight in kilograms:- ");
           double w = sc.nextDouble();
           System.out.print("Input your height in metres:- ");
           double m = sc.nextDouble();
           //variable BMI Calculation
           double m1 = m*m;
           double BMI = w/m1;
           System.out.println("Your BMI is:- " +BMI);
           if (BMI > 25.0){
              System.out.println("Oh no! You're Overweight! Exercise Harder");
           }
          else if(BMI > 18.5){
             System.out.println("Good Job! You're having a Healthy BMI!");
           }
          else{
             System.out.println("Oh no! You're Underweight! You've got to eat some nutritious food!");
          }
        }
        //scanner close
        sc.close();
    }   
}   


