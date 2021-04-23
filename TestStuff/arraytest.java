package TestStuff;
public class arraytest {
  public static void main(String[] args){
    double [ ] money = {10.23, 52.1, 566.25, 3.7};
    money = new double[100];
    char [ ] letters = {'a', 'b'};		
    float [ ] realNums;
    for (char item : letters){ 
      System.out.println(item);
    }	
    for (int i=0; i<letters.length;i++){ 
      System.out.println("gay");
    }
    String s1="Sachin";  
    String s2="Sachin";  
    String s3="Ratan";  
    System.out.println(s1.compareTo(s2));//0  
    System.out.println(s1.compareTo(s3));//1(because s1>s3)  
    System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
    char myChar;
    myChar = 'B';
  }
}
