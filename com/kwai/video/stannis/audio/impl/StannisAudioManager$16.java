package com.kwai.video.stannis.audio.impl.StannisAudioManager$16;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class StannisAudioManager$16 implements Runnable	// class@000c1e
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$16(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$16.class, "1")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] volume: "+this.this$0.audioManager.getStreamVolume(3)+"max volume"+this.this$0.audioManager.getStreamMaxVolume(3));
       this.this$0.audioCommon.SetInnerCapDataVolume(((float)this.this$0.audioManager.getStreamVolume(3) / (float)this.this$0.audioManager.getStreamMaxVolume(3)));
       return;
    }
}
