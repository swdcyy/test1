package com.kwai.video.player.surface.DummyThread;
import android.os.Handler$Callback;
import android.os.HandlerThread;
import java.lang.String;
import com.kwai.video.player.surface.EGLSurfaceTexture;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.opengl.EGLContext;
import java.lang.Integer;
import android.os.Handler;
import android.os.Looper;
import java.lang.Thread;
import com.kwai.video.player.surface.Assertions;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.surface.EGLSurfaceTexture$TextureImageListener;
import java.lang.Number;
import java.lang.Exception;

public abstract class DummyThread extends HandlerThread implements Handler$Callback	// class@000b9c
{
    public EGLSurfaceTexture eglSurfaceTexture;
    public Handler handler;
    public Error initError;
    public RuntimeException initException;
    public boolean released;
    public Object ret;

    public void DummyThread(){
       super("DummyThread");
    }
    public EGLSurfaceTexture getEglSurfaceTexture(){
       return this.eglSurfaceTexture;
    }
    public boolean handleMessage(Message p0){
       Message obj = PatchProxy.applyOneRefs(p0, this, DummyThread.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != true) {
          if (obj != 2) {
             return true;
          }
          this.releaseInternal();
          this.quit();
          return true;
       }else {
          try{
             this.initInternal(p0.arg1);
             _monitor_enter(this);
             this.notify();
             _monitor_exit(this);
          }catch(java.lang.RuntimeException e3){
             this.initException = e3;
             _monitor_enter(this);
             this.notify();
             _monitor_exit(this);
          }catch(java.lang.Error e3){
             this.initError = e3;
             _monitor_enter(this);
             this.notify();
             _monitor_exit(this);
          }
          return true;
       }
    }
    public Object init(int p0,EGLContext p1){
       Handler obj;
       if (PatchProxy.isSupport(DummyThread.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, DummyThread.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.start();
       obj = new Handler(this.getLooper(), this);
       this.handler = obj;
       this.eglSurfaceTexture = new EGLSurfaceTexture(obj, p1);
       _monitor_enter(this);
       this.handler.obtainMessage(1, p0, 0).sendToTarget();
       while (this.ret == null && (this.initException == null && this.initError == null)) {
          try{
             this.wait();
          }catch(java.lang.InterruptedException e0){
             int i = 1;
             goto label_003a ;
          }
       }
       _monitor_exit(this);
       if (0) {
          Thread.currentThread().interrupt();
       }
       DummyThread tinitExcepti = this.initException;
       if (tinitExcepti == null) {
          tinitExcepti = this.initError;
          if (tinitExcepti == null) {
             return Assertions.checkNotNull(this.ret);
          }else {
             throw tinitExcepti;
          }
       }else {
          throw tinitExcepti;
       }
    }
    public final void initInternal(int p0){
       if (PatchProxy.isSupport(DummyThread.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DummyThread.class, "6")) {
          return;
       }
       Assertions.checkNotNull(this.eglSurfaceTexture);
       this.eglSurfaceTexture.init(p0);
       this.eglSurfaceTexture.getSurfaceTextureId();
       SurfaceTexture surfaceTextu = this.eglSurfaceTexture.getSurfaceTexture();
       boolean b = (p0)? true: false;
       this.ret = this.newInstance(this, surfaceTextu, b);
       return;
    }
    public void listen(EGLSurfaceTexture$TextureImageListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DummyThread.class, "2")) {
          return;
       }
       this.eglSurfaceTexture.listen(p0);
       return;
    }
    public abstract Object newInstance(DummyThread p0,SurfaceTexture p1,boolean p2);
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, DummyThread.class, "4")) {
          return;
       }
       this.released = true;
       Assertions.checkNotNull(this.handler);
       this.handler.sendEmptyMessage(2);
       return;
    }
    public final void releaseInternal(){
       if (PatchProxy.applyVoid(null, this, DummyThread.class, "7")) {
          return;
       }
       Assertions.checkNotNull(this.eglSurfaceTexture);
       this.eglSurfaceTexture.release();
       return;
    }
    public synchronized int updateTexImgBlock(int p0,float[] p1){
       if (PatchProxy.isSupport(DummyThread.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, DummyThread.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.released == null) {
          try{
             return this.getEglSurfaceTexture().updateTexImage(p0, p1);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
             return -2;
          }
       }else {
          return -1;
       }
    }
}
