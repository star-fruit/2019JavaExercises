package ExerciseFolder;
import java.util.*;
public class ex14 {
  static Scanner input = new Scanner (System.in);
  static Exception except = new Exception();
  private static void Histogram(ArrayList<Integer> list){
    for (int i: list){// for each i in list
      for (int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.print("\n");
    }
  }
  public static void main(String[] args) {
    ArrayList<Integer> ints =new ArrayList<Integer>();
    System.out.println("Please enter integers. Enter -1 to stop");
    while (true){
      try{ 
          int i = Integer.parseInt(input.nextLine());
          if (i == -1){
            break;
         }
          if(i<1) throw except;
        ints.add(i);
      }
      catch(Exception e) {
        System.out.println("That is not a valid integer.");
      }
    }
    Histogram(ints);
  }
}
