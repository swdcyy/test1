package com.kwai.music.echo.EchoNative;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.System;
import java.lang.Object;

public class EchoNative	// class@000f72
{
    public static boolean a;

    static {
       try{
          if (Build$VERSION.SDK_INT >= 27) {
             System.loadLibrary("echo");
             EchoNative.a = true;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public void EchoNative(){
       super();
    }
    public static boolean a(){
       return EchoNative.a;
    }
    public static native boolean create();
    public static native void delete();
    public static native boolean setEchoOn(boolean p0);
    public static native void setPlaybackDeviceId(int p0);
    public static native void setRecordingDeviceId(int p0);
}
