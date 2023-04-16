package com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$b;
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
import java.util.ArrayList;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentHierarchyInfo;
import java.lang.CharSequence;
import java.util.List;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import fg6.a;
import com.kuaishou.merchant.home2.feed.model.FeedLivingData;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils;
import com.kuaishou.merchant.home2.feed.model.LiveStreamInfo;
import com.kuaishou.merchant.home2.feed.model.FeedLivingData$LiveStreamViews;
import ww3.a;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager;
import qrd.p;
import ak8.c;
import com.kwai.sdk.switchconfig.a;
import com.oceanlong.home_perf.cache.CacheConfig;
import java.lang.reflect.Type;
import ak8.d;
import ak8.b;
import ak8.a;
import java.lang.Runnable;
import crd.b;
import brd.z;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.System;
import java.lang.Long;

public class MerchantHomePrefetchUtils$b implements a$b	// class@0016e1
{

    public void MerchantHomePrefetchUtils$b(){
       super();
    }
    public void a(String p0,Map p1){
       MerchantHomeCacheManager b;
       SharedPreferences a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantHomePrefetchUtils$b.class, "1")) {
          return;
       }
       c.a("merchant_home_onSaveFeedCacheStart");
       HashMap hashMap = new HashMap();
       Iterator iterator = p1.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          hashMap.put(str, String.valueOf(p1.get(str)));
       }
       Pair first = PreloadCache.d.c(new a(p0, hashMap), PageComponentResponse.class).first;
       ArrayList uArrayList = new ArrayList();
       if (first != null) {
          PageComponentResponse data = first.data;
          if (data != null) {
             PageComponentInfo hierarchy = data.hierarchy;
             if (hierarchy != null) {
                PageComponentHierarchyInfo structure = hierarchy.structure;
                if (structure != null) {
                   Iterator iterator1 = structure.keySet().iterator();
                   while (iterator1.hasNext()) {
                      String str1 = iterator1.next();
                      if (str1.contains("list_component")) {
                         iterator = first.data.hierarchy.structure.get(str1).iterator();
                         while (iterator.hasNext()) {
                            FeedLivingData uFeedLivingD = a.a.c(first.data.data.get(iterator.next()).fields.data, FeedLivingData.class);
                            if (MerchantHomePrefetchUtils.a(uFeedLivingD)) {
                               LiveStreamInfo liveStreamIn = new LiveStreamInfo();
                               if (!(uFeedLivingD.mAuthorId).isEmpty()) {
                                  liveStreamIn.setLiveAuthorId(uFeedLivingD.mAuthorId);
                               }else {
                                  liveStreamIn.setLiveAuthorId(uFeedLivingD.mSellerId);
                               }
                               if (!(uFeedLivingD.mLiveStreamView.liveStreamId).isEmpty()) {
                                  liveStreamIn.setLiveStreamId(uFeedLivingD.mLiveStreamView.liveStreamId);
                               }else {
                                  liveStreamIn.setLiveAuthorId(uFeedLivingD.mWorkId);
                               }
                               uArrayList.add(liveStreamIn);
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       if (a.b()) {
          String str2 = "tabId";
          if (p1.get(str2) != null) {
             b = MerchantHomePrefetchUtils.b;
             String str3 = b.f(p1.get(str2).toString());
             d uod = new d(b, str3);
             b uob = new b(uod, first, str3, a.t().getValue(b.a, CacheConfig.class, new CacheConfig()).getFeedExpireDuration());
             b.d.getValue().a.d(v7);
          }
       }
       a = b.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putString(b.d("user")+"merchant_home_prefetch_feed_cache", b.e(first));
       g.a(uEditor);
       uEditor = a.edit();
       uEditor.putLong(b.d("user")+"merchant_home_prefetch_time_feed_cache", Long.valueOf(System.currentTimeMillis()).longValue());
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putString(b.d("user")+"merchant_home_prefetch_params_cache", b.e(uArrayList));
       g.a(uEditor1);
       c.a("merchant_home_onSaveFeedCacheEnd");
       return;
    }
}
