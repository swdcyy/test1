package com.yxcorp.gifshow.media.buffer.NativeBufferNativeWrapper;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;

public class NativeBufferNativeWrapper	// class@001cf1
{

    public void NativeBufferNativeWrapper(){
       super();
    }
    public static native boolean addBitmap(long p0,Bitmap p1,int p2,boolean p3);
    public static native boolean addBuffer(long p0,byte[] p1,int p2,int p3,int p4,int p5,int p6,boolean p7,int p8);
    public static native long create(int p0,int p1,int p2,int p3,String p4);
    public static native void flush(long p0);
    public static native boolean getBitmap(long p0,int p1,Bitmap p2);
    public static native boolean getBuffer(long p0,int p1,byte[] p2,int p3,int p4,int p5,int p6);
    public static native int getCount(long p0);
    public static native int getHeight(long p0);
    public static native int getItemSize(long p0);
    public static native int getPixelFormat(long p0);
    public static native int getWidth(long p0);
    public static native long open(String p0);
    public static native void release(long p0);
    public static native void save(long p0,String p1);
    public static native boolean trim(long p0,int p1);
}
