package com.kwai.video.stannis.audio.impl.ToBAudioManager$13;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.stannis.utils.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import bw7.g;
import java.util.concurrent.ExecutorService;

public class ToBAudioManager$13 implements Runnable	// class@000c2f
{
    public final ToBAudioManager this$0;
    public final int val$vivoHeadPhoneMonitorDelay;

    public void ToBAudioManager$13(ToBAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$vivoHeadPhoneMonitorDelay = p1;
       super();
    }
    public static void a(ToBAudioManager$13 p0,boolean p1){
       p0.lambda$run$0(p1);
    }
    private void lambda$run$0(boolean p0){
       if (p0 != this.this$0.isEnableHeadphoneMonitor) {
          this.this$0.notifyAudioDeviceStatus(6);
          Log.d("ToBAudioManager", "[ToBAudioManager] notifyAudioDeviceStatus KWStannisAudioHeadphoneMonitorOFFDeviceStop vivo");
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$13.class, "1")) {
          return;
       }
       this.this$0.closeDeviceHeaphoneMonitorInterval();
       Log.d("ToBAudioManager", "[ToBAudioManager] closeDeviceHeaphoneMonitorInterval for vivo delay: "+this.val$vivoHeadPhoneMonitorDelay);
       this.this$0.executorService.execute(new g(this, this.this$0.isEnableHeadphoneMonitor));
       return;
    }
}
