package com.kwai.stentor.Audio.AudioJni;
import java.lang.String;
import ekd.v0;
import java.lang.Object;
import com.kwai.stentor.Audio.AudioCallback;

public class AudioJni	// class@001904
{

    static {
       "Stentor_Audio".b("Stentor_Audio");
    }
    public void AudioJni(){
       super();
    }
    public static native long createHandler();
    public static native void destroyHandler(long p0);
    public static native int isStopListen(long p0);
    public static native void pauseListen(long p0);
    public static native void setCallback(long p0,AudioCallback p1);
    public static native void setPackDurationIn100Ms(long p0,int p1);
    public static native void startListen(long p0);
    public static native void stopListen(long p0);
    public static native void writeAudio(long p0,byte[] p1,int p2,int p3,int p4,int p5,int p6);
}
