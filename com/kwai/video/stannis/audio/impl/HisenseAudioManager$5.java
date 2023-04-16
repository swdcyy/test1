package com.kwai.video.stannis.audio.impl.HisenseAudioManager$5;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import com.kwai.video.stannis.audio.support.OppoKTVHelper;

public class HisenseAudioManager$5 implements Runnable	// class@000c11
{
    public final HisenseAudioManager this$0;

    public void HisenseAudioManager$5(HisenseAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$5.class, "1")) {
          return;
       }
       if (this.this$0.isEnableHeadphoneMonitor != null) {
          this.this$0.audioCommon.disableVendorHeadphoneMonitor();
          boolean b = false;
          this.this$0.audioCommon.enableSoftHeadphoneMonitor(b);
          this.this$0.isEnableHeadphoneMonitor = b;
          if (OppoKTVHelper.isNotInBlackList()) {
             this.this$0.resetDevice("OPPO", true);
          }
          HisenseAudioManager$5 tthis$0 = this.this$0;
          tthis$0.uploadDeviceInfo(tthis$0.getOutputType(), this.this$0.userSetOutputType);
       }
       return;
    }
}
