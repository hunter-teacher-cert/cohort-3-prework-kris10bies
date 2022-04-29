class DataTypes {
public static void main(String[]args){
int number;
int value = 30;
int sum;
int hour = 10;
int minute = 11;
  
number = 20;

sum = number + value;
  
System.out.println("Data Types");
  
System.out.println(number);

System.out.println("The sum of "+number+" + "+value+" = "+sum);

number = number - 1;

System.out.println("Number: "+number);
System.out.println("Value: "+value);
System.out.println("Sum: "+sum);

System.out.println("The time is " +hour+ ":" +minute);

System.out.println("The number of minutes until I go to sleep");
System.out.println(minute + 39+ "minutes");
System.out.println("My sleep efficiency is "+(hour*60+minute*100)/60+"%");
}

}