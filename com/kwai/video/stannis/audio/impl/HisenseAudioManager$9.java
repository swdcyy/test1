package com.kwai.video.stannis.audio.impl.HisenseAudioManager$9;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class HisenseAudioManager$9 implements Runnable	// class@000c15
{
    public final HisenseAudioManager this$0;

    public void HisenseAudioManager$9(HisenseAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$9.class, "1")) {
          return;
       }
       if (this.this$0.userSetOutputType == null && (this.this$0.isHeadsetConnected == null && (this.this$0.isUsbConnected == null && this.this$0.isBluetoothConnected == null))) {
          HisenseAudioManager$9 u9 = (this.this$0.isSpeakerOn != this.this$0.userSetSpeakerOn)? 1: null;
          if (u9) {
             this.this$0.resetDevice("setSpeakerOn", false);
          }
       }
    label_003b :
       return;
    }
}
