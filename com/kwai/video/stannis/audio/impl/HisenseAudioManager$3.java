package com.kwai.video.stannis.audio.impl.HisenseAudioManager$3;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class HisenseAudioManager$3 implements Runnable	// class@000c0f
{
    public final HisenseAudioManager this$0;
    public final int val$latency;

    public void HisenseAudioManager$3(HisenseAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$latency = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$3.class, "1")) {
          return;
       }
       this.this$0.audioCommon.setRoundTripLatency(this.val$latency);
       return;
    }
}
