package com.kuaishou.merchant.cover.lite.LiteMerchantCoverPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import nv.c;
import o63.a;
import su.g;
import xp5.g;
import ov.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.kuaishou.android.live.model.QLivePlayConfig;
import or5.d;
import java.util.HashMap;
import com.google.gson.Gson;
import su.o;
import brd.t;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import pv3.a;
import erd.g;
import crd.b;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopResourceLivePendantSignalData;
import ks3.k0;
import pv3.b;
import com.kuaishou.merchant.cover.lite.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mv3.f;
import c93.b;
import d93.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.cover.Link;
import com.kuaishou.cover.b;
import c30.b;

public class LiteMerchantCoverPresenter extends d	// class@00165b
{
    public g A;
    public b B;
    public d v;
    public a w;
    public k0 x;
    public LiveLiteScatterLoadManager y;
    public String z;

    public void LiteMerchantCoverPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiteMerchantCoverPresenter.class, "5")) {
          return;
       }
       super.E8();
       c.f("LiteMerchantCoverPresenter-onBind, liveId: "+this.d9());
       return;
    }
    public void F8(){
       LiteMerchantCoverPresenter liteMerchant = LiteMerchantCoverPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liteMerchant, "4")) {
          return;
       }
       super.F8();
       c.f("LiteMerchantCoverPresenter-onCreate");
       this.z = this.w.getLiveId();
       if (this.v != null) {
          c.f("LiteMerchantCoverPresenter-onInjectService new pageContext, liveId: "+this.d9());
          this.A = new g("LIVE_WATCH_LITE", this.v.d(), this.v.getLiveStreamId(), this.z);
       }
       b.o().n(this.z);
       LiteMerchantCoverPresenter tv = this.v;
       if (tv != null) {
          LiveMerchantFeedData merchantData = tv.r5().getMerchantData();
          QLivePlayConfig qLivePlayCon = this.v.C0();
          LiteMerchantCoverPresenter tA = this.A;
          String str = (qLivePlayCon.mIsShopLive != null)? "1": "0";
          tA.f = str;
          tA.g = String.valueOf(qLivePlayCon.mPatternType);
          HashMap hashMap = new HashMap();
          hashMap.put("merchantData", new Gson().q(merchantData));
          hashMap.put("kwaiLinkInfo", "");
          this.A.j = hashMap;
          if (merchantData != null && merchantData.isShopLive()) {
             c.f("LiteMerchantCoverPresenter-onCreate isShopLive");
             if (!PatchProxy.applyVoid(objArray, this, liteMerchant, "3")) {
                if (this.A != null) {
                   c.f("LiteMerchantCoverPresenter-requestAgreement: "+this.d9());
                   o.c().q(this.A, "Audience");
                }else {
                   c.b("LiteMerchantCoverPresenter-pageContext is null");
                }
             }
          }else {
             c.f("LiteMerchantCoverPresenter-onCreate isShopLive");
          }
       }
       liteMerchant = this.y;
       if (liteMerchant != null) {
          this.B = liteMerchant.bj().subscribe(new a(this));
       }
       this.X7(this.x.b(960, LiveRoomSignalMessage$SCKwaishopResourceLivePendantSignalData.class).subscribe(new b(this), a.b));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiteMerchantCoverPresenter.class, "8")) {
          return;
       }
       c.f("LiteMerchantCoverPresenter-onDestroy, liveId: "+this.d9());
       LiteMerchantCoverPresenter tB = this.B;
       if (tB != null) {
          tB.dispose();
       }
       if (this.c9() != null) {
          this.c9().u();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiteMerchantCoverPresenter.class, "7")) {
          return;
       }
       super.J8();
       c.f("LiteMerchantCoverPresenter-onUnbind, liveId: "+this.d9());
       o.c().v("LIVE_WATCH_LITE", this.z);
       if (this.c9() != null) {
          this.c9().v();
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteMerchantCoverPresenter.class, "1")) {
          return;
       }
       c.f("LiteMerchantCoverPresenter-onInjectService");
       this.v = p0.a(d.class);
       this.y = p0.a(LiveLiteScatterLoadManager.class);
       this.w = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteMerchantCoverPresenter.class, "2")) {
          return;
       }
       c.f("LiteMerchantCoverPresenter-onInjectService");
       this.x = p0.a(k0.class);
       return;
    }
    public f c9(){
       Object obj = PatchProxy.apply(null, this, LiteMerchantCoverPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Link.h().m() != null && (Link.h().m().a() == null || !Link.h().m().a() instanceof f)) {
          return null;
       }
       return Link.h().m().a();
    }
    public final String d9(){
       LiteMerchantCoverPresenter tz = this.z;
       if (tz == null) {
          tz = "";
       }
       return tz;
    }
}
