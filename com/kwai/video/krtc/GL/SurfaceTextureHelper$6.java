package com.kwai.video.krtc.GL.SurfaceTextureHelper$6;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SurfaceTextureHelper$6 implements Runnable	// class@00074e
{
    public final SurfaceTextureHelper this$0;

    public void SurfaceTextureHelper$6(SurfaceTextureHelper p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper$6.class, "1")) {
          return;
       }
       SurfaceTextureHelper$6 tthis$0 = this.this$0;
       tthis$0.isQuitting = true;
       tthis$0.release();
       return;
    }
}
