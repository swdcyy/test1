package com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl$2;
import java.lang.Runnable;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class KwaiGpuContextImpl$2 implements Runnable	// class@0019e0
{
    public final KwaiGpuContextImpl this$0;

    public void KwaiGpuContextImpl$2(KwaiGpuContextImpl p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KwaiGpuContextImpl$2.class, "1")) {
          return;
       }
       this.this$0.releaseInternal();
       return;
    }
}
