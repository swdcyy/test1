package b04.d$a;
import tu.b;
import b04.d;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$CacheConfig;
import java.lang.System;
import rw3.c;
import zw3.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.lang.Long;
import java.util.HashMap;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentHierarchyInfo;
import ww3.a;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager;
import wkd.b;
import com.kwai.framework.cache.CacheManager;

public class d$a implements b	// class@0002f3
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public PageComponentResponse a(String p0,Map p1){
       String str2;
       Long longx;
       boolean b;
       Object obj = this;
       PageComponentResponse obj1 = p0;
       SharedPreferences obj2 = p1;
       String str = "1";
       MerchantHomePrefetchUtils$CacheConfig obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, d$a.class, str);
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       MerchantHomePrefetchUtils$CacheConfig uCacheConfig = 0x36ee80;
       MerchantHomePrefetchUtils$CacheConfig uCacheConfig1 = 0x5265c00;
       obj3 = MerchantHomePrefetchUtils.a;
       if (obj3 != null) {
          uCacheConfig = obj3.feedExpireDuration;
          uCacheConfig1 = obj3.pageExpireDuration;
       }
       long l = System.currentTimeMillis();
       String str1 = "";
       if (("/rest/app/square/home/mall/dynamic/page").equals(obj1)) {
          c.a("merchant_home_onGetPageCacheStart");
          obj1 = PageComponentResponse.class;
          obj2 = b.a;
          str2 = obj2.getString(b.d("user")+"merchant_home_prefetch_page_cache", "null");
          obj1 = (str2 == null || str2 == str1)? null: b.a(str2, obj1);
          longx = Long.valueOf(obj2.getLong(b.d("user")+"merchant_home_prefetch_time_page_cache", 0));
          if (obj1 != null && (longx == null || (l - longx.longValue()) - uCacheConfig1 > 0)) {
             return null;
          }else {
             HashMap hashMap = new HashMap();
             PageComponentResponse data = obj1.data;
             if (data != null) {
                PageComponentInfo hierarchy = data.hierarchy;
                if (hierarchy != null) {
                   PageComponentHierarchyInfo structure = hierarchy.structure;
                   if (structure != null) {
                      hashMap.put("cache_size", String.valueOf(structure.size()));
                   }
                }
             }
             hashMap.put("pageName", "MERCHANT_HOME_PAGE3");
             c.b("merchant_home_onGetPageCacheEnd", hashMap);
             return obj1;
          }
       }else if(("/rest/app/square/home/mall/dynamic/feed").equals(obj1)){
          c.a("merchant_home_onGetFeedCacheStart");
          str2 = "0";
          if (a.b()) {
             String str3 = "tabId";
             if (obj2.get(str3) != null) {
                str3 = obj2.get(str3).toString();
                d y = obj.a.y;
                obj1 = (y.c == null)? b.a(0x5f2ddeb4).g(y.f(str3), PageComponentResponse.class): null;
                if (obj1 != null) {
                   obj1.isFromCache = true;
                   b = obj.a.r0(obj1);
                   HashMap hashMap1 = new HashMap();
                   PageComponentResponse data1 = obj1.data;
                   if (data1 != null) {
                      PageComponentInfo hierarchy1 = data1.hierarchy;
                      if (hierarchy1 != null) {
                         PageComponentHierarchyInfo structure1 = hierarchy1.structure;
                         if (structure1 != null) {
                            hashMap1.put("cache_size", String.valueOf(structure1.size()));
                         }
                      }
                   }
                   if (!b) {
                      str = str2;
                   }
                   hashMap1.put("cache_filter", str);
                   hashMap1.put("pageName", "MERCHANT_HOME_PAGE3");
                   c.b("merchant_home_onGetFeedCacheEnd_new", hashMap1);
                   if (b) {
                      return obj1;
                   }
                }
             }
          label_0140 :
             return null;
          }else {
             obj1 = PageComponentResponse.class;
             obj2 = b.a;
             p0 = str2;
             str2 = obj2.getString(b.d("user")+"merchant_home_prefetch_feed_cache", "null");
             obj1 = (str2 == null || str2 == str1)? null: b.a(str2, obj1);
             longx = Long.valueOf(obj2.getLong(b.d("user")+"merchant_home_prefetch_time_feed_cache", 0));
             if (obj1 == null || (longx != null && (l - longx.longValue()) - uCacheConfig <= 0)) {
                b = obj.a.r0(obj1);
                HashMap hashMap2 = new HashMap();
                PageComponentResponse data2 = obj1.data;
                if (data2 != null) {
                   PageComponentInfo hierarchy2 = data2.hierarchy;
                   if (hierarchy2 != null) {
                      PageComponentHierarchyInfo structure2 = hierarchy2.structure;
                      if (structure2 != null) {
                         hashMap2.put("cache_size", String.valueOf(structure2.size()));
                      }
                   }
                }
                if (!b) {
                   str = p0;
                }
                hashMap2.put("cache_filter", str);
                hashMap2.put("pageName", "MERCHANT_HOME_PAGE3");
                c.b("merchant_home_onGetFeedCacheEnd", hashMap2);
                if (b) {
                   return obj1;
                }
             }
          }
       }
    label_01d0 :
       return null;
    }
}
