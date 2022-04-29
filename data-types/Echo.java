import java.util.Scanner;
public class Echo{


  
  public static void main(String[] args){

int ft;
double mile;
Scanner in = new Scanner(System.in);

System.out.print("How many miles ? ");
ft = in.nextInt();

final double MILE_PER_FT = 5280;
mile = ft * MILE_PER_FT;

System.out.print(ft * MILE_PER_FT);

System.out.println("feet");
  

}
}