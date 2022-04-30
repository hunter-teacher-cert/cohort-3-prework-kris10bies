import java.io.*;
import java.util.*;

public class Arrays{
  public static void main(String[] args){

int a=10;
double pi = 3.1415;
String s = "Hello World";    
  a = 10;
int[] items = new int[5];
    for (a = 0; a < 5; a=a+1){
      items[a] = 11 + a;
    }
    System.out.println(items[2]);
    items[0] = items[2] + items[1];
    System.out.println(items);

    for (a = 0; a < 5; a = a + 1){
      System.out.print("items["+a+"] : " +items[a]+", ");
    }
    System.out.println();
    }
}