package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import ac3.k;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$b;
import nsd.u;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import ac3.i;
import androidx.lifecycle.Lifecycle;
import com.kwai.video.waynelive.LivePlayerController;
import xp5.i;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$longConnection$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$lifecycleObserver$1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$k;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$j;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import crd.a;
import ac3.m;
import wa1.i;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$disconnectState$1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$connectState$1;
import com.kwai.statechart.StateChart$b;
import com.kwai.statechart.StateChart;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import erd.g;
import crd.b;
import krd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$a;
import msd.l;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i51.j;
import i51.i;
import cjd.e;
import erd.o;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$l;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$m;
import ac3.l;
import java.lang.Boolean;
import lf3.g;
import java.lang.Integer;
import hf3.a;
import ut7.e;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$buildStateChart$$inlined$apply$lambda$1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$buildStateChart$1$2;
import com.kwai.statechart.a;
import ud3.e;
import ut7.g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$ConfigUpdated;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$f;
import ut7.o;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$LiveActive;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$g;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$LiveInactive;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$h;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$StreamStop;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$i;
import ac3.j;
import ac3.e;

public class LiveBaseLongConnectionManager implements k	// class@000a22
{
    public final boolean b;
    public final p c;
    public final LifecycleEventObserver d;
    public final LivePlayerStateChangeListener e;
    public final g f;
    public final LiveStreamFeedWrapper g;
    public final a h;
    public final m i;
    public final i j;
    public final LiveBaseLongConnectionManager$c k;
    public final StateChart l;
    public final c m;
    public final c n;
    public o o;
    public final i p;
    public final Lifecycle q;
    public final LivePlayerController r;
    public final i s;
    public static final LiveBaseLongConnectionManager$b t;

    static {
       LiveBaseLongConnectionManager.t = new LiveBaseLongConnectionManager$b(null);
    }
    public void LiveBaseLongConnectionManager(LiveStreamFeed p0,i p1,Lifecycle p2,LivePlayerController p3,i p4,t p5){
       a.p(p0, "liveSteamFeed");
       a.p(p1, "connectionConfig");
       a.p(p2, "lifecycle");
       a.p(p3, "livePlayerController");
       a.p(p4, "logPackageProvider");
       a.p(p5, "configUpdateSignal");
       super();
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.b = true;
       this.c = s.c(new LiveBaseLongConnectionManager$longConnection$2(this));
       LiveBaseLongConnectionManager$lifecycleObserver$1 olifecycleOb = new LiveBaseLongConnectionManager$lifecycleObserver$1(this);
       this.d = olifecycleOb;
       LiveBaseLongConnectionManager$k ok = new LiveBaseLongConnectionManager$k(this);
       this.e = ok;
       LiveBaseLongConnectionManager$j oj = new LiveBaseLongConnectionManager$j(this);
       this.f = oj;
       this.g = new LiveStreamFeedWrapper(p0);
       a uoa = new a();
       this.h = uoa;
       this.i = new m();
       this.j = new i();
       this.k = new LiveBaseLongConnectionManager$c();
       this.m = new LiveBaseLongConnectionManager$disconnectState$1(this, "Disconnect");
       this.n = new LiveBaseLongConnectionManager$connectState$1(this, "Connect");
       StateChart stateChart = this.r().a();
       this.l = stateChart;
       stateChart.s();
       p2.addObserver(olifecycleOb);
       p3.addStateChangeListener(ok);
       b uob = p5.subscribe(oj);
       a.o(uob, "configUpdateSignal.subscribe\(configUpdateObserver\)");
       a.b(uoa, uob);
       uob = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new LiveBaseLongConnectionManager$a(this));
       a.o(uob, "RxBus.INSTANCE.toObserva¡­ sendEvent\(Login\(\)\)\n    }");
       a.b(uoa, uob);
    }
    public final b C1(l p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBaseLongConnectionManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = i.b().a(this.g.getLiveStreamId(), true).map(new e()).subscribe(new LiveBaseLongConnectionManager$l(this, p0), new LiveBaseLongConnectionManager$m(p1));
       a.o(uob, "LiveLongConnectionApiSer¡­      onError\(it\)\n      }");
       return uob;
    }
    public void Fd(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager.class, "14")) {
          return;
       }
       a.p(p0, "observer");
       this.j.remove(p0);
       return;
    }
    public final boolean G(LiveBaseLongConnectionManager$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBaseLongConnectionManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.a() && !p0.b())? true: false;
       return b;
    }
    public void J(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(LiveBaseLongConnectionManager.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, LiveBaseLongConnectionManager.class, "11")) {
          return;
       }
       a.p(p1, "tClass");
       a.p(p2, "listener");
       this.t1().J(p0, p1, p2, p3);
       return;
    }
    public final void M1(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager.class, "4")) {
          return;
       }
       a.p(p0, "event");
       this.l.n(p0);
       return;
    }
    public final LiveBaseLongConnectionManager$c N(){
       return this.k;
    }
    public final a P(){
       return this.h;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void o(int p0,g p1){
       LiveBaseLongConnectionManager liveBaseLong = LiveBaseLongConnectionManager.class;
       if (PatchProxy.isSupport(liveBaseLong) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveBaseLong, "12")) {
          return;
       }
       a.p(p1, "scMessageListener");
       this.t1().o(p0, p1);
       return;
    }
    public StateChart$b r(){
       StateChart$b obj = PatchProxy.apply(null, this, LiveBaseLongConnectionManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StateChart$b();
       obj.b(new LiveBaseLongConnectionManager$buildStateChart$$inlined$apply$lambda$1(this));
       obj.e(this.m, LiveBaseLongConnectionManager$buildStateChart$1$2.INSTANCE);
       obj.f(this.m);
       obj.f(this.n);
       obj.d(new e());
       StateChart$b uob = obj;
       uob.h("config_updated", this.m, this.n, LiveBaseLongConnectionManager$ConfigUpdated.class, new LiveBaseLongConnectionManager$f(this));
       uob.h("live_active", this.m, this.n, LiveBaseLongConnectionManager$LiveActive.class, new LiveBaseLongConnectionManager$g(this));
       uob.h("live_inactive", this.n, this.m, LiveBaseLongConnectionManager$LiveInactive.class, new LiveBaseLongConnectionManager$h(this));
       uob.h("stream_stop", this.n, this.m, LiveBaseLongConnectionManager$StreamStop.class, new LiveBaseLongConnectionManager$i(this));
       return obj;
    }
    public void sb(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager.class, "13")) {
          return;
       }
       a.p(p0, "observer");
       this.j.add(p0);
       return;
    }
    public final a t1(){
       Object obj = PatchProxy.apply(null, this, LiveBaseLongConnectionManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public a u(){
       Object obj = PatchProxy.apply(null, this, LiveBaseLongConnectionManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t1();
    }
    public final boolean w(LiveBaseLongConnectionManager$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBaseLongConnectionManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.a != null && p0.a())? true: false;
       return b;
    }
    public boolean y0(){
       return this.b;
    }
    public j y1(){
       Object obj = PatchProxy.apply(null, this, LiveBaseLongConnectionManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
