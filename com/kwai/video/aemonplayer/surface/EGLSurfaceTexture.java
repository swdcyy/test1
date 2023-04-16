package com.kwai.video.aemonplayer.surface.EGLSurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.lang.Runnable;
import android.os.Handler;
import android.opengl.EGLContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.aemonplayer.surface.EGLSurfaceTexture$TextureImageListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.SurfaceTexture;
import com.kwai.video.aemonplayer.surface.Assertions;
import java.lang.Integer;
import android.opengl.EGLDisplay;
import com.kwai.video.aemonplayer.surface.EGL;
import android.opengl.EGLConfig;
import android.opengl.EGLSurface;
import java.lang.Boolean;
import android.opengl.EGL14;
import android.os.Looper;
import com.kwai.video.aemonplayer.surface.EGLCompatOESDrawer;
import java.lang.StringBuilder;
import com.kwai.video.aemonplayer.AemonNativeLogger;

public final class EGLSurfaceTexture implements SurfaceTexture$OnFrameAvailableListener, Runnable	// class@0019dc
{
    public EGLSurfaceTexture$TextureImageListener callback;
    public EGLCompatOESDrawer compatDrawer;
    public EGLDisplay display;
    public EGLContext eglContext;
    public final Handler handler;
    public final EGLContext sharedContext;
    public EGLSurface surface;
    public SurfaceTexture texture;
    public final int[] textureIdHolder;
    public float[] textureMat;

    public void EGLSurfaceTexture(Handler p0){
       super(p0, null);
    }
    public void EGLSurfaceTexture(Handler p0,EGLContext p1){
       super();
       this.handler = p0;
       this.sharedContext = p1;
       int[] ointArray = new int[1];
       this.textureIdHolder = ointArray;
       float[] uofloatArray = new float[16];
       this.textureMat = uofloatArray;
    }
    public final void dispatchOnFrameAvailable(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EGLSurfaceTexture.class, "14")) {
          return;
       }
       EGLSurfaceTexture tcallback = this.callback;
       if (tcallback != null) {
          tcallback.onFrameAvailable(p0);
       }
       return;
    }
    public long getSharedContextHandle(){
       EGLSurfaceTexture obj = PatchProxy.apply(null, this, EGLSurfaceTexture.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.sharedContext;
       if (obj != null) {
          return obj.getNativeHandle();
       }
       return 0;
    }
    public SurfaceTexture getSurfaceTexture(){
       Object obj = PatchProxy.apply(null, this, EGLSurfaceTexture.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Assertions.checkNotNull(this.texture);
    }
    public long getSurfaceTextureId(){
       return (long)this.textureIdHolder[0];
    }
    public long getTimestamp(){
       EGLSurfaceTexture obj = PatchProxy.apply(null, this, EGLSurfaceTexture.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.texture;
       long timestamp = (obj != null)? obj.getTimestamp(): 0;
       return timestamp;
    }
    public synchronized void init(int p0){
       if (PatchProxy.isSupport(EGLSurfaceTexture.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EGLSurfaceTexture.class, "1")) {
          return;
       }
       EGLDisplay defaultDispl = EGL.getDefaultDisplay();
       this.display = defaultDispl;
       EGLConfig uEGLConfig = EGL.chooseEGLConfig(defaultDispl);
       EGLContext uEGLContext = EGL.createEGLContext(this.display, uEGLConfig, this.sharedContext, p0);
       this.eglContext = uEGLContext;
       this.surface = EGL.createEGLSurface(this.display, uEGLConfig, uEGLContext, p0);
       EGL.generateTextureIds(this.textureIdHolder);
       this.texture = new SurfaceTexture(this.textureIdHolder[0]);
       this.makeCurrentNop();
       return;
    }
    public void listen(EGLSurfaceTexture$TextureImageListener p0){
       SurfaceTexture$OnFrameAvailableListener onFrameAvail;
       if (PatchProxy.applyVoidOneRefs(p0, this, EGLSurfaceTexture.class, "2")) {
          return;
       }
       this.callback = p0;
       EGLSurfaceTexture ttexture = this.texture;
       if (ttexture != null) {
          p0 = (p0 != null)? this: null;
          ttexture.setOnFrameAvailableListener(p0);
       }
       return;
    }
    public final boolean makeCurrentGL(){
       EGLSurfaceTexture obj = PatchProxy.apply(null, this, EGLSurfaceTexture.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.display;
       if (obj != null && !obj.equals(EGL14.EGL_NO_DISPLAY)) {
          obj = this.surface;
          if (obj != null && !obj.equals(EGL14.EGL_NO_SURFACE)) {
             obj = this.eglContext;
             if (obj != null && !obj.equals(EGL14.EGL_NO_CONTEXT)) {
                return EGL14.eglMakeCurrent(this.display, this.surface, this.surface, this.eglContext);
             }
          }
       }
       return false;
    }
    public final boolean makeCurrentNop(){
       EGLSurfaceTexture obj = PatchProxy.apply(null, this, EGLSurfaceTexture.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.display;
       if (obj != null && !obj.equals(EGL14.EGL_NO_DISPLAY)) {
          return EGL14.eglMakeCurrent(this.display, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
       }
       return false;
    }
    public void onEGLWillRelease(){
       if (PatchProxy.applyVoid(null, this, EGLSurfaceTexture.class, "4")) {
          return;
       }
       EGLSurfaceTexture ttexture = this.texture;
       if (ttexture != null) {
          ttexture.release();
          EGL.deleteTextureIds(this.textureIdHolder);
          this.texture = null;
       }
       return;
    }
    public void onFrameAvailable(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EGLSurfaceTexture.class, "12")) {
          return;
       }
       if (Looper.myLooper() == this.handler.getLooper()) {
          this.run();
       }else {
          this.handler.post(this);
       }
       return;
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, EGLSurfaceTexture.class, "3")) {
          return;
       }
       this.handler.removeCallbacks(this);
       this.makeCurrentGL();
       this.onEGLWillRelease();
       this.makeCurrentNop();
       EGLSurfaceTexture tsurface = this.surface;
       if (tsurface != null && !tsurface.equals(EGL14.EGL_NO_SURFACE)) {
          EGL14.eglDestroySurface(this.display, this.surface);
       }
       tsurface = this.eglContext;
       if (tsurface != null) {
          EGL14.eglDestroyContext(this.display, tsurface);
       }
       EGL14.eglReleaseThread();
       tsurface = this.display;
       if (tsurface != null && !tsurface.equals(EGL14.EGL_NO_DISPLAY)) {
          EGL14.eglTerminate(this.display);
       }
       this.display = null;
       this.eglContext = null;
       this.surface = null;
       this.texture = null;
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, EGLSurfaceTexture.class, "13")) {
          return;
       }
       try{
          EGLSurfaceTexture ttexture = this.texture;
          if (ttexture != null) {
             ttexture.updateTexImage();
             this.texture.getTransformMatrix(this.textureMat);
             this.dispatchOnFrameAvailable(this.textureMat);
          }
          return;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public synchronized int updateTexImage(int p0,float[] p1){
       if (PatchProxy.isSupport(EGLSurfaceTexture.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, EGLSurfaceTexture.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == 3) {
          this.getSurfaceTexture().updateTexImage();
          this.getSurfaceTexture().getTransformMatrix(p1);
          return 0;
       }else if(this.makeCurrentGL()){
          this.getSurfaceTexture().updateTexImage();
          this.getSurfaceTexture().getTransformMatrix(p1);
          if (p0 == 2) {
             if (this.compatDrawer == null) {
                this.compatDrawer = new EGLCompatOESDrawer(p0);
                AemonNativeLogger.e("EGLSurfaceTexture", "[EGL14ContextImpl] updateTexImage type = "+p0);
             }
             this.compatDrawer.draw();
          }
          this.makeCurrentNop();
          return 0;
       }else {
          return -1;
       }
    }
    public synchronized int updateTexMat(float[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EGLSurfaceTexture.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.getSurfaceTexture().getTransformMatrix(p0);
       return 0;
    }
}
