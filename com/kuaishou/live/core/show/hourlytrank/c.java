package com.kuaishou.live.core.show.hourlytrank.c;
import k51.c;
import com.kuaishou.live.core.show.hourlytrank.c$a;
import ba2.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.i;
import lp3.c;
import lp3.e;
import xp5.g;
import com.kuaishou.live.core.show.hourlytrank.c$b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import ry1.b;
import iy1.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import p91.m;
import ry1.a;
import t02.a0;
import y43.a;
import jt5.b;
import ba2.r;
import jv1.b;
import x67.j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.util.Objects;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank;
import lf3.g;
import iy1.l;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$f;
import ky1.c;
import oq5.c;
import brd.t;
import fa2.y;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import crd.a;
import fa2.z;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$f;
import wkd.b;
import com.kuaishou.live.common.core.component.authority.c;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import fa2.b;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kuaishou.live.core.show.hourlytrank.c$d;
import com.kuaishou.live.core.show.hourlytrank.c$e;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import java.lang.Long;
import java.lang.Boolean;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.hourlytrank.c$c;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$e;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ba2.f;
import ba2.c;
import java.lang.Runnable;
import ka2.j$c;
import ba2.h;

public class c extends c	// class@000c01
{
    public g A;
    public h B;
    public i C;
    public a D;
    public final c E;
    public final g F;
    public a p;
    public a q;
    public m r;
    public b s;
    public r t;
    public LiveSlidePlayService u;
    public a0 v;
    public j$c w;
    public b x;
    public e y;
    public i z;
    public static String sLivePresenterClassName = "LiveHourlyRankNoticePresenter";

    public void c(){
       super();
       this.E = new c$a(this);
       this.F = new j(this);
    }
    public void E8(){
       c b;
       a g;
       i h;
       i oi = this;
       c uoc = c.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, oi, uoc, str)) {
          return;
       }
       oi.z = oi.y.a(i.class);
       oi.A = oi.y.a(g.class);
       c u = oi.u;
       if (u != null) {
          u.P4(new c$b(oi));
       }else {
          this.R8();
       }
       b uob = b.class;
       g og = g.class;
       if (!PatchProxy.applyVoid(objArray, oi, uoc, "8")) {
          c r = oi.r;
          c uoc1 = oi.y.a(og);
          View view = this.m8();
          Context context = this.getContext();
          c s = oi.s;
          c t = oi.t;
          Object[] objArray1 = (oi.r.e())? objArray: oi.y.a(uob);
          a uoa = (oi.r.e())? oi.y.a(a.class): objArray;
          c x = oi.x;
          c v = oi.v;
          a uoa1 = (v != null)? v.D.c1: objArray;
          i oi1 = new i(r, uoc1, view, context, s, t, objArray1, uoa, x, uoa1);
          oi.C = uoc;
          v = oi.r;
          c uoc2 = oi.y.a(og);
          View view1 = this.m8();
          Context context1 = this.getContext();
          c s1 = oi.s;
          r = oi.t;
          Object[] objArray2 = (oi.r.e())? objArray: oi.y.a(uob);
          u = oi.x;
          uoc1 = oi.v;
          a uoa2 = (uoc1 != null)? uoc1.D.c1: objArray;
          a uoa3 = new a(v, uoc2, view1, context1, s1, r, objArray2, u, uoa2);
          oi.D = uoc;
          uoc = oi.C;
          Objects.requireNonNull(uoc);
          i oi2 = i.class;
          String str1 = "1";
          if (!PatchProxy.applyVoid(objArray, uoc, oi2, str1)) {
             uoc.b.u().u0(1092, LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank.class, uoc.w);
             uoc.c.Xb(l.e, new i$f(uoc));
             uoc.i.H6(uoc.y);
             if (!PatchProxy.applyVoid(objArray, uoc, oi2, str)) {
                if (uoc.b.e()) {
                   h = uoc.h;
                   if (h != null) {
                      uoc.k.c(h.F3().subscribe(new y(uoc), Functions.d()));
                   }
                }else {
                   h = uoc.g;
                   if (h != null) {
                      uoc.k.c(h.W().subscribe(new z(uoc), Functions.d()));
                   }
                }
             }
          }
          uoc = oi.D;
          Objects.requireNonNull(uoc);
          a uoa4 = a.class;
          if (!PatchProxy.applyVoid(objArray, uoc, uoa4, str1)) {
             uoc.b.u().u0(983, LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank.class, uoc.v);
             uoc.b.u().u0(1097, LiveDistrictRankFinalBattle$SCLiveRankVisibleResetInfo.class, uoc.y);
             uoc.c.Xb(l.d, new a$f(uoc));
             uoc.h.H6(uoc.x);
             if (!PatchProxy.applyVoid(objArray, uoc, uoa4, "3")) {
                if (uoc.b.e()) {
                   b = b.a(-416381922).b;
                   boolean b1 = (b != null && b.mIsHourlyRankStrengthNoticeEnable != null)? true: false;
                   uoc.r = b1;
                   b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "[district strength] anchor fetch strength notice : "+uoc.r);
                }else {
                   g = uoc.g;
                   if (g != null) {
                      uoc.j = g.W().subscribe(new b(uoc), Functions.d());
                   }
                }
             }
          }
       }
    label_01fa :
       return;
    }
    public void J8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       this.S8();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          uoc = this.C;
          String str = "2";
          if (uoc != null && !PatchProxy.applyVoid(objArray, uoc, i.class, str)) {
             uoc.b.u().o(1092, uoc.w);
             uoc.c.S8(l.e);
             i k = uoc.k;
             if (k != null) {
                k.dispose();
             }
             uoc.i.Q0(uoc.y);
             k1.n(uoc);
             k1.n(uoc.t);
          }
          uoc = this.D;
          if (uoc != null && !PatchProxy.applyVoid(objArray, uoc, a.class, str)) {
             uoc.b.u().o(983, uoc.v);
             uoc.b.u().o(1097, uoc.y);
             uoc.c.S8(l.d);
             a j = uoc.j;
             if (j != null) {
                j.dispose();
             }
             uoc.h.Q0(uoc.x);
             k1.n(uoc);
             k1.n(uoc.s);
          }
       }
    label_0096 :
       return;
    }
    public final int P8(){
       c obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       if (obj != null) {
          return obj.b();
       }
       return 0;
    }
    public void R8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.r.u().u0(510, SCActionSignal.class, this.F);
       this.y.a(og).Xb(l.b, new c$d(this));
       this.y.a(og).Xb(l.c, new c$e(this, this.y));
       return;
    }
    public void S8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.r.u().o(510, this.F);
       k1.n(this);
       l b = l.b;
       this.y.a(og).S8(b);
       this.y.a(og).S8(b);
       return;
    }
    public boolean V8(TopDistrictRank p0,LiveFancyRankResultViewV2 p1,long p2){
       ViewGroup$MarginLayoutParams obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, c.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.q = p1;
       boolean b = false;
       if (this.P8() <= 0) {
          p1.setVisibility(8);
          return b;
       }else {
          p1.setFancyRankDelegate(new c$c(this));
          p1.setVisibility(b);
          if (p1.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             obj = p1.getLayoutParams();
             obj.topMargin = b;
             obj.leftMargin = this.P8();
             p1.setLayoutParams(obj);
          }
          p1.setGuardAdapter(new f(this.r));
          if (!PatchProxy.isSupport(LiveFancyRankResultViewV2.class) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p2), p1, LiveFancyRankResultViewV2.class, "3")) {
             if (p1.b.getLayoutParams() != null) {
                p1.b.getLayoutParams().height = -2;
                p1.b.requestLayout();
             }
             p1.g(p0);
             if (!PatchProxy.isSupport(LiveFancyRankResultViewV2.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p2), p1, LiveFancyRankResultViewV2.class, "7")) {
                ViewGroup$LayoutParams layoutParams = p1.b.getLayoutParams();
                layoutParams.height = -2;
                p1.b.setLayoutParams(layoutParams);
                p1.post(new c(p1, p2));
             }
          }
          return true;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_HOURLY_RANK_LIST_SERVICE");
       this.t = this.s8(r.class);
       this.w = this.q8(j$c.class);
       this.u = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.v = this.s8(a0.class);
       this.y = this.r8("LIVE_SERVICE_MANAGER");
       this.B = this.q8(h.class);
       this.x = this.q8(b.class);
       return;
    }
}
