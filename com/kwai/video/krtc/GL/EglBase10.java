package com.kwai.video.krtc.GL.EglBase10;
import com.kwai.video.krtc.GL.EglBase;
import com.kwai.video.krtc.GL.EglBase10$Context;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kwai.video.krtc.utils.Log;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGLSurface;
import android.view.Surface;
import com.kwai.video.krtc.GL.EglBase10$a;
import com.kwai.video.krtc.GL.EglBase$Context;
import java.lang.Number;

public final class EglBase10 extends EglBase	// class@000743
{
    public final EGL10 a;
    public EGLContext b;
    public EGLConfig c;
    public EGLDisplay d;
    public EGLSurface e;

    public void EglBase10(EglBase10$Context p0,int[] p1){
       super();
       this.b = EGL10.EGL_NO_CONTEXT;
       this.c = null;
       this.d = EGL10.EGL_NO_DISPLAY;
       this.e = EGL10.EGL_NO_SURFACE;
       this.a = EGLContext.getEGL();
       EGLDisplay uEGLDisplay = this.b();
       this.d = uEGLDisplay;
       EGLConfig uEGLConfig = this.a(uEGLDisplay, p1);
       this.c = uEGLConfig;
       this.b = this.a(p0, this.d, uEGLConfig);
    }
    public final EGLConfig a(EGLDisplay p0,int[] p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, EglBase10.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EGLConfig[] uEGLConfigAr = new EGLConfig[1];
       obj = new int[1];
       if (!this.a.eglChooseConfig(p0, p1, uEGLConfigAr, 1, obj)) {
          Log.w("EglBase10", "eglChooseConfig failed: 0x"+Integer.toHexString(this.a.eglGetError()));
          return null;
       }else {
          int i = 0;
          if (obj[i] <= 0) {
             Log.w("EglBase10", "Unable to find any matching EGL config");
             return null;
          }else {
             object oobject = uEGLConfigAr[i];
             if (oobject != null) {
                return oobject;
             }
             Log.w("EglBase10", "eglChooseConfig returned null");
             return null;
          }
       }
    }
    public final EGLContext a(EglBase10$Context p0,EGLDisplay p1,EGLConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EglBase10.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.eglContext == EGL10.EGL_NO_CONTEXT) {
          Log.w("EglBase10", "Invalid sharedContext");
          return null;
       }else {
          int[] ointArray = new int[3]{0x3098,2,0x3038};
          EGLContext eGL_NO_CONTE = (p0 == null)? EGL10.EGL_NO_CONTEXT: p0.eglContext;
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          eGL_NO_CONTE = this.a.eglCreateContext(p1, p2, eGL_NO_CONTE, ointArray);
          _monitor_exit(lock);
          if (eGL_NO_CONTE == EGL10.EGL_NO_CONTEXT) {
             Log.w("EglBase10", "Failed to create EGL context: 0x"+Integer.toHexString(this.a.eglGetError()));
             return null;
          }else {
             Log.i("EglBase10", "createEglContext success");
             return eGL_NO_CONTE;
          }
       }
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, EglBase10.class, "10")) {
          return;
       }
       if (this.d != EGL10.EGL_NO_DISPLAY && (this.b == EGL10.EGL_NO_CONTEXT || this.c == null)) {
          Log.w("EglBase10", "This object has been released");
       }
       return;
    }
    public final void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EglBase10.class, "3")) {
          return;
       }
       if (!p0 instanceof SurfaceHolder && !p0 instanceof SurfaceTexture) {
          Log.w("EglBase10", "Input must be either a SurfaceHolder or SurfaceTexture");
          return;
       }else {
          this.a();
          if (this.e != EGL10.EGL_NO_SURFACE) {
             Log.w("EglBase10", "Already has an EGLSurface");
             return;
          }else {
             int[] ointArray = new int[]{0x3038};
             p0 = this.a.eglCreateWindowSurface(this.d, this.c, p0, ointArray);
             this.e = p0;
             if (p0 == EGL10.EGL_NO_SURFACE) {
                Log.w("EglBase10", "Failed to create window surface: 0x"+Integer.toHexString(this.a.eglGetError()));
             }
             return;
          }
       }
    }
    public final EGLDisplay b(){
       EGLDisplay obj = PatchProxy.apply(null, this, EglBase10.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
       if (obj == EGL10.EGL_NO_DISPLAY) {
          Log.w("EglBase10", "Unable to get EGL10 display: 0x"+Integer.toHexString(this.a.eglGetError()));
          return null;
       }else {
          int[] ointArray = new int[2];
          if (this.a.eglInitialize(obj, ointArray)) {
             return obj;
          }
          Log.w("EglBase10", "Unable to initialize EGL10: 0x"+Integer.toHexString(this.a.eglGetError()));
          return null;
       }
    }
    public void createDummyPbufferSurface(){
       if (PatchProxy.applyVoid(null, this, EglBase10.class, "4")) {
          return;
       }
       this.createPbufferSurface(1, 1);
       return;
    }
    public void createPbufferSurface(int p0,int p1){
       EglBase10 uEglBase10 = EglBase10.class;
       if (PatchProxy.isSupport(uEglBase10) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uEglBase10, "5")) {
          return;
       }
       this.a();
       if (this.e != EGL10.EGL_NO_SURFACE) {
          Log.w("EglBase10", "Already has an EGLSurface");
          return;
       }else {
          int[] ointArray = new int[]{0x3057,p0,0x3056,p1,0x3038};
          EGLSurface uEGLSurface = this.a.eglCreatePbufferSurface(this.d, this.c, ointArray);
          this.e = uEGLSurface;
          if (uEGLSurface == EGL10.EGL_NO_SURFACE) {
             Log.w("EglBase10", "Failed to create pixel buffer surface with size "+p0+"x"+p1+": 0x"+Integer.toHexString(this.a.eglGetError()));
          }
          return;
       }
    }
    public void createSurface(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EglBase10.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void createSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EglBase10.class, "1")) {
          return;
       }
       this.a(new EglBase10$a(this, p0));
       return;
    }
    public void detachCurrent(){
       if (PatchProxy.applyVoid(null, this, EglBase10.class, "13")) {
          return;
       }
       Object lock = EglBase.lock;
       _monitor_enter(lock);
       if (!this.a.eglMakeCurrent(this.d, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
          Log.w("EglBase10", "eglDetachCurrent failed: 0x"+Integer.toHexString(this.a.eglGetError()));
       }
       _monitor_exit(lock);
       return;
    }
    public EglBase$Context getEglBaseContext(){
       Object obj = PatchProxy.apply(null, this, EglBase10.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EglBase10$Context(this.b);
    }
    public boolean hasSurface(){
       boolean b = (this.e != EGL10.EGL_NO_SURFACE)? true: false;
       return b;
    }
    public void makeCurrent(){
       if (PatchProxy.applyVoid(null, this, EglBase10.class, "12")) {
          return;
       }
       this.a();
       if (this.e == EGL10.EGL_NO_SURFACE) {
          Log.w("EglBase10", "No EGLSurface - can\'t make current");
          return;
       }else {
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          if (!this.a.eglMakeCurrent(this.d, this.e, this.e, this.b)) {
             Log.w("EglBase10", "eglMakeCurrent failed: 0x"+Integer.toHexString(this.a.eglGetError()));
          }
          _monitor_exit(lock);
          return;
       }
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EglBase10.class, "11")) {
          return;
       }
       this.a();
       this.detachCurrent();
       this.releaseSurface();
       EglBase10 td = this.d;
       if (td != EGL10.EGL_NO_DISPLAY) {
          EglBase10 tb = this.b;
          if (tb != EGL10.EGL_NO_CONTEXT) {
             this.a.eglDestroyContext(td, tb);
          }
       }
       td = this.d;
       if (td != EGL10.EGL_NO_DISPLAY) {
          this.a.eglTerminate(td);
       }
       this.b = EGL10.EGL_NO_CONTEXT;
       this.d = EGL10.EGL_NO_DISPLAY;
       this.c = objArray;
       Log.i("EglBase10", "release done");
       return;
    }
    public void releaseSurface(){
       if (PatchProxy.applyVoid(null, this, EglBase10.class, "9")) {
          return;
       }
       EglBase10 te = this.e;
       if (te != EGL10.EGL_NO_SURFACE) {
          this.a.eglDestroySurface(this.d, te);
          this.e = EGL10.EGL_NO_SURFACE;
       }
       return;
    }
    public int surfaceHeight(){
       int[] obj = PatchProxy.apply(null, this, EglBase10.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[1];
       this.a.eglQuerySurface(this.d, this.e, 0x3056, obj);
       return obj[0];
    }
    public int surfaceWidth(){
       int[] obj = PatchProxy.apply(null, this, EglBase10.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[1];
       this.a.eglQuerySurface(this.d, this.e, 0x3057, obj);
       return obj[0];
    }
    public void swapBuffers(){
       if (PatchProxy.applyVoid(null, this, EglBase10.class, "14")) {
          return;
       }
       this.a();
       if (this.e == EGL10.EGL_NO_SURFACE) {
          Log.w("EglBase10", "No EGLSurface - can\'t swap buffers");
          return;
       }else {
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          this.a.eglSwapBuffers(this.d, this.e);
          _monitor_exit(lock);
          return;
       }
    }
}
