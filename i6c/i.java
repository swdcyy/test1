package i6c.i;
import jyb.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n6c.e;
import wkd.b;
import i6c.j;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import s7.b;
import i6c.a;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Math;
import com.yxcorp.gifshow.push.model.NotificationSocialConfig;
import java.lang.reflect.Type;
import java.util.List;
import com.yxcorp.gifshow.push.model.NotificationSocialConfig$BannerControl;
import i6c.k;
import java.util.Iterator;
import java.lang.Integer;
import v6c.a;
import java.lang.Throwable;
import q87.c;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import android.app.Activity;
import u07.u;
import java.lang.Long;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import i6c.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import brd.t;
import com.yxcorp.gifshow.push.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class i implements a	// class@0017ae
{

    public void i(){
       super();
    }
    public boolean AM(){
       Object obj = PatchProxy.apply(null, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new e().c();
    }
    public void H7(){
       if (PatchProxy.applyVoid(null, this, i.class, "15")) {
          return;
       }
       b.a(-1984185332);
       j.a();
       return;
    }
    public boolean HC(){
       boolean b;
       NotificationSocialConfig notification;
       int i;
       NotificationSocialConfig$BannerControl mClickThresh1;
       NotificationSocialConfig$BannerControl mClickCount2;
       NotificationSocialConfig$BannerControl mClickThresh2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, i.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.a(-1984185332);
       Objects.requireNonNull(obj);
       j oj = j.class;
       Object obj1 = PatchProxy.apply(objArray, obj, oj, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(b.a(a.b())){
          obj.c();
          a.f(false);
       }else if(!f.a("enableBannerforPush")){
          boolean b1 = true;
          if (DateUtils.r(obj.b, obj.d) < b1) {
             obj.c();
             a.f(false);
          }else if(DateUtils.r(obj.c, obj.d) < b1){
             obj.c();
             a.f(b1);
             b = true;
          }else if(DateUtils.r(obj.c, obj.d) < Math.max(a.a(), a.c())){
             obj.c();
             a.f(false);
          }else {
             a.h(false);
             a.d(false);
             j oj1 = null;
             if (!PatchProxy.applyVoid(objArray, obj, oj, "9")) {
                notification = a.b(NotificationSocialConfig.class);
                if (notification != null) {
                   notification = notification.mBannerShowControlList;
                   if (notification != null && notification.size() >= 2) {
                      mClickThresh1 = notification.get(false).mClickCount;
                      mClickCount2 = notification.get(false).mClickThreshold;
                      NotificationSocialConfig$BannerControl mClickCount3 = notification.get(b1).mClickCount;
                      mClickThresh2 = notification.get(b1).mClickThreshold;
                      if (obj.f == b1) {
                         j c = obj.c;
                         if (!c - oj1) {
                            obj.e();
                         }else if(DateUtils.r(c, obj.d) < mClickThresh2){
                            obj.a = false;
                            obj.c();
                         }else {
                            obj.e();
                         }
                      }
                      if (obj.f == mClickThresh1) {
                         obj.e();
                         a.h(mClickCount2);
                      }
                      if (obj.f == mClickCount3) {
                         if (DateUtils.r(obj.c, obj.d) < mClickCount2) {
                            obj.a = false;
                            obj.c();
                         }else {
                            obj.e();
                            a.h(mClickThresh2);
                            a.g(false);
                         }
                      }
                      if (obj.a != null) {
                         obj.e();
                      }
                   }
                }
             }
             if (!PatchProxy.applyVoid(objArray, obj, oj, "8")) {
                notification = a.b(NotificationSocialConfig.class);
                if (notification != null) {
                   i = obj.e + b1;
                   notification = notification.mBannerClickControlList;
                   if (notification != null && notification.size() >= 3) {
                      NotificationSocialConfig$BannerControl mClickCount = notification.get(false).mClickCount;
                      NotificationSocialConfig$BannerControl mClickThresh = notification.get(false).mClickThreshold;
                      NotificationSocialConfig$BannerControl mClickCount1 = notification.get(b1).mClickCount;
                      mClickThresh1 = notification.get(b1).mClickThreshold;
                      mClickCount2 = notification.get(2).mClickCount;
                      mClickThresh2 = notification.get(2).mClickThreshold;
                      if (i == b1) {
                         j b2 = obj.b;
                         if (!b2 - null) {
                            obj.d();
                         }else if(DateUtils.r(b2, obj.d) < mClickThresh2){
                            obj.a = false;
                         }else {
                            obj.d();
                         }
                      }
                      if (i == mClickCount) {
                         obj.d();
                         a.d(mClickThresh);
                      }
                      if (i == mClickCount1) {
                         if (DateUtils.r(obj.b, obj.d) < mClickThresh) {
                            obj.a = false;
                         }else {
                            obj.d();
                            a.d(mClickThresh1);
                         }
                      }
                      if (i == mClickCount2) {
                         if (DateUtils.r(obj.b, obj.d) < mClickThresh1) {
                            obj.a = false;
                         }else {
                            obj.d();
                            a.d(mClickThresh2);
                         }
                      }
                   }
                }
             }
             a.f(obj.a);
             b = obj.a;
          }
       }
       b = false;
       return b;
    }
    public boolean HT(Context p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       p0 = PatchProxy.applyOneRefs(p0, null, k.class, str);
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else {
          List list = k.b();
          if (!list.isEmpty()) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                try{
                   b.b(Integer.parseInt(str1));
                }catch(java.lang.Exception e0){
                   Object[] objArray = new Object[0];
                   a.C().u("push_id_parse_error", e0, objArray);
                   goto label_0036 ;
                }
             }
             a.e("");
          }
          b = true;
       }
       return b;
    }
    public void I4(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "16")) {
          return;
       }
       j oj = b.a(-1984185332);
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoid(objArray, oj, j.class, "4")) {
          i = oj.f + 1;
          oj.f = i;
          a.g(i);
          long l = System.currentTimeMillis();
          oj.d = l;
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong("show_social_dialog_current_time", l);
          g.a(uEditor);
       }
       return;
    }
    public a Q10(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PushSdkInitModuleForMainProcess();
    }
    public void T6(Activity p0,long p1,int p2,u p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, i.class, "8")) {
          return;
       }
       new e(p0, p1, p2).g(p3);
       return;
    }
    public a TA(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PushSdkInitModuleForSubProcess();
    }
    public boolean Tp(){
       Object obj = PatchProxy.apply(null, this, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new e().c();
    }
    public boolean W7(){
       Object obj = PatchProxy.apply(null, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.u;
    }
    public void al(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "13")) {
          return;
       }
       e.u = p0;
       return;
    }
    public void c50(PostStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, new e(), e.class, "2") && p0 == PostStatus.UPLOAD_COMPLETE) {
          new e(ActivityContext.g().e(), System.currentTimeMillis(), 3).f();
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public a lT(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NotificationManagerInitModule();
    }
    public void pK(Activity p0,long p1,int p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, i.class, "7")) {
          return;
       }
       new e(p0, p1, p2).f();
       return;
    }
    public a pN(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MutualInsuranceInitModule();
    }
    public boolean qA(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, i.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.a(-1984185332);
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, j.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!obj.c){
          Object obj2 = PatchProxy.apply(objArray, obj, j.class, "2");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(DateUtils.r(obj.b, System.currentTimeMillis()) < 1 || (DateUtils.r(obj.c, System.currentTimeMillis()) >= 1 && DateUtils.r(obj.c, System.currentTimeMillis()) < Math.max(a.a(), a.c()))){
             b = false;
          }
       }
       b = true;
       return b;
    }
    public void sw(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       k ok = k.class;
       if (!PatchProxy.applyVoid(objArray, objArray, ok, "6") && !a.a.getBoolean("local_push_first_play", false)) {
          b uob = PatchProxy.apply(objArray, objArray, ok, "1");
          if (uob != PatchProxyResult.class) {
          }else if(k.d == null){
             _monitor_enter(ok);
             if (k.d == null) {
                k.d = e.b(b.a(-1961311520).a(RouteType.API, d.b), b.class);
             }
             _monitor_exit(ok);
          }
          uob = k.d;
          uob.a().subscribe(b.b, Functions.d());
       }
       return;
    }
    public void xx(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "17")) {
          return;
       }
       j oj = b.a(-1984185332);
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoid(objArray, oj, j.class, "6")) {
          i = oj.e + 1;
          oj.e = i;
          if (i == 4) {
             oj.e = 0;
          }
          SharedPreferences a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putInt("click_social_dialog_count", oj.e);
          g.a(uEditor);
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putLong("click_social_record_time", System.currentTimeMillis());
          g.a(uEditor1);
       }
       return;
    }
}
