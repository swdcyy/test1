package com.kwai.video.stannis.audio.impl.StannisAudioManager$17;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;

public class StannisAudioManager$17 implements Runnable	// class@000c1f
{
    public final StannisAudioManager this$0;
    public final boolean val$finalNeedResetDevice;
    public final boolean val$isOn;

    public void StannisAudioManager$17(StannisAudioManager p0,boolean p1,boolean p2){
       this.this$0 = p0;
       this.val$isOn = p1;
       this.val$finalNeedResetDevice = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$17.class, "1")) {
          return;
       }
       if (this.this$0.userSetOutputType == null && (this.this$0.isHeadsetConnected == null && (this.this$0.isUsbConnected == null && this.this$0.isBluetoothConnected == null))) {
          StannisAudioManager config = this.this$0.config;
          if (config != null && config.getScene() == 3328) {
             Log.i("StannisAudioManager", "[StannisAudioManager] only setSpeakerOn = "+this.val$isOn);
             StannisAudioManager$17 tthis$0 = this.this$0;
             tthis$0.setSpeakerOnWrapper(tthis$0.userSetSpeakerOn);
          }else {
             String str = "switchnum:"+this.this$0.switchnum+" setSpeakerOn "+this.this$0.userSetSpeakerOn;
             if (this.val$finalNeedResetDevice != null) {
                this.this$0.resetDevice(str, false);
             }
          }
       }
       return;
    }
}
