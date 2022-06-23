import java.io.*;
import java.util.*;

public class Greeter{

public static void newLine(){
  System.out.println();
}
  
public static void namedGreet(String name){
System.out.println("Bonjour!"+name);
  
  
}

  
public static void greet() {
System.out.println("Hey");
  
}

public static void generationGreet(String name, int number){
  System.out.println("Hola "+name+"the "+number);
}

  
public static void main(String[] args){
  
greet();
greet();
  newLine();
namedGreet(" Kristen");
namedGreet(" Addie");
  newLine();
generationGreet("Josh ",2);

}

}
  