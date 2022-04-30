import java.io.*;
import java.util.*;

public class Greeter{

public static void namedGreet(String name){
System.out.println("Bonjour!"+name);
  
}

  
public static void greet() {
System.out.println("Hey");
  
}

public static void generationGreet(String name, int number){
  System.out.println("Hola"+name+"the"+number);
}
  
public static void main(String[] args){

greet();
greet();  
namedGreet(" Kristen");
namedGreet(" Addie");
generationGreet(" Josh",2);
}

}
  