package ExerciseFolder;
import java.util.*;
class ex1 {
  //creates scanner object
  static Scanner input = new Scanner(System.in);
 
  public static void main(String[] args) {
    float rad = 0;
    
    while (true){
      try{
        System.out.print("Please enter the radius of a circle in cm: ");
        //Using input.nextline so that the program waits for the input
        float r = Float.parseFloat(input.nextLine());
        rad = r;
        break;
      }
      catch(Exception e) {
        System.out.println("That is not a valid input.");
      }
    }
    //Multiply by 10.0/10.0 to get a single decimal place
    //double because Math.round returns a double
    double cir = Math.round(2 * Math.PI * rad * 10.0)/10.0;//circumference
    double area = Math.round(Math.PI * rad * rad * 10.0)/10.0;//area
    System.out.println("Circumference of the circle is " + cir + " cm");
    System.out.println("Area of the circle is " + area + " cm");
  }
}