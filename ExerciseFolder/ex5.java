package ExerciseFolder;
import java.util.*;
public class ex5 {
static Scanner input = new Scanner (System.in);
static Exception except = new Exception();
public static void main(String[] args) {
  int day;
   while (true){
     System.out.print("Please enter an integer from 1-7 to present a date: ");   
     try{
           int d = Integer.parseInt(input.nextLine());
           if (d<1 || d>7) throw except;           
           day = d;
           break;
        }
        catch(Exception e) {
          System.out.println("That is not a valid input");
        }
      }
  switch (day) {
    case 1:
      System.out.println("Today is Sunday");
      break;
    case 2:
      System.out.println("Today is Monday");
      break;
    case 3:
      System.out.println("Today is Tuesday");
      break;
    case 4:
      System.out.println("Today is Wednesday");
      break;
    case 5:
      System.out.println("Today is Thursday");     
      break;
    case 6:
      System.out.println("Today is Friday");
      break;
    case 7:
      System.out.println("Today is Saturday");
      break;
  }
}
}
