package com.kuaishou.merchant.live.basic.router.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c24.q;
import cb4.e;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler;
import fq5.b;
import ks3.d0;
import ks3.r;
import c24.i0;
import ls3.b;
import c24.m;
import c24.p0;
import ks3.f0;
import ks3.t;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import c24.r;
import ks3.x;
import c24.h;
import cs3.a;
import c24.n;
import com.kuaishou.merchant.live.basic.router.e;
import ks3.h;
import mb4.c;
import gu3.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import fu3.a;
import vq5.d;

public class c extends PresenterV2	// class@0018c2
{
    public d p;
    public f0 q;
    public d0 r;
    public b s;
    public b t;
    public x u;
    public a v;
    public h w;

    public void c(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       b.h("^kwailive://.*", new q(this));
       b.h("kwaimerchant://openMagicFace", new MagicEffectRouterHandler(this.s, this.r, objArray));
       b.h("kwaimerchant://pendantContainer", new i0(this.t));
       b.h("kwaimerchant://openhalfrn", new m(new p0(objArray, this.q, objArray, 0)));
       b.h("kwaimerchant://rndialog", new m(new p0(objArray, this.q, objArray, 0)));
       b.h("kwaimerchant://auctionRecord", new r(new LiveMerchantBaseContext$Builder().setLiveStreamId(this.s.getLiveStreamId()).setLiveAuthorId(this.s.d()).setLiveAuthorUser(this.s.I()).setLiveStreamPackage(this.s.a()).setIsAnonymousLive(0).build(), this.u));
       b.h("kwaimerchant://liveAnchorOnsale", new h(this.v));
       b.h("kwaimerchant://uploadExplainAndHotLog", new n(this.s));
       b.h("kwaimerchant://captureSandeaHeadImage", new e(this.w));
       b.h(".*", new c());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       b.u("^kwailive://.*");
       b.u("kwaimerchant://openMagicFace");
       b.u("kwaimerchant://pendantContainer");
       b.u("kwaimerchant://openhalfrn");
       b.u("kwaimerchant://rndialog");
       b.h("kwaimerchant://openhalfrn", new a());
       b.h("kwaimerchant://rndialog", new a());
       b.u("kwaimerchant://auctionRecord");
       b.u("kwaimerchant://liveAnchorOnsale");
       b.u("kwaimerchant://uploadExplainAndHotLog");
       RxBus.f.b(new a());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.r = this.t8("LIVE_MERCHANT_EFFECT_SERVICE");
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_MERCHANT_PENDANT_SERVICE");
       this.u = this.r8("LIVE_MERCHANT_AUCTION_SERVICE");
       this.v = this.q8(a.class);
       this.w = this.r8("LIVE_MERCHANT_ANCHOR_SANDEABIZ_SERVICE");
       return;
    }
}
