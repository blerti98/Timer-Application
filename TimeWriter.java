import java.awt.*;


public class TimeWriter
{ 
  private int minutes_angle;
  private int seconds_angle;
  private int hours_angle;
  private int inti_h;
  private int inti_m;
  private int inti_s;
  private boolean over;
  private boolean countdown;
  private boolean stopwatch;
  
  
  public void paint(Graphics g)
  {
    if(countdown){
    int width = 7;
    int dif = 70;
    g.setColor(Color.blue);
    Graphics2D g2d = (Graphics2D)g;
    g2d.setStroke(new BasicStroke(width));
    g2d.drawArc(50,50,400,400,90,hours_angle);
    g.setColor(Color.red); 
    g2d.drawArc(50+dif/2,50+dif/2,400-dif,400-dif,90,minutes_angle);
    g.setColor(Color.black);
    g2d.drawArc(50+2*dif/2,50+2*dif/2,400-2*dif,400-2*dif,90,seconds_angle);
    g.setFont(g.getFont().deriveFont(g.getFont().getSize() * 3F));
    g.drawString(inti_h + ":" + inti_m + ":" + inti_s,210,500);
    if(over){g.drawString("TIME IS OVER",170,270);}}
    if(stopwatch){
    g.setFont(g.getFont().deriveFont(g.getFont().getSize() * 6F));
    g.setColor(Color.black);
    g.drawString(inti_h + ":" + inti_m + ":" + inti_s,210,270);} 
  }
    
  
    public void upNumb(boolean coun,int[] angles,boolean ove)
    {
      stopwatch = false;
      countdown = coun;
      hours_angle = angles[0];
      minutes_angle = angles[1];
      seconds_angle = angles[2]; 
      inti_h = angles[3];
      inti_m = angles[4];
      inti_s = angles[5];
      over = ove;
    }
    
      public void upNumb2(boolean stop,int[] count)
    {
      countdown = false;
      stopwatch = stop;
      inti_h = count[0];
      inti_m = count[1];
      inti_s = count[2]; 
    }
 
     public void setValue(int h,int m,int s)
   {
     inti_h = h;
     inti_m = m;
     inti_s = s;
   }
   
}