import java.io.*;
import java.util.*;
import java.util.Random;

public class Craps3{
  
    public static void main(String[] args) {
    
      System.out.print("Roll: ");
        Random random = new Random();
        int number = random.nextInt(12) + 1;
        System.out.println(number);
      
      Scanner in = new Scanner(System.in);
boolean okay;

      int a;
      a = number;
do {
    System.out.print("Roll the dice: ");
    if (a == 4) {
        okay = true;
    System.out.println("Roll again.");
    } else {
        okay = false;
        String word = in.next();
        System.err.println(word + " is not a number");
    }
} while (!okay);
double x = in.nextDouble();
      }
}