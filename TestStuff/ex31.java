package TestStuff;
public class ex31 {
  public static void main(String[] args){
    final int SIZE = 30;
    int[] numbers = new int[SIZE];
    numbers [0] = 10;
    System.out.println(numbers[13]);
    for (int item : numbers){ 
      numbers [item] = 0;  
    }
    for (int item : numbers){ 
      System.out.println(numbers[item]);
    }
  }
}
