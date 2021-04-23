package ExerciseFolder;
import static ExerciseFolder.ex5.except;
import java.util.*;
public class ex9 {
  static Scanner input = new Scanner (System.in);
  public static void main(String[] args) {
    int numMarks = 0;
    float total, ans;
    total = ans = 0;
    System.out.println("Enter as many marks as possible. Enter '-1' to calculate the average");
    while (true){
      try{ 
        float a = Float.parseFloat(input.nextLine());
        if (a == -1){
            break;
         }
        if (a<0 || a>100) throw except;
        ans = a;
        total += ans;
        numMarks ++;
      }
      catch(Exception e) {
        System.out.println("That is not a valid mark. ");
      }
    }
    System.out.print("Your average is: ");
    System.out. printf("%.1f", total/numMarks);
  }
}
