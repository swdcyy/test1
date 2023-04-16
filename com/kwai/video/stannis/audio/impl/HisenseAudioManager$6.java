package com.kwai.video.stannis.audio.impl.HisenseAudioManager$6;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class HisenseAudioManager$6 implements Runnable	// class@000c12
{
    public final HisenseAudioManager this$0;

    public void HisenseAudioManager$6(HisenseAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$6.class, "1")) {
          return;
       }
       HisenseAudioManager$6 tthis$0 = this.this$0;
       tthis$0.audioCommon.uploadDeviceInfo(tthis$0.isHeadsetConnected, this.this$0.isBluetoothConnected, this.this$0.isUsbConnected, this.this$0.isEnableHeadphoneMonitor, false, "mic mute:"+this.this$0.audioManager.isMicrophoneMute()+", sco: false", "spk on:"+this.this$0.audioManager.isSpeakerphoneOn(), String.valueOf(this.this$0.audioManager.getMode()));
       return;
    }
}
