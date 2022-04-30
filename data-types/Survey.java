import java.util.Scanner;
public class Survey{

public static void main(String[] args) {
  String line;
  Scanner in = new Scanner(System.in);
  
System.out.print("What is your name? ");
name = in.nextLine();
System.out.print("What is your age? ");
age = in.nextInt();
System.out.printf("Hello %s, age %d\n", name, age);

}

}