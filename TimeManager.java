public class TimeManager
{ public static void main(String[] args)
  { 
    int frame_size = 600;
    TimeReader reader = new TimeReader();
    TimeModel model = new TimeModel();                                
    TimeWriter time_writer = new TimeWriter();
    FrameWriter frame_writer  = new FrameWriter(frame_size);
    AnimationWriter writer
             = new AnimationWriter(frame_writer, time_writer, frame_size);          
    TimeController t = new TimeController(model, writer,time_writer,reader);
    t.runAnimation();
   }
}
