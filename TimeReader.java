import javax.swing.*;

public class TimeReader
{
   private String input_line;
   
   public TimeReader()
   {
      input_line = "";
   }
   
   public char readCommand(String message)
   {
      input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
      return input_line.charAt(0);
   }
   
   public int readAmount(String message)
   {
      input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
      int amount = new Integer(input_line).intValue();
      return amount;
   }
}