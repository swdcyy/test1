package com.kwai.performance.overhead.battery.jni.CpuOptimize;
import com.kwai.performance.overhead.battery.jni.NativeHandler;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.kwai.performance.overhead.battery.jni.CpuOptimize$DuResultCallback;

public class CpuOptimize	// class@001114
{

    static {
       NativeHandler.a();
    }
    public void CpuOptimize(){
       super();
    }
    public static synchronized long a(File p0){
       _monitor_enter(CpuOptimize.class);
       _monitor_exit(CpuOptimize.class);
       return CpuOptimize.callDuV2(p0.getPath(), 8197);
    }
    public static native void callDuV1(String p0,int p1,CpuOptimize$DuResultCallback p2);
    public static native long callDuV2(String p0,int p1);
}
