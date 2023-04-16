package com.kuaishou.merchant.home2.MerchantHomePrefetchUtils;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager;
import java.lang.Object;
import com.kuaishou.merchant.home2.feed.model.FeedLivingData;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zw3.d;
import java.util.Objects;
import rw3.c;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.home2.main.Prefetch;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$Config;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$a;
import java.lang.reflect.Type;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$CacheConfig;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.util.HashMap;
import c04.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.google.gson.JsonObject;
import com.kuaishou.pagedy.request.a$a;
import java.util.Map;
import com.kuaishou.pagedy.request.a$b;
import com.kuaishou.pagedy.request.a;
import zw3.b;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Long;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$b;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.merchant.pagedy.a;

public class MerchantHomePrefetchUtils	// class@0016e2
{
    public static MerchantHomePrefetchUtils$CacheConfig a;
    public static final MerchantHomeCacheManager b;

    static {
       MerchantHomePrefetchUtils.b = new MerchantHomeCacheManager();
    }
    public void MerchantHomePrefetchUtils(){
       super();
    }
    public static boolean a(FeedLivingData p0){
       if (p0 == null || p0.mLiveStreamView == null) {
          return false;
       }
       return true;
    }
    public static void b(String p0,String p1){
       MerchantHomePrefetchUtils$Config obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, MerchantHomePrefetchUtils.class, "1")) {
          return;
       }
       Objects.requireNonNull(d.a);
       c.a("merchant_home_onTryPreRequest");
       boolean b = false;
       boolean b1 = a.t().d("merchantHomeRequestPreload", b);
       obj = a.t().getValue(Prefetch.s, MerchantHomePrefetchUtils$Config.class, new MerchantHomePrefetchUtils$Config(obj));
       MerchantHomePrefetchUtils.a = a.t().getValue("merchantHomeAgileCacheConfig", MerchantHomePrefetchUtils$CacheConfig.class, new MerchantHomePrefetchUtils$CacheConfig());
       boolean b2 = a.t().d("merchantHomeAgileNetworkCache", b);
       if (b2 && !("profile").equals(p0)) {
          b = true;
       }
       a.s(MerchantHomeLogBiz.MerchantCache, "MerchantHomePrefetchUtils", "merchantHomeAgileNetworkCache:"+b2+"needPageCache:"+b);
       if (b1) {
          HashMap hashMap = new HashMap();
          a b3 = a.b;
          hashMap.put("payInfo", b3.a(a.b()));
          String str = "channel";
          if (p0 != null) {
             hashMap.put(str, p0);
          }
          a$a uoa = new a$a();
          uoa.g("/rest/app/square/home/mall/dynamic/page");
          uoa.f(hashMap);
          String str1 = "BUYER_HOME_PAGE";
          uoa.e(str1);
          uoa.d(b);
          uoa.b(MerchantHomePrefetchUtils.a.pageExpireDuration);
          uoa.h(new MerchantHomePrefetchUtils$a());
          a uoa1 = uoa.a();
          HashMap hashMap1 = new HashMap();
          hashMap1.put("payInfo", b3.a(a.b()));
          if (p0 != null) {
             hashMap1.put(str, p0);
          }
          hashMap1.put("tabId", Long.valueOf(Long.valueOf(b.a.getLong(b.d("user")+"merchant_home_cache_tab_id", 0)).longValue()));
          hashMap1.put("preload_request_type", p1);
          hashMap1.put("extInfo", "");
          a$a uoa2 = new a$a();
          uoa2.g("/rest/app/square/home/mall/dynamic/feed");
          uoa2.f(hashMap1);
          uoa2.e(str1);
          uoa2.c(obj.mEffectiveDuration);
          uoa2.i(true);
          uoa2.d(b2);
          uoa2.b(MerchantHomePrefetchUtils.a.feedExpireDuration);
          uoa2.h(new MerchantHomePrefetchUtils$b());
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(uoa1);
          uArrayList.add(uoa2.a());
          c.a("merchant_home_onPreRequestStart");
          a.d(uArrayList);
       }
       return;
    }
}
