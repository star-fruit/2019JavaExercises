package TestStuff;
import javax.swing.JOptionPane;
public class ErrorMessage {
  public static void Error(){
    JOptionPane.showMessageDialog(null, "Syntax Error", "Java NetBeans IDE", JOptionPane.WARNING_MESSAGE);
  }
  
  public static void main(String[] args){
  try{
    Thread.sleep(10000);
  }
  catch(InterruptedException ex){
    Thread.currentThread().interrupt();
  }  
  
  
  Error();
  } 
}
