import java.io.*;
import java.util.*;
import java.util.Random;

public class Craps{
  
    public static void main(String[] args) {

     int rounds = Integer.parseInt(args[0]); 
     for(int i = 0; i < rounds; i++){
    boolean won = round();
       if(won)
        System.out.println("You won!");
       else
        System.out.println("You lost.");
     }
      
    
    
      }

public static int roll(int maxValue){
Random random = new Random();
  int number = random.nextInt(maxValue - 1) + 1;
  return number;
  }

public static int shoot(int number, int maxValue){
int result = 0;
  for (int i = 0; i < number; i++){
    result += roll(maxValue);
  }
   System.out.println("Rolled a "+result);
  return result;
  }    

  public static boolean round(){
    int point = shoot(2,6);
    if (point == 2){
  return false;
  }
  else if (point == 3){
  return false;
  }
  else if (point == 12){
  return false;
  }
  else if (point == 7){
  return true;
    }
  else if (point == 11){
  return true;
  }
  int nextRoll = shoot(2,6);
    while(nextRoll != point){
      if (nextRoll == 7)
      {return false;}
      else{nextRoll = shoot(2,6);}
    }
  return true;  
    }
  
}

  
  
 
