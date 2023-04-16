package com.kwai.framework.location.locationupload.h;
import java.lang.Object;
import e66.f;
import java.lang.String;
import android.content.SharedPreferences;
import r96.y;
import com.kwai.framework.location.locationupload.k;
import r96.g;
import com.kwai.framework.location.locationupload.k$b;
import com.kwai.framework.location.locationupload.l;
import r96.h;
import com.yxcorp.utility.NetworkUtilsCached$a;
import com.yxcorp.utility.NetworkUtilsCached;
import r96.w;
import com.kwai.framework.location.locationupload.h$a;
import com.kwai.framework.location.locationupload.h$b;
import com.kwai.framework.location.model.LocationCityInfo;
import android.location.Location;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.location.locationupload.g;
import java.lang.Runnable;
import t45.c;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.location.locationupload.LocationUploadConfig;
import com.kwai.framework.location.locationupload.LocationUploadConfig$DynamicConfig;
import o96.u;
import java.lang.Boolean;
import com.kwai.framework.location.CurrentLocationCityManager;
import q96.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.azeroth.Azeroth2;
import r96.b;
import java.lang.reflect.Type;
import java.util.Objects;
import r96.q;
import com.yxcorp.utility.c;
import java.util.Map;
import p96.a;
import java.lang.StringBuilder;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import q87.c;
import r96.x;
import java.lang.Long;
import java.lang.Number;
import com.kwai.framework.location.locationupload.LocationUploadConfig$Fire;
import com.kwai.framework.location.locationupload.LocationUploadConfig$TimerConfig;
import java.util.List;
import s96.a;
import lnc.i3;
import k2b.u1;
import java.util.concurrent.TimeUnit;
import brd.t;
import r96.j;
import com.kwai.framework.location.locationupload.f;
import erd.g;
import crd.b;

public class h	// class@001644
{
    public LocationUploadConfig a;
    public boolean b;
    public int c;
    public b d;
    public int e;
    public final y f;
    public final k g;
    public final l h;

    public void h(){
       super();
       this.b = true;
       this.c = 0;
       this.e = f.a.getInt("todayLocatedTimes", 0);
       this.f = new y();
       this.g = new k(new g(this));
       this.h = new l();
       NetworkUtilsCached.m(new h(this));
       w.a();
    }
    public void h(h$a p0){
       super();
       this.b = true;
       this.c = 0;
       this.e = f.a.getInt("todayLocatedTimes", 0);
       this.f = new y();
       this.g = new k(new g(this));
       this.h = new l();
       NetworkUtilsCached.m(new h(this));
       w.a();
    }
    public static h b(){
       return h$b.a;
    }
    public void a(LocationCityInfo p0,Location p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "10")) {
          return;
       }
       c.a(new g(this, p0, p1, p2));
       return;
    }
    public void c(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "9")) {
          return;
       }
       int i = 1;
       boolean b = false;
       int i1 = (!p0)? a.t().d("KSLKUploadServiceUpdateCacheDisabled", b) ^ i: false;
       LocationUploadConfig$DynamicConfig sdkType = (this.a != null && this.a.dynamicConfig != null)? this.a.dynamicConfig.sdkType: "tencent";
       LocationUploadConfig$DynamicConfig uDynamicConf = sdkType;
       h$a uoa = new h$a(this, p0);
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{"default","location_upload","location_upload",uoa,uDynamicConf,Boolean.valueOf(i1)};
          if (PatchProxy.applyVoid(objArray, null, ou, "40")) {
          label_0076 :
             return;
          }
       }
       CurrentLocationCityManager.getInstance().requestLocationWithoutBusinessDialog("default", "location_upload", "location_upload", uoa, uDynamicConf, i1);
       goto label_0076 ;
    }
    public final String d(){
       Object obj = PatchProxy.apply(null, this, h.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a != null) {
          return this.a.c();
       }
       return "";
    }
    public final boolean e(){
       LocationUploadConfig obj = PatchProxy.apply(null, this, h.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.a != null) {
          obj = this.a.dynamicConfig;
          if (obj != null && obj.uploadStatisticsData != null) {
             b = true;
          }
       }
       return b;
    }
    public final void f(){
       h a;
       h c;
       PatchProxyResult patchProxyRe1;
       Object obj1;
       long l2;
       LocationUploadConfig locationUplo = this;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, locationUplo, oh, "6")) {
          return;
       }
       String str = "1";
       String str1 = "2";
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, locationUplo, oh, str)) {
          b uob = Azeroth2.B.n("frigateClientCollect", b.class);
          String str2 = "LocationUploadManager";
          if (uob != null) {
             locationUplo.a = uob.a();
             if (locationUplo.a != null) {
                oh = locationUplo.g;
                LocationUploadConfig dynamicConfi1 = locationUplo.a.dynamicConfig;
                Objects.requireNonNull(oh);
                k ok = k.class;
                if (!PatchProxy.applyVoidOneRefs(dynamicConfi1, oh, ok, str1)) {
                   if (dynamicConfi1 != null) {
                      oh.a = dynamicConfi1.shouldQuery;
                      oh.b = dynamicConfi1.experimentTag;
                   }else {
                      oh.a = b;
                      oh.b = "";
                   }
                   boolean b1 = (dynamicConfi1 != null && dynamicConfi1.enableQueryWhenCellChanged != null)? true: false;
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), oh, ok, str)) {
                      if (b1) {
                         if (oh.k == null) {
                            oh.k = new q(oh);
                         }
                         c.j.put(oh.k, new Object());
                      }else if(oh.k != null){
                         c.j.remove(oh.k);
                         oh.k = objArray;
                      }
                   }
                }
             }
             Object[] objArray1 = new Object[b];
             a.C().w(str2, "updateLocationUploadConfig : "+GsonUtil.toJson(locationUplo.a), objArray1);
          }else {
             objArray = new Object[b];
             a.C().w(str2, "frigateClientCollectConfig = null!", objArray);
          }
       }
       if (locationUplo.c == null) {
          b = true;
       }
       long l = x.a();
       h f = locationUplo.f;
       a = locationUplo.a;
       c = locationUplo.c;
       Objects.requireNonNull(f);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(y.class)) {
          patchProxyRe1 = patchProxyRe;
          Boolean obj = PatchProxy.applyFourRefs(a, Long.valueOf(l), Integer.valueOf(c), Boolean.valueOf(b), f, y.class, "3");
          if (obj != patchProxyRe1) {
             l = obj.longValue();
          }else {
          label_0108 :
             obj = -1;
             if (a != null) {
                long l1 = 1000;
                if (a.d()) {
                   if (PatchProxy.isSupport(LocationUploadConfig.class)) {
                      obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b), a, LocationUploadConfig.class, str1);
                      if (obj1 != patchProxyRe1) {
                         l2 = obj1.longValue();
                      }else {
                      label_012e :
                         LocationUploadConfig dynamicConfi = a.dynamicConfig;
                         if (b) {
                            l2 = dynamicConfi.fire.timerConfig.firstDelayInterval;
                         }else {
                            l2 = dynamicConfi.fire.timerConfig.repeatedInterval;
                            if (l2 <= 0) {
                               l2 = obj;
                            }
                         }
                      }
                   }else {
                      goto label_012e ;
                   }
                   Long.signum(l2);
                   if (!y.a(l, ((l1 * l2) + l))) {
                   label_010c :
                      l = obj;
                   }
                }else if(PatchProxy.isSupport(LocationUploadConfig.class)){
                   obj1 = PatchProxy.applyOneRefs(Integer.valueOf(c), a, LocationUploadConfig.class, "3");
                   if (obj1 != patchProxyRe1) {
                      l2 = obj1.longValue();
                   }else if(a.e(c)){
                      l2 = (long)a.b().get(c).intValue();
                   }else {
                      l2 = obj;
                   }
                }else {
                   goto label_016b ;
                }
                Long.signum(l2);
                if (!y.a(l, ((l1 * l2) + l))) {
                }
                l = l2;
             }
          }
       }else {
          patchProxyRe1 = patchProxyRe;
          goto label_0108 ;
       }
       if (l >= 0) {
          if (this.e()) {
             str = this.d();
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Long.valueOf(l), str, null, a.class, "9")) {
                i3 oi3 = i3.f();
                oi3.a("isFirstTimer", Boolean.valueOf(b));
                oi3.c("timeInterval", Long.valueOf(l));
                oi3.d("configTag", str);
                str = oi3.e();
                u1.R("location_upload_timer_start", str, 15);
             }
          }
          locationUplo.d = t.timer(l, TimeUnit.SECONDS).subscribe(new j(locationUplo), f.b);
          locationUplo.c = locationUplo.c + 1;
       }
       return;
    }
}
