import java.util.Scanner;
/**
 * a program that tells the user the last digit of a number they entered
 * @author Daniel Rahmani
 */
public class Main {

  public static int lastDigit(int digit){
    int lastDig = digit % 10;
    return lastDig;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number
    System.out.println("Please enter a number");
    int n = input.nextInt();
    // calculate the last digit
    int answer = lastDigit(n);
    System.out.println(answer);
    
    
    
  }
}
