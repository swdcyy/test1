package com.yxcorp.gifshow.media.builder.MP4BuilderNativeWrapper;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;

public class MP4BuilderNativeWrapper	// class@001cf8
{

    public void MP4BuilderNativeWrapper(){
       super();
    }
    public static native boolean addAudio(long p0,byte[] p1,int p2,int p3,int p4,int p5);
    public static native boolean addAudioMix(long p0,Object p1,String p2,String p3,float p4,float p5,int p6);
    public static native boolean addBitmap(long p0,Bitmap p1,int p2,boolean p3);
    public static native boolean addFile(long p0,Object p1,String p2,boolean p3,boolean p4,boolean p5,long p6,long p7,float p8);
    public static native boolean addVideo(long p0,byte[] p1,int p2,int p3,int p4,int p5,int p6,boolean p7,int p8);
    public static native boolean compose(long p0,Object p1,String p2,String p3);
    public static native boolean composeBuffer(long p0,Object p1,int p2,String p3);
    public static native long create(String p0,String p1,int p2,int p3,int p4,boolean p5,boolean p6);
    public static native void finish(long p0,boolean p1);
    public static native int getPixelFormat(long p0);
}
