package com.kwai.video.stannis.audio.impl.ToBAudioManager$9;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;

public class ToBAudioManager$9 implements Runnable	// class@000c3f
{
    public final ToBAudioManager this$0;
    public final int val$latency;

    public void ToBAudioManager$9(ToBAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$latency = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$9.class, "1")) {
          return;
       }
       this.this$0.audioCommon.setRoundTripLatency(this.val$latency);
       Log.d("ToBAudioManager", "[ToBAudioManager] resetRoundTripLatencyWithDelay to:"+this.val$latency);
       return;
    }
}
