package com.kuaishou.live.audience.component.gift.gift.audience.v2.k$b;
import jk1.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import w91.a;
import java.util.Objects;
import t02.a0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ik1.d0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import u07.u;
import com.kuaishou.live.common.core.component.recharge.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import mk1.d0;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import mk1.h;
import bl1.a;
import ql1.c;
import android.database.Observable;
import wk1.b;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import mk1.f;
import com.kwai.framework.model.user.UserInfo;
import mk1.b$c;
import mk1.b$b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import e92.a;
import brd.t;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import lp3.e;
import lp3.c;
import lp3.b;
import jk1.c;
import java.lang.Long;
import d61.g;
import rw1.i$a;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import rw1.i;
import lnc.a1;
import java.lang.CharSequence;
import z12.x;

public class k$b implements f	// class@000b1f
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void B1(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void Cf(int p0){
       k k;
       LiveLogTag liveLogTag;
       List list;
       d0 uod0;
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "8")) {
          return;
       }
       uob = this.b;
       Map map = uob.I.d6();
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), "LIVE_ROOM_SEND_GIFT", map, uob, k.class, "15")) {
          a0 z2 = uob.w.Z2;
          Activity activity = uob.getActivity();
          k = uob.K;
          p op = p.class;
          int i = 1;
          int i1 = 0;
          if (PatchProxy.isSupport(op)) {
             Object[] objArray = new Object[]{z2,activity,Integer.valueOf(i1),"LIVE_ROOM_SEND_GIFT",k,map};
             if (!PatchProxy.applyVoid(objArray, null, op, "10")) {
             }
          }else {
          }
       }
    label_00b7 :
       return;
    }
    public void G9(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "18")) {
          return;
       }
       this.b.r.remove(p0);
       return;
    }
    public void Hh(boolean p0,int p1){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "13")) {
          return;
       }
       k u = this.b.u;
       if (u != null) {
          Objects.requireNonNull(u);
          if (!PatchProxy.isSupport(LiveAudienceGiftBoxFragment.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), u, LiveAudienceGiftBoxFragment.class, "6")) {
             LiveAudienceGiftBoxFragment z = u.z;
             if (z == null) {
                b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [autoRefreshNormalGiftPanel]: mGiftCallerContext is null ");
             }else {
                h o = z.o;
                if (o == null) {
                   b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [autoRefreshNormalGiftPanel]: mGiftCallerContext.mGiftBoxGiftGridViewService  is null ");
                }else {
                   o.E2(p0, p1);
                }
             }
          }
       }
       return;
    }
    public void K2(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "15")) {
          return;
       }
       this.b.q.registerObserver(p0);
       return;
    }
    public void K4(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "12")) {
          return;
       }
       k u = this.b.u;
       if (u != null) {
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoidOneRefs(p0, u, LiveAudienceGiftBoxFragment.class, "5")) {
             LiveAudienceGiftBoxFragment z = u.z;
             if (z == null) {
                b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [hideComboButton]: mGiftCallerContext is null ");
             }else {
                h a = z.A;
                if (a == null) {
                   b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [hideComboButton]: mGiftCallerContext.mGiftBoxComboButtonService is null ");
                }else {
                   a.K4(p0);
                }
             }
          }
       }else {
          b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxPresenter] [mLiveAudienceGiftBoxFragment]: mLiveAudienceGiftBoxFragment is null from = "+p0);
       }
       return;
    }
    public void Ng(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "17")) {
          return;
       }
       this.b.r.add(p0);
       return;
    }
    public List O3(){
       Object obj = PatchProxy.apply(null, this, k$b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.M.O3();
    }
    public void On(){
    }
    public void Tg(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "3")) {
          return;
       }
       b$b uob = PatchProxy.applyOneRefs(p0, null, b$c.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = b$c.a(p0, -1);
       }
       uob.d(GiftTab.PacketGift);
       this.bb(uob.a());
       return;
    }
    public void Ug(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "22")) {
          return;
       }
       b9.a(this.b.W);
       return;
    }
    public void Vg(int p0){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       Gift gift = a.a(p0);
       k w = this.b.w;
       if (w != null) {
          if (gift != null) {
             this.bb(a.c(null, p0, w));
          }else {
             this.bb(a.c(null, -1, w));
          }
       }
       return;
    }
    public boolean Wc(){
       return this.b.R;
    }
    public t Wf(){
       return this.b.T;
    }
    public boolean X3(){
       k obj = PatchProxy.apply(null, this, k$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.u;
       boolean b = (obj != null && obj.ch())? true: false;
       return b;
    }
    public void Yc(ILiveDefaultSelectGiftIdInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "21")) {
          return;
       }
       this.b.s.a(p0);
       return;
    }
    public void bb(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
          return;
       }
       this.b.V8(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void fl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "6")) {
          return;
       }
       this.b.p.add(p0);
       return;
    }
    public boolean ge(int p0,String p1,long p2,Map p3){
       Activity obj;
       if (PatchProxy.isSupport(k$b.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), p3, this, k$b.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.getActivity();
       boolean b = true;
       if (g.h(obj)) {
          List list = LiveLogTag.LIVE_INSUFFICIENT_DIALOG.appendTag("LiveAudienceGiftBoxPresenter");
          if (obj != null) {
             b = false;
          }
          b.S(list, "Cannot show insufficient dialog", "activity is null?", Boolean.valueOf(b));
          return false;
       }else {
          i$a uoa = new i$a();
          uoa.g(a.c(this.b.getActivity(), this.b.w, "gift_box_bottom_entry", false));
          uoa.k(p1);
          uoa.j(this.b.w.Z2.getLiveStreamId());
          uoa.a(this.b.w.Z2.d());
          uoa.h(p2);
          uoa.i(this.b.K);
          uoa.f(this.b.w.c.getExpTag());
          uoa.e(a.e(this.b.w));
          uoa.d(a.a(this.b.w));
          uoa.b(this.b.I.d6());
          d.i(this.b.getActivity(), uoa.c());
          x.H(a1.p(R.string.arg_RES_7f101c45));
          return b;
       }
    }
    public void ie(ILiveDefaultSelectGiftIdInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "20")) {
          return;
       }
       this.b.s.c(p0);
       return;
    }
    public void ii(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "7")) {
          return;
       }
       this.b.p.remove(p0);
       return;
    }
    public void ka(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "11")) {
          return;
       }
       this.b.M.m().subscribe();
       return;
    }
    public boolean o3(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, k$b.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b.u;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, LiveAudienceGiftBoxFragment.class, "29");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             LiveAudienceGiftBoxFragment z = obj.z;
             if (z != null) {
                h a = z.A;
                if (a != null && a.c()) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (b1) {
          label_0044 :
             return b;
          }
       }
       b = true;
       goto label_0044 ;
    }
    public void p3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "16")) {
          return;
       }
       this.b.q.unregisterObserver(p0);
       return;
    }
    public void u2(boolean p0,int p1){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "14")) {
          return;
       }
       k u = this.b.u;
       if (u != null) {
          Objects.requireNonNull(u);
          if (!PatchProxy.isSupport(LiveAudienceGiftBoxFragment.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), u, LiveAudienceGiftBoxFragment.class, "7")) {
             LiveAudienceGiftBoxFragment z = u.z;
             if (z == null) {
                b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [refreshAllPanelGiftData]: mGiftCallerContext is null ");
             }else {
                h o = z.o;
                if (o == null) {
                   b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [refreshAllPanelGiftData]: mGiftCallerContext.mGiftBoxGiftGridViewService  is null ");
                }else {
                   o.u2(p0, p1);
                }
             }
          }
       }
       return;
    }
}
