package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$e;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$h;
import java.lang.Object;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$a;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLSurface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pp.a;
import java.lang.Throwable;
import q87.c;

public class LiveGLTextureView$e implements LiveGLTextureView$h	// class@001b08
{

    public void LiveGLTextureView$e(){
       super();
    }
    public void LiveGLTextureView$e(LiveGLTextureView$a p0){
       super();
    }
    public EGLSurface createWindowSurface(EGL10 p0,EGLDisplay p1,EGLConfig p2,Object p3){
       EGLSurface uEGLSurface;
       int[] obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveGLTextureView$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          uEGLSurface = p0.eglCreateWindowSurface(p1, p2, p3, obj);
       }catch(java.lang.IllegalArgumentException e8){
          a.C().e("LiveGLTextureView", "eglCreateWindowSurface", e8);
       }
       return uEGLSurface;
    }
    public void destroySurface(EGL10 p0,EGLDisplay p1,EGLSurface p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGLTextureView$e.class, "2")) {
          return;
       }
       p0.eglDestroySurface(p1, p2);
       return;
    }
}
