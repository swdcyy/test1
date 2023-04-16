package com.kwai.video.stannis.audio.impl.HisenseAudioManager$2;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class HisenseAudioManager$2 implements Runnable	// class@000c0e
{
    public final HisenseAudioManager this$0;

    public void HisenseAudioManager$2(HisenseAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$2.class, "1")) {
          return;
       }
       HisenseAudioManager$2 tthis$0 = this.this$0;
       tthis$0.uploadDeviceInfo(tthis$0.getOutputType(), this.this$0.userSetOutputType);
       return;
    }
}
