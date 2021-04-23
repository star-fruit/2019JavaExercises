package TestStuff;
import java.util.Scanner;
public class printMethod {
  public static void print(String a){
    System.out.println(a);
  }
  public static void print(int a){
    System.out.println(a);
  }
  public static void print(double a){
    System.out.println(a);
  }
  public static void print(float a){
    System.out.println(a);
  }
  Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    print ("ga");
    print ((int)(7 / 3 + 2));
    print ((int)(45 / 8 * 4 + 2));
    print ((int)(17 + (21 % 6) * 2));
    print ((int)(4.5 + 2.6 + 0.5));
    print (7.0 % 0.0);
    print (7.0 / 0.0);
    int c, d;
    c = d = 1;
    print (c/d);
    float e, f;
    e = f = 1;
    print (e/f);
    int x=5;
    System.out.print(x);
    System.out.print(x++);
    System.out.print(x);
    System.out.print(++x);
    System.out.print(x);
    System.out.println();
    int a=5;
    print (++a);          //a becomes 6
    print (a++);          //a becomes 7
    print (--a);          //a becomes 6
    print (a--);          //a becomes 5
    print (a);
  }
}

