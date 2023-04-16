package com.kwai.performance.overhead.thread.monitor.NativeHandler;
import java.lang.Object;
import com.kwai.performance.overhead.thread.monitor.NativeHandler$a;
import java.lang.String;
import fg7.b;
import fg7.c;

public class NativeHandler	// class@00116f
{
    public b mILogHelper;
    public c mNativeCallback;

    public void NativeHandler(){
       super();
       this.mNativeCallback = null;
    }
    public static NativeHandler getInstance(){
       return NativeHandler$a.a;
    }
    public static String nativeCallGetCurrentActivity(){
       if (NativeHandler.getInstance().mILogHelper != null) {
          return NativeHandler.getInstance().mILogHelper.c();
       }
       return "UNKNOWN";
    }
    public static String nativeCallGetCurrentPage(){
       if (NativeHandler.getInstance().mILogHelper != null) {
          return NativeHandler.getInstance().mILogHelper.f();
       }
       return "UNKNOWN";
    }
    public static boolean nativeCallIsLaunchFinished(){
       if (NativeHandler.getInstance().mILogHelper != null) {
          return NativeHandler.getInstance().mILogHelper.d();
       }
       return true;
    }
    public static void nativeCallback(int p0,String p1,String p2){
       if (NativeHandler.getInstance().mNativeCallback != null) {
          NativeHandler.getInstance().mNativeCallback.a(p0, p1, p2);
       }
       return;
    }
    public native void disableJavaStack();
    public native void disableNativeStack();
    public native void enableNativeLog();
    public native void enableSigSegvProtection();
    public native void enableThreadAddCustomLog();
    public native void endCollect();
    public native void init();
    public native void logThreadStatus(String p0);
    public native void refresh();
    public void setILogHelper(b p0){
       this.mILogHelper = p0;
    }
    public native void setJavaStackDumpTimeGap(int p0,int p1);
    public void setNativeCallback(c p0){
       this.mNativeCallback = p0;
    }
    public native void setNativeStackDumpTimeGap(int p0,int p1);
    public native void setProcName(String p0);
    public native void setThreadAddTraceReportArgs(int p0,long p1,float p2);
    public native void setThreadCatch(String p0);
    public native void setThreadLeakDelay(long p0);
    public native void start();
    public native void startCollect(String p0);
    public native void stop();
    public native void test();
}
