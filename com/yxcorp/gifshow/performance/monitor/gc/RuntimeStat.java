package com.yxcorp.gifshow.performance.monitor.gc.RuntimeStat;
import java.io.Serializable;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import android.os.Debug;
import java.util.Set;
import java.util.Iterator;

public class RuntimeStat implements Serializable	// class@000e7b
{
    public boolean isUpdated;
    public RuntimeStat lastStat;
    public Map stats;
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
       this.isUpdated = false;
    }
    public final Long a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RuntimeStat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.stats.get(p0);
    }
    public final void b(String p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RuntimeStat.class, "2")) {
          return;
       }
       this.stats.put(p0, p1);
       return;
    }
    public void clearStat(){
       if (PatchProxy.applyVoid(null, this, RuntimeStat.class, "4")) {
          return;
       }
       this.stats.clear();
       return;
    }
    public Map getStats(){
       return this.stats;
    }
    public boolean hasUpdated(){
       return this.isUpdated;
    }
    public RuntimeStat updateRuntimeStat(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, RuntimeStat.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return objArray;
       }
       this.isUpdated = true;
       if (this.lastStat == null) {
          this.lastStat = new RuntimeStat();
       }
       obj = Debug.getRuntimeStats();
       Iterator iterator = obj.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Map sNameMap = RuntimeStat.sNameMap;
          if (!sNameMap.containsKey(str)) {
             continue ;
          }else {
             String str1 = obj.get(str);
             if (str1 == null || !str1.length()) {
                continue ;
             }else {
                str = sNameMap.get(str);
                long l = Long.parseLong(str1);
                Long longx = this.lastStat.a(str);
                this.lastStat.b(str, Long.valueOf(l));
                if (longx != null) {
                   l = l - longx.longValue();
                   this.b(str, Long.valueOf(l));
                }
             }
          }
       }
       return this.lastStat;
    }
}
