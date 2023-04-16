package com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter;
import sq5.a;
import lp3.a;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$a;
import nsd.u;
import java.util.HashMap;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$mainScope$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$PerfType;
import com.kuaishou.live.basic.performance.biz.MemoryPerfStatExecutor;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor;
import com.kuaishou.live.basic.performance.biz.FPSPerfStatExecutor;
import sq5.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ftd.k0;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$bizStart$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import msd.l;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import lp3.e;
import rp5.a;
import lp3.c;
import android.app.Activity;
import java.util.Objects;
import java.lang.Long;
import java.lang.ref.WeakReference;
import java.lang.System;
import com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$bizStop$1;

public final class LiveBizPerfReporter extends a implements a	// class@000ceb
{
    public final HashMap d;
    public boolean e;
    public long f;
    public final p g;
    public static final LiveBizPerfReporter$a h;

    static {
       LiveBizPerfReporter.h = new LiveBizPerfReporter$a(null);
    }
    public void LiveBizPerfReporter(){
       super();
       this.d = new HashMap();
       this.g = s.c(LiveBizPerfReporter$mainScope$2.INSTANCE);
       this.e = a.t().u("SOURCE_LIVE").d("enableLiveBizPerfReport", false);
       this.f = a.t().u("SOURCE_LIVE").b("liveBizPerfReportDuration", 0x2710);
       if (this.e != null) {
          this.Uo(LiveBizPerfReporter$PerfType.MEMORY, new MemoryPerfStatExecutor());
          this.Uo(LiveBizPerfReporter$PerfType.FPS, new FPSPerfStatExecutor());
       }
       return;
    }
    public void Hc(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizPerfReporter.class, "4")) {
          return;
       }
       a.p(p0, "bizInfoBuilder");
       if (this.e == null) {
          return;
       }
       a.f(this.To(), null, null, new LiveBizPerfReporter$bizStart$1(this, p0, null), 3, null);
       return;
    }
    public final void So(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizPerfReporter.class, "6")) {
          return;
       }
       Iterator iterator = this.d.entrySet().iterator();
       while (iterator.hasNext()) {
          p0.invoke(iterator.next().getValue());
       }
       return;
    }
    public final k0 To(){
       Object obj = PatchProxy.apply(null, this, LiveBizPerfReporter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final void Uo(LiveBizPerfReporter$PerfType p0,PerfStatExecutor p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBizPerfReporter.class, "7")) {
          return;
       }
       PerfStatExecutor perfStatExec = this.d.get(p0);
       if (perfStatExec != null) {
          perfStatExec.f();
       }
       this.d.put(p0, p1);
       return;
    }
    public void ri(String p0){
       object oobject;
       LiveBizPerfReporter liveBizPerfR = LiveBizPerfReporter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveBizPerfR, "2")) {
          return;
       }
       String str = "liveStreamId";
       a.p(p0, str);
       if (this.e == null) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, liveBizPerfR, "8")) {
          LiveBizPerfReporter$PerfType[] perfTypeArra = LiveBizPerfReporter$PerfType.values();
          int len = perfTypeArra.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = perfTypeArra[i];
                if (this.d.containsKey(oobject)) {
                   i = i + 1;
                }else {
                   break ;
                }
             }
          }
          throw new IllegalStateException(oobject+" Î´×¢²á¶ÔÓ¦µÄ PerfStatExecutor");
       }
       Activity uActivity = this.Po().a(a.class).c();
       Iterator iterator = this.d.entrySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next().getValue();
          LiveBizPerfReporter tf = this.f;
          Objects.requireNonNull(str1);
          if (PatchProxy.isSupport(PerfStatExecutor.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(tf), uActivity, str1, PerfStatExecutor.class, "1")) {
             continue ;
          }
          a.p(p0, str);
          str1.c = p0;
          str1.d = new WeakReference(uActivity);
          str1.a = System.currentTimeMillis();
          str1.d(tf);
       }
       return;
    }
    public void wc(){
       if (PatchProxy.applyVoid(null, this, LiveBizPerfReporter.class, "3")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       Iterator iterator = this.d.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().f();
       }
       return;
    }
    public void zm(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizPerfReporter.class, "5")) {
          return;
       }
       a.p(p0, "bizInfoBuilder");
       if (this.e == null) {
          return;
       }
       a.f(this.To(), null, null, new LiveBizPerfReporter$bizStop$1(this, p0, null), 3, null);
       return;
    }
}
