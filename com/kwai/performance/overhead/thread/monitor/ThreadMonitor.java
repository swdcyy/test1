package com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$a;
import nsd.u;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$mThreadBlockChecker$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.System;
import java.util.ArrayList;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$c;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import fg7.d;
import fg7.g;
import java.lang.String;
import yf7.h;
import java.util.HashMap;
import java.lang.ThreadGroup;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.Object;
import yf7.s;
import java.lang.Thread;
import java.lang.Thread$State;
import java.lang.StackTraceElement;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import fg7.e;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import java.lang.Number;
import java.util.Map;
import java.lang.Iterable;
import trd.u;
import java.lang.StringBuilder;
import fg7.f;
import gg7.d;
import com.google.gson.Gson;
import fg7.a;
import java.util.List;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import com.kwai.performance.overhead.thread.monitor.NativeHandler;
import gg7.b;
import yf7.r;
import android.os.Process;
import java.util.Objects;
import yf7.i;
import yf7.d;
import yf7.d$a;
import android.os.Handler;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$b;
import java.lang.Runnable;
import com.kwai.performance.monitor.base.Monitor;
import yf7.t;
import fg7.c;
import fg7.b;
import java.lang.CharSequence;
import yf7.x;
import yf7.u;
import com.kwai.performance.monitor.base.d;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$d;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$e;

public final class ThreadMonitor extends LoopMonitor	// class@000dd9
{
    public ArrayList mInitThreadData;
    public int mInitTotal;
    public boolean mIsNativeInit;
    public boolean mIsRunning;
    public long mLoopTimes;
    public final long mMonitorBegin;
    public final ThreadMonitor$c mNativeCallback;
    public final p mThreadBlockChecker$delegate;
    public int mThreadThresholdLimit;
    public static final ThreadMonitor$a Companion;

    static {
       ThreadMonitor.Companion = new ThreadMonitor$a(null);
    }
    public void ThreadMonitor(){
       super();
       this.mThreadBlockChecker$delegate = s.c(new ThreadMonitor$mThreadBlockChecker$2(this));
       this.mMonitorBegin = System.currentTimeMillis();
       this.mInitThreadData = new ArrayList();
       this.mNativeCallback = new ThreadMonitor$c();
    }
    public LoopMonitor$b call(){
       Thread$State state;
       String name;
       e uoe1;
       Pair pair;
       Pair obj;
       e obj1;
       d a;
       StringBuilder str1;
       ThreadMonitor threadMonito = this;
       if (threadMonito.mIsNativeInit == null) {
          threadMonito.mIsNativeInit = this.handleNativeInit();
       }
       threadMonito.mIsRunning = true;
       this.handleThreadThreshold();
       if (threadMonito.mIsNativeInit != null) {
          this.handleThreadLeak();
       }
       d mThreadBlock = this.getMThreadBlockChecker();
       ThreadMonitor mLoopTimes = threadMonito.mLoopTimes;
       g n = mThreadBlock.b.n;
       long l = 1;
       if (n > null) {
          long l1 = 0;
          if (!(mLoopTimes % (long)n) - l1) {
             String str = "ThreadMonitor";
             h.d(str, "handleBlockCheck start");
             HashMap hashMap = new HashMap();
             ThreadGroup threadGroup = s.e(m0.d(ThreadGroup.class), "systemThreadGroup");
             if (threadGroup != null) {
                int i = threadGroup.activeCount();
                Thread[] threadArray = new Thread[(i + (i / 2))];
                int i1 = threadGroup.enumerate(threadArray);
                int i2 = 0;
                while (i2 < i1) {
                   object oobject = threadArray[i2];
                   if (oobject != null) {
                      state = oobject.getState();
                      if (state != Thread$State.BLOCKED && (state == Thread$State.WAITING || state == Thread$State.TIMED_WAITING)) {
                         StackTraceElement[] stackTrace = oobject.getStackTrace();
                         a.h(stackTrace, "it.stackTrace");
                         hashMap.put(oobject, stackTrace);
                      }
                   }
                   i2 = i2 + 1;
                }
             }
             ArrayList uArrayList = new ArrayList(hashMap.size());
             Iterator iterator = hashMap.entrySet().iterator();
             long l2 = -1;
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                state = uEntry.getKey().getState();
                a.h(state, "it.key.state");
                name = uEntry.getKey().getName();
                a.h(name, "it.key.name");
                Thread$State state1 = state;
                e uoe = v15;
                uoe1 = v15;
                uoe = new e(uEntry.getKey().getId(), state1, name, uEntry.getValue());
                Long longx = mThreadBlock.a.get(uoe1);
                if (longx == null) {
                   longx = Long.valueOf(l1);
                }
                a.h(longx, "\(mLastThreadBlockMap[info] ?: 0L\)");
                long l3 = longx.longValue();
                if (!l3 - l2) {
                   pair = r0.a(uoe1, Long.valueOf(l2));
                }else {
                   l3 = l3 + l;
                   pair = r0.a(uoe1, Long.valueOf(l3));
                }
                uArrayList.add(pair);
                name = 1;
             }
             mThreadBlock.a.clear();
             ArrayList uArrayList1 = new ArrayList();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                obj1 = obj;
                d uod = (mThreadBlock.b.m <= null)? 1: null;
                if (obj1.getSecond().longValue() - (long)mThreadBlock.b.l >= 0) {
                   if (!uod) {
                      d b = mThreadBlock.b;
                      l2 = obj1.getSecond().longValue() - (long)b.l;
                      l2 = l2 % (long)b.m;
                      if (l2 - l1) {
                      label_0163 :
                         l = 0;
                      label_0164 :
                         a = mThreadBlock.a;
                         d first = obj1.getFirst();
                         long l4 = (l && uod)? -1: obj1.getSecond().longValue();
                         a.put(first, Long.valueOf(l4));
                         if (l) {
                            uArrayList1.add(obj);
                         }
                         first = -1;
                      }
                   }
                   l = 1;
                   goto label_0164 ;
                }else {
                   goto label_0163 ;
                }
             }
             ArrayList uArrayList2 = new ArrayList(u.Y(uArrayList1, 10));
             Iterator iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                h.d(str, "thread blocked, "+obj.getFirst().c+" : "+obj.getSecond().longValue());
                e a1 = obj.getFirst().a;
                obj1 = obj.getFirst().b;
                uoe1 = obj.getFirst().c;
                e d = obj.getFirst().d;
                if (d == null) {
                   str1 = "";
                   object oobject1 = null;
                }else {
                   str1 = "";
                   int len = d.length;
                   for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                      str1 = str1+"at "+d[i3]+10;
                   }
                   String str2 = str1.substring(0);
                   a.h(str2, "sb.substring\(0\)");
                   str1 = str2;
                }
                f uof = new f(a1, obj1, uoe1, str1, obj.getSecond().longValue());
                uArrayList2.add(l);
             }
             if (uArrayList2.isEmpty() ^ 1) {
                name = "thread_block";
                String str3 = new Gson().q(new a(name, uArrayList2));
                a.h(str3, "Gson\(\).toJson\(BlockThreadData\(type, it\)\)");
                ThreadMonitor.Companion.b(name, str3);
             }
          }
       }
       threadMonito.mLoopTimes = threadMonito.mLoopTimes + 1;
       return LoopMonitor$b$a.a;
    }
    public Object call(){
       return this.call();
    }
    public final void doReportThread(){
       ThreadMonitor threadMonito = this;
       if (threadMonito.mIsNativeInit != null) {
          NativeHandler.getInstance().logThreadStatus("over_limit");
       }else {
          ThreadMonitor$a companion = ThreadMonitor.Companion;
          Gson gson = new Gson();
          ThreadMonitor mInitTotal = threadMonito.mInitTotal;
          ThreadMonitor mInitThreadD = threadMonito.mInitThreadData;
          ThreadMonitor mMonitorBegi = threadMonito.mMonitorBegin;
          a.q(mInitThreadD, "initList");
          Pair pair = d.a();
          String str = r.a();
          if (str == null) {
             str = "unknown_proc";
          }
          b uob = new b("2.0.0", str, "over_limit_thread", mInitTotal, pair.getFirst().intValue(), Process.myPid(), mMonitorBegi, System.currentTimeMillis(), 0, mInitThreadD, pair.getSecond());
          String str1 = gson.q(v13);
          a.h(str1, "Gson\(\).toJson\(\n        g¡­orBegin\n        \)\n      \)");
          Objects.requireNonNull(companion);
          a.q("over_limit", "type");
          a.q(str1, "msg");
          StringBuilder str2 = "onReport "+"over_limit"+", ";
          boolean b = (!str1.length())? true: false;
          h.d("ThreadMonitor", str2+b);
          d$a.c(i.a, "over_limit", str1, false, 4, null);
       }
       return;
    }
    public final void endCollect(){
       this.getLoopHandler().post(new ThreadMonitor$b(this));
    }
    public long getLoopInterval(){
       return this.getMonitorConfig().a;
    }
    public final long getMMonitorBegin(){
       return this.mMonitorBegin;
    }
    public final d getMThreadBlockChecker(){
       return this.mThreadBlockChecker$delegate.getValue();
    }
    public final boolean handleNativeInit(){
       boolean b = false;
       if (this.getMonitorConfig().o != null) {
          return b;
       }
       ThreadMonitor$a companion = ThreadMonitor.Companion;
       if (!companion.a()) {
          return b;
       }
       h.d("ThreadMonitor", "koom init");
       if (!t.a("koom-thread")) {
          return b;
       }
       NativeHandler.getInstance().setNativeCallback(this.mNativeCallback);
       NativeHandler.getInstance().setILogHelper(this.getMonitorConfig().u);
       NativeHandler.getInstance().enableSigSegvProtection();
       if (this.getMonitorConfig().c != null) {
          NativeHandler.getInstance().disableNativeStack();
       }
       if (this.getMonitorConfig().d != null) {
          NativeHandler.getInstance().disableJavaStack();
       }
       if (this.getMonitorConfig().e != null) {
          NativeHandler.getInstance().enableNativeLog();
       }
       if (this.getMonitorConfig().f != null) {
          NativeHandler.getInstance().enableThreadAddCustomLog();
       }
       g og = (this.getMonitorConfig().p.length() > 0)? 1: null;
       if (og) {
          NativeHandler.getInstance();
       }
       if (this.getMonitorConfig().q.length() > 0) {
          b = true;
       }
       if (b) {
          NativeHandler.getInstance().setProcName(this.getMonitorConfig().q);
       }
       NativeHandler.getInstance().setThreadAddTraceReportArgs(this.getMonitorConfig().r, this.getMonitorConfig().t, this.getMonitorConfig().s);
       NativeHandler.getInstance().setThreadLeakDelay(this.getMonitorConfig().h);
       NativeHandler.getInstance().start();
       Objects.requireNonNull(companion);
       i.a.f("{\"leakType\": \"detach_leak_inited\"}", 12);
       return true;
    }
    public final void handleThreadLeak(){
       if (this.getMonitorConfig().g > null && !(this.mLoopTimes % (long)this.getMonitorConfig().g)) {
          NativeHandler.getInstance().refresh();
       }
       return;
    }
    public final void handleThreadThreshold(){
       String str = "ThreadMonitor";
       h.d(str, "handleThreadPoll");
       if (this.mThreadThresholdLimit <= null) {
          return;
       }
       if (this.getMonitorConfig().k > null && !(this.mLoopTimes % (long)this.getMonitorConfig().k) - null) {
          x c = u.b().c;
          h.d(str, "handleThreadPoll Thread size:"+c+" thread_over_threshold_count:"+this.mThreadThresholdLimit);
          if (c - (long)this.mThreadThresholdLimit > 0) {
             h.d(str, "reportThreadData");
             this.doReportThread();
             this.mThreadThresholdLimit = (this.getMonitorConfig().j > null)? this.mThreadThresholdLimit + this.getMonitorConfig().j: 0;
          }
       }
    label_0077 :
       return;
    }
    public void init(d p0,g p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       super.init(p0, p1);
       this.mThreadThresholdLimit = p1.i;
       Pair pair = d.a();
       this.mInitThreadData = pair.getSecond();
       this.mInitTotal = pair.getFirst().intValue();
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public final void report(long p0){
       h.d("ThreadMonitor", "report start "+p0);
       this.getLoopHandler().postDelayed(new ThreadMonitor$d(this), p0);
    }
    public final void startCollect(String p0){
       a.q(p0, "mode");
       this.getLoopHandler().post(new ThreadMonitor$e(this, p0));
    }
    public void stopLoop(){
       this.mIsRunning = false;
       super.stopLoop();
    }
    public final void test(){
       NativeHandler.getInstance().test();
    }
}
