package com.kuaishou.live.audience.component.activitycoupondialog.c;
import k51.c;
import com.kuaishou.live.audience.component.activitycoupondialog.c$a;
import com.kuaishou.live.audience.component.activitycoupondialog.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCKuaishouNightLotteryChanging;
import lf3.g;
import e93.f;
import xw0.d;
import ok.x;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.live.audience.component.activitycoupondialog.a;
import com.kuaishou.live.audience.component.activitycoupondialog.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.audience.component.activitycoupondialog.LiveCoinRewardInfo;
import lp3.e;
import oa1.a;
import oa1.b;
import o63.a;
import lp3.c;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import com.kwai.robust.PatchProxyResult;
import p63.a;
import fg6.a;
import com.google.gson.Gson;
import android.util.Base64;
import p63.a$a;
import p63.a$b;
import o63.d;

public class c extends c	// class@000a41
{
    public m p;
    public a0 q;
    public LiveSlidePlayService r;
    public final g s;
    public final c t;
    public static String sLivePresenterClassName = "LiveActivityCouponDialogPresenter";
    public static int u;

    public void c(){
       super();
       this.s = new c$a(this);
       this.t = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tq = this.q;
       if (tq != null && tq.h != null) {
          tq = this.r;
          if (tq != null) {
             tq.P4(this.t);
          label_0021 :
             return;
          }
       }
       this.P8();
       goto label_0021 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tr = this.r;
       if (tr != null) {
          tr.d5(this.t);
       }
       this.R8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.p.u().u0(913, SCKuaishouNightLotteryChanging.class, this.s);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.p.u().o(913, this.s);
       f.g(this);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       c.u = c.u + 1;
       this.X7(d.a.get().a(this.p.getLiveStreamId()).observeOn(d.a).map(new e()).subscribe(new a(this), b.b));
       return;
    }
    public final void V8(LiveCoinRewardInfo p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "8")) {
          return;
       }
       e uoe = this.p.t5();
       if (!uoe.b() && p0 != null) {
          a uoa = new a();
          int i = 0;
          uoa.c(i);
          uoa.a = 280;
          uoa.a(404);
          b a = b.a;
          a uoa1 = uoe.a(a.class);
          LiveKrnPageKey liveActivity = LiveKrnPageKey.LiveActivityCouponDialog;
          a uoa2 = PatchProxy.applyOneRefs(p0, this, uoc, "9");
          if (uoa2 != PatchProxyResult.class) {
          }else {
             uoa2 = a.b.a().a("couponDialogInfo", Base64.encodeToString((a.a.q(p0)).getBytes(), i)).b();
          }
          a.b(uoa1, liveActivity, uoa2, uoa);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.q = this.s8(a0.class);
       return;
    }
}
