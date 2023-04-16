package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$a;
import nsd.u;
import jp2.u;
import hf3.a;
import msd.a;
import java.lang.String;
import hp2.h;
import kp2.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import wa1.h;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import jp2.c;
import hp2.o;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$rtcBroadcastObserver$1;
import jp2.s;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$j;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$g;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$k;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$l;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$n;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$m;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$o;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$q;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$p;
import jp2.r;
import pp2.a;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ChangeSingTypeForMyself;
import ut7.e;
import com.kwai.robust.PatchProxyResult;
import jp2.a;
import jp2.d;
import com.kuaishou.livestream.message.nano.SCKtvNextMusicOrderInfo;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NextMineMusicOrder;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NextMusicOrder;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$PlayNextOrder;
import hp2.c;
import ut7.h;
import com.kwai.statechart.StateChart;
import msd.l;
import com.kuaishou.live.core.voiceparty.core.audience.LongConnectionUnregisterNewException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.statechart.StateChart$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildStateChart$$inlined$apply$lambda$1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildStateChart$1$2;
import com.kwai.statechart.a;
import pp2.b;
import ut7.g;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1;
import java.util.Set;
import trd.d1;
import jp2.f;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareFail;
import jp2.g;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchComplete;
import jp2.h;
import jp2.i;
import ut7.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$NoNextMusic;
import jp2.j;
import jp2.k;
import jp2.l;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$HeartbeatError;
import jp2.e;
import jp2.m;
import lf3.g;
import jp2.n;
import com.kuaishou.livestream.message.nano.SCKtvMusicOrderFinished;

public abstract class KtvManager	// class@001442
{
    public final h a;
    public final KtvManager$b b;
    public final l c;
    public StateChart d;
    public final s e;
    public boolean f;
    public final KtvManager$j g;
    public final KtvManager$g h;
    public final KtvManager$k i;
    public final KtvManager$l j;
    public final KtvManager$n k;
    public final KtvManager$m l;
    public final KtvManager$o m;
    public final KtvManager$q n;
    public final KtvManager$p o;
    public final u p;
    public final a q;
    public static final KtvManager$a r;

    static {
       KtvManager.r = new KtvManager$a(null);
    }
    public void KtvManager(u p0,a p1,a p2,String p3,String p4,String p5,h p6,a p7){
       a.p(p0, "ktvRtcService");
       a.p(p1, "longConnection");
       a.p(p2, "liveStreamIdFetcher");
       a.p(p3, "voicePartyId");
       a.p(p4, "anchorUserId");
       a.p(p5, "myselfId");
       a.p(p6, "param");
       a.p(p7, "logger");
       super();
       this.p = p0;
       this.q = p7;
       this.a = new h(p1);
       KtvManager$b uob = this.c();
       c uoc = new c(p2, p3, p6.a(), new o(p4), new o(p5));
       Objects.requireNonNull(uob);
       if (PatchProxy.applyVoidOneRefs(p1, uob, KtvManager$b.class, "2")) {
       }else {
          a.p(p1, "<set-?>");
          uob.a = p1;
       }
       this.b = uob;
       this.c = new KtvManager$rtcBroadcastObserver$1(this);
       this.e = new s();
       this.g = new KtvManager$j(this, "KtvIdle");
       this.h = new KtvManager$g(this);
       this.i = new KtvManager$k(this, "KtvSingPrepare");
       this.j = new KtvManager$l(this, "KtvSinging");
       this.k = new KtvManager$n(this, "KtvWatch");
       this.l = new KtvManager$m(this, "KtvWatchPrepare");
       this.m = new KtvManager$o(this, "KtvWatching");
       this.n = new KtvManager$q(this, "Watching");
       this.o = new KtvManager$p(this, "RefreshWatchPrepare");
       return;
    }
    public final void a(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager.class, "2")) {
          return;
       }
       a.p(p0, "observer");
       this.i().j0(p0);
       return;
    }
    public final void b(int p0){
       KtvManager ktvManager = KtvManager.class;
       if (PatchProxy.isSupport(ktvManager) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ktvManager, "7")) {
          return;
       }
       this.r(new KtvManager$ChangeSingTypeForMyself(p0));
       return;
    }
    public KtvManager$b c(){
       Object obj = PatchProxy.apply(null, this, KtvManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KtvManager$b();
    }
    public KtvManager$b d(){
       return this.b;
    }
    public a e(){
       Object obj = PatchProxy.apply(null, this, KtvManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d();
    }
    public final u f(){
       return this.p;
    }
    public KtvManager$g g(){
       return this.h;
    }
    public abstract d h();
    public s i(){
       return this.e;
    }
    public final void j(SCKtvNextMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager.class, "12")) {
          return;
       }
       a.p(p0, "msg");
       if (p0.ktvMusicOrderInfo != null && (a.g(p0.liveStreamId, this.d().l()) && (a.g(p0.voicePartyId, this.d().o()) && a.g(p0.ktvId, this.d().d())))) {
          String str = "msg.ktvMusicOrderInfo";
          if (a.g(String.valueOf(p0.ktvMusicOrderInfo.userId), this.d().m())) {
             p0 = p0.ktvMusicOrderInfo;
             a.o(p0, str);
             this.r(new KtvManager$NextMineMusicOrder(p0));
          }else {
             p0 = p0.ktvMusicOrderInfo;
             a.o(p0, str);
             this.r(new KtvManager$NextMusicOrder(p0, false));
          }
       }
       return;
    }
    public void k(){
    }
    public void l(){
    }
    public void m(){
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, KtvManager.class, "8")) {
          return;
       }
       this.o(2);
       return;
    }
    public final void o(int p0){
       KtvManager ktvManager = KtvManager.class;
       if (PatchProxy.isSupport(ktvManager) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ktvManager, "9")) {
          return;
       }
       this.r(new KtvManager$PlayNextOrder(p0));
       return;
    }
    public void p(c p0){
       KtvManager ktvManager = KtvManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ktvManager, "5")) {
          return;
       }
       a.p(p0, "reason");
       this.f = true;
       KtvManager td = this.d;
       if (td == null) {
          a.S("stateChart");
       }
       td.t(p0);
       if (!PatchProxy.applyVoid(null, this, ktvManager, "13")) {
          this.a.b();
          this.p.r(null);
       }
       return;
    }
    public final void q(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.i().l0(p0);
       return;
    }
    public final void r(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager.class, "6")) {
          return;
       }
       a.p(p0, "event");
       if (this.f != null) {
          ExceptionHandler.handleCaughtException(new LongConnectionUnregisterNewException(p0));
       }else {
          KtvManager td = this.d;
          if (td == null) {
             a.S("stateChart");
          }
          td.l(p0);
       }
       return;
    }
    public void s(){
       KtvManager ktvManager = KtvManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ktvManager, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StateChart$b uob = PatchProxy.apply(objArray, this, ktvManager, "16");
       if (uob != patchProxyRe) {
       }else {
          uob = new StateChart$b();
          uob.b(new KtvManager$buildStateChart$$inlined$apply$lambda$1(this));
          uob.e(this.g, KtvManager$buildStateChart$1$2.INSTANCE);
          uob.f(this.g);
          uob.c("KtvManager");
          uob.d(new b(false));
          KtvManager tk = this.k;
          KtvManager$buildWatchState$1 uobuildWatch = PatchProxy.apply(objArray, this, ktvManager, "17");
          if (uobuildWatch != patchProxyRe) {
          }else {
             uobuildWatch = new KtvManager$buildWatchState$1(this);
          }
          uob.g(tk, uobuildWatch);
          KtvManager$g og = this.g();
          KtvManager$buildSingState$1 uobuildSingS = PatchProxy.apply(objArray, this, ktvManager, "18");
          if (uobuildSingS != patchProxyRe) {
          }else {
             uobuildSingS = new KtvManager$buildSingState$1(this);
          }
          uob.g(og, uobuildSingS);
          Object[] objArray1 = new Object[]{this.g,this.g()};
          StateChart$b uob1 = uob;
          uob1.i("watch", d1.u(objArray1), this.k, KtvManager$NextMusicOrder.class, f.a);
          uob1.h("watch_fail", this.k, this.g, KtvManager$KtvWatchPrepareFail.class, g.a);
          uob1.h("watch_complete", this.k, this.g, KtvManager$KtvWatchComplete.class, h.a);
          objArray1 = new Object[]{this.g,this.k};
          uob.i("sing", d1.u(objArray1), this.g(), KtvManager$NextMineMusicOrder.class, i.a);
          d[] uodArray = new d[]{this.k,this.g()};
          uob1 = uob;
          uob1.i("no_order", d1.u(uodArray), this.g, KtvManager$NoNextMusic.class, j.a);
          KtvManager tk1 = this.k;
          uob1.h("watch_next", tk1, tk1, KtvManager$NextMusicOrder.class, k.a);
          tk1 = this.k;
          uob1.h("refresh_watch", tk1, tk1, KtvManager$NextMusicOrder.class, l.a);
          uob1.h("heartbeat_error", this.g(), this.g, KtvManager$HeartbeatError.class, e.a);
       }
       StateChart stateChart = uob.a();
       this.d = stateChart;
       if (stateChart == null) {
          a.S("stateChart");
       }
       stateChart.s();
       if (!PatchProxy.applyVoid(objArray, this, ktvManager, "11")) {
          this.a.a(472, SCKtvNextMusicOrderInfo.class, new m(this));
          this.a.a(476, SCKtvMusicOrderFinished.class, new n(this));
          this.p.r(this.c);
       }
       return;
    }
}
