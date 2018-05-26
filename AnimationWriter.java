
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class AnimationWriter extends JPanel
{ private FrameWriter frame_writer;   
  private TimeWriter time_writer; 
  private JButton button;
  private char c = 'T';
  private JFrame my_frame;

  
  
  
  public AnimationWriter(FrameWriter b, TimeWriter l, int size)
  { frame_writer = b;
    time_writer = l;
    my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("Timer App");
    my_frame.setSize(size, size);
    my_frame.setVisible(true);
    
  }
  
  public JButton showButton()
  {
     button = new JButton("Stop");
     button.setSize(100,100);
     button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
           c = 'R';          
        }});
        this.add(button);
        return button;
  }
  
  public char pl()
  {
   return c;
  }
  
  public void closeFrame(){
      my_frame.setVisible(false);
  }
  

  public void paintComponent(Graphics g)
  { frame_writer.paint(g);
    time_writer.paint(g);
  }
}