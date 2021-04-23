package ExerciseFolder;
import java.util.*;
public class ex15 {
  static Scanner input = new Scanner (System.in);
  public static void main(String[] args) {
    int num;
    while (true){
      try{
        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(input.nextLine());
        num = i;
        System.out.println("Good job printing an integer!");
        break;
      }
      catch(Exception e) {
        System.out.println("That is not a valid integer. Please try again.");
      }
    }
  }
}
