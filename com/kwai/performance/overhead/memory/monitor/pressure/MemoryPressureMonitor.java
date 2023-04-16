package com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$b;
import nsd.u;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$c;
import java.lang.Object;
import java.util.Objects;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;
import java.util.LinkedList;
import android.app.Application;
import yf7.k;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$a;
import android.content.ComponentCallbacks;
import java.lang.String;
import yf7.h;
import android.app.ActivityManager$RunningAppProcessInfo;
import kotlin.Result;
import android.app.ActivityManager;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import android.app.ActivityManager$MemoryInfo;
import kotlin.TypeCastException;
import android.os.Debug;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$2;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$evaluateMemoryPressure$7;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$d;
import com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$updateMemoryState$2;

public final class MemoryPressureMonitor	// class@00116d
{
    public MemoryPressureMonitor$State a;
    public final LinkedList b;
    public static final MemoryPressureMonitor c;
    public static final MemoryPressureMonitor$b d;

    static {
       MemoryPressureMonitor.d = new MemoryPressureMonitor$b(null);
       Objects.requireNonNull(MemoryPressureMonitor$c.b);
       MemoryPressureMonitor.c = MemoryPressureMonitor$c.a;
    }
    public void MemoryPressureMonitor(){
       super();
       this.a = MemoryPressureMonitor$State.NORMAL_MEMORY;
       this.b = new LinkedList();
       k.b().registerComponentCallbacks(new MemoryPressureMonitor$a(this));
    }
    public void MemoryPressureMonitor(u p0){
       super();
       this.a = MemoryPressureMonitor$State.NORMAL_MEMORY;
       this.b = new LinkedList();
       k.b().registerComponentCallbacks(new MemoryPressureMonitor$a(this));
    }
    public final void a(){
       long l1;
       MemoryPressureMonitor memoryPressu = this;
       if (memoryPressu.a != MemoryPressureMonitor$State.LOW_MEMORY) {
          return;
       }
       String str = "PLATFORM.MemoryPressure";
       h.d(str, "evaluateMemoryPressure");
       ActivityManager$RunningAppProcessInfo runningAppPr = new ActivityManager$RunningAppProcessInfo();
       ActivityManager.getMyMemoryState(runningAppPr);
       Throwable obj = Result.constructor-impl(l1.a);
       if (Result.isSuccess-impl(obj)) {
          ActivityManager$RunningAppProcessInfo lastTrimLeve = runningAppPr.lastTrimLevel;
          if (lastTrimLeve >= 20 || lastTrimLeve == 5) {
             Monitor_ThreadKt.f(new MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$1(memoryPressu, runningAppPr));
             return;
          }
       }
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          h.b(str, obj.toString());
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       Object systemServic = k.b().getSystemService("activity");
       if (systemServic != null) {
          systemServic.getMemoryInfo(memoryInfo);
          systemServic = Result.constructor-impl(l1.a);
          if (Result.isSuccess-impl(systemServic) && memoryInfo.lowMemory == null) {
             ActivityManager$MemoryInfo availMem = memoryInfo.availMem;
             ActivityManager$MemoryInfo threshold = memoryInfo.threshold;
             long l = 0x1f400000;
             if (threshold - l > 0) {
                threshold = l;
             }
             long pss = Debug.getPss();
             l1 = pss / 0x7d000;
             if (l1) {
                pss = (!l1 - 1)? pss / (long)2: pss / (long)3;
                l = pss * 1024;
             }
             if (availMem - (threshold + l) > 0) {
                Monitor_ThreadKt.f(new MemoryPressureMonitor$evaluateMemoryPressure$$inlined$onSuccess$lambda$2(memoryPressu, memoryInfo));
                return;
             }
          }
       label_00ce :
          obj = Result.exceptionOrNull-impl(systemServic);
          if (obj != null) {
             h.b(str, obj.toString());
          }
          Monitor_ThreadKt.a(0x7530, new MemoryPressureMonitor$evaluateMemoryPressure$7(memoryPressu));
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
       }
    }
    public final void b(MemoryPressureMonitor$State p0){
       h.d("PLATFORM.MemoryPressure", "update memory state: "+p0);
       if (this.a == p0) {
          return;
       }
       this.a = p0;
       MemoryPressureMonitor tb = this.b;
       _monitor_enter(tb);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.a);
       }
       _monitor_exit(tb);
       if (p0 != MemoryPressureMonitor$State.LOW_MEMORY) {
          return;
       }
       Monitor_ThreadKt.a(0x7530, new MemoryPressureMonitor$updateMemoryState$2(this));
       return;
    }
}
