package com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl;
import com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl$1;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuffer;
import java.lang.Thread;
import java.lang.Throwable;
import android.util.Log;
import android.opengl.EGLDisplay;
import com.kwai.video.aemonplayer.surface.EGL;
import android.opengl.EGLContext;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl$2;

public class KwaiGpuContextImpl extends KwaiGpuContext	// class@0019e1
{
    public EGLDisplay mDisplay;
    public EGLContext mEglContext;
    public EGLContext mEglContext10;
    public Handler mHandler;
    public final HandlerThread mHandlerThread;
    public boolean mReleased;
    public StringBuffer mThreadInfo;

    public void KwaiGpuContextImpl(int p0){
       Handler handler;
       super();
       int i = 1;
       if (p0 == i) {
          HandlerThread handlerThrea = new HandlerThread("kwaivpp_gl");
          this.mHandlerThread = handlerThrea;
          handlerThrea.start();
          handler = new Handler(handlerThrea.getLooper());
       }else {
          this.mHandlerThread = null;
          handler = new Handler(Looper.getMainLooper());
       }
       boolean b = false;
       if (!p0 && Looper.getMainLooper() == Looper.myLooper()) {
          this.createInternal(handler);
       }else {
          CountDownLatch uCountDownLa = new CountDownLatch(i);
          KwaiGpuContextImpl$1 u1 = new KwaiGpuContextImpl$1(this, handler, uCountDownLa);
          handler.postAtFrontOfQueue(u1);
          try{
             int i1 = 2000;
             b = uCountDownLa.await(i1, TimeUnit.MILLISECONDS);
          }catch(java.lang.InterruptedException e7){
             e7.printStackTrace();
          }
          if (!b) {
             handler.removeCallbacks(u1);
          }
       }
       if (!b) {
          this.createInternal(handler);
       }
       return;
    }
    public final void appendThreadInfo(){
       if (PatchProxy.applyVoid(null, this, KwaiGpuContextImpl.class, "6")) {
          return;
       }
       StringBuffer str = this.mThreadInfo+"released on tid="+Thread.currentThread().getId()+"\n";
       this.mThreadInfo+Log.getStackTraceString(new Throwable());
       return;
    }
    public synchronized void createInternal(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiGpuContextImpl.class, "1")) {
          return;
       }
       if (this.mEglContext == null) {
          this.mThreadInfo = "";
          this.mReleased = false;
          this.mHandler = p0;
          EGLDisplay defaultDispl = EGL.getDefaultDisplay();
          this.mDisplay = defaultDispl;
          this.mEglContext = EGL.createEGLContext(defaultDispl);
          EGL14.eglMakeCurrent(this.mDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, this.mEglContext);
          this.mEglContext10 = EGLContext.getEGL().eglGetCurrentContext();
          EGL14.eglMakeCurrent(this.mDisplay, EGL14.eglGetCurrentSurface(false), EGL14.eglGetCurrentSurface(1), EGL14.eglGetCurrentContext());
       }
       return;
    }
    public Object getContext(){
       return this.mEglContext;
    }
    public long getContextHandler(){
       Object obj = PatchProxy.apply(null, this, KwaiGpuContextImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mEglContext.getNativeHandle();
    }
    public EGLContext getEGLContext10(){
       return this.mEglContext10;
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, KwaiGpuContextImpl.class, "4")) {
          return;
       }
       if (this.mReleased == null) {
          this.runOnThread(new KwaiGpuContextImpl$2(this));
          this.mReleased = true;
          this.appendThreadInfo();
       }else {
          this.appendThreadInfo();
       }
       return;
    }
    public void releaseInternal(){
       if (PatchProxy.applyVoid(null, this, KwaiGpuContextImpl.class, "5")) {
          return;
       }
       EGL.destroyEGLContext(this.mDisplay, this.mEglContext);
       KwaiGpuContextImpl tmHandlerThr = this.mHandlerThread;
       if (tmHandlerThr != null) {
          tmHandlerThr.quitSafely();
       }
       return;
    }
    public final void runOnThread(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiGpuContextImpl.class, "2")) {
          return;
       }
       if (Looper.myLooper() == this.mHandler.getLooper()) {
          p0.run();
       }else {
          this.mHandler.post(p0);
       }
       return;
    }
}
