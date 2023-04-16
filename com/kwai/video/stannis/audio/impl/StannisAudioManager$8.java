package com.kwai.video.stannis.audio.impl.StannisAudioManager$8;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class StannisAudioManager$8 implements Runnable	// class@000c28
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$8(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$8.class, "1")) {
          return;
       }
       StannisAudioManager$8 tthis$0 = this.this$0;
       tthis$0.uploadDeviceInfo(tthis$0.getOutputType(), this.this$0.userSetOutputType);
       return;
    }
}
