package com.kwai.video.aemonplayer.surface.KwaiSharedGpuContext;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;

public class KwaiSharedGpuContext extends KwaiGpuContext	// class@0019e2
{
    public final KwaiGpuContext mCore;
    public static KwaiGpuContext sGpuContext;

    public void KwaiSharedGpuContext(){
       super();
       this.mCore = new KwaiGpuContextImpl(1);
    }
    public static KwaiGpuContext init(){
       KwaiSharedGpuContext kwaiSharedGp = KwaiSharedGpuContext.class;
       Object obj = PatchProxy.apply(null, null, kwaiSharedGp, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (KwaiSharedGpuContext.sGpuContext == null) {
          _monitor_enter(kwaiSharedGp);
          KwaiSharedGpuContext.sGpuContext = new KwaiSharedGpuContext();
          _monitor_exit(kwaiSharedGp);
       }
       return KwaiSharedGpuContext.sGpuContext;
    }
    public Object getContext(){
       KwaiSharedGpuContext obj = PatchProxy.apply(null, this, KwaiSharedGpuContext.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCore;
       Integer context = (obj != null)? obj.getContext(): Integer.valueOf(0);
       return context;
    }
    public long getContextHandler(){
       KwaiSharedGpuContext obj = PatchProxy.apply(null, this, KwaiSharedGpuContext.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mCore;
       long contextHandl = (obj != null)? obj.getContextHandler(): 0;
       return contextHandl;
    }
    public EGLContext getEGLContext10(){
       KwaiSharedGpuContext obj = PatchProxy.apply(null, this, KwaiSharedGpuContext.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCore;
       EGLContext eGLContext10 = (obj != null)? obj.getEGLContext10(): EGL10.EGL_NO_CONTEXT;
       return eGLContext10;
    }
    public void release(){
    }
}
