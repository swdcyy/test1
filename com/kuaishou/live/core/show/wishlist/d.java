package com.kuaishou.live.core.show.wishlist.d;
import im8.g;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.wishlist.d$c;
import com.kuaishou.live.core.show.wishlist.e;
import java.util.HashSet;
import nn2.b0;
import nn2.a0;
import com.kuaishou.live.core.show.wishlist.d$a;
import nn2.y;
import w51.a;
import t02.a0;
import jp3.a;
import android.content.SharedPreferences;
import gw1.a;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListClosed;
import lp3.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import lp3.c;
import xq5.c;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import mq5.h;
import mq5.b;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import vq5.d;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.voiceparty.model.VoicePartyAbParams;
import co2.f2;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import xp5.a;
import nn2.e0;
import nn2.f0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.util.Set;
import ks5.c;
import ab1.g;
import msd.a;
import nn2.z;
import java.util.Objects;
import nn2.v1;
import nn2.c0;
import nn2.d0;
import vq5.b;
import nn2.h0;
import vf1.a;
import vf1.b;
import ry1.b;
import brd.t;
import com.kuaishou.live.core.show.wishlist.d$b;
import erd.g;
import com.kuaishou.live.core.show.wishlist.g;
import java.util.Map;
import java.util.HashMap;

public class d extends c implements g	// class@0012d4
{
    public boolean A;
    public g B;
    public boolean C;
    public f2 D;
    public boolean E;
    public boolean F;
    public b G;
    public final g H;
    public final g I;
    public final c J;
    public final b K;
    public a0 p;
    public m q;
    public LiveBizParam r;
    public c s;
    public d t;
    public d$c u;
    public b v;
    public LiveAudienceWishListPendentController w;
    public b x;
    public h y;
    public final Set z;
    public static String sLivePresenterClassName = "LiveAudienceWishListPresenter";

    public void d(){
       super();
       e uoe = PatchProxy.apply(null, this, d.class, "8");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this);
       }
       this.u = uoe;
       this.z = new HashSet();
       this.E = false;
       this.F = false;
       this.H = new b0(this);
       this.I = new a0(this);
       this.J = new d$a(this);
       this.K = new y(this);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (a.O()) {
          return;
       }
       if (this.p.e != null && !a.a.getBoolean("disableAudienceWishList", false)) {
          if (!a.c()) {
             this.P8();
             this.A = true;
          }
          this.q.u().u0(410, LiveStreamMessages$SCWishListOpened.class, this.H);
          this.q.u().u0(411, LiveStreamMessages$SCWishListClosed.class, this.I);
          this.q.t5().a(LiveSlidePlayService.class).P4(this.J);
          this.R8();
          this.S8();
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       if (a.O()) {
          return;
       }
       if (this.x != null) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN,AudienceBizRelation.LIVE_GIFT_RAMPAGE,AudienceBizRelation.PK_SMALL_WINDOW};
          this.p.N().G5(this.x, uoaArray);
       }
       d ty = this.y;
       if (ty != null) {
          this.p.D2.le(ty);
       }
       ty = this.w;
       if (ty != null) {
          ty.d();
       }
       this.w = objArray;
       this.q.u().o(410, this.H);
       this.q.u().o(411, this.I);
       this.t.Z4("wishlist");
       this.q.t5().a(LiveSlidePlayService.class).d5(this.J);
       this.V8();
       b9.a(this.G);
       return;
    }
    public final void P8(){
       d d;
       LiveAudienceWishListPendentController liveAudience = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, liveAudience, uod, "7")) {
          return;
       }
       d = liveAudience.D;
       VoicePartyAbParams voicePartyAb = (d != null)? d.u().mEnableVoicePartyWishList: false;
       LiveAudienceWishListPendentController liveAudience1 = new LiveAudienceWishListPendentController(this.m8(), liveAudience.p, liveAudience.r, liveAudience.z, liveAudience.s, liveAudience.B, b.d(this), liveAudience.p.y4().c(), voicePartyAb, new e0(liveAudience), new f0(liveAudience));
       liveAudience.w = d;
       z oz = new z(liveAudience);
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(oz, d, LiveAudienceWishListPendentController.class, "36")) {
          d.n = oz;
          d.D();
       }
       c0 uoc0 = PatchProxy.apply(null, liveAudience, uod, "9");
       if (uoc0 != patchProxyRe) {
       }else {
          uoc0 = new c0(liveAudience);
       }
       liveAudience.x = uoc0;
       d0 uod0 = PatchProxy.apply(null, liveAudience, uod, "10");
       if (uod0 != patchProxyRe) {
       }else {
          uod0 = new d0(liveAudience);
       }
       liveAudience.y = uod0;
       liveAudience.p.D2.Km(uod0);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_THEATER_PORTRAIT_FULL_SCREEN,AudienceBizRelation.LIVE_GIFT_RAMPAGE,AudienceBizRelation.PK_SMALL_WINDOW};
       liveAudience.p.N().u5(liveAudience.x, uoaArray);
       d = liveAudience.t;
       h0 oh0 = PatchProxy.apply(null, liveAudience, uod, "11");
       if (oh0 != patchProxyRe) {
       }else {
          oh0 = new h0(liveAudience);
       }
       d.t5("wishlist", oh0);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.q.t5().a(a.class).Z9(this.K);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       b9.a(this.G);
       this.G = this.q.t5().a(b.class).T3().subscribe(new d$b(this));
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.q.t5().a(a.class).uh(this.K);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new g());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.q8(LiveBizParam.class);
       this.B = this.r8("LIVE_SERVICE_WISH_AND_RAMGGE_SERVICE");
       this.s = this.s8(c.class);
       this.t = this.r8("LIVE_ROUTER_SERVICE");
       this.D = this.s8(f2.class);
       return;
    }
}
