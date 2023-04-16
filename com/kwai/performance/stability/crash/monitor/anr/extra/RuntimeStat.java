package com.kwai.performance.stability.crash.monitor.anr.extra.RuntimeStat;
import java.io.Serializable;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import java.lang.Long;
import android.os.Build$VERSION;
import android.os.SystemClock;
import android.os.Debug;

public class RuntimeStat implements Serializable	// class@0011cb
{
    public long dispatchToken;
    public long firstUpdate;
    public long idleToken;
    public RuntimeStat last;
    public long lastUpdate;
    public Map stats;
    public int updateCount;
    public static RuntimeStat b;
    public static final Map sNameMap;

    static {
       HashMap hashMap = new HashMap();
       RuntimeStat.sNameMap = hashMap;
       hashMap.put("art.gc.gc-count", "gcCount");
       hashMap.put("art.gc.gc-time", "gcTime");
       hashMap.put("art.gc.bytes-allocated", "byteAlloc");
       hashMap.put("art.gc.bytes-freed", "byteFree");
       hashMap.put("art.gc.blocking-gc-count", "blockingGcCount");
       hashMap.put("art.gc.blocking-gc-time", "blockingGcTime");
       hashMap.put("art.gc.objects-allocated", "objAlloc");
       hashMap.put("art.gc.total-time-waiting-for-gc", "preOomGc");
       hashMap.put("art.gc.pre-oome-gc-count", "waitingForGc");
    }
    public void RuntimeStat(){
       super();
       this.stats = new HashMap();
       this.updateCount = -1;
       this.firstUpdate = -1;
       this.lastUpdate = -1;
       this.dispatchToken = -1;
       this.idleToken = -1;
    }
    public static void c(RuntimeStat p0,RuntimeStat p1,boolean p2){
       Iterator iterator = p0.stats.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Long longx = p0.a(str);
          if (p2 && p1.stats.containsKey(str)) {
             Long longx1 = p1.stats.get(str);
             if (longx1 != null && longx1.longValue() - -1) {
                long l = longx.longValue() + longx1.longValue();
                longx = Long.valueOf(l);
             }
          }
          p1.b(str, longx);
       }
       return;
    }
    public final Long a(String p0){
       return this.stats.get(p0);
    }
    public void afterSyncToTarget(){
       this.clearDiff();
    }
    public final void b(String p0,Long p1){
       this.stats.put(p0, p1);
    }
    public void clearAll(){
       this.clearDiff();
       this.firstUpdate = -1;
       this.lastUpdate = -1;
       RuntimeStat tlast = this.last;
       if (tlast != null) {
          tlast.clearAll();
       }
       return;
    }
    public void clearDiff(){
       this.stats.clear();
       this.updateCount = -1;
    }
    public RuntimeStat copy(){
       RuntimeStat runtimeStat = new RuntimeStat();
       runtimeStat.update(this);
       return runtimeStat;
    }
    public void update(RuntimeStat p0){
       RuntimeStat.c(p0, this, true);
       RuntimeStat tupdateCount = this.updateCount;
       this.updateCount = (tupdateCount == -1)? p0.updateCount: tupdateCount + p0.updateCount;
       this.firstUpdate = p0.firstUpdate;
       this.lastUpdate = p0.lastUpdate;
       if (p0.last != null) {
          if (this.last == null) {
             this.last = new RuntimeStat();
          }
          RuntimeStat.c(p0.last, this.last, false);
       }
       return;
    }
    public void updateStat(long p0,long p1,boolean p2){
       RuntimeStat tupdateCount;
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       RuntimeStat runtimeStat = null;
       RuntimeStat tdispatchTok = this.dispatchToken;
       int i = 1;
       if (tdispatchTok - -1 && tdispatchTok - p0) {
          runtimeStat = 1;
       }
       tdispatchTok = this.idleToken;
       if (tdispatchTok - -1 && tdispatchTok - p1) {
          runtimeStat = 1;
       }
       this.dispatchToken = p0;
       this.idleToken = p1;
       p0 = SystemClock.elapsedRealtime();
       this.lastUpdate = p0;
       if (p2) {
          if (runtimeStat) {
             this.clearAll();
          }
          tupdateCount = this.updateCount;
          this.updateCount = (tupdateCount == -1)? i: tupdateCount + i;
          if (!this.firstUpdate - -1) {
             this.firstUpdate = p0;
          }
       }
       if (p2) {
          if (this.last == null) {
             tupdateCount = new RuntimeStat();
             this.last = tupdateCount;
             if (!tupdateCount.firstUpdate - -1) {
                tupdateCount.firstUpdate = p0;
             }
             tupdateCount.lastUpdate = p0;
          }
       }else if(RuntimeStat.b == null){
          tupdateCount = new RuntimeStat();
          RuntimeStat.b = tupdateCount;
          if (!tupdateCount.firstUpdate - -1) {
             tupdateCount.firstUpdate = p0;
          }
          tupdateCount.lastUpdate = p0;
       }
       RuntimeStat tlast = (p2)? this.last: RuntimeStat.b;
       Map runtimeStats = Debug.getRuntimeStats();
       Iterator iterator = runtimeStats.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Map sNameMap = RuntimeStat.sNameMap;
          if (!sNameMap.containsKey(str)) {
             continue ;
          }else {
             String str1 = runtimeStats.get(str);
             if (str1 == null || !str1.length()) {
                continue ;
             }else {
                str = sNameMap.get(str);
                long l = Long.parseLong(str1);
                Long longx = tlast.a(str);
                tlast.b(str, Long.valueOf(l));
                Long longx1 = this.a(str);
                if (longx != null && longx.longValue() - -1) {
                   if (longx1 == null || !longx1.longValue() - -1) {
                      l = l - longx.longValue();
                      longx = Long.valueOf(l);
                   }else {
                      l = l - longx.longValue();
                      long l1 = longx1.longValue() + l;
                      longx = Long.valueOf(l1);
                   }
                   this.b(str, longx);
                }
             }
          }
       }
       return;
    }
}
