package com.kwai.performance.overhead.traffic.monitor.TrafficMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$mMinLogThreshold$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$mDefaultSampleTimeMs$2;
import com.google.gson.Gson;
import java.lang.System;
import android.os.Process;
import android.net.TrafficStats;
import android.app.Application;
import java.lang.String;
import kotlin.jvm.internal.a;
import hg7.a;
import hg7.b;
import com.kwai.performance.overhead.traffic.monitor.TrafficBucket;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$a;
import android.os.Handler;
import java.lang.Object;
import java.lang.Number;
import yf7.p;
import java.lang.Boolean;
import com.kwai.performance.monitor.base.d;
import yf7.k;
import android.os.HandlerThread;
import android.os.Looper;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$b;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$reportTrafficStatsInBucket$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class TrafficMonitor extends Monitor	// class@00117d
{
    public static final TrafficMonitor INSTANCE;
    public static Application application;
    public static TrafficBucket mBackgroundPendingBucket;
    public static long mBucketsLogInterval;
    public static final p mDefaultSampleTimeMs$delegate;
    public static TrafficBucket mForegroundPendingBucket;
    public static a mFreeTraffic;
    public static final Gson mGson;
    public static TrafficMonitor$a mHandler;
    public static final p mMinLogThreshold$delegate;
    public static b mMonitorConfig;
    public static long mPreviousBucketElapsedTimeMs;
    public static long mPreviousRxBytes;
    public static long mPreviousTxBytes;
    public static HandlerThread mThread;
    public static TrafficBucket mThreadBucket;

    static {
       TrafficMonitor.INSTANCE = new TrafficMonitor();
       TrafficMonitor.mMinLogThreshold$delegate = s.c(TrafficMonitor$mMinLogThreshold$2.INSTANCE);
       TrafficMonitor.mDefaultSampleTimeMs$delegate = s.c(TrafficMonitor$mDefaultSampleTimeMs$2.INSTANCE);
       TrafficMonitor.mGson = new Gson();
       TrafficMonitor.mPreviousBucketElapsedTimeMs = System.currentTimeMillis();
       TrafficMonitor.mPreviousTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
       TrafficMonitor.mPreviousRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
    }
    public void TrafficMonitor(){
       super();
    }
    public static final Application access$getApplication$p(TrafficMonitor p0){
       Application application = TrafficMonitor.application;
       if (application == null) {
          a.S("application");
       }
       return application;
    }
    public static final a access$getMFreeTraffic$p(TrafficMonitor p0){
       return TrafficMonitor.mFreeTraffic;
    }
    public static final Gson access$getMGson$p(TrafficMonitor p0){
       return TrafficMonitor.mGson;
    }
    public static final b access$getMMonitorConfig$p(TrafficMonitor p0){
       return TrafficMonitor.mMonitorConfig;
    }
    public static final TrafficBucket access$getMThreadBucket$p(TrafficMonitor p0){
       return TrafficMonitor.mThreadBucket;
    }
    public static final void access$setApplication$p(TrafficMonitor p0,Application p1){
       TrafficMonitor.application = p1;
    }
    public static final void access$setMFreeTraffic$p(TrafficMonitor p0,a p1){
       TrafficMonitor.mFreeTraffic = p1;
    }
    public static final void access$setMMonitorConfig$p(TrafficMonitor p0,b p1){
       TrafficMonitor.mMonitorConfig = p1;
    }
    public static final void access$setMThreadBucket$p(TrafficMonitor p0,TrafficBucket p1){
       TrafficMonitor.mThreadBucket = p1;
    }
    public static final void beginTrafficMonitor(){
       TrafficMonitor iNSTANCE = TrafficMonitor.INSTANCE;
       TrafficMonitor.mThreadBucket = iNSTANCE.getNextBucket();
       iNSTANCE.registerLifecycle();
       TrafficMonitor$a mHandler = TrafficMonitor.mHandler;
       if (mHandler == null) {
          a.S("mHandler");
       }
       mHandler.sendEmptyMessageDelayed(mHandler.a, mHandler.b);
       return;
    }
    public static final void endTrafficMonitor(){
       TrafficMonitor$a mHandler = TrafficMonitor.mHandler;
       if (mHandler == null) {
          a.S("mHandler");
       }
       mHandler.removeMessages(mHandler.a);
       return;
    }
    public final String dumpTrafficSample(){
       TrafficBucket mThreadBucke = TrafficMonitor.mThreadBucket;
       if (mThreadBucke != null) {
       }else {
          mThreadBucke = this.getNextBucket();
       }
       String str = TrafficMonitor.mGson.q(this.updateThreadBucketAndReport(mThreadBucke));
       this.resetThreadBucket();
       a.h(str, "result");
       return str;
    }
    public final long getMDefaultSampleTimeMs(){
       return TrafficMonitor.mDefaultSampleTimeMs$delegate.getValue().longValue();
    }
    public final long getMMinLogThreshold(){
       return TrafficMonitor.mMinLogThreshold$delegate.getValue().longValue();
    }
    public final TrafficBucket getNextBucket(){
       Application application = TrafficMonitor.application;
       if (application == null) {
          a.S("application");
       }
       Boolean uBoolean = Boolean.valueOf(p.b(application));
       long l = System.currentTimeMillis();
       a mFreeTraffic = TrafficMonitor.mFreeTraffic;
       int i = (mFreeTraffic != null)? mFreeTraffic.a(): 2;
       TrafficBucket trafficBucke = new TrafficBucket(0, 0, 0, uBoolean, false, l, true, i);
       return v13;
    }
    public void init(d p0,b p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       super.init(p0, p1);
       TrafficMonitor.application = k.b();
       TrafficMonitor.mFreeTraffic = p1.b;
       TrafficMonitor.mMonitorConfig = p1;
       TrafficBucket nextBucket = this.getNextBucket();
       nextBucket.setBackground(Boolean.TRUE);
       nextBucket.setPendingBucket(true);
       TrafficMonitor.mBackgroundPendingBucket = nextBucket;
       nextBucket = this.getNextBucket();
       nextBucket.setBackground(Boolean.FALSE);
       nextBucket.setPendingBucket(true);
       TrafficMonitor.mForegroundPendingBucket = nextBucket;
       TrafficMonitor.mPreviousTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
       TrafficMonitor.mPreviousRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
       HandlerThread handlerThrea = new HandlerThread("traffic-monitor-thr");
       TrafficMonitor.mThread = handlerThrea;
       handlerThrea.start();
       HandlerThread mThread = TrafficMonitor.mThread;
       if (mThread == null) {
          a.S("mThread");
       }
       TrafficMonitor.mHandler = new TrafficMonitor$a(mThread.getLooper());
       return;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public final boolean logPendingBucketIfNeeded(TrafficBucket p0,boolean p1){
       if (!p1 && p0.getDuration() - this.getMMinLogThreshold() < 0) {
          return false;
       }
       this.reportTrafficStatsInBucket(p0);
       return true;
    }
    public final void onBackground(){
       this.performSwitchAction(false);
    }
    public final void onForeground(){
       this.performSwitchAction(true);
    }
    public final void performSwitchAction(boolean p0){
       if (this.logPendingBucketIfNeeded(this.updatePendingBucket(p0), true)) {
          this.resetPendingBucket(p0);
          this.resetSampling();
       }
       return;
    }
    public final void registerLifecycle(){
       Application application = TrafficMonitor.application;
       if (application == null) {
          a.S("application");
       }
       application.registerActivityLifecycleCallbacks(new TrafficMonitor$b());
       return;
    }
    public final void reportTrafficStatsInBucket(TrafficBucket p0){
       Monitor_ThreadKt.b(0, new TrafficMonitor$reportTrafficStatsInBucket$1(p0), 1, null);
    }
    public final void resetPendingBucket(boolean p0){
       TrafficBucket nextBucket;
       if (p0) {
          nextBucket = this.getNextBucket();
          nextBucket.setBackground(Boolean.TRUE);
          nextBucket.setPendingBucket(true);
          TrafficMonitor.mBackgroundPendingBucket = nextBucket;
       }else {
          nextBucket = this.getNextBucket();
          nextBucket.setBackground(Boolean.FALSE);
          nextBucket.setPendingBucket(true);
          TrafficMonitor.mForegroundPendingBucket = nextBucket;
       }
       return;
    }
    public final void resetSampling(){
       TrafficMonitor$a mHandler = TrafficMonitor.mHandler;
       if (mHandler == null) {
          a.S("mHandler");
       }
       mHandler.removeMessages(mHandler.a);
       mHandler.sendEmptyMessage(mHandler.a);
       return;
    }
    public final void resetThreadBucket(){
       TrafficMonitor.mThreadBucket = this.getNextBucket();
    }
    public final void updateBucketInterval(){
       TrafficMonitor.mBucketsLogInterval = System.currentTimeMillis() - TrafficMonitor.mPreviousBucketElapsedTimeMs;
    }
    public synchronized final TrafficBucket updatePendingBucket(boolean p0){
       this.updateBucketInterval();
       TrafficMonitor.mPreviousBucketElapsedTimeMs = System.currentTimeMillis();
       long l = TrafficStats.getUidRxBytes(Process.myUid()) - TrafficMonitor.mPreviousRxBytes;
       TrafficMonitor.mPreviousRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
       long l1 = TrafficStats.getUidTxBytes(Process.myUid()) - TrafficMonitor.mPreviousTxBytes;
       TrafficMonitor.mPreviousTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
       TrafficBucket mBackgroundP = TrafficMonitor.mBackgroundPendingBucket;
       if (mBackgroundP == null) {
          a.S("mBackgroundPendingBucket");
       }
       if (!p0) {
          mBackgroundP = null;
       }
       if (mBackgroundP == null) {
          mBackgroundP = TrafficMonitor.mForegroundPendingBucket;
          if (mBackgroundP == null) {
             a.S("mForegroundPendingBucket");
          }
       }
       mBackgroundP.setRxBytes((mBackgroundP.getRxBytes() + l));
       mBackgroundP.setTxBytes((mBackgroundP.getTxBytes() + l1));
       mBackgroundP.setDuration((mBackgroundP.getDuration() + TrafficMonitor.mBucketsLogInterval));
       return mBackgroundP;
    }
    public synchronized final TrafficBucket updateThreadBucketAndReport(TrafficBucket p0){
       TrafficMonitor iNSTANCE = TrafficMonitor.INSTANCE;
       iNSTANCE.updateBucketInterval();
       TrafficMonitor.mPreviousBucketElapsedTimeMs = System.currentTimeMillis();
       TrafficMonitor.mPreviousRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
       TrafficMonitor.mPreviousTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
       p0.setDuration(TrafficMonitor.mBucketsLogInterval);
       p0.setRxBytes((TrafficStats.getUidRxBytes(Process.myUid()) - TrafficMonitor.mPreviousRxBytes));
       p0.setTxBytes((TrafficStats.getUidTxBytes(Process.myUid()) - TrafficMonitor.mPreviousTxBytes));
       Application application = TrafficMonitor.application;
       if (application == null) {
          a.S("application");
       }
       int i = 1;
       boolean b = (!p.b(application))? true: false;
       p0.setBackground(Boolean.valueOf(b));
       TrafficBucket mBackgroundP = TrafficMonitor.mBackgroundPendingBucket;
       if (mBackgroundP == null) {
          a.S("mBackgroundPendingBucket");
       }
       Boolean uBoolean = p0.isBackground();
       if (uBoolean == null) {
          a.L();
       }
       String str = (uBoolean.booleanValue() && p0.getDuration())? 1: null;
       TrafficBucket trafficBucke = null;
       if (!str) {
          mBackgroundP = trafficBucke;
       }
       if (mBackgroundP == null) {
          mBackgroundP = TrafficMonitor.mForegroundPendingBucket;
          if (mBackgroundP == null) {
             a.S("mForegroundPendingBucket");
          }
          uBoolean = p0.isBackground();
          if (uBoolean == null) {
             a.L();
          }
          if (uBoolean.booleanValue() || !p0.getDuration()) {
             i = 0;
          }
          if (!i) {
          label_00af :
             iNSTANCE.reportTrafficStatsInBucket(p0);
             return p0;
          }
       }
       trafficBucke = mBackgroundP;
       goto label_00af ;
    }
}
