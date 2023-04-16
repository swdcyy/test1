package com.kwai.video.stannis.audio.impl.ToBAudioManager$16;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class ToBAudioManager$16 implements Runnable	// class@000c32
{
    public final ToBAudioManager this$0;
    public final boolean val$use;

    public void ToBAudioManager$16(ToBAudioManager p0,boolean p1){
       this.this$0 = p0;
       this.val$use = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$16.class, "1")) {
          return;
       }
       this.this$0.audioCommon.useBuildInMicUpdate(this.val$use);
       return;
    }
}
