package com.kwai.video.aemonplayer.surface.OesSurfaceImpl;
import com.kwai.video.aemonplayer.surface.OesSurface;
import com.kwai.video.aemonplayer.surface.DummyThread;
import android.graphics.SurfaceTexture;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import com.kwai.video.aemonplayer.surface.EGLSurfaceTexture$TextureImageListener;
import dv7.a;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import com.kwai.video.aemonplayer.surface.OesSurfaceImpl$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.opengl.EGLContext;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.Surface;
import java.lang.Number;
import com.kwai.video.aemonplayer.surface.EGLSurfaceTexture;
import java.lang.Integer;
import java.nio.Buffer;
import java.lang.System;
import java.lang.InterruptedException;
import java.lang.StringBuilder;
import com.kwai.video.aemonplayer.AemonNativeLogger;

public final class OesSurfaceImpl extends OesSurface	// class@0019e6
{
    public boolean hasFirstFrame;
    public final Object hasFirstFrameSignal;
    public final float[] mat16;
    public final FloatBuffer mat4x4;
    public final SurfaceTexture surfaceTexture;
    public final DummyThread thread;
    public boolean threadReleased;

    public void OesSurfaceImpl(DummyThread p0,SurfaceTexture p1,boolean p2){
       super(p1);
       this.hasFirstFrameSignal = new Object();
       this.thread = p0;
       this.surfaceTexture = p1;
       float[] uofloatArray = new float[16];
       this.mat16 = uofloatArray;
       this.mat4x4 = ByteBuffer.allocateDirect(64).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
       p0.listen(null);
       p1.setOnFrameAvailableListener(new a(this));
    }
    public void OesSurfaceImpl(DummyThread p0,SurfaceTexture p1,boolean p2,OesSurfaceImpl$1 p3){
       super(p0, p1, p2);
    }
    public static void a(OesSurfaceImpl p0,SurfaceTexture p1){
       p0.lambda$new$0(p1);
    }
    public static void assertApiLevel17OrHigher(){
       PatchProxy.applyVoid(null, null, OesSurfaceImpl.class, "8");
    }
    public static int getSecureMode(Context p0){
       return 0;
    }
    private void lambda$new$0(SurfaceTexture p0){
       OesSurfaceImpl thasFirstFra = this.hasFirstFrameSignal;
       _monitor_enter(thasFirstFra);
       if (this.hasFirstFrame == null) {
          this.hasFirstFrame = true;
          this.hasFirstFrameSignal.notify();
       }
       _monitor_exit(thasFirstFra);
       return;
    }
    public static OesSurfaceImpl newInstanceV17(boolean p0,EGLContext p1){
       if (PatchProxy.isSupport(OesSurfaceImpl.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, OesSurfaceImpl.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       OesSurfaceImpl.assertApiLevel17OrHigher();
       return new OesSurfaceImpl$1().init(0, p1);
    }
    public void Destroy(){
       if (PatchProxy.applyVoid(null, this, OesSurfaceImpl.class, "7")) {
          return;
       }
       OesSurfaceImpl tthread = this.thread;
       _monitor_enter(tthread);
       if (this.threadReleased == null) {
          this.thread.release();
          this.threadReleased = true;
       }
       _monitor_exit(tthread);
       this.release();
       return;
    }
    public FloatBuffer GetMatrix(){
       return this.mat4x4;
    }
    public long GetSharedContextHandle(){
       Object obj = PatchProxy.apply(null, this, OesSurfaceImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.thread.getEglSurfaceTexture().getSharedContextHandle();
    }
    public long GetSurfaceTextureId(){
       Object obj = PatchProxy.apply(null, this, OesSurfaceImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.thread.getEglSurfaceTexture().getSurfaceTextureId();
    }
    public long GetTimestamp(){
       Object obj = PatchProxy.apply(null, this, OesSurfaceImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.thread.getEglSurfaceTexture().getTimestamp();
    }
    public int UpdateTexImage(int p0){
       if (PatchProxy.isSupport(OesSurfaceImpl.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, OesSurfaceImpl.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = this.thread.updateTexImgBlock(p0, this.mat16);
       if ((this.hasFirstFrame ^ 0x01) && this.hasFirstFrame == null) {
          this.waitUntilFirstFrame();
       }
       if (!p0) {
          _monitor_enter(this);
          this.mat4x4.position(0);
          this.mat4x4.put(this.mat16);
          this.mat4x4.flip();
          _monitor_exit(this);
       }
       return p0;
    }
    public final void waitUntilFirstFrame(){
       if (PatchProxy.applyVoid(null, this, OesSurfaceImpl.class, "6")) {
          return;
       }
       OesSurfaceImpl thasFirstFra = this.hasFirstFrameSignal;
       _monitor_enter(thasFirstFra);
       if (this.hasFirstFrame == null) {
          long l = System.currentTimeMillis();
          try{
             this.hasFirstFrameSignal.wait(500);
          }catch(java.lang.InterruptedException e3){
             e3.printStackTrace();
          }
          AemonNativeLogger.i("[render]", "waitUntilFirstFrame cost\("+(System.currentTimeMillis() - l)+"ms\) result:"+this.hasFirstFrame);
          if (this.hasFirstFrame != null) {
             this.thread.updateTexMat(this.mat16);
          }
       }
       _monitor_exit(thasFirstFra);
       return;
    }
}
