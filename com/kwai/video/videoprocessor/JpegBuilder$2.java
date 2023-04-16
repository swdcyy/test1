package com.kwai.video.videoprocessor.JpegBuilder$2;
import java.lang.Runnable;
import com.kwai.video.videoprocessor.JpegBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.videoprocessor.JpegBuilderEventListener;
import com.kwai.video.videoprocessor.JpegBuilderException;

public class JpegBuilder$2 implements Runnable	// class@000c8e
{
    public final JpegBuilder this$0;
    public final int val$retcode;

    public void JpegBuilder$2(JpegBuilder p0,int p1){
       this.this$0 = p0;
       this.val$retcode = p1;
       super();
    }
    public void run(){
       JpegBuilder$2 tthis$01;
       if (PatchProxy.applyVoid(null, this, JpegBuilder$2.class, "1")) {
          return;
       }
       JpegBuilder$2 tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       long l = 0;
       if (this.this$0.mNativeAddress - l) {
          tthis$01 = this.this$0;
          tthis$01.deleteNativeJpegBuilder(tthis$01.mNativeAddress);
          this.this$0.mNativeAddress = l;
       }
       tthis$01 = this.this$0;
       if (tthis$01.mListener == null) {
          _monitor_exit(tthis$0);
          return;
       }else if(tthis$01.mCancelled == null){
          tthis$01 = this.val$retcode;
          if (tthis$01 == -30008) {
          label_0050 :
             this.this$0.mListener.onCancelled();
          }else if(tthis$01 == null){
             this.this$0.mListener.onFinished();
          }else {
             this.this$0.mListener.onError(new JpegBuilderException(this.val$retcode));
          }
       }else {
          goto label_0050 ;
       }
       _monitor_exit(tthis$0);
       return;
    }
}
