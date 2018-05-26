import java.awt.Graphics;
import javax.swing.*;
public class TimeController extends JPanel
{ public TimeModel model; 
  public AnimationWriter writer;
  public TimeWriter time_writer; 
  private TimeReader reader;
  public char c;

   public TimeController(TimeModel m, AnimationWriter w,TimeWriter tr,TimeReader re)
   {  model = m;
      writer = w;
      time_writer = tr;
      reader = re;
   }
   

   public void runAnimation()
   { int time_unit = 1;
     int h = 0, m = 0, s = 0;
     int painting_delay = 0;
     boolean controlCommand = true;
     try{
     while(controlCommand){
     c = reader.readCommand("Type Command S-(Stopwatch) or C-(Countdown)"); 
     if(c == 'C'){ boolean control = true;
                   while(control){
                   h = reader.readAmount("Type the amount of hours (0-11)");
                   if(h<0 || h>11){JOptionPane.showMessageDialog(null,"Invalid Input");}
                   else {m = reader.readAmount("Type the amount of minutes (0-59)");
                         if(m<0 || m>59){JOptionPane.showMessageDialog(null,"Invalid Input");}
                         else{s = reader.readAmount("Type the amount of seconds (0-59)");
                              if(s<0 || s>59){JOptionPane.showMessageDialog(null,"Invalid Input");}
                              else{control = false;}}}
                       }
                   model.setValue(h,m,s);
                   time_writer.setValue(h,m,s);
                   controlCommand = false;} 
     else if(c == 'S'){writer.showButton(); controlCommand = false;}
     else{JOptionPane.showMessageDialog(null, "Invalid input.\nPlease type S(Stopwatch) or C(Counter)");} }         
     painting_delay = 1000;}
     catch(StringIndexOutOfBoundsException e){JOptionPane.showMessageDialog(null, "ERROR: Invalid input. \nUser pressed Ok."); writer.closeFrame();}
     catch(NullPointerException e){JOptionPane.showMessageDialog(null, "ERROR: Invalid input. \nUser pressed Cancel."); writer.closeFrame();}
     catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "ERROR: Invalid input. \nUser pressed Ok."); writer.closeFrame();}     
      while ( true )
      {  
         delay(painting_delay);
         if(writer.pl() != 'T'){break;}
         if(c== 'C'){time_writer.upNumb(model.countdown(),model.renew(),model.ove());}
         if(c=='S'){time_writer.upNumb2(model.stop(),model.counting());}
         writer.repaint(); 
      }
   }
  
    private void delay(int how_long)
   { 
      try { Thread.sleep(how_long); }
      catch (InterruptedException e) { }
   }
}
