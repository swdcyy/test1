package com.samsung.android.sdk.camera.impl.internal.NativeUtil;
import java.lang.Object;
import android.media.Image;
import java.nio.ByteBuffer;
import vk8.h;
import android.media.Image$Plane;
import java.lang.AssertionError;
import android.view.Surface;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;
import com.samsung.android.sdk.camera.impl.internal.NativeUtil$BufferQueueAbandonedException;
import android.graphics.SurfaceTexture;

public class NativeUtil	// class@000b80
{
    public static final String a = "SEC_SDK/NativeUtil";

    public void NativeUtil(){
       super();
    }
    public static void a(Image p0,ByteBuffer p1){
       h.b(p0);
       h.b(p1);
       if (p0.getFormat() != 35) {
          throw new AssertionError("Image format should be 420_888.");
       }
       int i = 3;
       if ((((p0.getWidth() * p0.getHeight()) * 3) / 2) > p1.capacity()) {
          throw new AssertionError("target buffer is too small.");
       }
       ByteBuffer[] uByteBufferA = new ByteBuffer[i];
       int[] ointArray = new int[i];
       int[] ointArray1 = new int[i];
       for (int i1 = 0; i1 < p0.getPlanes().length; i1 = i1 + 1) {
          uByteBufferA[i1] = p0.getPlanes()[i1].getBuffer();
          ointArray[i1] = p0.getPlanes()[i1].getRowStride();
          ointArray1[i1] = p0.getPlanes()[i1].getPixelStride();
       }
       NativeUtil.nativeConvertFlexibleToNV21(uByteBufferA, p1, p0.getWidth(), p0.getHeight(), ointArray, ointArray1);
       return;
    }
    public static void b(Surface p0,int p1){
       if (p0 == null) {
          return;
       }
       NativeUtil.f(NativeUtil.nativeDisconnectSurface(p0, p1));
       return;
    }
    public static int c(){
       return NativeUtil.nativeGetNativeUtilVersion();
    }
    public static void d(ByteBuffer p0){
       h.b(p0);
       NativeUtil.nativeReleaseNativeHeap(p0);
    }
    public static void e(Surface p0,int p1,boolean p2){
       h.b(p0);
       NativeUtil.f(NativeUtil.nativeSetSurfaceFormat(p0, p1, p2));
    }
    public static int f(int p0){
       if (p0 == -19) {
          throw new NativeUtil$BufferQueueAbandonedException();
       }
       if (!p0) {
          return 0;
       }
       if (p0 >= 0) {
          return p0;
       }
       throw new UnsupportedOperationException("Unknown error "+p0);
    }
    public static native int nativeConfigureSurface(Surface p0,int p1,int p2,int p3,boolean p4);
    public static native int nativeConnectSurface(Surface p0);
    public static native int nativeConvertFlexibleToNV21(ByteBuffer[] p0,ByteBuffer p1,int p2,int p3,int[] p4,int[] p5);
    public static native Surface nativeCreatePrivateSurface(Surface p0);
    public static native int nativeDetectSurfaceDimens(Surface p0,int[] p1);
    public static native int nativeDetectSurfaceType(Surface p0);
    public static native int nativeDetectTextureDimens(SurfaceTexture p0,int[] p1);
    public static native int nativeDisconnectSurface(Surface p0);
    public static native int nativeDisconnectSurface(Surface p0,int p1);
    public static native int nativeGetJpegFooterSize();
    public static native int nativeGetNativeUtilVersion();
    public static native long nativeGetSurfaceId(Surface p0);
    public static native int nativeProduceFrame(Surface p0,ByteBuffer p1,int p2,int p3,int p4);
    public static native void nativeReleaseNativeHeap(ByteBuffer p0);
    public static native int nativeSetNextTimestamp(Surface p0,long p1);
    public static native int nativeSetScalingMode(Surface p0,int p1);
    public static native int nativeSetSurfaceDimens(Surface p0,int p1,int p2);
    public static native int nativeSetSurfaceFormat(Surface p0,int p1,boolean p2);
    public static native int nativeSetSurfaceOrientation(Surface p0,int p1,int p2);
    public static native int nativeSetTransformImage(Surface p0,Image p1,boolean p2);
    public static native int nativeSetTransformSurfaceTexture(Surface p0,SurfaceTexture p1,boolean p2);
}
