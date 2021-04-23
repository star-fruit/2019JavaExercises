package ExerciseFolder;
import java.util.*;
public class ex12 {
  static Scanner input = new Scanner (System.in);
  static Exception except = new Exception();
  public static void main(String[] args) {
    int min, max;
    while (true){
      try{
        System.out.print("Input a minimum integer: ");
        int small = Integer.parseInt(input.nextLine());
        System.out.print("Input a maximum integer: ");
        int big = Integer.parseInt(input.nextLine());
        if (small>=big)throw except;
        min = small;
        max = big;
        break;
      }
      catch(Exception e) {
        System.out.println("That is not a valid input");
      }
    }
    Random r = new Random();
    // max-min +1 because it takes range [0 to x] and will not ouput x
    //thus [0 to x+1] is needed
    System.out.println("Here are 10 random integers between thse two values:");
    for (int i = 0; i<10; i++){
      System.out.println(r.nextInt((max - min) + 1) + min);
    }
  }
}
