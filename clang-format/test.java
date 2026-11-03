import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    Scanner scanner = new Scanner(System.in);
    System.out.print("What letter grade did you get? ");

    String input = scanner.next();
    char grade = input.length() > 0 ? input.charAt(0) : ' ';

    switch (grade) {
      case 'A': {
        System.out.println("You did great!");
        break;
      }
      case 'B': {
        System.out.println("You did good!");
        break;
      }
      case 'C': {
        System.out.println("You did okay!");
        break;
      }
      case 'D': {
        System.out.println("You passed!");
        break;
      }
      case 'E': {
        System.out.println("You barely passed!");
        break;
      }
      case 'F': {
        System.out.println("You failed!");
        break;
      }
      default: {
        System.out.println("You didn't enter a grade between A-F.");
        System.exit(1);
      }
    }
  }
};