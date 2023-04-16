package com.kwai.video.videoprocessor.JpegBuilder$1;
import java.lang.Runnable;
import com.kwai.video.videoprocessor.JpegBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.videoprocessor.JpegBuilderEventListener;

public class JpegBuilder$1 implements Runnable	// class@000c8d
{
    public final JpegBuilder this$0;
    public final double val$percentage;

    public void JpegBuilder$1(JpegBuilder p0,double p1){
       this.this$0 = p0;
       this.val$percentage = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, JpegBuilder$1.class, "1")) {
          return;
       }
       JpegBuilder$1 tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       JpegBuilder mListener = this.this$0.mListener;
       if (mListener != null) {
          mListener.onProgress(this.val$percentage);
       }
       _monitor_exit(tthis$0);
       return;
    }
}
