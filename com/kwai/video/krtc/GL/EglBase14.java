package com.kwai.video.krtc.GL.EglBase14;
import com.kwai.video.krtc.GL.EglBase;
import android.os.Build$VERSION;
import com.kwai.video.krtc.GL.EglBase14$Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kwai.video.krtc.utils.Log;
import java.lang.Boolean;
import java.lang.Long;
import android.opengl.EGLSurface;
import android.opengl.EGLExt;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import com.kwai.video.krtc.GL.EglBase$Context;
import java.lang.Number;

public final class EglBase14 extends EglBase	// class@000745
{
    public EGLContext b;
    public EGLConfig c;
    public EGLDisplay d;
    public EGLSurface e;
    public static final int a;

    static {
       EglBase14.a = Build$VERSION.SDK_INT;
    }
    public void EglBase14(EglBase14$Context p0,int[] p1){
       super();
       this.b = EGL14.EGL_NO_CONTEXT;
       this.c = null;
       this.d = EGL14.EGL_NO_DISPLAY;
       this.e = EGL14.EGL_NO_SURFACE;
       EGLDisplay uEGLDisplay = EglBase14.d();
       this.d = uEGLDisplay;
       EGLConfig uEGLConfig = EglBase14.a(uEGLDisplay, p1);
       this.c = uEGLConfig;
       this.b = EglBase14.a(p0, this.d, uEGLConfig);
    }
    public static EGLConfig a(EGLDisplay p0,int[] p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, null, EglBase14.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EGLConfig[] uEGLConfigAr = new EGLConfig[1];
       obj = new int[1];
       if (!EGL14.eglChooseConfig(p0, p1, 0, uEGLConfigAr, 0, 1, obj, 0)) {
          Log.w("EglBase14", "eglChooseConfig failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
          return null;
       }else {
          int i = 0;
          if (obj[i] <= 0) {
             Log.w("EglBase14", "Unable to find any matching EGL config");
             return null;
          }else {
             object oobject = uEGLConfigAr[i];
             if (oobject != null) {
                return oobject;
             }
             Log.w("EglBase14", "eglChooseConfig returned null");
             return null;
          }
       }
    }
    public static EGLContext a(EglBase14$Context p0,EGLDisplay p1,EGLConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, EglBase14.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.egl14Context == EGL14.EGL_NO_CONTEXT) {
          Log.w("EglBase14", "Invalid sharedContext");
          return null;
       }else {
          int[] ointArray = new int[3]{0x3098,2,0x3038};
          EGLContext eGL_NO_CONTE = (p0 == null)? EGL14.EGL_NO_CONTEXT: p0.egl14Context;
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          eGL_NO_CONTE = EGL14.eglCreateContext(p1, p2, eGL_NO_CONTE, ointArray, 0);
          _monitor_exit(lock);
          if (eGL_NO_CONTE == EGL14.EGL_NO_CONTEXT) {
             Log.w("EglBase14", "Failed to create EGL context: 0x"+Integer.toHexString(EGL14.eglGetError()));
             return null;
          }else {
             Log.i("EglBase14", "createEglContext success");
             return eGL_NO_CONTE;
          }
       }
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, EglBase14.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int a = EglBase14.a;
       boolean b = (a >= 18)? true: false;
       Log.d("EglBase14", "SDK version: "+a+". isEGL14Supported: "+b);
       return b;
    }
    public static EGLDisplay d(){
       Object obj = PatchProxy.apply(null, null, EglBase14.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       EGLDisplay uEGLDisplay = EGL14.eglGetDisplay(i);
       if (uEGLDisplay == EGL14.EGL_NO_DISPLAY) {
          Log.w("EglBase14", "Unable to get EGL14 display: 0x"+Integer.toHexString(EGL14.eglGetError()));
          return null;
       }else {
          int[] ointArray = new int[2];
          if (EGL14.eglInitialize(uEGLDisplay, ointArray, i, ointArray, 1)) {
             return uEGLDisplay;
          }
          Log.w("EglBase14", "Unable to initialize EGL14: 0x"+Integer.toHexString(EGL14.eglGetError()));
          return null;
       }
    }
    public void a(long p0){
       EglBase14 uEglBase14 = EglBase14.class;
       if (PatchProxy.isSupport(uEglBase14) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uEglBase14, "16")) {
          return;
       }
       this.c();
       if (this.e == EGL14.EGL_NO_SURFACE) {
          Log.w("EglBase14", "No EGLSurface - can\'t swap buffers");
          return;
       }else {
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          EGLExt.eglPresentationTimeANDROID(this.d, this.e, p0);
          EGL14.eglSwapBuffers(this.d, this.e);
          _monitor_exit(lock);
          return;
       }
    }
    public final void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EglBase14.class, "4")) {
          return;
       }
       if (!p0 instanceof Surface && !p0 instanceof SurfaceTexture) {
          Log.w("EglBase14", "Input must be either a Surface or SurfaceTexture");
          return;
       }else {
          this.c();
          if (this.e != EGL14.EGL_NO_SURFACE) {
             Log.w("EglBase14", "Already has an EGLSurface");
             return;
          }else {
             int[] ointArray = new int[]{0x3038};
             p0 = EGL14.eglCreateWindowSurface(this.d, this.c, p0, ointArray, 0);
             this.e = p0;
             if (p0 == EGL14.EGL_NO_SURFACE) {
                Log.w("EglBase14", "Failed to create window surface: 0x"+Integer.toHexString(EGL14.eglGetError()));
             }
             return;
          }
       }
    }
    public EglBase14$Context b(){
       Object obj = PatchProxy.apply(null, this, EglBase14.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EglBase14$Context(this.b);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, EglBase14.class, "11")) {
          return;
       }
       if (this.d != EGL14.EGL_NO_DISPLAY && (this.b == EGL14.EGL_NO_CONTEXT || this.c == null)) {
          Log.w("EglBase14", "This object has been released");
       }
       return;
    }
    public void createDummyPbufferSurface(){
       if (PatchProxy.applyVoid(null, this, EglBase14.class, "5")) {
          return;
       }
       this.createPbufferSurface(1, 1);
       return;
    }
    public void createPbufferSurface(int p0,int p1){
       EglBase14 uEglBase14 = EglBase14.class;
       if (PatchProxy.isSupport(uEglBase14) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uEglBase14, "6")) {
          return;
       }
       this.c();
       if (this.e != EGL14.EGL_NO_SURFACE) {
          Log.w("EglBase14", "Already has an EGLSurface");
          return;
       }else {
          int[] ointArray = new int[]{0x3057,p0,0x3056,p1,0x3038};
          EGLSurface uEGLSurface = EGL14.eglCreatePbufferSurface(this.d, this.c, ointArray, 0);
          this.e = uEGLSurface;
          if (uEGLSurface == EGL14.EGL_NO_SURFACE) {
             Log.w("EglBase14", "Failed to create pixel buffer surface with size "+p0+"x"+p1+": 0x"+Integer.toHexString(EGL14.eglGetError()));
          }
          return;
       }
    }
    public void createSurface(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EglBase14.class, "3")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void createSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EglBase14.class, "2")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void detachCurrent(){
       if (PatchProxy.applyVoid(null, this, EglBase14.class, "14")) {
          return;
       }
       Object lock = EglBase.lock;
       _monitor_enter(lock);
       if (!EGL14.eglMakeCurrent(this.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
          Log.w("EglBase14", "eglDetachCurrent failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
       }
       _monitor_exit(lock);
       return;
    }
    public EglBase$Context getEglBaseContext(){
       return this.b();
    }
    public boolean hasSurface(){
       boolean b = (this.e != EGL14.EGL_NO_SURFACE)? true: false;
       return b;
    }
    public void makeCurrent(){
       if (PatchProxy.applyVoid(null, this, EglBase14.class, "13")) {
          return;
       }
       this.c();
       if (this.e == EGL14.EGL_NO_SURFACE) {
          Log.w("EglBase14", "No EGLSurface - can\'t make current");
          return;
       }else {
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          if (!EGL14.eglMakeCurrent(this.d, this.e, this.e, this.b)) {
             Log.w("EglBase14", "eglMakeCurrent failed: 0x"+Integer.toHexString(EGL14.eglGetError()));
          }
          _monitor_exit(lock);
          return;
       }
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EglBase14.class, "12")) {
          return;
       }
       this.c();
       this.detachCurrent();
       this.releaseSurface();
       EglBase14 td = this.d;
       if (td != EGL14.EGL_NO_DISPLAY) {
          EglBase14 tb = this.b;
          if (tb != EGL14.EGL_NO_CONTEXT) {
             EGL14.eglDestroyContext(td, tb);
          }
       }
       EGL14.eglReleaseThread();
       td = this.d;
       if (td != EGL14.EGL_NO_DISPLAY) {
          EGL14.eglTerminate(td);
       }
       this.b = EGL14.EGL_NO_CONTEXT;
       this.d = EGL14.EGL_NO_DISPLAY;
       this.c = objArray;
       Log.i("EglBase14", "release done");
       return;
    }
    public void releaseSurface(){
       if (PatchProxy.applyVoid(null, this, EglBase14.class, "10")) {
          return;
       }
       EglBase14 te = this.e;
       if (te != EGL14.EGL_NO_SURFACE) {
          EGL14.eglDestroySurface(this.d, te);
          this.e = EGL14.EGL_NO_SURFACE;
       }
       return;
    }
    public int surfaceHeight(){
       int[] obj = PatchProxy.apply(null, this, EglBase14.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[1];
       EGL14.eglQuerySurface(this.d, this.e, 0x3056, obj, 0);
       return obj[0];
    }
    public int surfaceWidth(){
       int[] obj = PatchProxy.apply(null, this, EglBase14.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new int[1];
       EGL14.eglQuerySurface(this.d, this.e, 0x3057, obj, 0);
       return obj[0];
    }
    public void swapBuffers(){
       if (PatchProxy.applyVoid(null, this, EglBase14.class, "15")) {
          return;
       }
       this.c();
       if (this.e == EGL14.EGL_NO_SURFACE) {
          Log.w("EglBase14", "No EGLSurface - can\'t swap buffers");
          return;
       }else {
          Object lock = EglBase.lock;
          _monitor_enter(lock);
          EGL14.eglSwapBuffers(this.d, this.e);
          _monitor_exit(lock);
          return;
       }
    }
}
