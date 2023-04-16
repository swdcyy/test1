package com.kuaishou.merchant.live.lite.LiveMerchantLiteRouterPresenter;
import b93.d;
import com.kuaishou.merchant.live.lite.LiveMerchantLiteRouterPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h64.q;
import cb4.e;
import com.kuaishou.merchant.router.b;
import c24.c;
import o63.a;
import or5.d;
import c24.a;
import c24.b;
import com.kuaishou.cover.d;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import xp5.g;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Boolean;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.basic.router.b;
import h64.p;
import z1.k;
import com.kuaishou.merchant.a;
import h64.r;
import com.kuaishou.merchant.live.basic.router.g;
import android.app.Activity;
import android.content.Context;
import c93.b;
import vq5.d;
import d93.a;
import d93.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.UUID;
import ks3.b;

public class LiveMerchantLiteRouterPresenter extends d	// class@001a29
{
    public final b A;
    public d v;
    public d w;
    public a x;
    public i y;
    public String z;
    public static String B = "LiveMerchantLiteRouterPresenter";

    public void LiveMerchantLiteRouterPresenter(){
       super();
       this.A = new LiveMerchantLiteRouterPresenter$a(this);
    }
    public void F8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMerchantLiteRouterPresenter.class, "4")) {
          return;
       }
       super.F8();
       b.g(this.z, "^kwailive://.*", new q(this));
       LiveMerchantLiteRouterPresenter tz = this.z;
       c uoc = new c(this.x.I4(), this.x.getLiveId(), tz, this.w);
       b.g(tz, "kwaimerchant://openhalfrn", new a(uoc));
       b.g(this.z, "kwaimerchant://rndialog", new a(uoc));
       b uob = new b(uoc, new d());
       b.g(this.z, "kwaimerchant://link", uob);
       LiveMerchantBaseContext$Builder uBuilder = new LiveMerchantBaseContext$Builder().setLiveStreamId(this.w.getLiveStreamId()).setLiveAuthorId(this.w.d()).setLiveAuthorUser(this.w.I());
       LiveMerchantLiteRouterPresenter ty = this.y;
       if (ty != null) {
          objArray = ty.a();
       }
       LiveMerchantBaseContext liveMerchant = uBuilder.setLiveStreamPackage(objArray).setNeedDowngrade(this.w.U()).setLiveType(1).setLiveFeed(this.w.j0()).setMerchantSessionId(this.z).setServerExpTag(r1.I1(this.w.j0())).build();
       b = a.t().d("enableMRouter2KRouterOptimize", false);
       a.t(MerchantCommonLogBiz.ROUTER, LiveMerchantLiteRouterPresenter.B, "registerDefaultHandler", "enableMRouterOptimize", Boolean.valueOf(b));
       if (b) {
          b.g(this.z, ".*", new b(new p(liveMerchant)));
       }else {
          b.g(this.z, "kwaimerchant://openhalfweb", new a());
          b.g(this.z, "^https?://", new r(this));
          b.g(this.z, "^kwai://merchant.*", new g(this.getActivity(), liveMerchant));
          b.g(this.z, "^kwaimerchant://.*", new g(this.getActivity(), liveMerchant));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteRouterPresenter.class, "5")) {
          return;
       }
       b.t(this.z, "^kwailive://.*");
       b.t(this.z, "^https?://");
       b.t(this.z, "kwaimerchant://openhalfrn");
       b.t(this.z, "kwaimerchant://rndialog");
       b.t(this.z, "kwaimerchant://openhalfweb");
       b.t(this.z, "kwaimerchant://link");
       b.t(this.z, "^kwai://merchant.*");
       b.t(this.z, "^kwaimerchant://.*");
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteRouterPresenter.class, "2")) {
          return;
       }
       this.v = p0.a(d.class);
       this.w = p0.a(d.class);
       this.y = p0.a(i.class);
       this.x = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteRouterPresenter.class, "3");
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteRouterPresenter.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(this.z)) {
          this.z = UUID.randomUUID().toString();
       }
       p0.d(b.class, this.A);
       return;
    }
}
