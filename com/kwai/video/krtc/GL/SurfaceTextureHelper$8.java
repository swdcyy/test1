package com.kwai.video.krtc.GL.SurfaceTextureHelper$8;
import com.kwai.video.krtc.utils.d$a;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class SurfaceTextureHelper$8 implements d$a	// class@000750
{
    public final SurfaceTextureHelper this$0;

    public void SurfaceTextureHelper$8(SurfaceTextureHelper p0){
       this.this$0 = p0;
       super();
    }
    public void release(long p0){
       SurfaceTextureHelper$8 u8 = SurfaceTextureHelper$8.class;
       if (PatchProxy.isSupport(u8) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, u8, "1")) {
          return;
       }
       this.this$0.returnTextureFrame((int)p0);
       return;
    }
}
