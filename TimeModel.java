
public class TimeModel
{ private boolean countdown;
  private boolean stopwatch;
  private boolean over;
  private int inti_h;
  private int inti_m;
  private int inti_s;
  private int[] answer;
  private int[] answer2;

  public TimeModel()
  { 
     countdown = false;
     stopwatch = false;
  }
  
  public int[] renew()
  { 
    if(countdown){
       if(inti_s==0 && inti_m == 0 && inti_h != 0){
       inti_m = inti_m + 60;
       inti_h--;}
       if((inti_m != 0 || inti_h!= 0) && inti_s==0){
       inti_m--;
       inti_s = inti_s + 60;}
       if(inti_s>0){inti_s--;}   
       int minutes_angle = -inti_m*6;
       int hours_angle = -inti_h*30;
       int seconds_angle = -inti_s*6;
       answer2 = new int[6];
       answer2[0] = hours_angle;
       answer2[1] = minutes_angle;
       answer2[2] = seconds_angle;
       answer2[3] = inti_h;
       answer2[4] = inti_m;
       answer2[5] = inti_s;
       }
       return answer2;                            
  }
  
  public boolean countdown()
  {countdown = true;
   return countdown;}
  
  public boolean ove()
  {if(inti_s == 0 && inti_m == 0 && inti_h == 0){
       over = true;} 
       else{over = false;}
       return over;}
  
  public boolean stop()
  {if(stopwatch == false){
   inti_h = 0;
   inti_s = 0;
   inti_m = 0;}
   stopwatch = true;
   return stopwatch;}
   
   public int[] counting()
   {if(stopwatch)
     {
         if(inti_s < 59){inti_s = inti_s + 1;}
         if(inti_m <59 && inti_s == 59){inti_m++; inti_s = inti_s-59;}
         if(inti_h<24 && inti_m == 59 && inti_s == 59){inti_h++; 
         inti_m = inti_m - 59;
         inti_s = inti_s - 59;}
         System.out.println(inti_h + ":" + inti_m + ":" + inti_s);
     }  
     answer = new int[3];
     answer[0] = inti_h;
     answer[1] = inti_m;
     answer[2] = inti_s;
     return answer;
   }
   
   
   public void setValue(int h,int m,int s)
   {
     inti_h = h;
     inti_m = m;
     inti_s = s;
   }
  
}
