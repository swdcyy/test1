package com.kwai.video.player.surface.DummySurfaceTextureImpl;
import com.kwai.video.player.surface.DummySurfaceTexture;
import com.kwai.video.player.surface.DummyThread;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.player.surface.EGLSurfaceTexture$TextureImageListener;
import com.kwai.video.player.surface.DummySurfaceTextureImpl$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.opengl.EGLContext;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.surface.EGLSurfaceTexture;
import java.lang.StringBuilder;
import ei7.k;
import java.lang.Integer;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.nio.Buffer;

public final class DummySurfaceTextureImpl extends DummySurfaceTexture	// class@000b9b
{
    public final CountDownLatch firstFrameReadyLatch;
    public final float[] mat16;
    public final FloatBuffer mat4x4;
    public final boolean secure;
    public Surface surface;
    public final SurfaceTexture surfaceTexture;
    public final DummyThread thread;
    public boolean threadReleased;
    public static int secureMode;
    public static boolean secureModeInitialized;

    public void DummySurfaceTextureImpl(DummyThread p0,SurfaceTexture p1,boolean p2){
       super();
       this.thread = p0;
       this.secure = p2;
       this.surface = new Surface(p1);
       this.surfaceTexture = p1;
       float[] uofloatArray = new float[16];
       this.mat16 = uofloatArray;
       this.mat4x4 = ByteBuffer.allocateDirect(64).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
       this.firstFrameReadyLatch = new CountDownLatch(1);
       p0.listen(null);
    }
    public void DummySurfaceTextureImpl(DummyThread p0,SurfaceTexture p1,boolean p2,DummySurfaceTextureImpl$1 p3){
       super(p0, p1, p2);
    }
    public static void assertApiLevel17OrHigher(){
       PatchProxy.applyVoid(null, null, DummySurfaceTextureImpl.class, "8");
    }
    public static int getSecureMode(Context p0){
       return 0;
    }
    public static DummySurfaceTextureImpl newInstanceV17(boolean p0,EGLContext p1){
       DummySurfaceTextureImpl$1 obj;
       DummySurfaceTextureImpl uDummySurfac = DummySurfaceTextureImpl.class;
       if (PatchProxy.isSupport(uDummySurfac)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uDummySurfac, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DummySurfaceTextureImpl.assertApiLevel17OrHigher();
       obj = new DummySurfaceTextureImpl$1();
       int secureMode = (p0)? DummySurfaceTextureImpl.secureMode: 0;
       return obj.init(secureMode, p1);
    }
    public FloatBuffer getMatrix(){
       return this.mat4x4;
    }
    public Surface getSurface(){
       return this.surface;
    }
    public long getSurfaceTextureId(){
       Object obj = PatchProxy.apply(null, this, DummySurfaceTextureImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.thread.getEglSurfaceTexture().getSurfaceTextureId();
    }
    public void rebindSurface(){
       if (PatchProxy.applyVoid(null, this, DummySurfaceTextureImpl.class, "3")) {
          return;
       }
       DummySurfaceTextureImpl tsurface = this.surface;
       if (tsurface != null && tsurface.isValid()) {
          StringBuilder str = "Surface.release\(\) in"+this.surface;
          this.surface.release();
          this.surface = null;
       }
       if (this.surface == null) {
          this.surface = k.a(this.surfaceTexture);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, DummySurfaceTextureImpl.class, "2")) {
          return;
       }
       DummySurfaceTextureImpl tthread = this.thread;
       _monitor_enter(tthread);
       if (this.threadReleased == null) {
          this.thread.release();
          this.threadReleased = true;
       }
       _monitor_exit(tthread);
       return;
    }
    public void setDefaultBufferSize(int p0,int p1){
       DummySurfaceTextureImpl uDummySurfac = DummySurfaceTextureImpl.class;
       if (PatchProxy.isSupport(uDummySurfac) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uDummySurfac, "4")) {
          return;
       }
       uDummySurfac = this.surfaceTexture;
       if (uDummySurfac != null) {
          uDummySurfac.setDefaultBufferSize(p0, p1);
       }
       return;
    }
    public void setOnFrameAvailableListener(SurfaceTexture$OnFrameAvailableListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DummySurfaceTextureImpl.class, "5")) {
          return;
       }
       DummySurfaceTextureImpl tsurfaceText = this.surfaceTexture;
       if (tsurfaceText != null) {
          tsurfaceText.setOnFrameAvailableListener(p0);
       }
       return;
    }
    public int updateTexImage(int p0){
       DummySurfaceTextureImpl uDummySurfac = DummySurfaceTextureImpl.class;
       if (PatchProxy.isSupport(uDummySurfac)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDummySurfac, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = this.thread.updateTexImgBlock(p0, this.mat16);
       if (!p0) {
          _monitor_enter(this);
          this.mat4x4.position(0);
          this.mat4x4.put(this.mat16);
          this.mat4x4.flip();
          _monitor_exit(this);
       }
       return p0;
    }
}
