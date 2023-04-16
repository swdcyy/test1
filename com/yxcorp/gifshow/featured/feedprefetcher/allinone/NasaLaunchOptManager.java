package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$mFeedRequestParams$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$mInitIndexModel$2;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$mInitRealModel$2;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager$isAllInOneEnabled$2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import pea.b;
import lnc.i3;
import k2b.u1;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptIndexModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Boolean;
import iea.d;
import kotlin.jvm.internal.a;
import jea.g;
import java.util.Map;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import wkd.b;
import zy5.k;
import zy5.d;
import android.content.SharedPreferences;

public final class NasaLaunchOptManager	// class@000fa4
{
    public static final String a = "NasaLaunchOptManager";
    public static final AtomicInteger b;
    public static final AtomicReference c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final AtomicBoolean h;
    public static final AtomicBoolean i;
    public static final AtomicBoolean j;
    public static final AtomicBoolean k;
    public static final AtomicBoolean l;
    public static final NasaLaunchOptManager m;

    static {
       NasaLaunchOptManager.m = new NasaLaunchOptManager();
       NasaLaunchOptManager.b = new AtomicInteger(0);
       NasaLaunchOptManager.c = new AtomicReference();
       NasaLaunchOptManager.d = s.c(NasaLaunchOptManager$mFeedRequestParams$2.INSTANCE);
       NasaLaunchOptManager.e = s.c(NasaLaunchOptManager$mInitIndexModel$2.INSTANCE);
       NasaLaunchOptManager.f = s.c(NasaLaunchOptManager$mInitRealModel$2.INSTANCE);
       NasaLaunchOptManager.g = s.c(NasaLaunchOptManager$isAllInOneEnabled$2.INSTANCE);
       NasaLaunchOptManager.h = new AtomicBoolean(0);
       NasaLaunchOptManager.i = new AtomicBoolean(true);
       NasaLaunchOptManager.j = new AtomicBoolean(true);
       NasaLaunchOptManager.k = new AtomicBoolean(true);
       NasaLaunchOptManager.l = new AtomicBoolean(0);
    }
    public void NasaLaunchOptManager(){
       super();
    }
    public static final String a(NasaLaunchOptManager p0){
       return NasaLaunchOptManager.a;
    }
    public static final AtomicInteger b(NasaLaunchOptManager p0){
       return NasaLaunchOptManager.b;
    }
    public static final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NasaLaunchOptManager.class, "15")) {
          return;
       }
       AtomicInteger b = NasaLaunchOptManager.b;
       int i = 2;
       if (b.get() < i) {
          b.b(NasaLaunchOptManager.a, "deleteCacheWhenShowed error: "+b.get());
          b.set(i);
          i3 oi3 = i3.f();
          oi3.d("scene", "NasaLaunchOptManager");
          oi3.d("type", "deleteCacheWhenShowed");
          u1.R("NASA_PREFETCH_CACHE_RERANK_ORDER", oi3.e(), 14);
       }
       NasaLaunchOptIndexModel nasaLaunchOp = NasaLaunchOptManager.d();
       String photoId = (nasaLaunchOp != null)? nasaLaunchOp.getPhotoId(): null;
       if (TextUtils.n(p0, photoId) || TextUtils.n(p0, NasaLaunchOptManager.c.get())) {
          b.b(NasaLaunchOptManager.a, "deleteCacheWhenShowed photoId:"+p0);
          NasaLaunchOptManager.j(null, null, "isShow");
       }
       return;
    }
    public static final NasaLaunchOptIndexModel d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaLaunchOptManager nasaLaunchOp = NasaLaunchOptManager.class;
       NasaLaunchOptManager obj = PatchProxy.apply(null, null, nasaLaunchOp, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = NasaLaunchOptManager.m;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, nasaLaunchOp, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = NasaLaunchOptManager.e.getValue();
       }
       return obj1;
    }
    public static final QPhoto f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaLaunchOptManager nasaLaunchOp = NasaLaunchOptManager.class;
       NasaLaunchOptManager obj = PatchProxy.apply(null, null, nasaLaunchOp, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = NasaLaunchOptManager.m;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, nasaLaunchOp, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = NasaLaunchOptManager.f.getValue();
       }
       return obj1;
    }
    public static final boolean h(){
       Object obj = PatchProxy.apply(null, null, NasaLaunchOptManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (NasaLaunchOptManager.b.get() >= 2)? true: false;
       return b;
    }
    public static final boolean i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaLaunchOptManager nasaLaunchOp = NasaLaunchOptManager.class;
       Object[] objArray = null;
       NasaLaunchOptManager obj = PatchProxy.apply(objArray, objArray, nasaLaunchOp, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = NasaLaunchOptManager.m;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(objArray, obj, nasaLaunchOp, "4");
       if (uBoolean == patchProxyRe) {
          uBoolean = NasaLaunchOptManager.g.getValue();
       }
       boolean b = true;
       boolean b1 = (uBoolean.booleanValue() && d.j())? true: false;
       if (!NasaLaunchOptManager.l.getAndSet(b)) {
          b.b(NasaLaunchOptManager.a, "isLaunchOptCacheEnabled return "+b1);
       }
       return b1;
    }
    public static synchronized final boolean j(NasaLaunchOptIndexModel p0,QPhoto p1,String p2){
       _monitor_enter(NasaLaunchOptManager.class);
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, NasaLaunchOptManager.class, "16");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(NasaLaunchOptManager.class);
          return obj.booleanValue();
       }else {
          a.p(p2, "reason");
          if (!NasaLaunchOptManager.h()) {
             b.b(NasaLaunchOptManager.a, "saveConfigToFile is init, return:"+p2);
             _monitor_exit(NasaLaunchOptManager.class);
             return false;
          }else {
             b.b(NasaLaunchOptManager.a, "saveConfigToFile index: "+p0+", model:"+p1);
             if (p0 != null && (p1 == null || !TextUtils.n(p0.getPhotoId(), p1.getPhotoId()))) {
                QPhoto qPhoto = null;
                g.b(qPhoto);
                g.a(qPhoto);
                NasaLaunchOptManager.c.set(qPhoto);
             }else {
                g.b(p1);
                g.a(p0);
                NasaLaunchOptManager.c.set(p1.getPhotoId());
             }
             _monitor_exit(NasaLaunchOptManager.class);
             return true;
          }
       }
    }
    public final Map e(){
       Object obj = PatchProxy.apply(null, this, NasaLaunchOptManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NasaLaunchOptManager.d.getValue();
    }
    public final boolean g(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NasaLaunchOptIndexModel obj = PatchProxy.apply(objArray, this, NasaLaunchOptManager.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = NasaLaunchOptManager.d();
       boolean b = false;
       if (obj != null) {
          b1 = (obj.isPrefetch())? c.h(obj.getCreateTimestamp()): d.l(obj.getCreateTimestamp());
       }else {
          b1 = false;
       }
       NasaLaunchOptIndexModel nasaLaunchOp = NasaLaunchOptManager.d();
       if (nasaLaunchOp != null) {
          String photoId = nasaLaunchOp.getPhotoId();
          if (photoId != null) {
             b2 = b.a(-275376108).k(photoId);
          label_004f :
             String obj1 = PatchProxy.apply(objArray, objArray, g.class, "3");
             boolean b3 = (obj1 != patchProxyRe)? obj1.booleanValue(): TextUtils.x(g.a.getString("launchOptModel", "")) ^ 1;
             obj1 = NasaLaunchOptManager.a;
             StringBuilder str = "isCacheValid timeValid:"+b1+", "+"id: ";
             NasaLaunchOptIndexModel nasaLaunchOp1 = NasaLaunchOptManager.d();
             String photoId1 = (nasaLaunchOp1 != null)? nasaLaunchOp1.getPhotoId(): objArray;
             str = str+photoId1+", isPrefetch:";
             nasaLaunchOp1 = NasaLaunchOptManager.d();
             if (nasaLaunchOp1 != null) {
                objArray = Boolean.valueOf(nasaLaunchOp1.isPrefetch());
             }
             b.b(obj1, str+objArray+", isDuplicate:"+b2+",isModelValid: "+b3);
             if (b1) {
                obj = NasaLaunchOptManager.d();
                if (obj != null) {
                   String photoId2 = obj.getPhotoId();
                   if (photoId2 != null) {
                      photoId2 = (photoId2.length() > 0)? 1: 0;
                      if (photoId2 == 1 && (!b2 && b3)) {
                         b = true;
                      }
                   }
                }
             }
             return b;
          }
       }
       b2 = false;
       goto label_004f ;
    }
}
