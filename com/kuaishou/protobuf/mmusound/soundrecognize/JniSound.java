package com.kuaishou.protobuf.mmusound.soundrecognize.JniSound;
import java.lang.Object;
import java.lang.String;
import ekd.v0;
import com.kuaishou.protobuf.mmusound.soundrecognize.MmuSoundCallback;

public class JniSound	// class@000df7
{

    public void JniSound(){
       super();
    }
    public static native void cleanModel(long p0);
    public static native long createHandler();
    public static native void dataProcess(long p0,byte[] p1,int p2,int p3,int p4,int p5,String p6);
    public static native String getModelVersion(long p0);
    public static native String getSdkVersion(long p0);
    public static native void loadModel(long p0,String p1);
    public static void safeLoadLibraries(){
       "mmusound_lib".b("mmusound_lib");
    }
    public static native void sessionOver(long p0);
    public static native void setCallback(long p0,MmuSoundCallback p1);
    public static native void setFunctionMode(long p0,int p1);
    public static native void setSendTime(long p0,int p1);
    public static native void wakeup(long p0,byte[] p1,int p2,int p3,int p4,int p5,int p6,String p7);
}
