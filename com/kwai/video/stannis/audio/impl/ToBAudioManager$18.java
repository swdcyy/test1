package com.kwai.video.stannis.audio.impl.ToBAudioManager$18;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class ToBAudioManager$18 implements Runnable	// class@000c34
{
    public final ToBAudioManager this$0;

    public void ToBAudioManager$18(ToBAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$18.class, "1")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] volume: "+this.this$0.audioManager.getStreamVolume(3)+"max volume"+this.this$0.audioManager.getStreamMaxVolume(3));
       this.this$0.audioCommon.SetInnerCapDataVolume(((float)this.this$0.audioManager.getStreamVolume(3) / (float)this.this$0.audioManager.getStreamMaxVolume(3)));
       return;
    }
}
