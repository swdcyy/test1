package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e$a;
import i82.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.krn.event.a;
import oj0.a;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.d;
import lnc.c3$a;
import lnc.c3;
import rq5.a;
import i82.h;
import ks5.m;
import i82.i;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.n;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;
import kg1.e;
import android.view.View;
import java.util.HashMap;
import p91.m;
import java.lang.Long;
import k82.b;
import k82.a;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import bp6.a;
import erd.g;
import i82.e;
import com.kwai.robust.PatchProxyResult;
import i82.p;
import java.util.Map;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LivePendantInfo;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import i2b.a;
import i82.f;
import i82.g;
import i82.b;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.f;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import t02.a0;
import com.yxcorp.utility.TextUtils;
import pq5.c;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import i82.c;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.c;
import i82.j;

public abstract class e extends f implements g	// class@000b34
{
    public a0 K;
    public m L;
    public c M;
    public LiveTopPendantTempPlayService N;
    public e O;
    public b P;
    public b Q;
    public b R;
    public b S;
    public boolean T;
    public n U;
    public boolean V;
    public Object W;
    public final a X;
    public a Y;
    public e$b Z;
    public static String sLivePresenterClassName = "LiveAudienceSuperFansGroupLuckyBagPendantBasePresenter";

    public void e(){
       super();
       this.T = false;
       this.V = false;
       this.X = new a(this);
       this.Y = new e$a(this);
       this.Z = new d(this);
    }
    public void Q(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "3")) {
          return;
       }
       a.b().c("fetch_lucky_bag_pendant_info", this.X);
       b9.a(this.R);
       b9.a(this.P);
       b9.a(this.Q);
       b9.a(this.S);
       this.e9();
       this.T = false;
       this.V = false;
       c3.c(this.U, d.a);
       e tW = this.W;
       if (!PatchProxy.applyVoidOneRefs(tW, this, uoe, "13")) {
          if (tW instanceof a) {
             c3.c(this.M, new h(tW));
          }else if(tW instanceof m){
             c3.c(this.N, new i(tW));
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.e9();
       this.V = false;
       return;
    }
    public void W8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "4")) {
          return;
       }
       if (this.V == null) {
          e tU = this.U;
          if (tU != null) {
             Objects.requireNonNull(tU);
             if (!PatchProxy.applyVoid(null, tU, n.class, "1")) {
                tU.b.f();
             }
             this.d9();
          }else if(PatchProxy.applyVoid(null, this, uoe, "10")){
             uoe = this.O;
             if (uoe != null && uoe.zn()) {
                this.d9();
             }
          }
       }else {
          goto label_002b ;
       }
       return;
    }
    public abstract Object a9(View p0);
    public abstract String b9();
    public abstract int c9();
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("reportTimeMs", Long.valueOf(this.L.s()));
       b9.a(this.S);
       this.S = a.b().b(this.L.getLiveStreamId(), a.a.q(hashMap)).subscribe(new a(), new a());
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       c3.c(this.U, new e(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new p());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public final void h9(LiveSuperFansGroupInfo p0){
       boolean b2;
       String str1;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "6")) {
          return;
       }
       e obj = PatchProxy.applyOneRefs(p0, this, uoe, "8");
       boolean b = true;
       boolean b1 = false;
       if (obj != patchProxyRe) {
          b2 = obj.booleanValue();
       }else if(p0 == null){
          b.Z(LiveLogTag.LIVE_SUPER_FANS_GROUP_PENDANT, "cannot show lucky bag pendant. superFansGroupInfo is null");
       }else {
          LiveSuperFansGroupInfo mPendantInfo1 = p0.mPendantInfo;
          if (mPendantInfo1 == null) {
             b.Z(LiveLogTag.LIVE_SUPER_FANS_GROUP_PENDANT, "cannot show lucky bag pendant. pendantInfo is null");
          }else if(mPendantInfo1.mEnable == null){
             b.Z(LiveLogTag.FANS_GROUP, "cannot show lucky bag pendant. enable is false");
          }else if(this.T != null){
             b.Z(LiveLogTag.LIVE_SUPER_FANS_GROUP_PENDANT, "show lucky bag pendant");
             b2 = true;
          }
       }
       b2 = false;
       if (!b2) {
          return;
       }else {
          this.T = b;
          LiveSuperFansGroupInfo mPendantInfo = p0.mPendantInfo;
          View view = a.d(this.getContext(), this.c9(), null, b1);
          p0 = this.a9(view);
          this.W = p0;
          if (p0 instanceof a) {
             c3.c(this.M, new f(p0));
          }else if(p0 instanceof m){
             c3.c(this.N, new g(p0));
          }
          obj = this.W;
          f uof = PatchProxy.applyOneRefs(obj, this, uoe, "9");
          if (uof != patchProxyRe) {
          }else {
             uof = new f(this, obj);
          }
          Object obj1 = uof;
          String str = this.b9();
          Object obj2 = PatchProxy.apply(null, this, uoe, "7");
          if (obj2 != patchProxyRe) {
             str1 = obj2;
          }else if(this.K.c0() != null){
             str2 = TextUtils.k(this.K.c0().stidContainer);
          }else {
             str2 = "";
          }
          str1 = str2;
          n on = new n(view, mPendantInfo, obj1, str, str1);
          this.U = p0;
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.r8("LIVE_BASIC_CONTEXT");
       this.M = this.s8(c.class);
       this.N = this.s8(LiveTopPendantTempPlayService.class);
       this.O = this.r8("LIVE_FANS_GROUP_SERVICE");
       return;
    }
    public void x(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       this.V = true;
       a.b().a("fetch_lucky_bag_pendant_info", this.X);
       b9.a(this.P);
       this.P = this.O.v6().subscribe(new c(this), c.b);
       b9.a(this.Q);
       this.Q = this.O.Rm().subscribe(new j(this), new a());
       return;
    }
}
