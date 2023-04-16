package com.yxcorp.gifshow.media.buffer.JpegBufferNativeWrapper;
import java.lang.Object;
import java.lang.String;

public class JpegBufferNativeWrapper	// class@001cf0
{

    public void JpegBufferNativeWrapper(){
       super();
    }
    public static native long create(int p0,int p1,String p2,String p3);
    public static native void flush(long p0);
    public static native int getCount(long p0);
    public static native int getHeight(long p0);
    public static native String getJpegDirectory(long p0);
    public static native int getWidth(long p0);
    public static native long open(String p0);
    public static native void release(long p0);
    public static native boolean setCount(long p0,int p1);
}
