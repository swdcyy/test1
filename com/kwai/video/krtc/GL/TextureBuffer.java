package com.kwai.video.krtc.GL.TextureBuffer;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import android.os.Handler;
import com.kwai.video.krtc.GL.e;
import com.kwai.video.krtc.utils.d;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Object;
import com.kwai.video.krtc.utils.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.krtc.utils.RenderUtils;
import java.lang.Long;
import com.kwai.video.krtc.GL.TextureBuffer$2;
import com.kwai.video.krtc.GL.TextureBuffer$1;
import java.lang.Runnable;
import com.kwai.video.krtc.utils.e;
import java.lang.Boolean;
import android.graphics.Matrix;
import android.opengl.GLES30;

public class TextureBuffer	// class@000758
{
    public int colorSpace;
    public long fenceId;
    public d fenceIdDelegate;
    public int height;
    public final int id;
    public int orgHeight;
    public int orgWidth;
    public final d refCountDelegate;
    public int rotation;
    public ReentrantLock textureLock;
    public long timestamp;
    public final Handler toI420Handler;
    public float[] toI420Matrix;
    public float[] transformMatrix;
    public final TextureBuffer$Type type;
    public int width;
    public final e yuvConverter;

    public void TextureBuffer(int p0,int p1,int p2,int p3,int p4,long p5,TextureBuffer$Type p6,int p7,long p8,float[] p9,float[] p10,int p11,Handler p12,e p13,d p14,d p15,ReentrantLock p16){
       int i = this;
       super();
       i.fenceId = 1281;
       i.fenceIdDelegate = null;
       i.textureLock = new ReentrantLock();
       i.orgWidth = p0;
       i.orgHeight = p1;
       i.width = p2;
       i.height = p3;
       i.rotation = p4;
       i.timestamp = p5;
       i.type = p6;
       i.id = p7;
       i.fenceId = p8;
       i.transformMatrix = p9.clone();
       i.toI420Matrix = p10.clone();
       i.toI420Handler = p12;
       i.yuvConverter = p13;
       i.refCountDelegate = p14;
       i.fenceIdDelegate = p15;
       i.textureLock = p16;
       i.colorSpace = p11;
    }
    public void TextureBuffer(int p0,int p1,int p2,long p3,TextureBuffer$Type p4,int p5,long p6,float[] p7,Handler p8,e p9,d$a p10){
       super();
       this.fenceId = 1281;
       this.fenceIdDelegate = null;
       this.textureLock = new ReentrantLock();
       if (p2 == 90 || p2 == 270) {
          this.width = p1;
          this.height = p0;
       }else {
          this.width = p0;
          this.height = p1;
       }
       this.orgWidth = p0;
       this.orgHeight = p1;
       this.rotation = p2;
       this.timestamp = p3;
       this.type = p4;
       this.id = p5;
       this.setFenceId(p6);
       this.transformMatrix = p7.clone();
       this.toI420Matrix = p7.clone();
       this.toI420Handler = p8;
       this.yuvConverter = p9;
       this.refCountDelegate = new d(p10, (long)p5);
       this.colorSpace = 0;
       return;
    }
    public void TextureBuffer(int p0,int p1,int p2,long p3,TextureBuffer$Type p4,int p5,float[] p6,Handler p7,e p8,d$a p9){
       super(p0, p1, p2, p3, p4, p5, 1281, p6, p7, p8, p9);
    }
    public TextureBuffer clone(){
       Object obj = this;
       Object obj1 = PatchProxy.apply(null, obj, TextureBuffer.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       TextureBuffer textureBuffe = obj1;
       TextureBuffer textureBuffe1 = obj1;
       textureBuffe = new TextureBuffer(obj.orgWidth, obj.orgHeight, obj.width, obj.height, obj.rotation, obj.timestamp, obj.type, obj.id, obj.fenceId, obj.transformMatrix, obj.toI420Matrix, obj.colorSpace, obj.toI420Handler, obj.yuvConverter, obj.refCountDelegate, obj.fenceIdDelegate, obj.textureLock);
       return textureBuffe1;
    }
    public Object clone(){
       return this.clone();
    }
    public void convert(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureBuffer.class, "13")) {
          return;
       }
       this.yuvConverter.a(this, p0);
       return;
    }
    public void cropAndScale(int p0,int p1,int p2,int p3,int p4,int p5){
       TextureBuffer textureBuffe = TextureBuffer.class;
       if (PatchProxy.isSupport(textureBuffe)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, textureBuffe, "6")) {
             return;
          }
       }
       this.textureLock.lock();
       TextureBuffer textureBuffe1 = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int i3 = p3;
       this.toI420Matrix = textureBuffe1.updateMatrix(this.toI420Matrix, true, i, i1, i2, i3);
       this.transformMatrix = textureBuffe1.updateMatrix(this.transformMatrix, false, i, i1, i2, i3);
       this.width = p4;
       this.height = p5;
       this.textureLock.unlock();
       return;
    }
    public int getColorSpace(){
       return this.colorSpace;
    }
    public long getFenceId(){
       return this.fenceId;
    }
    public int getHeight(){
       return this.height;
    }
    public int getOrgHeight(){
       return this.orgHeight;
    }
    public int getOrgWidth(){
       return this.orgWidth;
    }
    public int getRotation(){
       return this.rotation;
    }
    public int getTextureId(){
       return this.id;
    }
    public int getTextureType(){
       Object obj = PatchProxy.apply(null, this, TextureBuffer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.type.getGlTarget();
    }
    public long getTimestamp(){
       return this.timestamp;
    }
    public float[] getToI420Matrix(){
       return this.toI420Matrix;
    }
    public float[] getTransformMatrix(){
       return this.transformMatrix;
    }
    public TextureBuffer$Type getType(){
       return this.type;
    }
    public int getWidth(){
       return this.width;
    }
    public void lockTexture(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "9")) {
          return;
       }
       this.textureLock.lock();
       return;
    }
    public void mirror(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "8")) {
          return;
       }
       this.textureLock.lock();
       this.transformMatrix = RenderUtils.mirrorTextureMatrix(this.transformMatrix);
       this.textureLock.unlock();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "5")) {
          return;
       }
       TextureBuffer tTextureBuff = this.fenceIdDelegate;
       if (tTextureBuff != null) {
          tTextureBuff.b();
       }
       this.refCountDelegate.b();
       return;
    }
    public void retain(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "4")) {
          return;
       }
       TextureBuffer tTextureBuff = this.fenceIdDelegate;
       if (tTextureBuff != null) {
          tTextureBuff.a();
       }
       this.refCountDelegate.a();
       return;
    }
    public void rotate(int p0){
       TextureBuffer textureBuffe = TextureBuffer.class;
       if (PatchProxy.isSupport(textureBuffe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textureBuffe, "7")) {
          return;
       }
       this.textureLock.lock();
       this.rotation = (this.rotation + p0) % 360;
       this.textureLock.unlock();
       return;
    }
    public void setColorSpace(int p0){
       this.colorSpace = p0;
    }
    public void setFenceId(long p0){
       TextureBuffer textureBuffe = TextureBuffer.class;
       if (PatchProxy.isSupport(textureBuffe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, textureBuffe, "11")) {
          return;
       }
       if (p0 - 1281 && p0 - 1280) {
          this.fenceIdDelegate = new d(new TextureBuffer$2(this), p0);
       }
       this.fenceId = p0;
       return;
    }
    public void toI420(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureBuffer.class, "3")) {
          return;
       }
       this.textureLock.lock();
       TextureBuffer ttoI420Handl = this.toI420Handler;
       if (ttoI420Handl != null && this.yuvConverter != null) {
          e.a(ttoI420Handl, new TextureBuffer$1(this, p0));
       }
       this.textureLock.unlock();
       return;
    }
    public void unlockTexture(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "10")) {
          return;
       }
       this.textureLock.unlock();
       return;
    }
    public final float[] updateMatrix(float[] p0,boolean p1,int p2,int p3,int p4,int p5){
       Matrix obj;
       TextureBuffer textureBuffe = TextureBuffer.class;
       int i = 1;
       if (PatchProxy.isSupport(textureBuffe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, textureBuffe, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Matrix(RenderUtils.convertMatrixToAndroidGraphicsMatrix(p0));
       if (p1) {
          TextureBuffer trotation = this.rotation;
          if (trotation != 90 && trotation != 270) {
             i = 0;
          }
          TextureBuffer twidth = this.width;
          float f = (float)p2 / (float)twidth;
          TextureBuffer theight = this.height;
          float f1 = (float)p3 / (float)theight;
          float f2 = (float)p4 / (float)twidth;
          float f3 = (float)p5 / (float)theight;
          float f4 = (i)? f1: f;
          if (!i) {
             f = f1;
          }
          obj.preTranslate(f4, f);
          f = (i)? f3: f2;
          if (!i) {
             f2 = f3;
          }
          obj.preScale(f, f2);
       }else if(p2 > 0){
          p2 = p2 - ((this.width - p4) / 2);
       }
       if (p3 > 0) {
          p3 = p3 - ((this.height - p5) / 2);
       }
       obj.preTranslate(((float)p2 / (float)this.width), ((float)p3 / (float)this.height));
       return RenderUtils.convertMatrixFromAndroidGraphicsMatrix(obj);
    }
    public void updateTimestamp(long p0){
       this.timestamp = p0;
    }
    public void waitSyncInGpu(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer.class, "12")) {
          return;
       }
       TextureBuffer tTextureBuff = this.fenceId;
       if (tTextureBuff - 1281 && tTextureBuff - 1280) {
          GLES30.glWaitSync(tTextureBuff, 0, -1);
       }
       return;
    }
}
