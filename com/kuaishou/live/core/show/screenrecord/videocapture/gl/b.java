package com.kuaishou.live.core.show.screenrecord.videocapture.gl.b;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.b$a;
import com.kwai.robust.PatchProxyResult;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Integer;
import javax.microedition.khronos.egl.EGLSurface;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a$a;

public final class b extends a	// class@000ff1
{
    public final EGL10 d;
    public EGLContext e;
    public EGLConfig f;
    public EGLDisplay g;
    public EGLSurface h;

    public void b(b$a p0,int[] p1){
       int[] obj;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       this.h = EGL10.EGL_NO_SURFACE;
       EGL10 eGL = EGLContext.getEGL();
       this.d = eGL;
       EGLDisplay uEGLDisplay = PatchProxy.apply(null, this, uob, "9");
       if (uEGLDisplay != patchProxyRe) {
       }else {
          uEGLDisplay = eGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
          if (uEGLDisplay != EGL10.EGL_NO_DISPLAY) {
             obj = new int[2];
             if (!eGL.eglInitialize(uEGLDisplay, obj)) {
                throw new RuntimeException("Unable to initialize EGL10: 0x"+Integer.toHexString(eGL.eglGetError()));
             }
          }else {
             throw new RuntimeException("Unable to get EGL10 display: 0x"+Integer.toHexString(eGL.eglGetError()));
          }
       }
       obj = uEGLDisplay;
       this.g = obj;
       object oobject = PatchProxy.applyTwoRefs(obj, p1, this, uob, "10");
       if (oobject != patchProxyRe) {
       }else {
          EGLConfig[] uEGLConfigAr = new EGLConfig[1];
          int[] ointArray1 = new int[1];
          if (eGL.eglChooseConfig(obj, p1, uEGLConfigAr, 1, ointArray1)) {
             int i = 0;
             if (ointArray1[i] > 0) {
                oobject = uEGLConfigAr[i];
                if (oobject == null) {
                   throw new RuntimeException("eglChooseConfig returned null");
                }
             }else {
                throw new RuntimeException("Unable to find any matching EGL config");
             }
          }else {
             throw new RuntimeException("eglChooseConfig failed: 0x"+Integer.toHexString(eGL.eglGetError()));
          }
       }
       this.f = oobject;
       b tg = this.g;
       EGLContext uEGLContext = PatchProxy.applyThreeRefs(p0, tg, oobject, this, b.class, "11");
       if (uEGLContext != patchProxyRe) {
       }else if(p0 == null || p0.a != EGL10.EGL_NO_CONTEXT){
          int[] ointArray = new int[3]{0x3098,2,0x3038};
          EGLContext eGL_NO_CONTE = (p0 == null)? EGL10.EGL_NO_CONTEXT: p0.a;
          Object a = a.a;
          _monitor_enter(a);
          eGL_NO_CONTE = eGL.eglCreateContext(tg, oobject, eGL_NO_CONTE, ointArray);
          _monitor_exit(a);
          if (eGL_NO_CONTE != EGL10.EGL_NO_CONTEXT) {
             uEGLContext = eGL_NO_CONTE;
          }else {
             throw new RuntimeException("Failed to create EGL context: 0x"+Integer.toHexString(eGL.eglGetError()));
          }
       }else {
          throw new RuntimeException("Invalid sharedContext");
       }
       this.e = uEGLContext;
       return;
    }
    public void b(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
          return;
       }
       int i = 1;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i), this, uob, "2")) {
          this.i();
          if (this.h == EGL10.EGL_NO_SURFACE) {
             EGLSurface uEGLSurface = this.d.eglCreatePbufferSurface(this.g, this.f, new int[5]{0x3057,1,0x3056,1,0x3038});
             this.h = uEGLSurface;
             if (uEGLSurface == EGL10.EGL_NO_SURFACE) {
                throw new RuntimeException("Failed to create pixel buffer surface with size "+i+"x"+i+": 0x"+Integer.toHexString(this.d.eglGetError()));
             }
          }else {
             throw new RuntimeException("Already has an EGLSurface");
          }
       }
       return;
    }
    public void c(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.i();
       if (this.h != EGL10.EGL_NO_SURFACE) {
          throw new RuntimeException("Already has an EGLSurface");
       }
       int[] ointArray = new int[]{0x3057,p0,0x3056,p1,0x3038};
       EGLSurface uEGLSurface = this.d.eglCreatePbufferSurface(this.g, this.f, ointArray);
       this.h = uEGLSurface;
       if (uEGLSurface != EGL10.EGL_NO_SURFACE) {
          return;
       }
       throw new RuntimeException("Failed to create pixel buffer surface with size "+p0+"x"+p1+": 0x"+Integer.toHexString(this.d.eglGetError()));
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       Object a = a.a;
       _monitor_enter(a);
       if (!this.d.eglMakeCurrent(this.g, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
          throw new RuntimeException("eglDetachCurrent failed: 0x"+Integer.toHexString(this.d.eglGetError()));
       }
       _monitor_exit(a);
       return;
    }
    public a$a e(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b$a(this.e);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.i();
       if (this.h == EGL10.EGL_NO_SURFACE) {
          throw new RuntimeException("No EGLSurface - can\'t make current");
       }
       Object a = a.a;
       _monitor_enter(a);
       if (!this.d.eglMakeCurrent(this.g, this.h, this.h, this.e)) {
          throw new RuntimeException("eglMakeCurrent failed: 0x"+Integer.toHexString(this.d.eglGetError()));
       }
       _monitor_exit(a);
       return;
    }
    public void g(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "6")) {
          return;
       }
       this.i();
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          b th = this.h;
          if (th != EGL10.EGL_NO_SURFACE) {
             this.d.eglDestroySurface(this.g, th);
             this.h = EGL10.EGL_NO_SURFACE;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "8")) {
          Object a = a.a;
          _monitor_enter(a);
          if (this.d.eglMakeCurrent(this.g, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
             _monitor_exit(a);
          }else {
             throw new RuntimeException("eglDetachCurrent failed: 0x"+Integer.toHexString(this.d.eglGetError()));
          }
       }
       this.d.eglDestroyContext(this.g, this.e);
       this.d.eglTerminate(this.g);
       this.e = EGL10.EGL_NO_CONTEXT;
       this.g = EGL10.EGL_NO_DISPLAY;
       this.f = objArray;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b th = this.h;
       if (th != EGL10.EGL_NO_SURFACE) {
          this.d.eglDestroySurface(this.g, th);
          this.h = EGL10.EGL_NO_SURFACE;
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.g != EGL10.EGL_NO_DISPLAY && (this.e != EGL10.EGL_NO_CONTEXT && this.f != null)) {
          return;
       }
       throw new RuntimeException("This object has been released");
    }
}
