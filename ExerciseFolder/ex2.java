package ExerciseFolder;
import java.util.*;
class ex2 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("First Name? ");
    String first = input.nextLine();

    System.out.print("Middle Name? ");
    String middle = input.nextLine();

    System.out.print("Last Name? ");
    String last = input.nextLine();

    System.out.println("I can list you as: ");
    System.out.println(String.format("%3$s, %1$s %2$s", first, middle, last));
    System.out.println(String.format("%1$s %2$s %3$s", first, middle, last));
    System.out.println(String.format("%1$s %2$s", first, last));
    System.out.println(String.format("%1$s %2$s. %3$s", first, middle.charAt(0), last));
  }
}
