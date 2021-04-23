package ExerciseFolder;
import java.util.*;
public class ex13 {
  static Scanner input = new Scanner (System.in);
  static Exception except = new Exception();
  private static float getBiggerNumber(float a, float b){
    if (a > b) {
      return a;
    }
    return b;
  }
  public static void main(String[] args) {
    float num1,num2;
      while (true){
        try{
          System.out.println("Enter two numbers:");
          float x = Float.parseFloat(input.nextLine());
          float y= Float.parseFloat(input.nextLine());
          num1 = x;
          num2 = y;
        break;
      }
      catch(Exception e) {
        System.out.println("That is not a valid input");
      }
    }
     System.out.println ("The bigger number is " + getBiggerNumber(num1,num2));
  }  
}
