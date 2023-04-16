package com.kuaishou.live.basic.performance.biz.PerfStatExecutor;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor$a;
import nsd.u;
import java.lang.Object;
import l51.a;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor$StatPeriod;
import java.lang.System;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Map$Entry;
import l51.a$a;
import com.kwai.feature.api.live.base.service.perf.LivePerfBizInfo;
import l51.a$b;
import java.lang.Long;
import kotlin.Pair;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Number;

public abstract class PerfStatExecutor	// class@000cf1
{
    public long a;
    public a b;
    public String c;
    public WeakReference d;
    public static final PerfStatExecutor$a e;

    static {
       PerfStatExecutor.e = new PerfStatExecutor$a(null);
    }
    public void PerfStatExecutor(){
       super();
       this.b = new a();
    }
    public final PerfStatExecutor$b a(){
       a$a uoa;
       PerfStatExecutor perfStatExec = PerfStatExecutor.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PerfStatExecutor obj = PatchProxy.apply(objArray, this, perfStatExec, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       PerfStatExecutor$StatPeriod statPeriod = PatchProxy.apply(objArray, this, perfStatExec, "7");
       if (statPeriod != patchProxyRe) {
       }else {
          statPeriod = new PerfStatExecutor$StatPeriod(this.a, System.currentTimeMillis());
       }
       this.a = statPeriod.endTime;
       obj = this.b;
       Objects.requireNonNull(obj);
       List list = PatchProxy.apply(objArray, obj, a.class, "3");
       if (list != patchProxyRe) {
       }else {
          Set set = obj.a.entrySet();
          a.o(set, "startedBizMap.entries");
          int i = 10;
          ArrayList uArrayList = new ArrayList(u.Y(set, i));
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             uoa = new a$a(uEntry.getKey().a(), uEntry.getValue().b(), null, uEntry.getKey().b());
             uArrayList.add(v14);
          }
          a b = obj.b;
          ArrayList uArrayList1 = new ArrayList(u.Y(b, i));
          iterator = b.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             uoa = new a$a(pair.getFirst().a(), pair.getSecond().b(), pair.getSecond().b, pair.getFirst().b());
             uArrayList1.add(v14);
          }
          if (!PatchProxy.applyVoid(objArray, obj, a.class, "4")) {
             obj.b.clear();
          }
          list = CollectionsKt___CollectionsKt.m4(uArrayList, uArrayList1);
       }
       PerfStatExecutor tc = this.c;
       if (tc == null) {
          a.S("liveStreamId");
       }
       return new PerfStatExecutor$b(tc, statPeriod, list);
    }
    public final Activity b(){
       PerfStatExecutor obj = PatchProxy.apply(null, this, PerfStatExecutor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("activityWeakRef");
       }
       return obj.get();
    }
    public final long c(){
       Object obj = PatchProxy.apply(null, this, PerfStatExecutor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() - this.a);
    }
    public abstract void d(long p0);
    public abstract void e();
    public final void f(){
       if (PatchProxy.applyVoid(null, this, PerfStatExecutor.class, "2")) {
          return;
       }
       this.e();
       return;
    }
}
