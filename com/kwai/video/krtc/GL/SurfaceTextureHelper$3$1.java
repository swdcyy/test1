package com.kwai.video.krtc.GL.SurfaceTextureHelper$3$1;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;

public class SurfaceTextureHelper$3$1 implements Runnable	// class@00074a
{
    public final SurfaceTextureHelper$3 this$1;

    public void SurfaceTextureHelper$3$1(SurfaceTextureHelper$3 p0){
       this.this$1 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper$3$1.class, "1")) {
          return;
       }
       this.this$1.this$0.hasPendingTexture = true;
       this.this$1.this$0.tryDeliverTextureFrame();
       return;
    }
}
