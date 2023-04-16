package com.kwai.performance.stability.oom.monitor.tracker.FdOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.FdOOMTracker$a;
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
import kotlin.jvm.internal.a;
import android.system.Os;
import java.lang.StringBuilder;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.CharSequence;
import msd.l;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import qrd.l1;

public final class FdOOMTracker extends OOMTracker	// class@001269
{
    public int mLastFdCount;
    public int mOverThresholdCount;
    public static final FdOOMTracker$a Companion;

    static {
       FdOOMTracker.Companion = new FdOOMTracker$a(null);
    }
    public void FdOOMTracker(){
       super();
    }
    public final void dumpFdIfNeed(){
       ArrayList uArrayList;
       String str = "file";
       String str1 = "FdOOMTracker";
       h.d(str1, "over threshold dumpFdIfNeed");
       if (this.mOverThresholdCount > this.getMonitorConfig().h) {
          return;
       }
       File[] uFileArray = Result.constructor-impl(new File("/proc/self/fd").listFiles());
       int i = 0;
       if (Result.exceptionOrNull-impl(uFileArray) != null) {
          h.d(str1, "/proc/self/fd child files is empty");
          uFileArray = new File[i];
       }
       if (uFileArray != null) {
          uArrayList = new ArrayList(uFileArray.length);
          int len = uFileArray.length;
          for (; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             a.o(oobject, str);
             String str2 = Result.constructor-impl(Os.readlink(oobject.getPath()));
             if (Result.exceptionOrNull-impl(str2) != null) {
                a.o(oobject, str);
                str2 = "failed to read link "+oobject.getPath();
             }
             uArrayList.add(str2);
          }
       }else {
          uArrayList = CollectionsKt__CollectionsKt.E();
       }
       FilesKt__FileReadWriteKt.G(OOMFileManager.a(OOMFileManager.f()), CollectionsKt___CollectionsKt.V2(CollectionsKt___CollectionsKt.b5(uArrayList), ",", null, null, 0, null, null, 62, null), null, 2, null);
       Result.constructor-impl(l1.a);
       return;
    }
    public final int getFdCount(){
       File[] uFileArray = new File("/proc/self/fd").listFiles();
       int len = (uFileArray != null)? uFileArray.length: 0;
       return len;
    }
    public String reason(){
       return "reason_fd_oom";
    }
    public void reset(){
       this.mLastFdCount = 0;
       this.mOverThresholdCount = 0;
    }
    public boolean track(){
       int fdCount = this.getFdCount();
       int i = 1;
       if (fdCount > this.getMonitorConfig().e && fdCount >= (this.mLastFdCount - 50)) {
          this.mOverThresholdCount = this.mOverThresholdCount + i;
          h.d("FdOOMTracker", "[meet condition] "+"overThresholdCount: "+this.mOverThresholdCount+", fdCount: "+fdCount);
          this.dumpFdIfNeed();
       }else {
          this.reset();
       }
       this.mLastFdCount = fdCount;
       if (this.mOverThresholdCount < this.getMonitorConfig().h) {
          i = false;
       }
       return i;
    }
}
