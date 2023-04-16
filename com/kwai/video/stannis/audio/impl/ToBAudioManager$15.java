package com.kwai.video.stannis.audio.impl.ToBAudioManager$15;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class ToBAudioManager$15 implements Runnable	// class@000c31
{
    public final ToBAudioManager this$0;

    public void ToBAudioManager$15(ToBAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$15.class, "1")) {
          return;
       }
       ToBAudioManager$15 tthis$0 = this.this$0;
       tthis$0.audioCommon.uploadDeviceInfo(tthis$0.isHeadsetConnected, this.this$0.isBluetoothConnected, this.this$0.isUsbConnected, this.this$0.isEnableHeadphoneMonitor, false, "mic mute:"+this.this$0.audioManager.isMicrophoneMute()+", sco:"+this.this$0.audioManager.isBluetoothScoOn(), "spk on:"+this.this$0.audioManager.isSpeakerphoneOn(), String.valueOf(this.this$0.audioManager.getMode()));
       return;
    }
}
