package com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import k51.c;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$c;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$1;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$b;
import android.content.IntentFilter;
import ck2.h;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.i;
import tj3.e;
import tj3.k;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import ck2.g;
import mq5.h;
import mq5.b;
import androidx.fragment.app.c$b;
import kq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import ck2.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.activity.x;
import org.greenrobot.eventbus.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import k2b.j0;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import m56.f;
import com.kuaishou.live.core.show.floatingwindow.z;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import z12.x;
import tj3.l;
import m56.g;

public abstract class LiveLogReporterBasePresenter extends c	// class@0010a0
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public c E;
    public c$b F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final IntentFilter J;
    public final BroadcastReceiver K;
    public final LivePlayerStateChangeListener L;
    public final LivePlayerErrorListener M;
    public e p;
    public j0 q;
    public LivePlayerController r;
    public x s;
    public b t;
    public LiveSlidePlayService u;
    public b v;
    public k w;
    public i x;
    public LiveBizParam y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveLogReporterBasePresenter";

    public void LiveLogReporterBasePresenter(){
       super();
       this.B = false;
       this.C = false;
       this.E = new LiveLogReporterBasePresenter$c(this, null);
       this.F = new LiveLogReporterBasePresenter$b(this);
       this.G = true;
       this.H = true;
       this.J = new IntentFilter();
       this.K = new LiveLogReporterBasePresenter$1(this);
       this.L = new h(this);
       this.M = new LiveLogReporterBasePresenter$a(this);
    }
    public void E8(){
       LiveLogReporterBasePresenter liveLogRepor = LiveLogReporterBasePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLogRepor, "2")) {
          return;
       }
       this.x = this.p.h();
       this.w = this.p.x();
       this.r.addStateChangeListener(this.L);
       this.r.addLivePlayerErrorListener(this.M);
       LiveLogReporterBasePresenter tv = this.v;
       if (tv != null) {
          tv.Km(new g(this));
       }
       this.t.c(this.F);
       if (!PatchProxy.applyVoid(objArray, this, liveLogRepor, "7")) {
          if (!e.s(this.getActivity())) {
             this.V8();
             this.W8();
          }else {
             LiveLogReporterBasePresenter$c uoc = new LiveLogReporterBasePresenter$c(this, objArray);
             this.E = uoc;
             LiveLogReporterBasePresenter tu = this.u;
             if (tu != null) {
                tu.P4(uoc);
             }
          }
       }
       this.V8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter.class, "4")) {
          return;
       }
       this.A = false;
       this.D = false;
       this.t.a(this.F);
       this.r.removeStateChangeListener(this.L);
       this.r.removeLivePlayerErrorListener(this.M);
       LiveLogReporterBasePresenter tu = this.u;
       if (tu != null) {
          tu.d5(this.E);
       }
       this.X8();
       this.Y8();
       return;
    }
    public abstract i P8();
    public boolean R8(){
       LiveLogReporterBasePresenter obj = PatchProxy.apply(null, this, LiveLogReporterBasePresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       boolean b = (obj != null && obj.a())? true: false;
       return b;
    }
    public boolean S8(){
       LiveLogReporterBasePresenter obj = PatchProxy.apply(null, this, LiveLogReporterBasePresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.U0())? true: false;
       return b;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter.class, "8")) {
          return;
       }
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter.class, "10")) {
          return;
       }
       if (this.B == null) {
          this.J.addAction("android.intent.action.SCREEN_ON");
          this.J.addAction("android.intent.action.SCREEN_OFF");
          this.J.addAction("android.intent.action.USER_PRESENT");
          UniversalReceiver.e(a.a().a(), this.K, this.J);
          this.B = true;
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter.class, "9")) {
          return;
       }
       if (a.d().i(this)) {
          a.d().t(this);
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter.class, "11")) {
          return;
       }
       if (this.B != null) {
          UniversalReceiver.f(a.a().a(), this.K);
          this.B = false;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveLogReporterBasePresenter.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_LOG_REPORTER");
       this.q = this.r8("LIVE_PAGE_LOGGER");
       this.r = this.r8("LIVE_PLAYER_CONTROLLER");
       this.s = this.t8("LIVE_FRAGMENT_SERVICE");
       this.t = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.u = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.v = this.t8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.y = this.s8(LiveBizParam.class);
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLogReporterBasePresenter.class, "5")) {
          return;
       }
       if (this.p.e() && (!z.c() && (!b.a(0x432c5e03).o().booleanValue() && !x.u()))) {
          this.p.n().c(1);
          this.p.g();
          this.C = true;
       }
    label_0043 :
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLogReporterBasePresenter.class, "6")) {
          return;
       }
       if (this.p.e() && this.C != null) {
          this.p.n().c(10);
          this.p.g();
          this.C = false;
       }
       return;
    }
}
