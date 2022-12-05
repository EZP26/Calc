import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    char operation;
    double num1, num2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    num1 = input.nextDouble();
    System.out.println("Choose an operation: +, -, * or /");
    operation = input.next().charAt(0);
    System.out.println("Enter second number");
    num2 = input.nextDouble();
    
    if (operation == '+'){
      result = num1 + num2;
    System.out.println(num1 + "+" + num2 + "=" + result);
    } else if (operation == '-'){
      result = num1 - num2;
      System.out.println(num1 + "-" + num2 + "=" + result);
    } else if (operation == '*'){
      result = num1 * num2;
      System.out.println(num1 + "*" + num2 + "=" + result);
    } else if (operation == '/'){
      result = num1/num2;
      System.out.println(num1 + "/" + num2 + "=" + result);
  }
}
}

