package com.kwai.component.misc.livestatusquery.v2.LiveStatusQueryManagerV3;
import com.kwai.component.misc.livestatusquery.v2.a;
import com.kwai.component.misc.livestatusquery.v2.LiveEndStatusCheckV3Config;
import sc5.d;
import java.lang.String;
import com.kwai.component.misc.livestatusquery.LiveCheckStatusConfig;
import java.lang.Object;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import tc5.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import tc5.a;
import java.util.Collection;
import ekd.q;
import java.lang.Throwable;
import java.lang.System;
import java.lang.Integer;
import m56.f;
import com.kwai.component.misc.livestatusquery.v2.LiveStatusQueryManagerV3$QueryStrategy;
import java.lang.Number;
import com.kwai.component.misc.livestatusquery.v2.LiveStatusQueryManagerV3$a;
import java.lang.Enum;
import java.lang.Math;
import com.google.common.collect.ImmutableMap$b;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import tc5.l;
import erd.g;
import tc5.m;
import erd.o;
import tc5.j;
import tc5.k;
import crd.b;

public class LiveStatusQueryManagerV3 extends a	// class@0009d2
{
    public final LiveEndStatusCheckV3Config i;
    public LiveStatusQueryManagerV3$QueryStrategy j;
    public long k;
    public static LiveStatusQueryManagerV3 l;

    public void LiveStatusQueryManagerV3(){
       super();
       this.i = d.d();
       d.d("LiveStatusQueryManagerV3", "create LiveStatusQueryManagerV3", ImmutableMap.of("liveEndStatusCheckV3Config", this.b.toString()));
    }
    private boolean n(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveStatusQueryManagerV3 liveStatusQu = LiveStatusQueryManagerV3.class;
       a obj = PatchProxy.apply(null, this, liveStatusQu, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = true;
       if (obj.mEnableCheckLiveStatus != null && obj.mMaxRequestBatchSize > null) {
          Object obj1 = PatchProxy.apply(null, this, liveStatusQu, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             Iterator iterator = this.a.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (!q.f(iterator.next().a())) {
                      b1 = true;
                   }
                }else {
                   b1 = false;
                }
             }
             return b;
          }
          if (b1) {
             goto label_0052 ;
          }
       }
    label_0051 :
       b = false;
       goto label_0052 ;
    }
    public static LiveStatusQueryManagerV3 q(){
       Object obj = PatchProxy.apply(null, null, LiveStatusQueryManagerV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LiveStatusQueryManagerV3.l == null) {
          LiveStatusQueryManagerV3.l = new LiveStatusQueryManagerV3();
       }
       return LiveStatusQueryManagerV3.l;
    }
    public String f(){
       return "LiveStatusQueryManagerV3";
    }
    public void i(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStatusQueryManagerV3.class, "10")) {
          return;
       }
       this.l();
       this.k = System.currentTimeMillis();
       int i = this.d + 1;
       this.d = i;
       d.b("LiveStatusQueryManagerV3", "processLiveStatusQueryFailed", ImmutableMap.of("mCurrentRetryCount", Integer.valueOf(i)), p0);
       a td = this.d;
       if (td > 3) {
          this.d = td % 3;
       }
       if (this.n()) {
          this.p();
       }
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStatusQueryManagerV3.class, "2")) {
          return;
       }
       this.e = true;
       this.p();
       return;
    }
    public void p(){
       long l;
       long l1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveStatusQueryManagerV3 liveStatusQu = LiveStatusQueryManagerV3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveStatusQu, "3")) {
          return;
       }
       d.c("LiveStatusQueryManagerV3", "updateCheckLiveStatus\(\) method start");
       if (this.n()) {
          LiveStatusQueryManagerV3$QueryStrategy queryStrateg = PatchProxy.apply(objArray, this, liveStatusQu, "5");
          boolean b = false;
          String str = 1;
          if (queryStrateg != patchProxyRe) {
          }else {
             Iterator obj1 = PatchProxy.apply(objArray, this, liveStatusQu, "8");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                obj1 = this.a.iterator();
                while (true) {
                   if (obj1.hasNext()) {
                      a uoa1 = obj1.next();
                      if (uoa1.b() && !q.f(uoa1.a())) {
                         b1 = true;
                      }
                   }else {
                      b1 = false;
                   }
                }
             }
             if (b1 && this.e == null) {
                queryStrateg = LiveStatusQueryManagerV3$QueryStrategy.FOREGROUND_ACTIVE;
             }else if(b1){
                queryStrateg = LiveStatusQueryManagerV3$QueryStrategy.BACKGROUND_ACTIVE;
             }else if(this.e == null){
                queryStrateg = LiveStatusQueryManagerV3$QueryStrategy.FOREGROUND_NON_ACTIVE;
             }else {
                queryStrateg = LiveStatusQueryManagerV3$QueryStrategy.BACKGROUND_NON_ACTIVE;
             }
          }
          a tg = this.g;
          if (this.k - tg > 0 && tg > 0) {
             b = true;
          }
          if (PatchProxy.isSupport(liveStatusQu)) {
             Object obj = PatchProxy.applyTwoRefs(queryStrateg, Boolean.valueOf(b), this, liveStatusQu, "4");
             if (obj != patchProxyRe) {
                l = obj.longValue();
             }else {
             label_009b :
                int i = LiveStatusQueryManagerV3$a.a[queryStrateg.ordinal()];
                if (i != str) {
                   if (i != 2) {
                      if (i != 3) {
                         l = this.i.mInactiveAndBackgroundIntervalMs;
                      }else {
                         l = this.i.mActiveAndBackgroundIntervalMs;
                      }
                   }else {
                      l = this.i.mInactiveAndForegroundIntervalMs;
                   }
                }else if(!b){
                   l = this.b.mRequestIntervalMs;
                }else if(this.h()){
                   l = (long)d.a();
                   l1 = 1000;
                }else {
                   LiveCheckStatusConfig mRequestInte = this.b.mRequestIntervalMs;
                   l1 = (long)Math.pow(2.00f, (double)this.d);
                }
                l = l * l1;
             }
          }else {
             goto label_009b ;
          }
          ImmutableMap$b uob = ImmutableMap.builder().c("currentQueryStrategy", queryStrateg);
          LiveStatusQueryManagerV3 tj = this.j;
          str = "null";
          if (tj == null) {
             tj = str;
          }
          uob = uob.c("lastQueryStrategy", tj).c("lastRequestTimestamp", Long.valueOf(this.g)).c("mLastRequestFailedTimestamp", Long.valueOf(this.k)).c("currentRequestDelayTimeMs", Long.valueOf(l));
          a tf = this.f;
          if (tf != null) {
             a uoa = tf;
          }
          d.d("LiveStatusQueryManagerV3", "shouldCheckLiveStatus returns true", uob.c("disposable", str).a());
          if (this.f == null) {
             if (!this.g) {
                this.g = System.currentTimeMillis();
                this.r(l, queryStrateg);
             }else {
                this.r(Math.max(0, (l - (System.currentTimeMillis() - Math.max(this.g, this.k)))), queryStrateg);
             }
          }else {
             LiveStatusQueryManagerV3 tj1 = this.j;
             if (tj1 != null && tj1 != queryStrateg) {
                this.l();
                this.r(Math.max(0, (l - (System.currentTimeMillis() - Math.max(this.g, this.k)))), queryStrateg);
             }
          }
       }else {
          d.c("LiveStatusQueryManagerV3", "shouldCheckLiveStatus returns false, reset request task");
          this.l();
       }
       d.c("LiveStatusQueryManagerV3", "updateCheckLiveStatus\(\) method end");
       return;
    }
    public final void r(long p0,LiveStatusQueryManagerV3$QueryStrategy p1){
       LiveStatusQueryManagerV3 liveStatusQu = LiveStatusQueryManagerV3.class;
       if (PatchProxy.isSupport(liveStatusQu) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, liveStatusQu, "9")) {
          return;
       }
       d.d("LiveStatusQueryManagerV3", "scheduleCheckLiveStatus", ImmutableMap.of("delayTimeMs", Long.valueOf(p0), "queryStrategy", p1));
       this.j = p1;
       this.f = t.timer(p0, TimeUnit.MILLISECONDS).observeOn(d.a).doOnNext(new l(this)).flatMap(new m(this)).subscribe(new j(this), new k(this));
       return;
    }
}
