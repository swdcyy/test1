package com.kwai.video.krtc.render.VideoFrame;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class VideoFrame	// class@0007de
{
    public int color_space;
    public int height;
    public boolean isTexture;
    public int[] line_size;
    public boolean mirror;
    public int rotation;
    public float[] texMatrix;
    public int textureId;
    public int textureType;
    public int width;
    public int yuv_format;
    public byte[][] yuv_planes;
    public static final String TAG = "com.kwai.video.krtc.render.VideoFrame";

    public void VideoFrame(int p0){
       super();
       if (p0 > 0) {
          byte[][] uobyteArray = new byte[][p0];
          this.yuv_planes = uobyteArray;
          int[] ointArray = new int[p0];
          this.line_size = ointArray;
       }else {
          this.yuv_planes = null;
          this.line_size = null;
       }
       return;
    }
    public static void copyYuv(ByteBuffer p0,int[] p1,byte[][] p2,int[] p3,int p4,int p5){
       byte[] uobyteArray;
       int i3;
       VideoFrame videoFrame = VideoFrame.class;
       if (PatchProxy.isSupport(videoFrame)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, videoFrame, "5")) {
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
             if (i2 > p3[i]) {
                uobyteArray = new byte[(i2 - p3[i])];
                i3 = p3[i];
             }else {
                i3 = i2;
                uobyteArray = null;
             }
             int i4 = 0;
             while (i4 < i1) {
                int i5 = p3[i] * i4;
                p0.get(p2[i], i5, i3);
                if (uobyteArray != null) {
                   p0.get(uobyteArray, 0, uobyteArray.length);
                }
                i4 = i4 + 1;
             }
          }
          i = i + 1;
       }
       return;
    }
    public static void copyYuv(byte[][] p0,int[] p1,byte[][] p2,int[] p3,int p4,int p5){
       VideoFrame videoFrame = VideoFrame.class;
       if (PatchProxy.isSupport(videoFrame)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, videoFrame, "6")) {
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
    public static VideoFrame create(byte[][] p0,int[] p1,int p2,int p3,int p4,boolean p5,int p6,int p7,int p8){
       VideoFrame videoFrame = VideoFrame.class;
       int i = 0;
       if (PatchProxy.isSupport(videoFrame)) {
          Object[] objArray = new Object[9];
          objArray[i] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          Object obj = PatchProxy.apply(objArray, null, videoFrame, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       videoFrame = new VideoFrame(p8);
       videoFrame.isTexture = i;
       for (; i < p8; i = i + 1) {
          videoFrame.yuv_planes[i] = p0[i];
          videoFrame.line_size[i] = p1[i];
       }
       videoFrame.width = p2;
       videoFrame.height = p3;
       videoFrame.rotation = p4;
       videoFrame.mirror = p5;
       videoFrame.yuv_format = p6;
       videoFrame.color_space = p7;
       return videoFrame;
    }
    public static VideoFrame fromByteBuffer(ByteBuffer p0,int p1,int p2,int p3,boolean p4,int p5,int p6,boolean p7){
       byte[][] obj1;
       int[] ointArray;
       int[] ointArray1;
       int[] ointArray2;
       int i = p5;
       VideoFrame videoFrame = VideoFrame.class;
       byte[] obj = null;
       int i1 = 4;
       int i2 = 0;
       int i3 = 3;
       int i4 = 2;
       int i5 = 1;
       if (PatchProxy.isSupport(videoFrame)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Boolean.valueOf(p7)};
          obj1 = PatchProxy.apply(objArray, obj, videoFrame, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (i) {
          if (i != i5 && i != i4) {
             if (i != i3) {
                Log.e(VideoFrame.TAG, "unsupport format: "+i);
                return obj;
             }else {
                ointArray = new int[i5];
                ointArray[i2] = p1 * 4;
                ointArray1 = ointArray;
             }
          }else {
             ointArray2 = new int[i4];
             ointArray2[i2] = p1;
             ointArray2[i5] = p1;
             ointArray1 = ointArray2;
             i5 = 2;
          }
       }else {
          ointArray2 = new int[i3];
          ointArray2[i2] = p1;
          int i7 = p1 >> 1;
          ointArray2[i5] = i7;
          ointArray2[i4] = i7;
          ointArray1 = ointArray2;
          i5 = 3;
       }
       obj1 = new byte[][i5];
       ointArray = new int[i5];
       for (; i2 < i5; i2 = i2 + 1) {
          int i6 = (!i2)? p2: p2 / 2;
          i3 = ointArray1[i2];
          if (p7) {
             i3 = i3 + 3;
             i3 = i3 / i1;
             i3 = i3 * 4;
          }
          i6 = i6 * i3;
          obj = new byte[i6];
          obj1[i2] = obj;
          ointArray[i2] = i3;
       }
       VideoFrame.copyYuv(p0, ointArray1, obj1, ointArray, p2, i5);
       return VideoFrame.create(obj1, ointArray, p1, p2, p3, p4, p5, p6, i5);
    }
    public static VideoFrame fromTexture(int p0,int p1,float[] p2,int p3,int p4,int p5){
       VideoFrame videoFrame = VideoFrame.class;
       if (PatchProxy.isSupport(videoFrame)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, videoFrame, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       videoFrame = new VideoFrame(0);
       videoFrame.isTexture = true;
       videoFrame.textureId = p0;
       videoFrame.textureType = p1;
       videoFrame.texMatrix = p2.clone();
       videoFrame.width = p3;
       videoFrame.height = p4;
       videoFrame.rotation = p5;
       return videoFrame;
    }
    public static VideoFrame fromYuv(byte[][] p0,int[] p1,int p2,int p3,int p4,boolean p5,int p6,int p7,boolean p8){
       byte[] obj1;
       object oobject = p0;
       VideoFrame videoFrame = VideoFrame.class;
       int[] obj = null;
       int i = 0;
       int i1 = 4;
       if (PatchProxy.isSupport(videoFrame)) {
          Object[] objArray = new Object[9];
          objArray[i] = oobject;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[i1] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          obj1 = PatchProxy.apply(objArray, obj, videoFrame, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (oobject != null && p1 != null) {
          int len = oobject.length;
          byte[][] uobyteArray = new byte[][len];
          int[] ointArray = new int[len];
          for (; i < len; i = i + 1) {
             int i2 = (!i)? p3: p3 / 2;
             int i3 = p1[i];
             if (p8) {
                i3 = i3 + 3;
                i3 = i3 / i1;
                i3 = i3 * 4;
             }
             i2 = i2 * i3;
             obj1 = new byte[i2];
             uobyteArray[i] = obj1;
             ointArray[i] = i3;
          }
          byte[][] uobyteArray1 = uobyteArray;
          obj = ointArray;
          VideoFrame.copyYuv(p0, p1, uobyteArray1, obj, p3, len);
          return VideoFrame.create(uobyteArray1, obj, p2, p3, p4, p5, p6, p7, len);
       }else {
          return obj;
       }
    }
    public VideoFrame clone(){
       Object obj = PatchProxy.apply(null, this, VideoFrame.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isTexture != null) {
          return VideoFrame.fromTexture(this.textureId, this.textureType, this.texMatrix.clone(), this.width, this.height, this.rotation);
       }
       return VideoFrame.fromYuv(this.yuv_planes, this.line_size, this.width, this.height, this.rotation, this.mirror, this.yuv_format, this.color_space, false);
    }
    public Object clone(){
       return this.clone();
    }
}
