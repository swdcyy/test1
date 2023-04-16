package com.kwai.sdk.eve.internal.pack.EvePackageManager$h;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import tn7.b;
import qrd.l1;
import kotlin.jvm.internal.a;
import qn7.a;
import ekd.k1;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import tn7.c;
import java.lang.Iterable;
import xn7.b;
import com.kwai.sdk.eve.internal.statistics.EveLogger;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;

public final class EvePackageManager$h implements Runnable	// class@001585
{
    public final EvePackageManager b;

    public void EvePackageManager$h(EvePackageManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       b uob;
       b uob1;
       EvePackageManager uEvePackageM = EvePackageManager.class;
       if (PatchProxy.applyVoidWithListener(null, this, EvePackageManager$h.class, "1")) {
          return;
       }
       EvePackageManager$h tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uEvePackageM, "23")) {
          EvePackageManager g = tb.g;
          _monitor_enter(g);
          EveLog.i$default("EPM#dropTaskPackageIfNeed : ", false, 2, null);
          iterator = tb.g.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             uob1 = uEntry.getValue().d();
             if (uob1 != null) {
                tb.x(uob1);
             }
          }
          _monitor_exit(g);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uEvePackageM, "22")) {
          uEvePackageM = tb.o;
          if (uEvePackageM == null) {
             a.S("mPackConfig");
          }
          if (uEvePackageM.a == null) {
             EveLog.i$default("EPM#dropOutDatedPackageIfNeed disable", false, 2, null);
          }else if(k1.t(tb.e) - (long)0x5265c00 >= 0){
             EveLog.i$default("EPM#dropOutDatedPackageIfNeed since lastInitTime\("+tb.e+"\) over 24h", false, 2, null);
          }else {
             uEvePackageM = tb.g;
             _monitor_enter(uEvePackageM);
             EveLog.i$default("EPM#dropOutDatedPackageIfNeed : ", false, 2, null);
             ArrayList uArrayList = new ArrayList();
             iterator = tb.g.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                key = uEntry.getKey();
                Iterator iterator1 = c.b(uEntry.getValue()).iterator();
                while (iterator1.hasNext()) {
                   uob = iterator1.next();
                   if (k1.t(uob.lastVisitTime) - (long)0x240c8400 >= 0) {
                      EveLog.i$default("EPM#dropOutDatedPackageIfNeed : "+uob+" lastVisitTime "+uob.lastVisitTime+", add into dropList", false, 2, null);
                      uArrayList.add(uob);
                   }
                }
             }
             Iterator iterator2 = uArrayList.iterator();
             EvePackageManager uEvePackageM1 = null;
             while (iterator2.hasNext()) {
                uob1 = iterator2.next();
                uob = b.a;
                Objects.requireNonNull(uob);
                if (!PatchProxy.applyVoidOneRefs(uob1, uob, b.class, "1")) {
                   a.p(uob1, "pack");
                   EveLogger.INSTANCE.logCustomEvent("EVE_PACK_OUTDATED", uob.b(uob1));
                }
                uob = uob1.d();
                b uob2 = uob1.c();
                if (tb.q(uob1)) {
                   if (a.g(tb.g.get(uob1.taskId), uob1)) {
                      if (uob2 != null) {
                         tb.g.put(uob1.taskId, uob2);
                         EveLog.i$default("EPM#dropOutDatedPackageIfNeed : change map value of "+uob1.taskId+" from "+uob1+" to "+uob2, false, 2, null);
                      }else if(uob != null){
                         tb.g.put(uob1.taskId, uob);
                         EveLog.i$default("EPM#dropOutDatedPackageIfNeed : change map value of "+uob1.taskId+" from "+uob1+" to "+uob, false, 2, null);
                      }else {
                         tb.g.remove(uob1.taskId);
                         EveLog.i$default("EPM#dropOutDatedPackageIfNeed : final task "+uob1+" drop, remove key "+uob1.taskId+" from map", false, 2, null);
                      }
                   }
                }else if(uob1.usingStatus != 2){
                   uob1.usingStatus = 2;
                }
                uEvePackageM1 = 1;
             }
             if (uEvePackageM1 != null) {
                tb.u();
             }
             _monitor_exit(uEvePackageM);
          }
       }
       PatchProxy.onMethodExit(EvePackageManager$h.class, "1");
       return;
    }
}
