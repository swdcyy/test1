package com.yxcorp.gifshow.featured.feedprefetcher.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import qea.u;
import java.util.Objects;
import lea.f;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import lea.b;
import lea.e;
import java.lang.StringBuilder;
import pea.b;
import java.util.ArrayList;
import qea.i;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import iea.j;
import t45.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import uh5.e;
import com.yxcorp.gifshow.w;
import com.kwai.sdk.switchconfig.a;
import java.lang.Number;
import com.kwai.video.hodor.Hodor;
import com.kwai.video.hodor.HlsPreloadPriorityTask;
import java.lang.Math;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kwai.video.player.mid.manifest.ManifestInterface;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import zp.a0;
import java.util.Map;
import java.lang.Float;
import com.kuaishou.android.model.mix.SortFeature;

public final class g	// class@000fb9
{

    public void g(){
       super();
    }
    public static boolean a(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, g.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       if (p0 == null || TextUtils.x(p0.getPhotoId())) {
          return false;
       }
       int i = -622777217;
       u ou = b.a(i);
       String photoId = p0.getPhotoId();
       Objects.requireNonNull(ou);
       b obj2 = PatchProxy.applyOneRefs(photoId, ou, u.class, "22");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else {
          List list = ou.n();
          if (!q.f(list)) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                f uof = iterator.next();
                if (uof != null) {
                   obj2 = uof.mQPhoto;
                   if (obj2 != null && photoId.equals(obj2.getPhotoId())) {
                      obj = uof;
                      break ;
                   }
                }
             }
          }
       }
       if (obj == null) {
          if (b.a(i).j(p0.getPhotoId()) == null) {
             return false;
          }else {
             obj = new f(p0, -1, null, null);
          }
       }
       b.k("discard duplicate prefetch photo, "+p0);
       ArrayList uArrayList = new ArrayList();
       obj.mDiscardReason = "duplicated_photo";
       uArrayList.add(obj);
       if (!q.f(uArrayList)) {
          g.b(uArrayList, false);
       }
       return true;
    }
    public static void b(List p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, og, "1")) {
          return;
       }
       if (!q.f(p0)) {
          List list = b.a(-622777217).k();
          u ou = b.a(-622777217);
          Objects.requireNonNull(ou);
          if (!PatchProxy.applyVoidOneRefs(p0, ou, u.class, "28")) {
             u.l.execute(new i(ou, p0));
          }
          c.a(new j(list, p1, p0));
       }
       return;
    }
    public static boolean c(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, og, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (VisitorModeManager.f()) {
          return b;
       }
       if (e.e()) {
          Object obj1 = PatchProxy.apply(objArray, objArray, og, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b1 = b.a(-1343064608).isColdStart();
             b.g("enableFeaturedPreCachedVideoStartMode: coldstart "+b1);
             b1 = (b1 || a.t().d("enableFeaturedPreCacheWarmStart", b))? true: false;
          }
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public static int d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       if (!p0.isHlsVideo()) {
          return i;
       }
       String str = g.e(p0);
       if (TextUtils.x(str)) {
          return i;
       }
       ArrayList uArrayList = g.h(str);
       if (q.f(uArrayList)) {
          return i;
       }
       if (!Hodor.instance().isMediaCacheInfoReady()) {
          b.j("getHlsPhotoSegCount media cache info not ready");
          return i;
       }else {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             i = Math.max(i, HlsPreloadPriorityTask.getCachedSegCntForKey(iterator.next()));
          }
          b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" is hls, segCnt = "+i);
          return i;
       }
    }
    public static String e(QPhoto p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mEntity;
       if (p0 instanceof VideoFeed) {
          VideoFeed mVideoModel = p0.mVideoModel;
          if (mVideoModel != null) {
             VideoMeta mMediaManife = mVideoModel.mMediaManifest;
             if (mMediaManife != null) {
                str = mMediaManife.toJsonString();
             }
          }
       }
       return str;
    }
    public static long f(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (p0 == null) {
          return l;
       }
       if (!Hodor.instance().isMediaCacheInfoReady()) {
          b.j("getPhotoCacheSize isMediaCacheInfoReady false");
          return c.g();
       }else {
          String str = g.e(p0);
          if (TextUtils.x(str)) {
             b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" manifest is null");
             return l;
          }else if(p0.isHlsVideo()){
             ArrayList uArrayList = g.h(str);
             if (q.f(uArrayList)) {
                b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" cacheKeys is null");
                return l;
             }else {
                l = -1;
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   l = Math.max(l, HlsPreloadPriorityTask.getCachedBytes(iterator.next()));
                }
                b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" is hls, cachedBytes = "+l);
                return l;
             }
          }else {
             l = VodAdaptivePreloadPriorityTask.getUpmostCachedBytes(str);
             b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" is non hls, cachedBytes = "+l);
             return l;
          }
       }
    }
    public static float g(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0xbf800000;
       if (p0 != null && p0.getEntity() != null) {
          CommonMeta uCommonMeta = r1.w0(p0.getEntity());
          if (uCommonMeta != null && uCommonMeta.getRankFeatures() != null) {
             a0 l = uCommonMeta.getRankFeatures().l;
             if (l != null && !l.isEmpty()) {
                List list = l.get("27");
                if (!q.f(list)) {
                   return list.get(0).floatValue();
                }
             }else {
                uCommonMeta = uCommonMeta.mSortFeatures;
                if (!q.f(uCommonMeta)) {
                   Iterator iterator = uCommonMeta.iterator();
                   while (iterator.hasNext()) {
                      SortFeature sortFeature = iterator.next();
                      if ("27".equals(sortFeature.mName)) {
                         return sortFeature.mValue;
                      }
                   }
                }
             }
          }
       }
       return f;
    }
    public static ArrayList h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return VodAdaptivePreloadPriorityTask.getCacheKeyListFromManifest(p0);
    }
    public static boolean i(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String str = g.e(p0);
       if (TextUtils.x(str)) {
          b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" manifest is null");
          return b;
       }else if(!Hodor.instance().isMediaCacheInfoReady()){
          b.j("isPhotoFullyCached media cache info not ready");
          return b;
       }else if(p0.isHlsVideo()){
          b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" is hls, default not fullycache");
          return b;
       }else if(VodAdaptivePreloadPriorityTask.isFullyCached(str)){
          b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" is non hls, and fullCache");
          return true;
       }else {
          b.j("photo id: "+p0.getPhotoId()+", userName: "+p0.getUserName()+" is not fullCache");
          return b;
       }
    }
}
