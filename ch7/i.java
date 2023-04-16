package ch7.i;
import com.google.gson.Gson;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.lang.System;
import java.lang.Runtime;
import java.lang.StringBuilder;
import yf7.h;
import android.os.Debug$MemoryInfo;
import android.os.Debug;
import dh7.c;
import java.util.Map;
import ch7.d;
import java.lang.Integer;
import java.lang.Float;
import jh7.c;
import ch7.f;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import ch7.i$b;
import java.util.Iterator;
import java.util.List;
import dh7.b;
import dh7.d;
import ch7.e;
import java.lang.Runnable;
import java.lang.Long;
import android.os.Process;
import java.lang.Thread;
import ch7.i$a;
import jh7.a;
import yf7.i;

public class i	// class@00055b
{
    public Application a;
    public final List b;
    public long c;
    public long d;
    public d e;
    public Map f;
    public static final Gson g;
    public static i h;

    static {
       i.g = new Gson();
    }
    public void i(){
       super();
       this.b = new ArrayList();
       this.c = 0;
       this.d = 0;
       this.f = new HashMap();
    }
    public static long c(String p0){
       Runtime.getRuntime().gc();
       Runtime.getRuntime().runFinalization();
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       h.d("LeakFixer", p0+" force gc cost "+l);
       return l;
    }
    public static i d(){
       if (i.h == null) {
          i.h = new i();
       }
       return i.h;
    }
    public static Debug$MemoryInfo e(){
       Debug$MemoryInfo memoryInfo = new Debug$MemoryInfo();
       Debug.getMemoryInfo(memoryInfo);
       return memoryInfo;
    }
    public static long f(){
       return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }
    public final void a(String p0,c p1){
       if (this.f.isEmpty()) {
          return;
       }
       c c = p1.c;
       if (c != null) {
          this.f.put("trimMemoryLevel", c);
       }
       c = p1.b;
       if (c != null) {
          this.f.put("heapRatio", c);
       }
       c = p1.d;
       if (c != null) {
          this.f.put("reason", c);
       }
       this.f.put("level", p1.a);
       this.f.put("tag", p0);
       i te = this.e;
       if (te != null) {
          this.f.put("forceGCTrimMemoryLevel", Integer.valueOf(te.i));
          this.f.put("forceGcHeapRatio", Float.valueOf(this.e.h));
          this.f.put("lowMemoryToFixMinInterval", Integer.valueOf(this.e.f));
       }
       this.o(this.f);
       this.f = new HashMap();
       return;
    }
    public void b(c p0){
       Monitor_ThreadKt.a(0, new f(p0));
    }
    public final void g(String p0,c p1,boolean p2){
       this.d = System.currentTimeMillis();
       long l = i.f();
       long l1 = this.h(p1.a);
       this.j(l1, l, i.e());
       h.d("LeakFixer", p0+" to fixer cost "+l1+", info "+p1);
       if (p2) {
          long l2 = i.c(p0);
          l1 = l1 + l2;
          this.k(l2, l);
       }
       this.a(p0, p1);
       l = l - i.f();
       h.d("LeakFixer", "onLowMemoryToFix\(\) | Info = "+p1+", Cost = "+l1+", Free = "+l);
       d b = this.e.b;
       if (b != null) {
          b.a(l1, l);
       }
       return;
    }
    public final long h(LowMemoryLevel p0){
       long l = System.currentTimeMillis();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof d) {
             c.c(new e(this, uob, p0));
          }
       }
       return (System.currentTimeMillis() - l);
    }
    public void i(String p0,LowMemoryLevel p1){
       i oi = this;
       LowMemoryLevel lowMemoryLev = p1;
       c uoc = new c(lowMemoryLev, p0);
       Debug$MemoryInfo memoryInfo = i.e();
       long l = i.f();
       String str = ", Free = ";
       long l1 = 0;
       if (oi.e == null) {
          if (lowMemoryLev == LowMemoryLevel.LEVEL5) {
             long l2 = i.c("onManualRun");
             l1 = l1 + l2;
             oi.l(l2, l);
             oi.a("onManualRun", uoc);
             h.d("LeakFixer", "onLowMemoryToFix\(\) | Info = "+uoc+", Cost = "+l1+str+(l - i.f())+" | Without config but level = "+lowMemoryLev);
          }
          return;
       }else {
          d long l3 = oi.h(lowMemoryLev);
          long l4 = l3 + l1;
          long l5 = l3;
          long l6 = l5;
          long l7 = l5;
          this.j(l6, l, memoryInfo);
          h.d("LeakFixer", "onManualRun"+" to fixer cost "+l7+", info "+uoc);
          l3 = i.c("onManualRun");
          l1 = l4 + l3;
          oi.k(l3, l);
          oi.a("onManualRun", uoc);
          l = l - i.f();
          h.d("LeakFixer", "onLowMemoryToFix\(\) | Info = "+uoc+", Cost = "+l1+str+l);
          l3 = oi.e.b;
          if (l3 != null) {
             l3.a(l1, l);
          }
          return;
       }
    }
    public final void j(long p0,long p1,Debug$MemoryInfo p2){
       i oi = (this.e.l & 0x02)? 1: null;
       if (oi) {
          this.f.put("cost", Long.valueOf(p0));
          this.f.put("fixFree", Long.valueOf((p1 - i.f())));
          this.f.put("before", p2);
          this.f.put("afterFix", i.e());
       }
       return;
    }
    public final void k(long p0,long p1){
       int i = 1;
       if (this.e.l & i) {
       }else {
          i = 0;
       }
       if (i) {
          this.l(p0, p1);
       }
       return;
    }
    public final void l(long p0,long p1){
       this.f.put("gcCost", Long.valueOf(p0));
       this.f.put("gcFree", Long.valueOf((p1 - i.f())));
       this.f.put("afterGc", i.e());
    }
    public final void m(String p0,Integer p1,Float p2){
       Debug$MemoryInfo memoryInfo = (this.e.l & 0x04)? 1: null;
       if (memoryInfo) {
          memoryInfo = i.e();
          if (p1 != null) {
             this.f.put("level", p1);
          }
          if (p2 != null) {
             this.f.put("heapRatio", p2);
          }
          this.f.put("memory", memoryInfo);
          this.f.put("tag", p0);
          this.o(this.f);
       }
       return;
    }
    public final void n(long p0){
       this.f.put("taskAddAt", Long.valueOf(p0));
       this.f.put("taskAddDiff", Long.valueOf((System.currentTimeMillis() - p0)));
    }
    public final void o(Map p0){
       d a;
       p0.put("maxMemory", Long.valueOf(Runtime.getRuntime().maxMemory()));
       p0.put("totalMemory", Long.valueOf(Runtime.getRuntime().totalMemory()));
       p0.put("freeMemory", Long.valueOf(Runtime.getRuntime().freeMemory()));
       p0.put("usedMemory", Long.valueOf(i.f()));
       p0.put("pid", Integer.valueOf(Process.myPid()));
       Thread thread = Thread.currentThread();
       p0.put("threadId", Long.valueOf(thread.getId()));
       p0.put("threadName", thread.getName());
       i te = this.e;
       if (te != null) {
          a = te.a;
          if (a != null) {
             p0.putAll(a.a());
          }
       }
       p0.putAll(a.c());
       a.c().clear();
       i.a.e("leakfix.lowerMemoryToFix", i.g.q(p0), false);
       return;
    }
}
