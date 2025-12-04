import java.util.Scanner;

class Calculator{
  double calculate(double a, double b,String operation){
       switch (operation.toLowerCase()) {
            case "+":
                return a + b;
            case "-":
                return a - b;

            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
                return a / b;
            case "%":
              if(b==0){
                System.out.println("Can't divide by zero");
              }
              return a % b;
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
  }
}
public class Problem_1{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (+ - * / %): ");
        String op = sc.next();
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);
        System.out.println("Result = " + result);
        sc.close();
    }
}