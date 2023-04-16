package com.kwai.video.stannis.audio.impl.ToBAudioManager$12;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import android.os.Build;
import com.kwai.video.stannis.utils.Log;

public class ToBAudioManager$12 implements Runnable	// class@000c2e
{
    public final ToBAudioManager this$0;
    public final int val$headPhoneMonitorDelay;

    public void ToBAudioManager$12(ToBAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$headPhoneMonitorDelay = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$12.class, "1")) {
          return;
       }
       this.this$0.openDeviceHeaphoneMonitorInternal();
       Log.d("ToBAudioManager", "[ToBAudioManager] openDeviceHeaphoneMonitorInternal for "+Build.MANUFACTURER+" delay: "+this.val$headPhoneMonitorDelay);
       if (this.this$0.isEnableHeadphoneMonitor != this.this$0.isEnableHeadphoneMonitor) {
          Log.d("ToBAudioManager", "[ToBAudioManager] KWStannisAudioHeadphoneMonitorON vivo");
          this.this$0.notifyAudioDeviceStatus(5);
       }
       return;
    }
}
