package com.yxcorp.gifshow.media.MediaDecoderNativeWrapper;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;

public class MediaDecoderNativeWrapper	// class@001ced
{

    public void MediaDecoderNativeWrapper(){
       super();
    }
    public static native void close(long p0);
    public static native int getDelay(long p0);
    public static native long getDuration(long p0);
    public static native int getHeight(long p0);
    public static native int getPixelFormat(long p0);
    public static native long getPosition(long p0);
    public static native int getRotation(long p0);
    public static native long getVideoDuration(long p0);
    public static native int getWidth(long p0);
    public static native boolean nextBitmap(long p0,Bitmap p1);
    public static native boolean nextFrame(long p0,byte[] p1,int p2,int p3,int p4,int p5);
    public static native long open(String p0,int p1,int p2);
    public static native void seekByTime(long p0,long p1);
    public static native boolean toBuffer(long p0,long p1,Object p2);
}
