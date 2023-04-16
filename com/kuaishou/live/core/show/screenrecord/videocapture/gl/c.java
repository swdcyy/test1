package com.kuaishou.live.core.show.screenrecord.videocapture.gl.c;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a;
import android.os.Build$VERSION;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.c$a;
import com.kwai.robust.PatchProxyResult;
import android.opengl.EGL14;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.opengl.EGLSurface;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a$a;

public final class c extends a	// class@000ff3
{
    public EGLContext d;
    public EGLConfig e;
    public EGLDisplay f;
    public EGLSurface g;
    public static final int h;

    static {
       c.h = Build$VERSION.SDK_INT;
    }
    public void c(c$a p0,int[] p1){
       int[] a;
       c uoc = this;
       c$a uoa = p0;
       c uoc1 = c.class;
       super();
       uoc.g = EGL14.EGL_NO_SURFACE;
       Object[] objArray = null;
       EGLDisplay uEGLDisplay = PatchProxy.apply(objArray, objArray, uoc1, "10");
       int i = 1;
       if (uEGLDisplay != PatchProxyResult.class) {
       }else {
          uEGLDisplay = EGL14.eglGetDisplay(0);
          if (uEGLDisplay != EGL14.EGL_NO_DISPLAY) {
             int[] ointArray1 = new int[2];
             if (!EGL14.eglInitialize(uEGLDisplay, ointArray1, 0, ointArray1, i)) {
                throw new RuntimeException("Unable to initialize EGL14: 0x"+Integer.toHexString(EGL14.eglGetError()));
             }
          }else {
             throw new RuntimeException("Unable to get EGL14 display: 0x"+Integer.toHexString(EGL14.eglGetError()));
          }
       }
       Object obj = uEGLDisplay;
       uoc.f = obj;
       object oobject = PatchProxy.applyTwoRefs(obj, p1, objArray, uoc1, "11");
       if (oobject != PatchProxyResult.class) {
       }else {
          EGLConfig[] uEGLConfigAr = new EGLConfig[i];
          a = new int[i];
          if (EGL14.eglChooseConfig(obj, p1, 0, uEGLConfigAr, 0, 1, a, 0)) {
             if (a[0] > 0) {
                oobject = uEGLConfigAr[0];
                if (oobject == null) {
                   throw new RuntimeException("eglChooseConfig returned null");
                }
             }else {
                throw new RuntimeException("Unable to find any matching EGL config");
             }
          }else {
             throw new RuntimeException("eglChooseConfig failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
          }
       }
       obj = oobject;
       uoc.e = obj;
       c f = uoc.f;
       EGLContext uEGLContext = PatchProxy.applyThreeRefs(p0, f, obj, null, c.class, "12");
       if (uEGLContext != PatchProxyResult.class) {
       }else if(!uoa || uoa.a != EGL14.EGL_NO_CONTEXT){
          int[] ointArray = new int[3]{0x3098,2,0x3038};
          EGLContext eGL_NO_CONTE = (uoa == null)? EGL14.EGL_NO_CONTEXT: uoa.a;
          a = a.a;
          _monitor_enter(a);
          uEGLContext = EGL14.eglCreateContext(f, obj, eGL_NO_CONTE, ointArray, 0);
          _monitor_exit(a);
          if (uEGLContext == EGL14.EGL_NO_CONTEXT) {
             throw new RuntimeException("Failed to create EGL context: 0x"+Integer.toHexString(EGL14.eglGetError()));
          }
       }else {
          throw new RuntimeException("Invalid sharedContext");
       }
       uoc.d = uEGLContext;
       return;
    }
    public static boolean j(){
       List obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveLogTag.LIVE_SCREEN_RECORD.appendTag("EglBase14");
       int h = c.h;
       StringBuilder str = "SDK version: "+h+". isEGL14Supported: ";
       boolean b = true;
       boolean b1 = (h >= 18)? true: false;
       b.P(obj, str+b1);
       if (h < 18) {
          b = false;
       }
       return b;
    }
    public void b(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "2")) {
          return;
       }
       int i = 1;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i), this, uoc, "3")) {
          this.i();
          if (this.g == EGL14.EGL_NO_SURFACE) {
             EGLSurface uEGLSurface = EGL14.eglCreatePbufferSurface(this.f, this.e, new int[5]{0x3057,1,0x3056,1,0x3038}, 0);
             this.g = uEGLSurface;
             if (uEGLSurface == EGL14.EGL_NO_SURFACE) {
                throw new RuntimeException("Failed to create pixel buffer surface with size "+i+"x"+i+": 0x"+Integer.toHexString(EGL14.eglGetError()));
             }
          }else {
             throw new RuntimeException("Already has an EGLSurface");
          }
       }
       return;
    }
    public void c(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       this.i();
       if (this.g != EGL14.EGL_NO_SURFACE) {
          throw new RuntimeException("Already has an EGLSurface");
       }
       int[] ointArray = new int[]{0x3057,p0,0x3056,p1,0x3038};
       int i = 0;
       EGLSurface uEGLSurface = EGL14.eglCreatePbufferSurface(this.f, this.e, ointArray, i);
       this.g = uEGLSurface;
       if (uEGLSurface != EGL14.EGL_NO_SURFACE) {
          return;
       }
       throw new RuntimeException("Failed to create pixel buffer surface with size "+p0+"x"+p1+": 0x"+Integer.toHexString(EGL14.eglGetError()));
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       Object a = a.a;
       _monitor_enter(a);
       if (!EGL14.eglMakeCurrent(this.f, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
          throw new RuntimeException("eglDetachCurrent failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
       }
       _monitor_exit(a);
       return;
    }
    public a$a e(){
       c$a uoa = PatchProxy.apply(null, this, c.class, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new c$a(this.d);
       }
       return uoa;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.i();
       if (this.g == EGL14.EGL_NO_SURFACE) {
          throw new RuntimeException("No EGLSurface - can\'t make current");
       }
       Object a = a.a;
       _monitor_enter(a);
       if (!EGL14.eglMakeCurrent(this.f, this.g, this.g, this.d)) {
          throw new RuntimeException("eglMakeCurrent failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
       }
       _monitor_exit(a);
       return;
    }
    public void g(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "7")) {
          return;
       }
       this.i();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          c tg = this.g;
          if (tg != EGL14.EGL_NO_SURFACE) {
             EGL14.eglDestroySurface(this.f, tg);
             this.g = EGL14.EGL_NO_SURFACE;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          Object a = a.a;
          _monitor_enter(a);
          if (EGL14.eglMakeCurrent(this.f, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
             _monitor_exit(a);
          }else {
             throw new RuntimeException("eglDetachCurrent failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
          }
       }
       EGL14.eglDestroyContext(this.f, this.d);
       EGL14.eglReleaseThread();
       EGL14.eglTerminate(this.f);
       this.d = EGL14.EGL_NO_CONTEXT;
       this.f = EGL14.EGL_NO_DISPLAY;
       this.e = objArray;
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tg = this.g;
       if (tg != EGL14.EGL_NO_SURFACE) {
          EGL14.eglDestroySurface(this.f, tg);
          this.g = EGL14.EGL_NO_SURFACE;
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       if (this.f != EGL14.EGL_NO_DISPLAY && (this.d != EGL14.EGL_NO_CONTEXT && this.e != null)) {
          return;
       }
       throw new RuntimeException("This object has been released");
    }
}
