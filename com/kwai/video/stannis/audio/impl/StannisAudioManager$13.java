package com.kwai.video.stannis.audio.impl.StannisAudioManager$13;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class StannisAudioManager$13 implements Runnable	// class@000c1b
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$13(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$13.class, "1")) {
          return;
       }
       if (this.this$0.isEnableHeadphoneMonitor != null) {
          this.this$0.audioCommon.disableVendorHeadphoneMonitor();
          this.this$0.audioCommon.enableSoftHeadphoneMonitor(false);
          this.this$0.isEnableHeadphoneMonitor = false;
          StannisAudioManager$13 tthis$0 = this.this$0;
          tthis$0.uploadDeviceInfo(tthis$0.getOutputType(), this.this$0.userSetOutputType);
       }
       return;
    }
}
