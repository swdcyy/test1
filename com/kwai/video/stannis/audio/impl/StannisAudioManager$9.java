package com.kwai.video.stannis.audio.impl.StannisAudioManager$9;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class StannisAudioManager$9 implements Runnable	// class@000c29
{
    public final StannisAudioManager this$0;
    public final int val$latency;

    public void StannisAudioManager$9(StannisAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$latency = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$9.class, "1")) {
          return;
       }
       this.this$0.audioCommon.setRoundTripLatency(this.val$latency);
       return;
    }
}
