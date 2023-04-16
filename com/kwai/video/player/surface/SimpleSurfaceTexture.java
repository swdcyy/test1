package com.kwai.video.player.surface.SimpleSurfaceTexture;
import com.kwai.video.player.surface.DummySurfaceTexture;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.SurfaceTexture;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.opengl.GLES20;
import android.view.Surface;
import java.lang.StringBuilder;
import ei7.k;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.lang.Integer;
import java.nio.Buffer;

public class SimpleSurfaceTexture extends DummySurfaceTexture	// class@000ba5
{
    public Surface mSurface;
    public int mTexName;
    public SurfaceTexture mTexSurfaceTexture;
    public final float[] mat16;
    public final FloatBuffer mat4x4;

    public void SimpleSurfaceTexture(){
       super();
       float[] uofloatArray = new float[16];
       this.mat16 = uofloatArray;
       this.mat4x4 = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
       this.createTexture();
       this.rebindSurface();
    }
    public final void createTexture(){
       if (PatchProxy.applyVoid(null, this, SimpleSurfaceTexture.class, "6")) {
          return;
       }
       this.mTexName = this.createTextureObject();
       this.mTexSurfaceTexture = new SurfaceTexture(this.mTexName);
       return;
    }
    public final int createTextureObject(){
       Object obj = PatchProxy.apply(null, this, SimpleSurfaceTexture.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int[] ointArray = new int[1];
       GLES20.glGenTextures(1, ointArray, 0);
       GLES20.glBindTexture(0x8d65, ointArray[0]);
       GLES20.glTexParameterf(0x8d65, 0x2801, 9728.00f);
       GLES20.glTexParameterf(0x8d65, 0x2800, 9729.00f);
       GLES20.glTexParameterf(0x8d65, 0x2802, 0x47012f00);
       GLES20.glTexParameterf(0x8d65, 0x2803, 0x47012f00);
       GLES20.glBindTexture(0x8d65, 0);
       return ointArray[0];
    }
    public FloatBuffer getMatrix(){
       return this.mat4x4;
    }
    public Surface getSurface(){
       return this.mSurface;
    }
    public long getSurfaceTextureId(){
       return (long)this.mTexName;
    }
    public final SurfaceTexture getTexture(){
       Object obj = PatchProxy.apply(null, this, SimpleSurfaceTexture.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mTexSurfaceTexture == null) {
          this.createTexture();
       }
       return this.mTexSurfaceTexture;
    }
    public void rebindSurface(){
       if (PatchProxy.applyVoid(null, this, SimpleSurfaceTexture.class, "3")) {
          return;
       }
       SimpleSurfaceTexture tmSurface = this.mSurface;
       if (tmSurface != null && tmSurface.isValid()) {
          StringBuilder str = "Surface.release\(\) in"+this.mSurface;
          this.mSurface.release();
          this.mSurface = null;
       }
       if (this.mSurface == null) {
          this.mSurface = k.a(this.getTexture());
       }
       tmSurface = this.mSurface;
       if (tmSurface != null && !tmSurface.isValid()) {
          k.b(this.mSurface);
          tmSurface = this.mTexSurfaceTexture;
          if (tmSurface != null) {
             tmSurface.setOnFrameAvailableListener(null);
             this.mTexSurfaceTexture.release();
             this.mTexSurfaceTexture = null;
          }
          this.mSurface = k.a(this.getTexture());
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, SimpleSurfaceTexture.class, "2")) {
          return;
       }
       SimpleSurfaceTexture tmSurface = this.mSurface;
       if (tmSurface != null && tmSurface.isValid()) {
          StringBuilder str = "Surface.release\(\) in"+this.mSurface;
          this.mSurface.release();
          this.mSurface = null;
       }
       return;
    }
    public void setDefaultBufferSize(int p0,int p1){
       SimpleSurfaceTexture simpleSurfac = SimpleSurfaceTexture.class;
       if (PatchProxy.isSupport(simpleSurfac) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, simpleSurfac, "4")) {
          return;
       }
       this.mTexSurfaceTexture.setDefaultBufferSize(p0, p1);
       return;
    }
    public void setOnFrameAvailableListener(SurfaceTexture$OnFrameAvailableListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleSurfaceTexture.class, "5")) {
          return;
       }
       this.mTexSurfaceTexture.setOnFrameAvailableListener(p0);
       return;
    }
    public int updateTexImage(int p0){
       SimpleSurfaceTexture simpleSurfac = SimpleSurfaceTexture.class;
       if (PatchProxy.isSupport(simpleSurfac)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, simpleSurfac, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.mTexSurfaceTexture.updateTexImage();
       this.mTexSurfaceTexture.getTransformMatrix(this.mat16);
       _monitor_enter(this);
       this.mat4x4.position(0);
       this.mat4x4.put(this.mat16);
       this.mat4x4.flip();
       _monitor_exit(this);
       return 0;
    }
}
