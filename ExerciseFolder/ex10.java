package ExerciseFolder;
import java.util.*;

public class ex10 {
  static Scanner input = new Scanner (System.in);
  static Exception except = new Exception();
  public static void main(String[] args) {
    int start,end,inc;
    while (true){
      try{
        System.out.print("Enter the starting value: ");
        start = Integer.parseInt(input.nextLine());
        System.out.print("Enter the ending value: ");
        end = Integer.parseInt(input.nextLine());
        System.out.print("What is the increment: ");
        inc = Integer.parseInt(input.nextLine());
        System.out.println("Starting program...");
        break;
      }
      catch(Exception e) {
        System.out.println("That is not a valid mark. ");
      }
    }
    System.out.println(String.format("%8s %7s","Value", "Square"));
      while (start<end){
        System.out.println(String.format("%6d %7d", start, start*start));
        start += inc;
      }
  }
}