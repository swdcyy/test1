package com.kuaishou.merchant.live.basic.router.b;
import cb4.e;
import z1.k;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import tkd.b;
import tkd.d;
import ma4.e;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.router.RouterConfig;
import c24.j;
import z1.a;
import android.net.Uri;
import com.kuaishou.merchant.basic.util.f;
import ekd.x0;
import java.lang.StringBuilder;
import ab4.g;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.merchant.basic.util.FoldUtils;
import fs5.a;
import fs3.e;
import wp5.c;
import java.util.Collection;

public final class b implements e	// class@0018c1
{
    public final k a;

    public void b(k p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       b uob = b.class;
       String str = "1";
       MerchantCommonLogBiz obj = PatchProxy.applyOneRefs(p0, this, uob, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = MerchantCommonLogBiz.ROUTER;
       a.s(obj, "LiveDefaultRouterHandlerV2", "onHandle");
       if (d.a(-1103669376).M3(p0)) {
          return true;
       }
       LiveMerchantBaseContext liveMerchant = this.a.get();
       if (!PatchProxy.applyVoidTwoRefs(p0, liveMerchant, this, uob, "2")) {
          a.s(obj, "LiveDefaultRouterHandlerV2", "handleLiveContext");
          p0.c().g(new j(liveMerchant));
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, liveMerchant, this, uob, "3")) {
          String str1 = p0.d().toString();
          a.t(obj, "LiveDefaultRouterHandlerV2", "handleUrlLink: before", "url", str1);
          Uri uri = x0.f(f.p(f.o(str1, liveMerchant), liveMerchant));
          if (!PatchProxy.applyVoidOneRefs(uri, p0, RouterRequest.class, str)) {
             g.b("RouterRequest", "setUri: oldUri="+p0.b+" newUri="+uri);
             p0.b = uri;
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, liveMerchant, this, uob, "4")) {
          a.s(obj, "LiveDefaultRouterHandlerV2", "handleLiveFloatWindow");
          Activity uActivity = p0.a();
          BaseFeed liveFeed = liveMerchant.getLiveFeed();
          if (liveFeed instanceof LiveStreamFeed && !FoldUtils.b(uActivity)) {
             d.a(-1397441499).k1(uActivity, liveFeed, "merchant_float_window", d.a(0x55e6228c).i0(), d.a(0x55e6228c).p());
          }
       }
       return false;
    }
    public String getName(){
       return "LiveDefaultRouterHandlerV2";
    }
}
