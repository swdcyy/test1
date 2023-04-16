package com.yxcorp.gifshow.media.util.MediaUtilityNativeWrapper;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;

public class MediaUtilityNativeWrapper	// class@001d1b
{

    public void MediaUtilityNativeWrapper(){
       super();
    }
    public static native int centerCropYUVData(byte[] p0,int p1,int p2,byte[] p3,int p4,int p5);
    public static native String compressBitmap(Bitmap p0,int p1,int p2,int p3,byte[] p4,boolean p5);
    public static native boolean isFmp4File(String p0);
    public static native int nativeGetAudioDuration(String p0);
    public static native int nativeGetDelay(String p0);
    public static native String nativeGetDescription(String p0);
    public static native int nativeGetNumberBytes(int p0,int p1,int p2);
    public static native int nativeGetVideoCodecId(String p0);
    public static native int nativeGetVideoDuration(String p0);
    public static native int nativeGetVideoDurationNoInfo(String p0);
    public static native int scaleYUV(byte[] p0,int p1,int p2,int p3,int p4,byte[] p5,int p6,int p7,int p8,boolean p9);
}
