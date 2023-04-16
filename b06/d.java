package b06.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import qk.g0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.HashMultimap;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import wy5.b;
import q87.c;
import l66.c;
import dda.b;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import tca.h;
import b06.d$b;
import java.util.Collection;
import tca.v2;
import b06.d$c;
import lnc.c2;
import java.util.LinkedHashSet;
import b06.c;
import java.util.Set;
import lnc.e4;
import b06.d$e;
import b06.d$f;

public final class d	// class@0003e5
{
    public static final int a;

    static {
       d.a = a.t().a("adFilterTopCount", 2);
    }
    public void d(){
       super();
    }
    public static g0 a(List p0,boolean p1){
       Object[] obj;
       d uod = d.class;
       QPhoto qPhoto = null;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), qPhoto, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       if (p1 && (p0 == null || p0.isEmpty())) {
          return HashMultimap.create(i, i);
       }else {
          HashMultimap hashMultimap = HashMultimap.create();
          Iterator iterator = p0.iterator();
          int i1 = 0;
          Object[] objArray = null;
          String str = "QPhotoFilter";
          while (iterator.hasNext() && i1 < d.a) {
             QPhoto qPhoto1 = iterator.next();
             PhotoAdvertisement photoAdverti = k.B(qPhoto1);
             if (photoAdverti != null) {
                if (photoAdverti.isSplashAd()) {
                   objArray = new Object[i];
                   b.C().w(str, "filterAdByPosition, filter splashAd", objArray);
                   iterator.remove();
                   hashMultimap.put("first_page_ad", qPhoto1);
                   objArray = i1;
                   qPhoto = qPhoto1;
                }else if(photoAdverti.canAdvertisementAbandoned()){
                   Object[] objArray1 = new Object[i];
                   b.C().w(str, "filterAdByPosition, filter dsp or third_platform ad", objArray1);
                   iterator.remove();
                   hashMultimap.put("first_page_ad", qPhoto1);
                   c.a().b(new b(qPhoto1.mEntity, 1));
                }
             }
             i1 = i1 + 1;
          }
          if (qPhoto != null && objArray < p0.size()) {
             obj = new Object[i];
             b.C().w(str, "filterAdByPosition, splashAd insert of "+objArray, obj);
             p0.add(objArray, qPhoto);
          }
          return hashMultimap;
       }
    }
    public static g0 b(List p0,int p1){
       HashMultimap obj;
       d uod = d.class;
       QPhoto qPhoto = null;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), qPhoto, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = HashMultimap.create();
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          QPhoto qPhoto1 = iterator.next();
          PhotoAdvertisement photoAdverti = k.B(qPhoto1);
          if (photoAdverti != null) {
             if (photoAdverti.isSplashAd()) {
                i = i2;
                qPhoto = qPhoto1;
             }else {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData mDisplayInTo = photoAdverti.mDisplayInTopPageNum;
                   if (mDisplayInTo > null && (p1 > 0 && p1 > mDisplayInTo)) {
                      if (i2 < i) {
                         i1 = 1;
                      }
                      obj.put("top_page_ad", qPhoto1);
                      iterator.remove();
                   }
                }
             }
          }
          i2 = i2 + 1;
       }
       if (qPhoto != null && (i < p0.size() && i1)) {
          p0.remove(qPhoto);
          p0.add(i, qPhoto);
       }
    label_006a :
       return obj;
    }
    public static void c(List p0){
       d$b uob;
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "11")) {
          return;
       }
       h[] ohArray = new h[]{uob};
       uob = new d$b();
       uob.a(p0, ohArray);
       return;
    }
    public static g0 d(Collection p0){
       d$c uoc;
       h[] obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h[]{uoc};
       uoc = new d$c();
       return uoc.a(p0, obj);
    }
    public static void e(Collection p0,c2[] p1){
       if (p0 == null || (!p0.isEmpty() && p1.length > 0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             int len = p1.length;
             int i = 0;
             while (i < len) {
                if (p1[i].accept(qPhoto)) {
                   qPhoto.getPhotoId();
                   iterator.remove();
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public static g0 f(List p0){
       LinkedHashSet obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashSet();
       HashMultimap hashMultimap = HashMultimap.create();
       c2[] uoc2Array = new c2[]{new c(hashMultimap, obj)};
       d.e(p0, uoc2Array);
       if (!obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             int i = p0.indexOf(qPhoto);
             p0.remove(qPhoto);
             if (i != -1) {
                qPhoto = e4.b().c(qPhoto.getPhotoId());
                if (qPhoto != null) {
                   p0.add(i, qPhoto);
                }
             }
          }
       }
       return hashMultimap;
    }
    public static g0 g(Collection p0){
       d$e uoe;
       h[] obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h[]{uoe};
       uoe = new d$e();
       return uoe.a(p0, obj);
    }
    public static g0 h(Collection p0){
       d$f uof;
       h[] obj = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h[]{uof};
       uof = new d$f();
       return uof.a(p0, obj);
    }
}
