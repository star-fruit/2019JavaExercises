package ExerciseFolder;
import java.util.*;
public class ex4 {
   static Scanner input = new Scanner (System.in);
   static Exception except = new Exception();
   public static void main(String[] args) {
   
   float price;
   while (true){
     System.out.print("What is the price of your purchase?: $");   
     try{
           float p = Float.parseFloat(input.nextLine());
           if (p<0) throw except;
           price = p;
           break;
        }
        catch(Exception e) {
          System.out.println("That is not a valid price.");
        }
      }
   if (price < 25){
     System.out.print("No savings available. Your new price is $");
     System.out. printf("%.2f", price);
   } else if (price < 50){
     System.out.print("10% savings available. Your new price is $");
     System.out. printf("%.2f", 0.9*price);
   } else if (price < 75){
     System.out.print("20% savings available. Your new price is $");
     System.out. printf("%.2f", 0.8*price);
   } else if (price < 100){
     System.out.print("30% savings available. Your new price is $" );
     System.out. printf("%.2f", 0.7*price);
   } else {
     System.out.print("40% savings available. Your new price is $");
     System.out. printf("%.2f", 0.6*price);
     } 
  }
}

  


