package ExerciseFolder;
import java.util.*;
public class ex6 {
  public static void main(String[] args) {
  int count = 0;
    while (count < 20) {
      count ++;
      System.out.print(count + "  " );  
    }
    System.out.print("\n");    
    
    int c = 1;
    ArrayList<Integer> ints = new ArrayList<>();
    while (c < 21) {
      ints.add(c);
      System.out.print(ints.get(c-1) + "  " );
      c ++;
    }
    
    System.out.print("\n");
    
    for (int i = 2; i < 21; i++) {
     System.out.print(i + "  " );  
    }
    
    System.out.print("\n");
    
    int cnt = 1;
    do {
      cnt ++;
      System.out.print(cnt + "  " );  
    }
    while (cnt<20);
  }
}

