package TestStuff;
import java.lang.Math;
import java.util.Scanner;
public class Rectangle {
  double length;
  double width;
  public Rectangle(double l,double w){
    length = l;
    width = w;
  }
  public double calcArea(){
    return Math.round(length * width*10.00)/10.00;
  }
  public double calcPerimeter(){
    return Math.round(2* length + 2 * width);
  }
  
  public double calcDiagonal(){
    return Math.round(Math.sqrt(length*length + width*width)*10.0)/10.0;
  }
  
  private void printAll(){
    System.out.println("Area:" + calcArea());
     System.out.println("Perimeter:" + calcPerimeter());
     System.out.println("Diagonal:" + calcDiagonal());
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double l, w;
    System.out.println("Please input the rectangle's length:");
    l = input.nextInt();
    System.out.println("Please input the rectangle's width:");
    w = input.nextInt();
    Rectangle possiblyASquare = new Rectangle (l,w);
    possiblyASquare.printAll();
  }
}
