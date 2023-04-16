package com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper;
import com.kuaishou.merchant.preload.net.cache.PreloadCache;
import java.lang.String;
import java.lang.Object;
import ds3.a;
import ds3.l;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import b24.a;
import java.util.HashMap;
import h44.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import android.content.Context;
import lnc.a1;
import ot3.l0;
import android.util.Pair;
import sa4.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper$Config;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper$1;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import v34.b;
import v34.b$a;
import com.kuaishou.merchant.live.cart.onsale.audience.preload.LiveShopPreloadHelper$DynamicConfig;
import wu4.a;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import java.lang.Throwable;
import com.kuaishou.merchant.preload.PreloadConfig;
import com.kuaishou.merchant.preload.PreloadConfig$a;
import qa4.f;

public class LiveShopPreloadHelper	// class@001972
{
    public static List a;

    static {
       PreloadCache d = PreloadCache.d;
       d.d("/rest/app/eshop/ks/live/item/byGuest", 10);
       d.d("/rest/app/flow/live/c/car/item/list", 10);
    }
    public void LiveShopPreloadHelper(){
       super();
    }
    public static Map a(a p0,l p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveShopPreloadHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.a(-337650694).a()) {
          return LiveShopPreloadHelper.b(p0, p1);
       }
       obj = new HashMap();
       b a = b.a;
       obj.putAll(a.a(p0, p1));
       obj.putAll(a.c(p0, p1, false));
       HashMap hashMap = new HashMap();
       Iterator iterator = obj.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          hashMap.put(key, String.valueOf(uEntry.getValue()));
       }
       return hashMap;
    }
    public static Map b(a p0,l p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveShopPreloadHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("liveStreamId", p0.b.getLiveStreamId());
       obj.put("serverExpTag", p0.b.getServerExpTag());
       obj.put("source", String.valueOf(p0.i));
       obj.put("fanGroupLevel", String.valueOf(p0.b.getFansGroupLevel()));
       obj.put("livePayload", p0.b.getLivePayload());
       obj.put("pcursor", "");
       obj.put("context", "");
       obj.put("anchorItemId", p1.k);
       obj.put("buyerCouponId", p1.f);
       obj.put("yellowCarSource", String.valueOf(p1.e));
       obj.put("tabType", "0");
       obj.put("tabId", "");
       obj.put("payload", p1.g);
       obj.put("screenLogicWidth", String.valueOf(l0.h(a1.c())));
       obj.put("sellerId", p0.b.getLiveAuthorId());
       return obj;
    }
    public static Pair c(a p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveShopPreloadHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreloadCache.d.c(new a("/rest/app/eshop/ks/live/item/byGuest", LiveShopPreloadHelper.b(p0, p1)), CommodityListGuestResponse.class);
    }
    public static String d(){
       String obj = PatchProxy.apply(null, null, LiveShopPreloadHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (b.a(-337650694).a())? "MERCHANT_AUDIENCE_ON_SALE_ULTRON": "MERCHANT_AUDIENCE_ON_SALE";
       return obj;
    }
    public static String e(){
       String obj = PatchProxy.apply(null, null, LiveShopPreloadHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (b.a(-337650694).a())? "/rest/app/flow/live/c/car/item/list": "/rest/app/eshop/ks/live/item/byGuest";
       return obj;
    }
    public static LiveShopPreloadHelper$Config f(){
       Object obj = PatchProxy.apply(null, null, LiveShopPreloadHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("merchantAudienceShopPreload", LiveShopPreloadHelper$Config.class, new LiveShopPreloadHelper$Config());
    }
    public static void g(){
       List a;
       if (PatchProxy.applyVoid(null, null, LiveShopPreloadHelper.class, "12")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (!uActivity instanceof FragmentActivity) {
          return;
       }
       MerchantCartLogBiz lIVE_SHOP_PR = MerchantCartLogBiz.LIVE_SHOP_PRELOAD;
       try{
          a.s(lIVE_SHOP_PR, "LiveShopPreloadHelper", "preloadDynamicView");
          a = LiveShopPreloadHelper.a;
          if (a == null) {
             a = a.t().getValue("merchantCartDyPreloadConfig", new LiveShopPreloadHelper$1().getType(), new ArrayList());
             LiveShopPreloadHelper.a = a;
          label_0042 :
             ArrayList uArrayList = new ArrayList();
             if (!q.f(a)) {
                Map map = b.h.a();
                Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                   LiveShopPreloadHelper$DynamicConfig uDynamicConf = iterator.next();
                   if (uDynamicConf != null) {
                      uArrayList.add(new a(uDynamicConf.renderUrl, uDynamicConf.count, map));
                   }
                }
             }
             if (!q.f(uArrayList)) {
                BundlePreloadUtil.e(uActivity, uArrayList);
                a.t(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveShopPreloadHelper", "preloadDynamicView", "config", a);
             }
          }else {
             goto label_0042 ;
          }
       }catch(java.lang.Exception e0){
          a.l(MerchantCartLogBiz.LIVE_SHOP_PRELOAD, "LiveShopPreloadHelper", "preloadDynamicView", e0);
       }
       return;
    }
    public static void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveShopPreloadHelper.class, "4")) {
          return;
       }
       if (LiveShopPreloadHelper.f().mPreloadEachEnable != null && PreloadConfig.Companion.a()) {
          f.a.b(p0);
       }
       LiveShopPreloadHelper.g();
       return;
    }
    public static void i(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveShopPreloadHelper.class, "8")) {
          return;
       }
       PreloadCache.d.e(new a(LiveShopPreloadHelper.e(), LiveShopPreloadHelper.a(p0, p1)), LiveShopPreloadHelper.f().mCurrentCacheTime);
       return;
    }
}
