package TestStuff;
import java.util.Scanner;
public class emailEntry {
  String fullname;
  String username = "";
  String address;
  public emailEntry(String n, String a){
    fullname = n;
    address = a;
  }
  
  public void returnEmail(){
    username += fullname.toLowerCase().charAt(0);
    String name[] = fullname.split(" "); 
    username += name[1].toLowerCase();
    System.out.println(username + "@" + address);
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String f, d;
    System.out.println("Please input your first and last name:");
    f = input.nextLine();
    System.out.println("Please input your domain name:");
    d = input.nextLine();
    emailEntry email = new emailEntry(f, d);
    email.returnEmail();
  }
}
