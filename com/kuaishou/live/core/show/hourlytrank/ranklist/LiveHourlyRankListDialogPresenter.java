package com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import im8.g;
import k51.c;
import ea2.j;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$1;
import ea2.c;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$a;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$b;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import lf3.g;
import t02.a0;
import mq5.h;
import mq5.b;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter$c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.fragment.app.c$b;
import kq5.b;
import lp3.e;
import ry1.a;
import lp3.c;
import brd.t;
import ea2.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ry1.b;
import ea2.d;
import vq5.d;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kwai.robust.PatchProxyResult;
import ea2.i;
import java.util.Map;
import java.util.HashMap;
import t02.r1;
import fg3.s;
import xq5.a;
import u57.f;
import om1.a;
import ba2.h;

public class LiveHourlyRankListDialogPresenter extends c implements g	// class@000c27
{
    public j A;
    public LiveHourlyRankType B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public LifecycleObserver G;
    public ProgressFragment H;
    public final g I;
    public final h J;
    public c$b K;
    public b L;
    public d p;
    public m q;
    public e r;
    public a0 s;
    public r1 t;
    public s u;
    public a v;
    public f w;
    public a x;
    public h y;
    public KwaiDialogFragment z;
    public static String sLivePresenterClassName = "LiveHourlyRankListDialogPresenter";

    public void LiveHourlyRankListDialogPresenter(){
       super();
       this.A = new j();
       this.C = "UNKNOWN";
       this.D = false;
       this.G = new LiveHourlyRankListDialogPresenter$1(this);
       this.I = new c(this);
       this.J = new LiveHourlyRankListDialogPresenter$a(this);
       this.K = new LiveHourlyRankListDialogPresenter$b(this);
       this.L = new LiveHourlyRankListDialogPresenter$d(this);
    }
    public void E8(){
       LiveHourlyRankListDialogPresenter liveHourlyRa = LiveHourlyRankListDialogPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveHourlyRa, "5")) {
          return;
       }
       this.q.u().u0(587, LiveStreamMessages$SCLiveDistrictRankInfo.class, this.I);
       LiveHourlyRankListDialogPresenter ts = this.s;
       if (ts != null) {
          ts.D2.Km(this.J);
          this.s.y2.P4(new LiveHourlyRankListDialogPresenter$c(this));
          a0 d2 = this.s.d2;
          if (d2 != null) {
             d2.c(this.K);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveHourlyRa, "16")) {
          if (this.q.e()) {
             this.X7(this.q.t5().a(a.class).F3().subscribe(new e(this), Functions.d()));
          }else {
             liveHourlyRa = this.s;
             if (liveHourlyRa != null) {
                this.X7(liveHourlyRa.b3.W().subscribe(new d(this), Functions.d()));
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankListDialogPresenter.class, "6")) {
          return;
       }
       this.q.u().o(587, this.I);
       LiveHourlyRankListDialogPresenter ts = this.s;
       if (ts != null) {
          ts.D2.le(this.J);
          a0 d2 = this.s.d2;
          if (d2 != null) {
             d2.a(this.K);
          }
       }
       ts = this.p;
       if (ts != null) {
          ts.Z4("hourly-show-loading");
       }
       x.E(this.H);
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankListDialogPresenter.class, "4")) {
          return;
       }
       x.E(this.z);
       this.z = null;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHourlyRankListDialogPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveHourlyRankListDialogPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveHourlyRankListDialogPresenter.class, new i());
       }else {
          obj.put(LiveHourlyRankListDialogPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankListDialogPresenter.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.s8(a0.class);
       this.t = this.s8(r1.class);
       this.u = this.r8("LIVE_MERCHANT_HOURLY_RANK_SERVICE");
       this.v = this.s8(a.class);
       this.w = this.t8("LIVE_GZONE_HOURLY_RANK_SERVICE");
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       this.p = this.t8("LIVE_ROUTER_SERVICE");
       this.x = this.r.a(a.class);
       this.y = this.s8(h.class);
       return;
    }
}
