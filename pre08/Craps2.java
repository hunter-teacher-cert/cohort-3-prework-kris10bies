import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Craps2{
  

    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Type roll when ready to play craps ");
  name = in.nextLine();
       
      
        System.out.print("Roll: ");
        Random random = new Random();
        int number = random.nextInt(12) + 1;
        System.out.println(number);

int a;
a = random.nextInt(12) + 1;

  if (a > 7){
  System.out.println("You lose.");
  }
  if (a < 7){
  System.out.println("You win.");
    }
  else{
  System.out.println("HI");  
  }

      name();
      
  }
  }
