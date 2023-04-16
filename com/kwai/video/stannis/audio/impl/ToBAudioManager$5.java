package com.kwai.video.stannis.audio.impl.ToBAudioManager$5;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.kwai.video.stannis.utils.Log;
import java.lang.CharSequence;
import java.lang.InterruptedException;

public class ToBAudioManager$5 implements Runnable	// class@000c3b
{
    public final ToBAudioManager this$0;
    public final boolean val$force;
    public final boolean val$needforceReportRoute;
    public final String val$reason;

    public void ToBAudioManager$5(ToBAudioManager p0,String p1,boolean p2,boolean p3){
       this.this$0 = p0;
       this.val$reason = p1;
       this.val$force = p2;
       this.val$needforceReportRoute = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$5.class, "1")) {
          return;
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] asyncResetDevice "+Thread.currentThread().getId()+","+this.val$reason);
       String str = ", ";
       String str1 = ", needforceReportRoute = ";
       int i = 1000;
       if ((this.val$reason).contains("Interrupt")) {
          try{
             Log.d("ToBAudioManager", "[ToBAudioManager] async 1s to ResetDevice in interrupt case");
             Thread.sleep(1000);
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
          int outputType = this.this$0.getOutputType();
          if (this.this$0.userSetOutputType != null && outputType != this.this$0.userSetOutputType) {
             this.this$0.resetDevice(this.val$reason, this.val$force);
             this.this$0.resetRoundTripLatencyWithDelay(i);
             this.this$0.forceReportRoute = this.val$needforceReportRoute;
             Log.i("ToBAudioManager", "[ToBAudioManager] asyncResetDevice end for interrupt, force = "+this.val$force+str1+this.val$needforceReportRoute+str+this.val$reason);
             return;
          }
       }
       this.this$0.resetDevice(this.val$reason, this.val$force);
       this.this$0.resetRoundTripLatencyWithDelay(i);
       this.this$0.forceReportRoute = this.val$needforceReportRoute;
       Log.d("ToBAudioManager", "[ToBAudioManager] asyncResetDevice end, force = "+this.val$force+str1+this.val$needforceReportRoute+str+this.val$reason);
       return;
    }
}
