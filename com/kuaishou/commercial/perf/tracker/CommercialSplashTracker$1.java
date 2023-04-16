package com.kuaishou.commercial.perf.tracker.CommercialSplashTracker$1;
import java.util.HashMap;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import java.lang.Object;

public class CommercialSplashTracker$1 extends HashMap	// class@001511
{
    public final CommercialSplashTracker this$0;

    public void CommercialSplashTracker$1(CommercialSplashTracker p0){
       this.this$0 = p0;
       super();
       this.put("NewFPS", "new_fps");
       this.put("Histogram", "histogram");
       this.put("FPS", "fps");
       this.put("RefreshRate", "refresh_rate");
       this.put("JankyFrameCount", "janky_frame_count");
       this.put("TotalFrameCount", "total_frame_count");
    }
}
