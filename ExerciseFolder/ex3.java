package ExerciseFolder;
import java.util.*;
public class ex3 {
  static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Please inpupt 4 floats: ");
    ArrayList<Float> floats = new ArrayList<>();

    for (int i = 0; i < 4; i++) {
       while (true){
        try{
           float f = Float.parseFloat(input.nextLine());
           floats.add(f);
           break;
        }
        catch(Exception e) {
          System.out.println("That is not a float, try not to break the program again.");
        }
      }
    }
    float max = Collections.max(floats); 
    System.out.println("The largest value is " + max);
  }
}