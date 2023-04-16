package com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.Object;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.nio.ByteBuffer;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.nio.Buffer;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;

public class RtcEngineVideoFrame	// class@000845
{
    public ByteBuffer alpha;
    public int colorSpace;
    public ByteBuffer data;
    public int format;
    public int height;
    public boolean isFrontCamera;
    public boolean isTexture;
    public boolean mirror;
    public byte[][] planes;
    public String rois;
    public int rotation;
    public int[] strides;
    public TextureBuffer textureBuffer;
    public int textureId;
    public int textureType;
    public long timestamp;
    public float[] transformMatrix;
    public int width;
    public static final String TAG = "com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame";

    public void RtcEngineVideoFrame(int p0,int p1,long p2,int p3,int p4,int p5,float[] p6){
       super();
       this.colorSpace = 0;
       this.format = 0;
       this.textureType = 0;
       this.width = 0;
       this.height = 0;
       this.rotation = 0;
       this.timestamp = 0;
       this.mirror = false;
       this.isFrontCamera = false;
       this.data = null;
       this.alpha = null;
       this.textureId = 0;
       this.transformMatrix = null;
       this.isTexture = false;
       this.planes = null;
       this.strides = null;
       this.textureBuffer = null;
       this.rois = "";
       this.isTexture = true;
       this.width = p0;
       this.height = p1;
       this.timestamp = p2;
       this.rotation = p3;
       this.textureType = p4;
       this.textureId = p5;
       this.transformMatrix = p6.clone();
    }
    public void RtcEngineVideoFrame(int p0,int p1,long p2,int p3,TextureBuffer p4,boolean p5){
       super();
       this.colorSpace = 0;
       this.format = 0;
       this.textureType = 0;
       this.width = 0;
       this.height = 0;
       this.rotation = 0;
       this.timestamp = 0;
       this.mirror = false;
       this.isFrontCamera = false;
       this.data = null;
       this.alpha = null;
       this.textureId = 0;
       this.transformMatrix = null;
       this.isTexture = false;
       this.planes = null;
       this.strides = null;
       this.textureBuffer = null;
       this.rois = "";
       this.isTexture = true;
       this.width = p0;
       this.height = p1;
       this.timestamp = p2;
       this.rotation = p3;
       this.isFrontCamera = p5;
       p4.retain();
       this.textureBuffer = p4;
       this.textureType = p4.getTextureType();
       this.textureId = p4.getTextureId();
       this.transformMatrix = p4.getTransformMatrix().clone();
    }
    public void RtcEngineVideoFrame(int p0,ByteBuffer p1,int p2,int p3,long p4,int p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6, false, false, false);
    }
    public void RtcEngineVideoFrame(int p0,ByteBuffer p1,int p2,int p3,long p4,int p5,int p6,boolean p7,boolean p8,boolean p9){
       int[] ointArray;
       int[] ointArray1;
       int i4;
       int i5;
       RtcEngineVideoFrame rtcEngineVid = this;
       int i = p0;
       int i1 = p2;
       int i2 = p3;
       super();
       rtcEngineVid.colorSpace = 0;
       rtcEngineVid.format = 0;
       rtcEngineVid.textureType = 0;
       rtcEngineVid.width = 0;
       rtcEngineVid.height = 0;
       rtcEngineVid.rotation = 0;
       rtcEngineVid.timestamp = 0;
       rtcEngineVid.mirror = false;
       rtcEngineVid.isFrontCamera = false;
       rtcEngineVid.data = null;
       rtcEngineVid.alpha = null;
       rtcEngineVid.textureId = 0;
       rtcEngineVid.transformMatrix = null;
       rtcEngineVid.isTexture = false;
       rtcEngineVid.planes = null;
       rtcEngineVid.strides = null;
       rtcEngineVid.textureBuffer = null;
       rtcEngineVid.rois = "";
       StringBuilder str = 3;
       String str1 = 2;
       int i3 = 1;
       if (i) {
          if (i != i3 && i != str1) {
             if (i != str) {
                Log.e(RtcEngineVideoFrame.TAG, "unsupport format: "+p0);
                return;
             }else {
                ointArray = new int[i3];
                ointArray[0] = i1 * 4;
                ointArray1 = ointArray;
                i4 = 1;
             }
          }else {
             ointArray = new int[str1];
             ointArray[0] = i1;
             ointArray[i3] = i1;
             ointArray1 = ointArray;
             i4 = 2;
          }
       }else {
          ointArray = new int[str];
          ointArray[0] = i1;
          i5 = i1 >> 1;
          ointArray[i3] = i5;
          ointArray[str1] = i5;
          ointArray1 = ointArray;
          i4 = 3;
       }
       int[] ointArray2 = new int[i4];
       rtcEngineVid.strides = ointArray2;
       for (i3 = 0; i3 < i4; i3 = i3 + 1) {
          RtcEngineVideoFrame strides = rtcEngineVid.strides;
          if (p8) {
             i5 = ointArray1[i3] + str;
             i5 = i5 / 4;
             i5 = i5 * 4;
          }else {
             i5 = ointArray1[i3];
          }
          strides[i3] = i5;
       }
       if (p8) {
          byte[][] uobyteArray = new byte[][i4];
          rtcEngineVid.planes = uobyteArray;
          for (int i6 = 0; i6 < i4; i6 = i6 + 1) {
             i3 = (!i6)? i2: i2 / 2;
             i5 = rtcEngineVid.strides[i6] * i3;
             byte[] uobyteArray1 = new byte[i5];
             rtcEngineVid.planes[i6] = uobyteArray1;
          }
          RtcEngineVideoFrame.copyYuv(p1, ointArray1, rtcEngineVid.planes, rtcEngineVid.strides, p3, i4);
       }
       rtcEngineVid.isTexture = false;
       rtcEngineVid.format = i;
       rtcEngineVid.data = p1;
       rtcEngineVid.width = i1;
       rtcEngineVid.height = i2;
       rtcEngineVid.timestamp = p4;
       rtcEngineVid.rotation = p5;
       rtcEngineVid.colorSpace = p6;
       rtcEngineVid.mirror = p7;
       rtcEngineVid.isFrontCamera = p9;
       return;
    }
    public void RtcEngineVideoFrame(int p0,byte[][] p1,int[] p2,int p3,int p4,long p5,int p6,int p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, false, false);
    }
    public void RtcEngineVideoFrame(int p0,byte[][] p1,int[] p2,int p3,int p4,long p5,int p6,int p7,boolean p8,boolean p9){
       int i2;
       RtcEngineVideoFrame rtcEngineVid = this;
       int i = p1;
       int i1 = p4;
       super();
       rtcEngineVid.colorSpace = 0;
       rtcEngineVid.format = 0;
       rtcEngineVid.textureType = 0;
       rtcEngineVid.width = 0;
       rtcEngineVid.height = 0;
       rtcEngineVid.rotation = 0;
       rtcEngineVid.timestamp = 0;
       rtcEngineVid.mirror = false;
       rtcEngineVid.isFrontCamera = false;
       rtcEngineVid.data = null;
       rtcEngineVid.alpha = null;
       rtcEngineVid.textureId = 0;
       rtcEngineVid.transformMatrix = null;
       rtcEngineVid.isTexture = false;
       rtcEngineVid.planes = null;
       rtcEngineVid.strides = null;
       rtcEngineVid.textureBuffer = null;
       rtcEngineVid.rois = "";
       if (i && p2 != null) {
          int len = i.length;
          byte[][] uobyteArray = new byte[][len];
          rtcEngineVid.planes = uobyteArray;
          int[] ointArray = new int[len];
          rtcEngineVid.strides = ointArray;
          if (p9) {
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                int i3 = (!i2)? i1: i1 / 2;
                int i4 = p2[i2] + 3;
                i4 = i4 / 4;
                i4 = i4 * 4;
                i3 = i3 * i4;
                byte[] uobyteArray1 = new byte[i3];
                rtcEngineVid.planes[i2] = uobyteArray1;
                rtcEngineVid.strides[i2] = i4;
             }
             RtcEngineVideoFrame.copyYuv(p1, p2, rtcEngineVid.planes, rtcEngineVid.strides, p4, len);
          }else {
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                rtcEngineVid.planes[i2] = i[i2];
                rtcEngineVid.strides[i2] = p2[i2];
             }
          }
          rtcEngineVid.isTexture = false;
          rtcEngineVid.format = p0;
          rtcEngineVid.width = p3;
          rtcEngineVid.height = i1;
          rtcEngineVid.timestamp = p5;
          rtcEngineVid.rotation = p6;
          rtcEngineVid.colorSpace = p7;
          rtcEngineVid.mirror = p8;
       }
       return;
    }
    public void RtcEngineVideoFrame(ByteBuffer p0){
       super();
       this.colorSpace = 0;
       this.format = 0;
       this.textureType = 0;
       this.width = 0;
       this.height = 0;
       this.rotation = 0;
       this.timestamp = 0;
       this.mirror = false;
       this.isFrontCamera = false;
       this.data = null;
       this.alpha = null;
       this.textureId = 0;
       this.transformMatrix = null;
       this.isTexture = false;
       this.planes = null;
       this.strides = null;
       this.textureBuffer = null;
       this.rois = "";
       this.data = p0;
    }
    public static void copyYuv(ByteBuffer p0,int[] p1,byte[][] p2,int[] p3,int p4,int p5){
       int i4;
       RtcEngineVideoFrame rtcEngineVid = RtcEngineVideoFrame.class;
       if (PatchProxy.isSupport(rtcEngineVid)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, rtcEngineVid, "4")) {
             return;
          }
       }
       int i = 0;
       while (i < p5) {
          int i1 = (!i)? p4: p4 / 2;
          if (p1[i] == p3[i]) {
             i1 = i1 * p1[i];
             p0.get(p2[i], 0, i1);
          }else {
             int i2 = p1[i];
             int i3 = p0.position();
             if (i2 > p3[i]) {
                i2 = p3[i];
                i4 = 1;
             }else {
                i4 = 0;
             }
             int i5 = 0;
             while (i5 < i1) {
                int i6 = p3[i] * i5;
                p0.get(p2[i], i6, i2);
                if (i4) {
                   i3 = i3 + p1[i];
                   p0.position(i3);
                }
                i5 = i5 + 1;
             }
          }
          i = i + 1;
       }
       p0.position(0);
       return;
    }
    public static void copyYuv(byte[][] p0,int[] p1,byte[][] p2,int[] p3,int p4,int p5){
       RtcEngineVideoFrame rtcEngineVid = RtcEngineVideoFrame.class;
       if (PatchProxy.isSupport(rtcEngineVid)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, rtcEngineVid, "5")) {
             return;
          }
       }
       int i = 0;
       while (i < p5) {
          int i1 = (!i)? p4: p4 / 2;
          if (p1[i] == p3[i]) {
             i1 = i1 * p1[i];
             System.arraycopy(p0[i], 0, p2[i], 0, i1);
          }else {
             int i2 = p1[i];
             if (i2 > p3[i]) {
                i2 = p3[i];
             }
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                int i4 = p1[i] * i3;
                int i5 = p3[i] * i3;
                System.arraycopy(p0[i], i4, p2[i], i5, i2);
             }
          }
          i = i + 1;
       }
       return;
    }
    public static RtcEngineVideoFrame createVideoEncodedFrame(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RtcEngineVideoFrame.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RtcEngineVideoFrame(p0);
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, RtcEngineVideoFrame.class, "2")) {
          return;
       }
       this.release();
       super.finalize();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RtcEngineVideoFrame.class, "1")) {
          return;
       }
       if (this.isTexture != null) {
          RtcEngineVideoFrame ttextureBuff = this.textureBuffer;
          if (ttextureBuff != null) {
             ttextureBuff.release();
             this.textureBuffer = null;
          }
       }
       return;
    }
}
