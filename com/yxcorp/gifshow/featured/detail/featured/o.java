package com.yxcorp.gifshow.featured.detail.featured.o;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.featured.detail.featured.t;
import iea.d;
import kda.e;
import java.lang.String;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import pea.b;
import lea.d;
import nea.b;
import lea.c;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.util.List;
import iea.c;
import ekd.q$b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.featured.feedprefetcher.e;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.VideoMeta;
import com.yxcorp.gifshow.featured.feedprefetcher.d;
import tl8.d;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.hodor.Hodor;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.DynamicPrefetchFeedResponse;

public final class o implements Callable	// class@000f3e
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final Object call(){
       long upmostCached;
       int i = 0;
       Iterator obj = null;
       if (!d.j()) {
          Object[] objArray = new Object[i];
          e.C().w("NasaSlidePageList", "getLocalCacheObservable switch close", objArray);
       }else {
          d uod = d.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          d obj1 = PatchProxy.apply(obj, obj, uod, "12");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             b.b("DynamicPrefetcherHelper", "call getDynamicCachedPhotos");
             if (!d.j()) {
                b.b("DynamicPrefetcherHelper", "!DynamicPrefetcherHelper.isEnablePrefetchDynamicFeed\(\)");
             }else {
                obj1 = d.e();
                if (obj1 == null) {
                   b.b("DynamicPrefetcherHelper", "dynamicPrefetchConfig == null");
                }else {
                   KwaiManifest obj2 = PatchProxy.apply(obj, obj, b.class, "2");
                   if (obj2 != patchProxyRe) {
                   }else {
                      String str1 = b.a.getString("dynamicModels", "");
                      obj2 = (TextUtils.x(str1))? obj: b.a(str1, c.class);
                   }
                   if (obj2 == null) {
                      b.b("DynamicPrefetcherHelper", "mDynamicPrefetchModel == null");
                   }else {
                      c c = d.c;
                      _monitor_enter(c);
                      d.c.c = (obj2.c != null)? new HashMap(obj2.c): new HashMap();
                      d.c.a = (obj2.a != null)? new ArrayList(obj2.a): new ArrayList();
                      d.c.b = (obj2.b != null)? new HashMap(obj2.b): new HashMap();
                      _monitor_exit(c);
                      c = obj2.a;
                      if (q.f(c)) {
                         b.b("DynamicPrefetcherHelper", "CollectionUtils.isEmpty == null");
                      }else {
                         b.a(-1343064608).l(c.size());
                         ArrayList uArrayList = new ArrayList(c);
                         q.c(uArrayList, new c(obj2));
                         b.b("DynamicPrefetcherHelper", "validPhotos size:"+uArrayList.size());
                         if (obj1.mIsUseMaxCached != null && !q.f(uArrayList)) {
                            Collections.sort(uArrayList, e.b);
                         }
                         b.b("DynamicPrefetcherHelper", "是否使用最大缓存时长内容:"+obj1.mIsUseMaxCached);
                         b.b("DynamicPrefetcherHelper", "插入本地缓存最大数量:"+d.g());
                         ArrayList uArrayList1 = PatchProxy.applyOneRefs(uArrayList, obj, uod, "18");
                         if (uArrayList1 != patchProxyRe) {
                         }else if(q.f(uArrayList)){
                            uArrayList1 = new ArrayList();
                         }else {
                            uArrayList1 = new ArrayList();
                            obj = uArrayList.iterator();
                            while (obj.hasNext()) {
                               QPhoto qPhoto = obj.next();
                               String str = "DynamicPrefetcherHelper";
                               if (qPhoto == null) {
                                  b.b(str, "getValidQPhotos item null");
                               }else if((long)uArrayList1.size() - d.g() >= 0){
                                  qPhoto.setCacheType(5);
                                  if (qPhoto.isVideoType() && !qPhoto.isAd()) {
                                     obj2 = e.h(qPhoto.mEntity, VideoMeta.class, d.b);
                                     if (obj2 != null) {
                                        b.b(str, "getValidQPhotos:"+qPhoto);
                                        if (a.t().d("LaunchOpt2022DynamicCheckCache", i) && Hodor.instance().isMediaCacheInfoReady()) {
                                           b.b(str, "getValidQPhotos isMediaCacheInfoReady true");
                                           upmostCached = VodAdaptivePreloadPriorityTask.getUpmostCachedDurationMs(obj2.getManifestString());
                                        }else {
                                           b.b(str, "getValidQPhotos isMediaCacheInfoReady false");
                                           upmostCached = d.c() + 1;
                                        }
                                        b.b(str, "getValidQPhotos cachedMs:"+upmostCached);
                                        if (upmostCached - d.c() >= 0) {
                                           b.b(str, "添加QPhoto:"+qPhoto);
                                           uArrayList1.add(qPhoto);
                                        }
                                        b.b(str, "被遍历内容 cachedMs:"+upmostCached+" title: "+qPhoto.getCaption());
                                     }else {
                                        b.b(str, "被遍历内容 cachedMs: null title: "+qPhoto.getCaption());
                                     }
                                  }else {
                                     b.b(str, "getValidQPhotos 类型不匹配 "+qPhoto);
                                  }
                               }
                            }
                         }
                         if (!q.f(uArrayList1)) {
                            obj = new DynamicPrefetchFeedResponse();
                            obj.mQPhotos = uArrayList1;
                            obj.mCursor = "1";
                            String listLoadSequ = (uArrayList1.size() > 0 && uArrayList1.get(i) != null)? uArrayList1.get(i).getListLoadSequenceID(): "…";
                            obj.mLlsid = listLoadSequ;
                            b.b("DynamicPrefetcherHelper", "getDynamicCachedPhotos Feed size："+uArrayList1.size()+",cusor:"+obj.mCursor+", llsid:"+obj.mLlsid);
                         }else {
                            b.b("DynamicPrefetcherHelper", "getDynamicCachedPhotos Feed 0 title:====null");
                            obj = new DynamicPrefetchFeedResponse();
                         }
                      }
                   }
                }
             }
          }
       }
       return obj;
    }
}
