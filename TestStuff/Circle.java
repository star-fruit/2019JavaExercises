package TestStuff;
import java.lang.Math;
import java.util.Scanner;
public class Circle {
  float radius;
  final double PI = 3.14159;
  public Circle(float r){
    radius = r;
  }
  public double calcDiameter(){
    return Math.round(2 * radius*10.0)/10.0;
  }
  public double calcCirc(){
    return Math.round(2 * PI * radius* 10.0)/10.0;
  }
  
  public double calcArea(){
    return Math.round(PI * radius * radius*10.0)/10.0;
  }
   
  private void printAll(){
    System.out.println("Radius:" + radius + " Diameter:" + calcDiameter());
     System.out.println("Circumference:" + calcCirc());
     System.out.println("Area:" + calcArea());
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float r;
    System.out.println("Please input the circle's radius:");
    r = input.nextInt();
    Circle possiblyASquare = new Circle (r);
    possiblyASquare.printAll();
  }
}
