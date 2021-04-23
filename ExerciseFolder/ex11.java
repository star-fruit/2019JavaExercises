package ExerciseFolder;
import java.util.*;
public class ex11 {
  static Scanner input = new Scanner (System.in);
  static Exception except = new Exception();
  public static void main(String[] args) {
    int num, sum;
    num = sum = 0;
    while (true){
      try{
        System.out.print("Please enter an integer: ");
        int n= Integer.parseInt(input.nextLine());
        if (n<0)throw except;  
        num = n;
        break;
      }
      catch(Exception e) {
        System.out.println("That is not a valid integer");
      }
    }
    
    System.out.println("The length of the integer is " + Integer.toString(num).length());
    //takes remainder of integer/10. Because it is int, it forgets anything 
    //past the decimal
    while (num > 0) {
      sum += num % 10;
      num = num / 10;
    }
    System.out.println("The sum of the digits of the integer is " + sum);
  }  
}
