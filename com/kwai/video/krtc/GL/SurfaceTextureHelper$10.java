package com.kwai.video.krtc.GL.SurfaceTextureHelper$10;
import com.kwai.video.krtc.utils.d$a;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class SurfaceTextureHelper$10 implements d$a	// class@000747
{
    public final SurfaceTextureHelper this$0;

    public void SurfaceTextureHelper$10(SurfaceTextureHelper p0){
       this.this$0 = p0;
       super();
    }
    public void release(long p0){
       SurfaceTextureHelper$10 u10 = SurfaceTextureHelper$10.class;
       if (PatchProxy.isSupport(u10) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, u10, "1")) {
          return;
       }
       this.this$0.returnTextureFrame((int)p0);
       return;
    }
}
