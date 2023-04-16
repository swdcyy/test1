package com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$mSharedPreferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$mDownloadResList$2;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$b;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$a;
import java.lang.Object;
import com.yxcorp.gifshow.growth.predownload.model.GrowthPreDownloadResConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.hodor.Hodor;
import qrd.l1;
import java.lang.CharSequence;
import zsd.u;
import eqa.a;
import com.kwai.video.hodor.MediaPreloadPriorityTask;
import java.util.Map;
import com.kwai.video.hodor.HodorConfig;
import com.kwai.video.hodor.AbstractHodorTask;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import android.content.SharedPreferences;
import com.kwai.android.common.ext.SharePreferenceExtKt;
import com.kwai.robust.PatchProxyResult;

public final class GrowthResourcePreDownloadManager	// class@001482
{
    public static final p a;
    public static final p b;
    public static GrowthPreDownloadResConfig c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static final a g;
    public static final AwesomeCacheCallback h;
    public static final GrowthResourcePreDownloadManager i;

    static {
       GrowthResourcePreDownloadManager.i = new GrowthResourcePreDownloadManager();
       GrowthResourcePreDownloadManager.a = s.c(GrowthResourcePreDownloadManager$mSharedPreferences$2.INSTANCE);
       GrowthResourcePreDownloadManager.b = s.c(GrowthResourcePreDownloadManager$mDownloadResList$2.INSTANCE);
       GrowthResourcePreDownloadManager.g = GrowthResourcePreDownloadManager$b.b;
       GrowthResourcePreDownloadManager.h = new GrowthResourcePreDownloadManager$a();
    }
    public void GrowthResourcePreDownloadManager(){
       super();
    }
    public static final GrowthPreDownloadResConfig a(GrowthResourcePreDownloadManager p0){
       return GrowthResourcePreDownloadManager.c;
    }
    public final void b(){
       GrowthPreDownloadResConfig c;
       List video;
       String str1;
       l1 a;
       GrowthResourcePreDownloadManager growthResour = GrowthResourcePreDownloadManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, growthResour, "4")) {
          return;
       }
       if (GrowthResourcePreDownloadManager.d) {
          objArray = new Object[0];
          w.C().w("GrowthResourcePreDownloadManager", "doOnSwitchConfigUpdate block isProcessRes", objArray);
          GrowthResourcePreDownloadManager.e = true;
          return;
       }else {
          Object[] objArray1 = new Object[0];
          w.C().w("GrowthResourcePreDownloadManager", "doOnSwitchConfigUpdate", objArray1);
          GrowthResourcePreDownloadManager.d = true;
          int i = 10;
          if (!PatchProxy.applyVoid(objArray, this, growthResour, "6")) {
             Object[] objArray4 = new Object[0];
             w.C().w("GrowthResourcePreDownloadManager", "clearLocalUselessRes", objArray4);
             c = GrowthResourcePreDownloadManager.c;
             if (c != null) {
                video = c.getVideo();
                if (video != null) {
                label_0056 :
                   CopyOnWriteArrayList uCopyOnWrite = this.c();
                   ArrayList uArrayList1 = new ArrayList(u.Y(uCopyOnWrite, i));
                   Iterator iterator1 = uCopyOnWrite.iterator();
                   while (iterator1.hasNext()) {
                      str1 = iterator1.next();
                      if (str1 != null) {
                         if (!video.contains(str1)) {
                            GrowthResourcePreDownloadManager i2 = GrowthResourcePreDownloadManager.i;
                            Objects.requireNonNull(i2);
                            if (!PatchProxy.applyVoidOneRefs(str1, i2, growthResour, "8")) {
                               Object[] objArray5 = new Object[0];
                               w.C().w("GrowthResourcePreDownloadManager", "removeLocalVideo "+str1, objArray5);
                               Hodor.instance().deleteCacheByKey(CacheKeyUtil.getCacheKey(str1, 0), 0);
                               i2.c().remove(str1);
                            }
                         }
                         a = l1.a;
                      }else {
                         a = objArray;
                      }
                      uArrayList1.add(a);
                   }
                }
             }
             ArrayList uArrayList2 = new ArrayList();
             goto label_0056 ;
          }
          if (!PatchProxy.applyVoid(objArray, this, growthResour, "5")) {
             c = GrowthResourcePreDownloadManager.c;
             if (c != null) {
                video = c.getVideo();
                if (video != null) {
                   ArrayList uArrayList = new ArrayList(u.Y(video, i));
                   Iterator iterator = video.iterator();
                   while (iterator.hasNext()) {
                      String str = iterator.next();
                      GrowthResourcePreDownloadManager i1 = GrowthResourcePreDownloadManager.i;
                      Objects.requireNonNull(i1);
                      if (!PatchProxy.applyVoidOneRefs(str, i1, growthResour, "7")) {
                         Object[] objArray2 = new Object[0];
                         w.C().w("GrowthResourcePreDownloadManager", "downloadVideo "+str, objArray2);
                         str1 = (str == null || u.S1(str))? 1: null;
                         if (!str1 && !a.a.a(str)) {
                            MediaPreloadPriorityTask mediaPreload = new MediaPreloadPriorityTask(str, objArray, CacheKeyUtil.getCacheKey(str, 0));
                            if (HodorConfig.isDefaultEnableUnifyLog()) {
                               mediaPreload.setUnifyCdnLog(true);
                            }
                            mediaPreload.setPreloadBytes(-1);
                            mediaPreload.setAwesomeCacheCallback(GrowthResourcePreDownloadManager.h);
                            mediaPreload.setBizType("KSGrowthWarmUp");
                            mediaPreload.setCacheGroup("growth_warmup_default");
                            mediaPreload.enableCronTask(true);
                            mediaPreload.setEvictStrategy(3);
                            mediaPreload.submit();
                            Object[] objArray3 = new Object[0];
                            w.C().w("GrowthResourcePreDownloadManager", "downloadVideo add", objArray3);
                            i1.c().add(str);
                         }
                      }
                   label_016d :
                      uArrayList.add(l1.a);
                   }
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, growthResour, "9")) {
             objArray = new Object[0];
             w.C().w("GrowthResourcePreDownloadManager", "updateDownloadResListToDisk", objArray);
             SharePreferenceExtKt.put(this.d(), "SP_KEY_DOWNLOAD_RES_LIST", this.c());
          }
          GrowthResourcePreDownloadManager.d = false;
          if (GrowthResourcePreDownloadManager.e) {
             GrowthResourcePreDownloadManager.e = false;
             this.b();
          }
          return;
       }
    }
    public final CopyOnWriteArrayList c(){
       Object obj = PatchProxy.apply(null, this, GrowthResourcePreDownloadManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthResourcePreDownloadManager.b.getValue();
    }
    public final SharedPreferences d(){
       Object obj = PatchProxy.apply(null, this, GrowthResourcePreDownloadManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthResourcePreDownloadManager.a.getValue();
    }
}
