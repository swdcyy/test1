package com.kwai.performance.overhead.io.monitor.NativeHandler;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import dg7.c;
import java.util.Objects;
import yf7.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import dg7.c$c;
import com.google.gson.Gson;
import android.content.Context;
import dg7.a;
import com.kwai.performance.overhead.io.monitor.IoMonitorWBConfig;
import com.kwai.performance.overhead.io.monitor.IoMonitorArgsConfig;
import com.kwai.performance.overhead.io.monitor.IoMonitorPdConfig;
import com.kwai.performance.overhead.io.monitor.IoMonitorDiskUsageConfig;
import com.kwai.performance.overhead.io.monitor.FDMonitorArgsConfig;
import android.os.Build$VERSION;
import java.io.File;

public class NativeHandler	// class@001158
{
    public AtomicBoolean initSuc;
    public static int MIN_ANDROID_API = 21;
    public static final NativeHandler ourInstance;

    static {
       NativeHandler.ourInstance = new NativeHandler();
    }
    public void NativeHandler(){
       super();
       this.initSuc = new AtomicBoolean(false);
    }
    public static NativeHandler getInstance(){
       return NativeHandler.ourInstance;
    }
    public static boolean onIoTraceStateEvent(String p0,String p1){
       Objects.requireNonNull(c.b());
       i a = i.a;
       a.e(p0, p1, false);
       if (!TextUtils.isEmpty(p1)) {
          c$c uoc = new c$c();
          uoc.key = p0;
          uoc.length = p1.length();
          a.e("report_length", new Gson().q(uoc), false);
       }
       return true;
    }
    public native final void configArgs(boolean p0,long p1,boolean p2,boolean p3,boolean p4,double p5,int p6,int p7,int p8,int p9,int p10,int p11,int p12,int p13,int p14);
    public native final void configDiskUsage(boolean p0,String p1,String p2,String[] p3);
    public native void configFdOverLimitArgs(int p0,int p1,int p2,float p3);
    public native final void configPds(int[] p0);
    public native final void configWhiteBlackList(String[] p0,String[] p1,String[] p2,String[] p3,String[] p4,String[] p5,String[] p6);
    public native int getMaxFd();
    public native long getWriteBytes();
    public void init(Context p0,a p1,int p2){
       a uoa = p1;
       if (this.notSupport()) {
          return;
       }
       a a = uoa.a;
       a b = uoa.b;
       this.configWhiteBlackList(a.overviewElfs, a.ignoreElfs, a.overviewWhiteFiles, a.overviewFiles, a.overviewBlackFiles, a.monitorWhiteFiles, a.monitorBlackFiles);
       a uoa1 = b;
       this.configArgs(b.debug, b.nativeLogPtr, b.replaceEnable, b.detectInMainThread, b.fileIssueCollect, b.traceRatio, b.fileReportCount, b.overviewSaveDurationMs, b.overviewSaveSizeByte, b.startTimeMs, b.smallBufferByte, uoa1.smallBufferCount, uoa1.bigFileSizeByte, uoa1.traceReportCount, uoa1.traceReportSeconds);
       NativeHandler nativeHandle = this;
       nativeHandle.configPds(uoa.c.bufferPdRulesByte);
       a = uoa.f;
       nativeHandle.configDiskUsage(a.isDiskUsageMode, a.monitorDir, a.monitorDirParent, a.monitorBlackDirs);
       a = uoa.d;
       FDMonitorArgsConfig uFDMonitorAr = a.fdAbortThreshold;
       if (a.fdTraceThreshold <= null || uFDMonitorAr <= null) {
          if (Build$VERSION.SDK_INT <= 27) {
             a.fdTraceThreshold = 400;
             a.fdAbortThreshold = 800;
             a.fdAbortStep = 200;
          }else {
             a.fdTraceThreshold = 1024;
             a.fdAbortThreshold = 1400;
             a.fdAbortStep = 300;
          }
          float f = 0.00f;
          a.fdMonitorRate = f;
          a.fdRandomTraceRate = f;
       }
       nativeHandle.configFdOverLimitArgs(a.fdTraceThreshold, a.fdAbortThreshold, a.fdAbortStep, a.fdRandomTraceRate);
       File a1 = p0.getFilesDir();
       if (a1 == null) {
          return;
       }else if(a1.getParentFile() == null){
          return;
       }else {
          nativeHandle.init(p0.getFilesDir().getAbsolutePath(), p1.a(), p2);
          nativeHandle.initSuc.set(true);
          return;
       }
    }
    public native final void init(String p0,String p1,int p2);
    public native boolean loopCheck();
    public final boolean notSupport(){
       boolean b = (Build$VERSION.SDK_INT < NativeHandler.MIN_ANDROID_API)? true: false;
       return b;
    }
    public native void setCurrentActivity(String p0);
    public native void setCurrentPage(String p0);
    public native final void setIODetectorStatus(boolean p0);
    public native void setLaunchStatus(boolean p0);
    public void startDetect(){
       if (this.notSupport()) {
          return;
       }
       if (!this.initSuc.get()) {
          return;
       }
       this.setIODetectorStatus(true);
       return;
    }
    public void stopDetect(){
       if (this.notSupport()) {
          return;
       }
       if (!this.initSuc.get()) {
          return;
       }
       this.setIODetectorStatus(false);
       return;
    }
    public native void testHwasan();
    public native void testNativeFile(String p0);
}
