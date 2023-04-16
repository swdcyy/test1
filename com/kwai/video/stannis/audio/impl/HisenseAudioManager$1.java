package com.kwai.video.stannis.audio.impl.HisenseAudioManager$1;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.kwai.video.stannis.utils.Log;
import java.lang.CharSequence;
import java.lang.InterruptedException;

public class HisenseAudioManager$1 implements Runnable	// class@000c0d
{
    public final HisenseAudioManager this$0;
    public final boolean val$force;
    public final boolean val$needforceReportRoute;
    public final String val$reason;

    public void HisenseAudioManager$1(HisenseAudioManager p0,String p1,boolean p2,boolean p3){
       this.this$0 = p0;
       this.val$reason = p1;
       this.val$force = p2;
       this.val$needforceReportRoute = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$1.class, "1")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] asyncResetDevice "+Thread.currentThread().getId()+","+this.val$reason);
       String str = ", ";
       String str1 = ", needforceReportRoute = ";
       int i = 1000;
       if ((this.val$reason).contains("Interrupt")) {
          try{
             Log.d("HisenseAudioManager", "[HisenseAudioManager] async 1s to ResetDevice in interrupt case");
             Thread.sleep(1000);
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
          int outputType = this.this$0.getOutputType();
          if (this.this$0.userSetOutputType != null && outputType != this.this$0.userSetOutputType) {
             this.this$0.resetDevice(this.val$reason, this.val$force);
             this.this$0.resetRoundTripLatencyWithDelay(i);
             this.this$0.forceReportRoute = this.val$needforceReportRoute;
             Log.i("HisenseAudioManager", "[HisenseAudioManager] asyncResetDevice end for interrupt, force = "+this.val$force+str1+this.val$needforceReportRoute+str+this.val$reason);
             return;
          }
       }
       this.this$0.resetDevice(this.val$reason, this.val$force);
       this.this$0.resetRoundTripLatencyWithDelay(i);
       this.this$0.forceReportRoute = this.val$needforceReportRoute;
       Log.d("HisenseAudioManager", "[HisenseAudioManager] asyncResetDevice end, force = "+this.val$force+str1+this.val$needforceReportRoute+str+this.val$reason);
       return;
    }
}
