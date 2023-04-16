package com.kwai.video.stannis.audio.impl.ToBAudioManager$8;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ToBAudioManager$8 implements Runnable	// class@000c3e
{
    public final ToBAudioManager this$0;

    public void ToBAudioManager$8(ToBAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$8.class, "1")) {
          return;
       }
       ToBAudioManager$8 tthis$0 = this.this$0;
       tthis$0.uploadDeviceInfo(tthis$0.getOutputType(), this.this$0.userSetOutputType);
       return;
    }
}
