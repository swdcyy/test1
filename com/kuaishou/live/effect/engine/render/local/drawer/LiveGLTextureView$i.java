package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$i;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import pp.a;
import q87.c;
import java.lang.Thread;
import java.lang.RuntimeException;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.egl.EGLContext;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$m;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$n;
import java.io.Writer;
import android.opengl.GLDebugHelper;
import java.lang.Boolean;
import java.lang.Exception;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$j;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLSurface;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$h;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$g;
import javax.microedition.khronos.egl.EGL;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$f;
import java.lang.Number;

public class LiveGLTextureView$i	// class@001b0c
{
    public WeakReference a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLSurface d;
    public EGLConfig e;
    public EGLContext f;

    public void LiveGLTextureView$i(WeakReference p0){
       super();
       this.a = p0;
    }
    public static String e(String p0,int p1){
       LiveGLTextureView$i oi = LiveGLTextureView$i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oi, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0+" failed: "+p1;
    }
    public static void f(String p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveGLTextureView$i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveGLTextureView$i.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().A(p0, LiveGLTextureView$i.e(p1, p2), objArray);
       return;
    }
    public static void i(String p0,int p1){
       LiveGLTextureView$i oi = LiveGLTextureView$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oi, "9")) {
          return;
       }
       p0 = LiveGLTextureView$i.e(p0, p1);
       Object[] objArray = new Object[0];
       a.C().t("EglHelper", "throwEglException tid="+Thread.currentThread().getId()+" "+p0, objArray);
       throw new RuntimeException(p0);
    }
    public GL a(){
       Object[] objArray = null;
       GL obj = PatchProxy.apply(objArray, this, LiveGLTextureView$i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.getGL();
       LiveGLTextureView liveGLTextur = this.a.get();
       if (liveGLTextur != null) {
          LiveGLTextureView i = liveGLTextur.i;
          if (i != null) {
             obj = i.a(obj);
          }
          liveGLTextur = liveGLTextur.j;
          if (liveGLTextur & 0x03) {
             int i1 = 0;
             if (liveGLTextur & 0x01) {
                i1 = 1;
             }
             if (liveGLTextur & 0x02) {
                objArray = new LiveGLTextureView$n();
             }
             obj = GLDebugHelper.wrap(obj, i1, objArray);
          }
       }
       return obj;
    }
    public boolean b(){
       Object[] objArray = null;
       LiveGLTextureView obj = PatchProxy.apply(objArray, this, LiveGLTextureView$i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray1 = new Object[0];
       a.C().A("EglHelper", "createSurface\(\)  tid="+Thread.currentThread().getId(), objArray1);
       if (this.b == null) {
          try{
             throw new RuntimeException("egl not initialized");
          }catch(java.lang.Exception e0){
             if (this.a.get() != null && this.a.get().m != null) {
                this.a.get().m.a(e0);
             }
          }
       }
       if (this.c == null) {
          try{
             throw new RuntimeException("eglDisplay not initialized");
          }catch(java.lang.Exception e0){
             if (this.a.get() != null && this.a.get().m != null) {
                this.a.get().m.a(e0);
             }
          }
       }
       if (this.e == null) {
          try{
             throw new RuntimeException("mEglConfig not initialized");
          }catch(java.lang.Exception e0){
             if (this.a.get() != null && this.a.get().m != null) {
                this.a.get().m.a(e0);
             }
          }
       }
       this.c();
       obj = this.a.get();
       this.d = (obj != null && obj.getSurfaceTexture() != null)? obj.h.createWindowSurface(this.b, this.c, this.e, obj.getSurfaceTexture()): objArray;
       LiveGLTextureView$i td = this.d;
       if (td == null || td == EGL10.EGL_NO_SURFACE) {
          if (this.b.eglGetError() == 0x300b) {
             objArray = new Object[0];
             a.C().t("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.", objArray);
          }
          return 0;
       }else if(!this.b.eglMakeCurrent(this.c, td, td, this.f)){
          LiveGLTextureView$i.f("EGLHelper", "eglMakeCurrent", this.b.eglGetError());
          return 0;
       }else {
          return true;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$i.class, "6")) {
          return;
       }
       LiveGLTextureView$i td = this.d;
       if (td != null) {
          EGLSurface eGL_NO_SURFA = EGL10.EGL_NO_SURFACE;
          if (td != eGL_NO_SURFA) {
             this.b.eglMakeCurrent(this.c, eGL_NO_SURFA, eGL_NO_SURFA, EGL10.EGL_NO_CONTEXT);
             LiveGLTextureView liveGLTextur = this.a.get();
             if (liveGLTextur != null) {
                liveGLTextur.h.destroySurface(this.b, this.c, this.d);
             }
             this.d = null;
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveGLTextureView$i.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().A("EglHelper", "finish\(\) tid="+Thread.currentThread().getId(), objArray);
       if (this.f != null) {
          LiveGLTextureView liveGLTextur = this.a.get();
          if (liveGLTextur != null) {
             liveGLTextur.g.destroyContext(this.b, this.c, this.f);
          }
          this.f = null;
       }
       LiveGLTextureView$i tc = this.c;
       if (tc != null) {
          this.b.eglTerminate(tc);
          this.c = null;
       }
       return;
    }
    public void g(){
       LiveGLTextureView$i oi = LiveGLTextureView$i.class;
       if (PatchProxy.applyVoid(null, this, oi, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().A("EglHelper", "start\(\) tid="+Thread.currentThread().getId(), objArray);
       EGL10 eGL = EGLContext.getEGL();
       this.b = eGL;
       EGLDisplay uEGLDisplay = eGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
       this.c = uEGLDisplay;
       if (uEGLDisplay == EGL10.EGL_NO_DISPLAY) {
          try{
             throw new RuntimeException("eglGetDisplay failed");
          }catch(java.lang.Exception e2){
             if (this.a.get() != null && this.a.get().m != null) {
                this.a.get().m.a(e2);
             }
          }
       }
       int[] ointArray = new int[2];
       if (!this.b.eglInitialize(this.c, ointArray)) {
          try{
             throw new RuntimeException("eglInitialize failed");
          }catch(java.lang.Exception e2){
             if (this.a.get() != null && this.a.get().m != null) {
                this.a.get().m.a(e2);
             }
          }
       }
       LiveGLTextureView liveGLTextur = this.a.get();
       if (liveGLTextur == null) {
          this.e = null;
          this.f = null;
       }else {
          EGLConfig uEGLConfig = liveGLTextur.f.chooseConfig(this.b, this.c);
          this.e = uEGLConfig;
          this.f = liveGLTextur.g.createContext(this.b, this.c, uEGLConfig);
       }
       LiveGLTextureView$i tf = this.f;
       if (tf == null || tf == EGL10.EGL_NO_CONTEXT) {
          this.f = null;
          try{
             String str = "createContext";
             if (!PatchProxy.applyVoidOneRefs(str, this, oi, "8")) {
                LiveGLTextureView$i.i(str, this.b.eglGetError());
             }
          }catch(java.lang.Exception e0){
             if (this.a.get() != null && this.a.get().m != null) {
                this.a.get().m.a(e0);
             }
          }
       }
       Object[] objArray1 = new Object[0];
       a.C().A("EglHelper", "createContext "+this.f+" tid="+Thread.currentThread().getId(), objArray1);
       this.d = null;
       return;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, LiveGLTextureView$i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.b.eglSwapBuffers(this.c, this.d)) {
          return this.b.eglGetError();
       }
       return 0x3000;
    }
}
