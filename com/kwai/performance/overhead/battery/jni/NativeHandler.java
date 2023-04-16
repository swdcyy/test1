package com.kwai.performance.overhead.battery.jni.NativeHandler;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.lang.StringBuilder;
import yf7.h;
import java.lang.Throwable;
import android.util.Log;
import yf7.i;
import ag7.b;
import java.lang.Thread;

public class NativeHandler	// class@001115
{
    public static boolean a = false;
    public static int b;

    public void NativeHandler(){
       super();
    }
    public static int a(){
       String str = "BatteryMonitor.JNI";
       if (!NativeHandler.a && NativeHandler.b == -1) {
          System.loadLibrary("plt-base");
          System.loadLibrary("plt-unwind");
          System.loadLibrary("cpu-monitor");
          int i = NativeHandler.init();
          NativeHandler.b = i;
          if (i) {
             h.d(str, "NativeHandler.init\(\) | code = "+NativeHandler.b);
          }
          NativeHandler.a = true;
       }
       return NativeHandler.b;
    }
    public static native String dumpThreadInfo(Thread p0);
    public static native int init();
}
