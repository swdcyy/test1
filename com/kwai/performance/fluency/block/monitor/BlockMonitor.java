package com.kwai.performance.fluency.block.monitor.BlockMonitor;
import oe7.b;
import androidx.lifecycle.LifecycleEventObserver;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;
import com.kwai.performance.fluency.block.monitor.BlockMonitor$a;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.kwai.performance.fluency.block.monitor.StackTrace;
import nsd.u;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.l1;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import java.util.Map;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig;
import trd.t0;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.performance.fluency.block.monitor.BlockMonitor$getStackTraceList$$inlined$also$lambda$1;
import msd.l;
import trd.y;
import kotlin.TypeCastException;
import com.kwai.performance.monitor.base.d;
import oe7.a;
import java.util.Iterator;
import java.lang.Iterable;
import ne7.a;
import android.app.Application;
import yf7.k;
import android.app.Activity;
import yf7.p;
import java.lang.Class;
import yf7.r;
import msd.a;
import com.kwai.performance.fluency.block.monitor.BlockMonitor$onBlock$2;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import ne7.b;
import java.lang.Enum;
import java.lang.StringBuilder;

public final class BlockMonitor extends LoopMonitor implements b, LifecycleEventObserver	// class@001058
{
    public static final BlockMonitor INSTANCE;
    public static a mBlockDetector;
    public static int mBlockEventCount;
    public static CopyOnWriteArrayList mBlockListeners;
    public static long mBufferSize;
    public static String mCustomStatEventKey;
    public static final LinkedList mLatestStackTraces;
    public static final LinkedList mLoopStackTraces;
    public static final Object mStackTraceLock;

    static {
       BlockMonitor.INSTANCE = new BlockMonitor();
       BlockMonitor.mCustomStatEventKey = "perf-block";
       BlockMonitor.mStackTraceLock = new Object();
       BlockMonitor.mLoopStackTraces = new LinkedList();
       BlockMonitor.mLatestStackTraces = new LinkedList();
    }
    public void BlockMonitor(){
       super();
    }
    public static final String access$getMCustomStatEventKey$p(BlockMonitor p0){
       return BlockMonitor.mCustomStatEventKey;
    }
    public static final void access$setMCustomStatEventKey$p(BlockMonitor p0,String p1){
       BlockMonitor.mCustomStatEventKey = p1;
    }
    public static void startSection$default(BlockMonitor p0,String p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = "";
       }
       p0.startSection(p1);
       return;
    }
    public final void addOnBlockListener(BlockMonitor$a p0){
       a.q(p0, "listener");
       CopyOnWriteArrayList mBlockListen = BlockMonitor.mBlockListeners;
       if (mBlockListen == null) {
          a.S("mBlockListeners");
       }
       mBlockListen.add(p0);
       return;
    }
    public LoopMonitor$b call(){
       StackTrace stackTrace = new StackTrace(0, null, 3, null);
       Object mStackTraceL = BlockMonitor.mStackTraceLock;
       _monitor_enter(mStackTraceL);
       LinkedList mLoopStackTr = BlockMonitor.mLoopStackTraces;
       if ((long)mLoopStackTr.size() - BlockMonitor.mBufferSize > 0) {
          mLoopStackTr.removeFirst();
       }
       LinkedList mLatestStack = BlockMonitor.mLatestStackTraces;
       if ((long)mLatestStack.size() - BlockMonitor.mBufferSize > 0) {
          mLatestStack.removeFirst();
       }
       StackTrace stackTrace1 = CollectionsKt___CollectionsKt.e3(mLoopStackTr);
       StackTrace stackTraceDe = v6.stackTraceDetail;
       StackTrace stackTraceDe1 = (stackTrace1 != null)? stackTrace1.stackTraceDetail: null;
       if (a.g(stackTraceDe, stackTraceDe1)) {
          stackTrace1.endTimestamp = v6.startTimestamp;
          stackTrace1.repeatCount = stackTrace1.repeatCount + 1;
       }else {
          mLoopStackTr.add(v6);
          mLatestStack.add(v6);
       }
       _monitor_exit(mStackTraceL);
       return LoopMonitor$b$a.a;
    }
    public Object call(){
       return this.call();
    }
    public Map getLogParams(){
       if (this.isInitialized() && this.getMonitorConfig().c == null) {
          return t0.z();
       }
       return super.getLogParams();
    }
    public long getLoopInterval(){
       return this.getMonitorConfig().b;
    }
    public final StackTrace[] getStackTraceList(long p0,long p1){
       ArrayList uArrayList = new ArrayList();
       Object mStackTraceL = BlockMonitor.mStackTraceLock;
       _monitor_enter(mStackTraceL);
       uArrayList.addAll(BlockMonitor.mLoopStackTraces);
       _monitor_exit(mStackTraceL);
       y.K0(uArrayList, new BlockMonitor$getStackTraceList$$inlined$also$lambda$1(p0, p1));
       StackTrace[] stackTraceAr = new StackTrace[0];
       Object[] objArray = uArrayList.toArray(stackTraceAr);
       if (objArray != null) {
          return objArray;
       }
       throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
    public final List getStackTraces(){
       ArrayList uArrayList = new ArrayList();
       Object mStackTraceL = BlockMonitor.mStackTraceLock;
       _monitor_enter(mStackTraceL);
       uArrayList.addAll(BlockMonitor.mLatestStackTraces);
       _monitor_exit(mStackTraceL);
       return uArrayList;
    }
    public void init(d p0,BlockMonitorConfig p1){
       a.q(p0, "commonConfig");
       a.q(p1, "blockMonitorConfig");
       super.init(p0, p1);
       BlockMonitor.mBlockDetector = new a(this, p1.a);
       BlockMonitor.mBufferSize = ((long)10 * p1.a) / p1.b;
       BlockMonitor.mBlockListeners = new CopyOnWriteArrayList();
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void onBlock(long p0,long p1,long p2,String p3){
       a.q(p3, "msg");
       CopyOnWriteArrayList mBlockListen = BlockMonitor.mBlockListeners;
       if (mBlockListen == null) {
          a.S("mBlockListeners");
       }
       Iterator iterator = mBlockListen.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p3);
       }
       if (BlockMonitor.mBlockEventCount <= 300 && this.getMonitorConfig().c != null) {
          a uoa = new a();
          uoa.blockDuration = p1;
          BlockMonitor iNSTANCE = BlockMonitor.INSTANCE;
          uoa.blockTimeThreshold = iNSTANCE.getMonitorConfig().a;
          uoa.blockLoopInterval = iNSTANCE.getMonitorConfig().b;
          uoa.calcBlockOverhead = p2;
          uoa.stackTraceSample = iNSTANCE.getStackTraceList(p0, p1);
          Activity uActivity = p.a(k.b());
          String str = "";
          String simpleName = (uActivity != null)? uActivity.getClass().getSimpleName(): str;
          uoa.currentActivity = simpleName;
          simpleName = r.a();
          if (simpleName != null) {
             str = simpleName;
          }
          uoa.processName = str;
          uoa.extraMap.putAll(iNSTANCE.getMonitorConfig().d.invoke());
          Monitor_ThreadKt.b(0, new BlockMonitor$onBlock$2(uoa), 1, null);
          BlockMonitor.mBlockEventCount = BlockMonitor.mBlockEventCount + 1;
       }
       return;
    }
    public void onStartSampleStackTrace(){
       if (this.getMonitorConfig().c != null) {
          this.startLoop(true, true, 0);
       }
       return;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       a mBlockDetect;
       a.q(p0, "source");
       a.q(p1, "event");
       int i = b.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2) {
             mBlockDetect = BlockMonitor.mBlockDetector;
             if (mBlockDetect == null) {
                a.S("mBlockDetector");
             }
             mBlockDetect.d();
          }
       }else {
          mBlockDetect = BlockMonitor.mBlockDetector;
          if (mBlockDetect == null) {
             a.S("mBlockDetector");
          }
          mBlockDetect.c();
       }
       return;
    }
    public void onStopSampleStackTrace(){
       if (this.getMonitorConfig().c != null) {
          this.stopLoop();
          Object mStackTraceL = BlockMonitor.mStackTraceLock;
          _monitor_enter(mStackTraceL);
          BlockMonitor.mLoopStackTraces.clear();
          _monitor_exit(mStackTraceL);
       }
       return;
    }
    public final void removeOnBlockListener(BlockMonitor$a p0){
       a.q(p0, "listener");
       CopyOnWriteArrayList mBlockListen = BlockMonitor.mBlockListeners;
       if (mBlockListen == null) {
          a.S("mBlockListeners");
       }
       mBlockListen.remove(p0);
       return;
    }
    public final void startSection(){
       BlockMonitor.startSection$default(this, null, 1, null);
    }
    public final void startSection(String p0){
       a.q(p0, "keySuffix");
       if (!this.isInitialized()) {
          return;
       }
       a mBlockDetect = BlockMonitor.mBlockDetector;
       if (mBlockDetect == null) {
          a.S("mBlockDetector");
       }
       if (mBlockDetect.b()) {
          return;
       }else {
          BlockMonitor.mCustomStatEventKey = BlockMonitor.mCustomStatEventKey+p0;
          a mBlockDetect1 = BlockMonitor.mBlockDetector;
          if (mBlockDetect1 == null) {
             a.S("mBlockDetector");
          }
          mBlockDetect1.c();
          p.c(k.b(), this);
          return;
       }
    }
    public final void stopSection(){
       if (!this.isInitialized()) {
          return;
       }
       a mBlockDetect = BlockMonitor.mBlockDetector;
       if (mBlockDetect == null) {
          a.S("mBlockDetector");
       }
       if (!mBlockDetect.b()) {
          return;
       }else {
          BlockMonitor.mCustomStatEventKey = "perf-block";
          mBlockDetect = BlockMonitor.mBlockDetector;
          if (mBlockDetect == null) {
             a.S("mBlockDetector");
          }
          mBlockDetect.d();
          this.stopLoop();
          Object mStackTraceL = BlockMonitor.mStackTraceLock;
          _monitor_enter(mStackTraceL);
          BlockMonitor.mLoopStackTraces.clear();
          BlockMonitor.mLatestStackTraces.clear();
          _monitor_exit(mStackTraceL);
          a.q(k.b(), "$this$unregisterProcessLifecycleObserver");
          a.q(this, "observer");
          p.c.remove(this);
          return;
       }
    }
}
