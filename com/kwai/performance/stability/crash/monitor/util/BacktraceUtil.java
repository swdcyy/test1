package com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.kwai.apm.message.FastUnwindBackTraceElement;
import java.lang.StackTraceElement;
import java.lang.Thread;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.RuntimeException;
import java.lang.Exception;
import java.util.ArrayList;
import java.lang.Boolean;
import com.kwai.apm.message.FastUnwindBacktrace;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil$ThreadStateAndLockInfo;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import android.os.SystemClock;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.stability.crash.monitor.message.BackTraceStatistics;

public class BacktraceUtil	// class@000e41
{
    public static boolean a;
    public static FastUnwindBackTraceElement b;
    public static final Set c;
    public static final Set d;
    public static final Map e;

    static {
       BacktraceUtil.c = new CopyOnWriteArraySet();
       BacktraceUtil.d = new CopyOnWriteArraySet();
       BacktraceUtil.e = new HashMap();
    }
    public void BacktraceUtil(){
       super();
    }
    public static native FastUnwindBackTraceElement[] FrameInfoToNativeTrace(String p0);
    public static native StackTraceElement[] FrameInfoToTrace(String p0);
    public static native String GetThreadFrameInfo(Object p0,boolean p1,boolean p2,boolean p3);
    public static native int GetThreadNativeTid(Thread p0);
    public static native void HookLogMessage();
    public static native void HookUnwind();
    public static native int InitUtil();
    public static native boolean UnwindTraceElement(FastUnwindBackTraceElement p0);
    public static Object[] a(String p0){
       StackTraceElement[] stackTraceEl = BacktraceUtil.FrameInfoToTrace(p0);
       int i = 0;
       if (stackTraceEl == null) {
          b.c().b(new RuntimeException("BacktraceUtil.frameInfoToTraceElements fail"));
          StackTraceElement[] stackTraceEl1 = new StackTraceElement[i];
          return stackTraceEl1;
       }else {
          ArrayList uArrayList = new ArrayList();
          FastUnwindBackTraceElement[] uFastUnwindB = BacktraceUtil.FrameInfoToNativeTrace(p0);
          if (uFastUnwindB != null) {
             int len = uFastUnwindB.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = uFastUnwindB[i1];
                if (oobject.hasUnwind != null) {
                   uArrayList.add(oobject);
                }
                i1 = i1 + 1;
             }
          }
          int len1 = stackTraceEl.length;
          while (i < len1) {
             object oobject1 = stackTraceEl[i];
             if (oobject1.getMethodName() != null && !(oobject1.getMethodName()).isEmpty()) {
                uArrayList.add(oobject1);
             }
             i = i + 1;
          }
          return uArrayList.toArray();
       }
    }
    public static String b(Thread p0,Boolean p1,Boolean p2,Boolean p3){
       boolean b;
       if (!BacktraceUtil.a) {
          return null;
       }
       if (p1 == null) {
          b = (p0 == Thread.currentThread())? true: false;
          b = Boolean.valueOf(b);
       }
       return BacktraceUtil.GetThreadFrameInfo(p0, b.booleanValue(), p2.booleanValue(), p3.booleanValue());
    }
    public static BacktraceUtil$ThreadStateAndLockInfo c(FastUnwindBacktrace p0){
       if (p0 == null || (p0.threadDumpStr).isEmpty()) {
          return null;
       }
       if ((p0.threadStateStr).isEmpty()) {
          String str = (p0.threadDumpStr).substring(0, (p0.threadDumpStr).indexOf(",Thread"));
          p0.threadStateStr = str.substring((str.lastIndexOf(",") + 1));
       }
       try{
          BacktraceUtil$ThreadStateAndLockInfo threadStateA = new BacktraceUtil$ThreadStateAndLockInfo();
          threadStateA.threadState = p0.threadStateStr;
          if (Build$VERSION.SDK_INT >= 28) {
             threadStateA.tid = p0.threadId;
             threadStateA.lockClassName = p0.lockType;
          }else {
             String[] stringArray = (p0.lockMsg).split("held by thread");
             String str1 = (stringArray[(stringArray.length - 1)]).trim();
             threadStateA.tid = Integer.parseInt(str1);
             threadStateA.threadState = "Blocked";
             int i = (p0.lockMsg).indexOf("\(a ") + 3;
             int i1 = (p0.lockMsg).indexOf("\)");
             if (i > 0 && i1 > i) {
                threadStateA.lockClassName = (p0.lockMsg).substring(i, i1);
             }
          }
          return threadStateA;
       }catch(java.lang.Exception e0){
       }
    }
    public static int d(){
       BacktraceUtil.a = true;
       return BacktraceUtil.InitUtil();
    }
    public static boolean e(FastUnwindBackTraceElement p0){
       return BacktraceUtil.UnwindTraceElement(p0);
    }
    public static List f(List p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FastUnwindBackTraceElement uFastUnwindB = iterator.next();
          if (uFastUnwindB.hasUnwind != null) {
             uArrayList.add(uFastUnwindB);
          }else {
             Set d = BacktraceUtil.d;
             boolean b = true;
             if (d.contains(uFastUnwindB)) {
                uFastUnwindB.isIgnore = b;
             }else if(uFastUnwindB.isEmpty()){
                uFastUnwindB.isIgnore = b;
             }else {
                Set c = BacktraceUtil.c;
                if (c.contains(uFastUnwindB)) {
                   Iterator iterator1 = c.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         FastUnwindBackTraceElement uFastUnwindB1 = iterator1.next();
                         if (uFastUnwindB1.equals(uFastUnwindB)) {
                            uFastUnwindB.updateTraceInfo(uFastUnwindB1);
                            uFastUnwindB.hasUnwind = b;
                            uFastUnwindB1.lastUpdateTime = uFastUnwindB.updateTime;
                            uArrayList.add(uFastUnwindB);
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                   return uArrayList;
                }else {
                   e.p().put("traceElement", uFastUnwindB.toString());
                   long l = SystemClock.elapsedRealtimeNanos() - SystemClock.elapsedRealtimeNanos();
                   BackTraceStatistics.getQualityStatistics().updateUnwindTime(uFastUnwindB, l);
                   if (BacktraceUtil.e(uFastUnwindB)) {
                      uFastUnwindB.hasUnwind = b;
                      c.add(uFastUnwindB);
                      uArrayList.add(uFastUnwindB);
                   }else {
                      uFastUnwindB.isIgnore = b;
                      d.add(uFastUnwindB);
                      BackTraceStatistics.getQualityStatistics().addUnwindFailTrace(uFastUnwindB);
                   }
                }
             }
          }
       }
    }
}
