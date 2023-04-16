package com.kwai.performance.stability.leak.monitor.LeakMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.kwai.performance.monitor.base.Monitor;
import zg7.b;
import android.os.Debug;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import java.util.LinkedHashMap;
import ah7.b;
import java.util.Objects;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.performance.stability.leak.monitor.message.LeakRecord;
import ah7.a;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage;
import com.kwai.performance.monitor.base.d;
import android.os.Build$VERSION;
import android.os.Process;
import yf7.t;
import kotlin.Result;
import com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage$NativeLeakItem;
import com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage$BacktraceLine;
import com.kwai.performance.stability.leak.monitor.message.FrameInfo;
import zsd.b;
import java.lang.Long;
import java.io.File;
import kotlin.text.StringsKt__StringsKt;
import zg7.c;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import yf7.i;
import android.util.Log;
import yf7.d;
import yf7.d$a;
import android.os.Handler;
import com.kwai.performance.stability.leak.monitor.LeakMonitor$a;
import java.lang.Runnable;
import com.kwai.performance.stability.leak.monitor.LeakMonitor$b;
import com.google.gson.Gson;

public final class LeakMonitor extends LoopMonitor	// class@00122f
{
    public static final String ERROR_EVENT_KEY = "NativeLeakMonitor_Error";
    public static final LeakMonitor INSTANCE;
    public static final String NATIVE_LEAK_HAPPENED_BEGIN;
    public static final String TAG;
    public static final String UUID_PREFIX;
    public static final AtomicInteger mIndex;
    public static boolean mIsStart;

    static {
       LeakMonitor.INSTANCE = new LeakMonitor();
       String str = UUID.randomUUID().toString();
       a.h(str, "UUID.randomUUID\(\).toString\(\)");
       LeakMonitor.UUID_PREFIX = str;
       LeakMonitor.mIndex = new AtomicInteger();
    }
    public void LeakMonitor(){
       super();
    }
    public static final boolean access$getMIsStart$p(LeakMonitor p0){
       return LeakMonitor.mIsStart;
    }
    public static final void access$setMIsStart$p(LeakMonitor p0,boolean p1){
       LeakMonitor.mIsStart = p1;
    }
    public static final void access$startLoop$s-623650729(LeakMonitor p0,boolean p1,boolean p2,long p3){
       super.startLoop(p1, p2, p3);
    }
    public static final void access$stopLoop$s-623650729(LeakMonitor p0){
       super.stopLoop();
    }
    public static native final long nativeGetAllocIndex();
    public static native final void nativeGetLeakAllocs(Map p0);
    public static native final boolean nativeInstallMonitor(String[] p0,String[] p1,boolean p2);
    public static boolean nativeInstallMonitor$default(String[] p0,String[] p1,boolean p2,int p3,Object p4){
       if (p3 & 0x04) {
          p2 = false;
       }
       return LeakMonitor.nativeInstallMonitor(p0, p1, p2);
    }
    public static native final void nativeSetMonitorThreshold(int p0);
    public static native final void nativeUninstallMonitor();
    public final void asyncRefresh(){
    }
    public LoopMonitor$b call(){
       String str2;
       if (this.getMonitorConfig().d > null && Debug.getNativeHeapAllocatedSize() - (long)this.getMonitorConfig().d > 0) {
          return LoopMonitor$b$a.a;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       LeakMonitor.nativeGetLeakAllocs(linkedHashMa);
       Objects.requireNonNull(b.d);
       StringBuilder str = (linkedHashMa.isEmpty())? 1: null;
       if (!str) {
          Collection uCollection = b.b.values();
          a.h(uCollection, "mAllocationTagInfoMap.values");
          List list = CollectionsKt___CollectionsKt.G4(CollectionsKt___CollectionsKt.G5(uCollection));
          Iterator iterator = linkedHashMa.entrySet().iterator();
          while (iterator.hasNext()) {
             LeakRecord value = iterator.next().getValue();
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                a uoa = iterator1.next();
                a.h(uoa, "allocationTagInfo");
                LeakRecord index = value.index;
                a.q(uoa, "$this$searchTag");
                String str1 = null;
                if ((v13 = index - uoa.a) >= 0) {
                   if (v13 >= 0) {
                      a c = uoa.c;
                      if (!c - -1 || index - c <= 0) {
                         str2 = 1;
                      label_009e :
                         if (str2) {
                            str1 = uoa.e;
                         }
                      }
                   }
                   str2 = null;
                   goto label_009e ;
                }
                if (str1 != null) {
                   value.tag = str1;
                }
             }
          }
       }
       h.d("NativeLeakMonitor", "leakRecordMap "+linkedHashMa.size());
       if (linkedHashMa.isEmpty()) {
          return LoopMonitor$b$a.a;
       }else {
          LeakMonitor.INSTANCE.uploadLeakMessage(this.packageLeakMessage(linkedHashMa));
          return LoopMonitor$b$a.a;
       }
    }
    public Object call(){
       return this.call();
    }
    public final long getAllocationIndex$com_kwai_performance_stability_leak_monitor(){
       return LeakMonitor.nativeGetAllocIndex();
    }
    public long getLoopInterval(){
       return this.getMonitorConfig().f;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void init(d p0,b p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       if (Build$VERSION.SDK_INT < 24 || !Process.is64Bit()) {
          h.b("NativeLeakMonitor", "Native LeakMonitor NOT running in below Android N or Arm 32 bit app");
          return;
       }else if(!t.a("memory-monitor")){
          return;
       }else {
          super.init(p0, p1);
          return;
       }
    }
    public final NativeLeakMessage packageLeakMessage(Map p0){
       int i;
       NativeLeakMessage nativeLeakMe = new NativeLeakMessage();
       nativeLeakMe.logUUID = LeakMonitor.UUID_PREFIX+'-'+LeakMonitor.mIndex.getAndIncrement();
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             NativeLeakMessage$NativeLeakItem nativeLeakIt = new NativeLeakMessage$NativeLeakItem();
             nativeLeakIt.type = "AndroidLeakAlloc";
             nativeLeakIt.leakSize = String.valueOf(uEntry.getValue().size);
             nativeLeakIt.threadName = uEntry.getValue().threadName;
             nativeLeakIt.activity = uEntry.getValue().tag;
             LeakRecord frames = uEntry.getValue().frames;
             int len = frames.length;
             for (i = 0; i < len; i = i + 1) {
                object oobject = frames[i];
                NativeLeakMessage$BacktraceLine uBacktraceLi = new NativeLeakMessage$BacktraceLine();
                String str = Long.toString(oobject.relPc, b.a(16));
                a.h(str, "java.lang.Long.toString\(this, checkRadix\(radix\)\)");
                uBacktraceLi.offset = str;
                uBacktraceLi.soName = StringsKt__StringsKt.e5(oobject.soName, File.separatorChar, null, 2, null);
                uBacktraceLi.buildId = c.a(oobject.soName);
                nativeLeakIt.backtraceLines.add(uBacktraceLi);
             }
             if (!nativeLeakIt.backtraceLines.size()) {
                continue ;
             }else {
                nativeLeakMe.leakItems.add(nativeLeakIt);
                if (nativeLeakMe.leakItems.size() < this.getMonitorConfig().c) {
                   continue ;
                }
             }
          }
          iterator = Result.constructor-impl(l1.a);
          Throwable throwable = Result.exceptionOrNull-impl(iterator);
          if (throwable != null) {
             nativeLeakMe.errorMessage = nativeLeakMe.errorMessage+throwable;
             d$a.c(i.a, "NativeLeakMonitor_Error", Log.getStackTraceString(throwable), false, 4, null);
             break ;
          }
          break ;
       }
       return nativeLeakMe;
    }
    public final void startLoop(){
       this.startLoop(false, true, this.getMonitorConfig().f);
    }
    public void startLoop(boolean p0,boolean p1,long p2){
       if (!this.isInitialized()) {
          h.b("NativeLeakMonitor", "Please initialize LeakMonitor before start, check init\(\)");
          return;
       }else {
          this.getLoopHandler().post(new LeakMonitor$a(p0, p1, p2));
          return;
       }
    }
    public void stopLoop(){
       if (!this.isInitialized()) {
          h.b("NativeLeakMonitor", "Please initialize LeakMonitor before stop, check init\(\)");
          return;
       }else {
          this.getLoopHandler().post(LeakMonitor$b.b);
          return;
       }
    }
    public final void syncRefresh(){
    }
    public final void uploadLeakMessage(NativeLeakMessage p0){
       if (p0.leakItems.isEmpty()) {
          return;
       }
       String str = new Gson().q(p0);
       a.h(str, "it");
       i.a.f(str, 9);
       h.d("NativeLeakMonitor", "------  Native Leak Found ------\n"+str);
       str = Result.constructor-impl(str);
       Throwable throwable = Result.exceptionOrNull-impl(str);
       if (throwable != null) {
          d$a.c(i.a, "NativeLeakMonitor_Error", Log.getStackTraceString(throwable), false, 4, null);
       }
       return;
    }
}
