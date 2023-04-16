package com.kwai.performance.stability.oom.monitor.tracker.ThreadOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.ThreadOOMTracker$a;
import nsd.u;
import java.lang.String;
import yf7.h;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import kotlin.Result;
import java.io.File;
import java.lang.Throwable;
import qrd.j0;
import java.util.ArrayList;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.lang.StringBuilder;
import java.util.Collection;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import zsd.u;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.l1;
import mh7.a;
import mh7.a$d;

public final class ThreadOOMTracker extends OOMTracker	// class@001276
{
    public int mLastThreadCount;
    public int mOverThresholdCount;
    public static final ThreadOOMTracker$a Companion;

    static {
       ThreadOOMTracker.Companion = new ThreadOOMTracker$a(null);
    }
    public void ThreadOOMTracker(){
       super();
    }
    public final void dumpThreadIfNeed(){
       ArrayList uArrayList;
       ArrayList uArrayList1;
       String str = "ThreadOOMTracker";
       h.d(str, "over threshold dumpThreadIfNeed");
       if (this.mOverThresholdCount > this.getMonitorConfig().h) {
          return;
       }
       File[] uFileArray = Result.constructor-impl(new File("/proc/self/task").listFiles());
       boolean b = false;
       if (Result.exceptionOrNull-impl(uFileArray) != null) {
          h.d(str, "/proc/self/task child files is empty");
          uFileArray = new File[b];
       }
       if (uFileArray != null) {
          uArrayList = new ArrayList(uFileArray.length);
          int len = uFileArray.length;
          int i = 0;
          int i1 = 1;
          while (i < len) {
             String str1 = Result.constructor-impl(FilesKt__FileReadWriteKt.z(new File(uFileArray[i], "comm"), null, i1, null));
             Throwable throwable = Result.exceptionOrNull-impl(str1);
             if (throwable != null) {
                str1 = "failed to read "+throwable+"/comm";
             }
             uArrayList.add(str1);
             i = i + 1;
          }
          uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             String str2 = iterator.next();
             if (u.H1(str2, "\n", b, 2, null)) {
                i = str2.length() - i1;
                str2 = str2.substring(b, i);
                a.o(str2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }
             uArrayList1.add(str2);
          }
       }else {
          uArrayList1 = CollectionsKt__CollectionsKt.E();
       }
       uArrayList = uArrayList1;
       h.d(str, "threadNames = "+uArrayList);
       FilesKt__FileReadWriteKt.G(OOMFileManager.a(OOMFileManager.j()), CollectionsKt___CollectionsKt.V2(uArrayList, ",", null, null, 0, null, null, 62, null), null, 2, null);
       Result.constructor-impl(l1.a);
       return;
    }
    public final int getThreadCount(){
       return a.i.b();
    }
    public String reason(){
       return "reason_thread_oom";
    }
    public void reset(){
       this.mLastThreadCount = 0;
       this.mOverThresholdCount = 0;
    }
    public boolean track(){
       int threadCount = this.getThreadCount();
       int i = 1;
       if (threadCount > this.getMonitorConfig().f && threadCount >= (this.mLastThreadCount - 50)) {
          this.mOverThresholdCount = this.mOverThresholdCount + i;
          h.d("ThreadOOMTracker", "[meet condition] "+"overThresholdCount:"+this.mOverThresholdCount+", threadCount: "+threadCount);
          this.dumpThreadIfNeed();
       }else {
          this.reset();
       }
       this.mLastThreadCount = threadCount;
       if (this.mOverThresholdCount < this.getMonitorConfig().h) {
          i = false;
       }
       return i;
    }
}
