import java.io.*;
import java.util.*;

public class Addition{


public static int add10(int a){
  int result = a + 10;
  return result;
    
}

public static int addTwoPlusTen(int number1,int number2){
  int a = number1 + number2;
  int result = add10(a);
    return result;
}

  
public static void main(String[] args){
  int a = 5;
    int b = 10;
  int result = addTwoPlusTen(a,b);

 System.out.println(result); 
  }

}