package com.kwai.video.aemonplayer.surface.KwaiSimpleGpuContext;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import javax.microedition.khronos.egl.EGLContext;

public class KwaiSimpleGpuContext extends KwaiGpuContext	// class@0019e3
{
    public final KwaiGpuContext mGpuContext;

    public void KwaiSimpleGpuContext(){
       super();
       this.mGpuContext = new KwaiGpuContextImpl(1);
    }
    public Object getContext(){
       Object obj = PatchProxy.apply(null, this, KwaiSimpleGpuContext.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mGpuContext.getContext();
    }
    public long getContextHandler(){
       Object obj = PatchProxy.apply(null, this, KwaiSimpleGpuContext.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mGpuContext.getContextHandler();
    }
    public EGLContext getEGLContext10(){
       Object obj = PatchProxy.apply(null, this, KwaiSimpleGpuContext.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mGpuContext.getEGLContext10();
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiSimpleGpuContext.class, "4")) {
          return;
       }
       this.mGpuContext.release();
       return;
    }
}
