package com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader$a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader;
import java.lang.Object;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import msd.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper;
import java.lang.Boolean;
import java.lang.System;
import android.os.Trace;
import xj3.d;
import za3.n;
import java.lang.Runnable;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import java.util.List;
import za3.m;
import java.util.concurrent.Future;
import t45.c;
import qrd.l1;
import java.lang.Number;
import java.lang.StringBuilder;
import brd.t;
import crd.b;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$a;
import crd.a;
import com.kuaishou.live.lite.framework.basicservice.b;
import erd.r;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$execAfterScatterNormalFinished$3;
import za3.g;
import msd.l;
import erd.g;
import com.kuaishou.live.lite.framework.basicservice.d;
import e93.f;
import com.kuaishou.live.lite.framework.basicservice.a;
import crd.c;
import lp3.e;
import lp3.c;
import lp3.b;
import en8.c;
import hb3.a;

public final class BizPresenterScatterLoader$a implements LiveLiteScatterLoadManager	// class@000950
{
    public final BizPresenterScatterLoader b;

    public void BizPresenterScatterLoader$a(BizPresenterScatterLoader p0){
       this.b = p0;
       super();
    }
    public LiveLiteScatterLoadManager$ScatterLoadStatus Dg(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.q().i();
    }
    public void E4(String p0,a p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BizPresenterScatterLoader$a.class, "6")) {
          return;
       }
       String str = "name";
       a.p(p0, str);
       String str1 = "task";
       a.p(p1, str1);
       BizPresenterScatterLoader z = this.b.z;
       Objects.requireNonNull(z);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, z, LiveTaskQueueHelper.class, "4")) {
          a.p(p0, str);
          a.p(p1, str1);
          if (z.f.invoke().booleanValue()) {
             LiveTaskQueueHelper b = z.b;
             Trace.beginSection(p0);
             d uod = new d(0, p0, null, new n(p1));
             Trace.endSection();
             float f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
             if (f.b()) {
                if (SystemUtil.K()) {
                   objArray = new Object[]{p0,Float.valueOf(f)};
                   p0 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                   a.o(p0, "java.lang.String.format\(format, *args\)");
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, p0);
                }
             }else {
                objArray = new Object[]{p0,Float.valueOf(f)};
                p0 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                a.o(p0, "java.lang.String.format\(format, *args\)");
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, p0);
             }
             b.add(r0.a(Long.valueOf((long)f), uod).getSecond());
          }else {
             Future uFuture = c.k(new m(p0, p1));
             a.o(uFuture, "Async.submit {\n        v¡­imeMs:${timeMs}\"\)\n      }");
             z.c.add(uFuture);
          }
       }
       return;
    }
    public void W1(String p0,a p1){
       LiveTaskQueueHelper a;
       Object[] objArray;
       Object[] objArray1;
       String str3;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BizPresenterScatterLoader$a.class, "5")) {
          return;
       }
       String str = "name";
       a.p(p0, str);
       String str1 = "task";
       a.p(p1, str1);
       BizPresenterScatterLoader z = this.b.z;
       Objects.requireNonNull(z);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, z, LiveTaskQueueHelper.class, "3")) {
          a.p(p0, str);
          a.p(p1, str1);
          float f = 1000000.00f;
          String str2 = "java.lang.String.format\(format, *args\)";
          int i = 0;
          if (z.f.invoke().booleanValue()) {
             a = z.a;
             Trace.beginSection(p0);
             d uod = new d(i, p0, null, new n(p1));
             Trace.endSection();
             float f1 = (float)(System.nanoTime() - System.nanoTime()) / f;
             if (f.b()) {
                if (SystemUtil.K()) {
                   objArray = new Object[]{p0,Float.valueOf(f1)};
                   p0 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                   a.o(p0, str2);
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, p0);
                }
             }else {
                objArray = new Object[]{p0,Float.valueOf(f1)};
                p0 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                a.o(p0, str2);
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, p0);
             }
             a.add(r0.a(Long.valueOf((long)f1), uod).getSecond());
          }else {
             Trace.beginSection(p0);
             p1.invoke();
             l1 a1 = l1.a;
             Trace.endSection();
             float f2 = (float)(System.nanoTime() - System.nanoTime()) / f;
             if (f.b()) {
                if (SystemUtil.K()) {
                   objArray1 = new Object[]{p0,Float.valueOf(f2)};
                   str3 = String.format("%s - %.3fms", Arrays.copyOf(objArray1, 2));
                   a.o(str3, str2);
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str3);
                }
             }else {
                objArray1 = new Object[]{p0,Float.valueOf(f2)};
                str3 = String.format("%s - %.3fms", Arrays.copyOf(objArray1, 2));
                a.o(str3, str2);
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str3);
             }
             b.Z(LiveLiteLogTag.LIVE_LITE_TASK, "main task: "+p0+", timeMs:"+r0.a(Long.valueOf((long)f2), a1).getFirst().longValue());
          }
       }
       return;
    }
    public boolean Xn(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.o();
    }
    public t bj(){
       Object obj = PatchProxy.apply(null, this, BizPresenterScatterLoader$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.q();
    }
    public b ca(Runnable p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, BizPresenterScatterLoader$a.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "action";
       a.p(p0, obj);
       a uoa = PatchProxy.applyTwoRefs(this, p0, null, LiveLiteScatterLoadManager$a.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          a.p(p0, obj);
          if (!this.Xn() || this.Dg() == LiveLiteScatterLoadManager$ScatterLoadStatus.NORMAL) {
             f.j("afterScatterTask", p0, 0);
             uoa = c.d(new a(p0));
             a.o(uoa, "Disposables.fromRunnable¡­iThreadCallbacks\(action\)}");
          }else {
             uoa = new a();
             this.bj().filter(b.b).doOnSubscribe(new g(new LiveLiteScatterLoadManager$execAfterScatterNormalFinished$3(uoa))).subscribe(new d(p0, uoa));
          }
       }
       return uoa;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void ll(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BizPresenterScatterLoader$a.class, "4")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "runnable");
       if (this.Dg() == null) {
          this.b.p().e(new d(0, p0, null, new a(p1)));
       }else {
          p1.invoke();
       }
       return;
    }
}
