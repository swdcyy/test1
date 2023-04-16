package com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$a;
import com.kuaishou.pagedy.request.a$b;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rw3.c;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.merchant.preload.net.cache.PreloadCache;
import sa4.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import android.util.Pair;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.System;
import java.lang.Long;

public class MerchantHomePrefetchUtils$a implements a$b	// class@0016e0
{

    public void MerchantHomePrefetchUtils$a(){
       super();
    }
    public void a(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantHomePrefetchUtils$a.class, "1")) {
          return;
       }
       c.a("merchant_home_onSavePageCacheStart");
       HashMap hashMap = new HashMap();
       Iterator iterator = p1.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          hashMap.put(str, String.valueOf(p1.get(str)));
       }
       Pair pair = PreloadCache.d.c(new a(p0, hashMap), PageComponentResponse.class);
       if (pair != null) {
          pair = pair.first;
          if (pair != null) {
             SharedPreferences a = b.a;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putString(b.d("user")+"merchant_home_prefetch_page_cache", b.e(pair));
             g.a(uEditor);
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putLong(b.d("user")+"merchant_home_prefetch_time_page_cache", Long.valueOf(System.currentTimeMillis()).longValue());
             g.a(uEditor1);
          }
       }
       c.a("merchant_home_onSavePageCacheEnd");
       return;
    }
}
