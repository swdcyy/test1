package com.kwai.video.stannis.audio.impl.HisenseAudioManager$8;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class HisenseAudioManager$8 implements Runnable	// class@000c14
{
    public final HisenseAudioManager this$0;

    public void HisenseAudioManager$8(HisenseAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$8.class, "1")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] volume: "+this.this$0.audioManager.getStreamVolume(3)+"max volume"+this.this$0.audioManager.getStreamMaxVolume(3));
       this.this$0.audioCommon.SetInnerCapDataVolume(((float)this.this$0.audioManager.getStreamVolume(3) / (float)this.this$0.audioManager.getStreamMaxVolume(3)));
       return;
    }
}
