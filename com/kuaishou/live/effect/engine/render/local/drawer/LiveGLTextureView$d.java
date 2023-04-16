package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$d;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$g;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import java.lang.Object;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Thread;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$i;
import java.lang.Exception;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$j;

public class LiveGLTextureView$d implements LiveGLTextureView$g	// class@001b07
{
    public int a;
    public final LiveGLTextureView b;

    public void LiveGLTextureView$d(LiveGLTextureView p0){
       this.b = p0;
       super();
       this.a = 0x3098;
    }
    public EGLContext createContext(EGL10 p0,EGLDisplay p1,EGLConfig p2){
       LiveGLTextureView k;
       int[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGLTextureView$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[]{this.a,k,0x3038};
       k = this.b.k;
       EGLContext eGL_NO_CONTE = EGL10.EGL_NO_CONTEXT;
       if (k == null) {
          obj = null;
       }
       return p0.eglCreateContext(p1, p2, eGL_NO_CONTE, obj);
    }
    public void destroyContext(EGL10 p0,EGLDisplay p1,EGLContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGLTextureView$d.class, "2")) {
          return;
       }
       if (!p0.eglDestroyContext(p1, p2)) {
          Object[] objArray = new Object[0];
          a.C().t("DefaultContextFactory", "display:"+p1+" context: "+p2, objArray);
          a uoa = a.C();
          String str = "tid="+Thread.currentThread().getId();
          Object[] objArray1 = new Object[0];
          try{
             uoa.w("DefaultContextFactory", str, objArray1);
             LiveGLTextureView$i.i("eglDestroyContext", p0.eglGetError());
          }catch(java.lang.Exception e7){
             LiveGLTextureView m = this.b.m;
             if (m != null) {
                m.a(e7);
             }
          }
       }
    }
}
