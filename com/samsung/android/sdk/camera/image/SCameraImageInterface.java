package com.samsung.android.sdk.camera.image.SCameraImageInterface;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;

public class SCameraImageInterface	// class@000b7a
{
    public long a;

    public void SCameraImageInterface(){
       super();
    }
    public static native long nativeConvertImageFormat(long p0,int p1);
    public static native long nativeCreateSIImage(int p0,int p1,int p2);
    public static native long nativeCreateSIImagefromBitmap(Bitmap p0,int p1);
    public static native long nativeCreateSIImagefromFile(String p0,int p1);
    public static native long nativeCreateSIImagefromJpegBuffer(int p0,byte[] p1);
    public static native long nativeCreateSIImagefromYuvBuffer(int p0,int p1,int p2,byte[] p3);
    public static native long nativeCreateSMMarixf(int p0,int p1);
    public static native int nativeDeleteSIImage(long p0);
    public static native int nativeDeleteSMMatrixf(long p0);
    public static native long nativeEnhanceContrast(long p0,int p1,float p2);
    public static native long nativeEqualizeHistogram(long p0);
    public static native long nativeFilterSpatial(long p0,long p1);
    public static native int[] nativeGetArgb(long p0);
    public static native int nativeGetBpp(long p0);
    public static native int nativeGetFormat(long p0);
    public static native int nativeGetHeight(long p0);
    public static native byte[] nativeGetJpeg(long p0);
    public static native int nativeGetPixel(long p0,int p1,int p2);
    public static native float[] nativeGetSMMatrixf(long p0);
    public static native float nativeGetSMMatrixfAt(long p0,int p1,int p2);
    public static native int nativeGetWidth(long p0);
    public static native long nativeProcessMedian(long p0,int p1);
    public static native long nativeProcessSobel(long p0,int p1);
    public static native byte[] nativeReadData(long p0);
    public static native void nativeResize(long p0,long p1);
    public static native int nativeSaveAsJpeg(long p0,String p1,int p2);
    public static native int nativeSaveAsRaw(long p0,String p1);
    public static native int nativeSetDataDivisionFlag(int p0);
    public static native int nativeSetPixel(long p0,int p1,int p2,int p3);
    public static native int nativeSetSMMatrixf(long p0,float[] p1);
    public static native int nativeSetSMMatrixfAt(long p0,int p1,int p2,float p3);
    public static native long nativeWarpAffine(long p0,long p1);
    public static native long nativeWarpAffineImage(long p0,float p1,int p2,int p3,float p4,int p5,int p6);
    public static native int nativeWriteData(long p0,byte[] p1);
}
