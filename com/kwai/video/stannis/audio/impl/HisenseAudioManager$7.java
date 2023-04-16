package com.kwai.video.stannis.audio.impl.HisenseAudioManager$7;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class HisenseAudioManager$7 implements Runnable	// class@000c13
{
    public final HisenseAudioManager this$0;
    public final int val$currentOutType;
    public final int val$userSetOutType;

    public void HisenseAudioManager$7(HisenseAudioManager p0,int p1,int p2){
       this.this$0 = p0;
       this.val$currentOutType = p1;
       this.val$userSetOutType = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$7.class, "1")) {
          return;
       }
       HisenseAudioManager$7 tthis$0 = this.this$0;
       tthis$0.audioCommon.uploadDeviceInfo(tthis$0.isHeadsetConnected, this.this$0.isBluetoothConnected, this.this$0.isUsbConnected, this.this$0.isEnableHeadphoneMonitor, false, "mic mute:"+this.this$0.audioManager.isMicrophoneMute()+", sco: false", "curoutput: "+this.val$currentOutType+" thisouttype"+this.this$0.currentOutputType+" userset:"+this.val$userSetOutType, String.valueOf(this.this$0.audioManager.getMode()));
       return;
    }
}
