import java.awt.*;

public class FrameWriter
{ private int size; 


  public FrameWriter(int size1)
  { size = size1; }
   

  public void paint(Graphics g)
  { 
    g.setColor(Color.white);
    g.fillRect(0, 0, size, size);
    g.setColor(Color.black);
    g.drawRect(0, 0, size, size);
  }
}