package com.kwai.video.krtc.GL.SurfaceTextureHelper$3;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$3$1;
import java.lang.Runnable;

public class SurfaceTextureHelper$3 implements SurfaceTexture$OnFrameAvailableListener	// class@00074b
{
    public final SurfaceTextureHelper this$0;

    public void SurfaceTextureHelper$3(SurfaceTextureHelper p0){
       this.this$0 = p0;
       super();
    }
    public void onFrameAvailable(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SurfaceTextureHelper$3.class, "1")) {
          return;
       }
       this.this$0.postRunnable(new SurfaceTextureHelper$3$1(this));
       return;
    }
}
