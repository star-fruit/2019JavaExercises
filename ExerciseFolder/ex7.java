package ExerciseFolder;
import java.util.*;
public class ex7 {
  static Scanner input = new Scanner (System.in);
  public static void main(String[] args) {
    System.out.println("Keep inputting words and the program will count the "
    + "number of words you inputted. "); 
    System.out.println("Enter 'stop' to stop the program");
    String text;
    int count = 0;
    do{
      String t = input.nextLine();
      text = t;
      count ++;
    }
    while (!"stop".equals(text));
    // -1 because the count++ adds 1 to count
    System.out.println("Total number of words:" + Integer.toString(count-1));
  }
}
        