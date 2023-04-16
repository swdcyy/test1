package ge0.f;
import ge0.e;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import ge0.f$c;
import java.lang.Number;
import java.lang.Integer;
import ge0.f$b;
import ce0.b;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;
import java.lang.Throwable;
import com.kuaishou.tk.api.b;
import tkd.b;
import tkd.d;
import rx4.i;
import tx4.w;
import java.util.Collection;
import ekd.q;
import java.util.List;
import sx4.f;
import lnc.i3;
import k2b.u1;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import vid.b;
import lnc.u1;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import ge0.f$a;
import java.lang.reflect.Type;
import el.a;
import java.util.Iterator;
import brd.a0;
import b66.k$a;

public class f implements e	// class@0024af
{
    public Map a;
    public SharedPreferences b;
    public boolean c;

    public void f(){
       super();
       this.a = new HashMap();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.l();
       if (TextUtils.x(p0)) {
          return true;
       }
       f$c uoc = this.a.get(p0);
       if (uoc == null) {
          return true;
       }
       return uoc.mReplaceExceptionTkWithNative;
    }
    public long b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       this.l();
       f$c uoc = this.a.get(p0);
       if (uoc == null) {
          return 5000;
       }
       return uoc.mSdkInitTimeout;
    }
    public synchronized void c(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "15")) {
          return;
       }
       this.l();
       f$c uoc = this.a.get(p0);
       if (uoc == null) {
          return;
       }
       this.m(p0, p1);
       String str = this.e(p0, p1);
       f$b uob = this.i(str);
       if (uob == null) {
          uob = new f$b();
       }
       if (this.g(uoc, uob)) {
          Object[] objArray = new Object[0];
          b.C().t("UgActivityTkStrategy", "notifyTkErrorOccurs id ="+p0, objArray);
          return;
       }else {
          f$b mCrashDay = uob.mCrashDay;
          uob.mCrashDay = this.k();
          int i = 1;
          uob.mCrashDayCount = ((this.k()).equals(mCrashDay))? uob.mCrashDayCount + i: i;
          if (uob.mCrashDayCount >= uoc.mMaxExceptionCount) {
             uob.mDisableStartTime = this.h();
             uob.mCrashDayCount = 0;
             uob.mCrashDay = "";
             this.o(p0);
          }
          if (!PatchProxy.applyVoidTwoRefs(str, uob, this, uof, "22")) {
             try{
                g.a(this.b.edit().putString(str, a.a.q(uob)));
             }catch(java.lang.Exception e8){
                b.C().e("UgActivityTkStrategy", "getCrashInfo error ", e8);
             }
          }
       }
    }
    public boolean d(String p0){
       boolean b;
       boolean b1;
       boolean b2;
       f$c obj3;
       boolean b3;
       w obj4;
       boolean b4;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       f$c obj = PatchProxy.applyOneRefs(p0, this, uof, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String str = "UgActivityTkStrategy";
       int i = 0;
       if (TextUtils.x(p0)) {
          Object[] objArray = new Object[i];
          b.C().t(str, "isTkAvailable: tk empty", objArray);
          return i;
       }else {
          Object[] objArray1 = new Object[i];
          b.C().s(str, "isTkAvailable bundleId:"+p0, objArray1);
          obj = PatchProxy.apply(null, this, uof, "8");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(b.b().d() && d.a(0x256720e1).k4()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             i3 obj1 = PatchProxy.applyOneRefs(p0, this, uof, "12");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                this.l();
                f$c uoc = this.a.get(p0);
                if (uoc == null) {
                   Object[] objArray4 = new Object[i];
                   b.C().t(str, "isConfigEnable is null id = "+p0, objArray4);
                   b1 = false;
                }else {
                   uoc = uoc.mEnableTk;
                }
             }
             if (b1 != null) {
                b1 = true;
             label_00b0 :
                if (b1) {
                   Object[] obj2 = PatchProxy.applyOneRefs(p0, this, uof, "20");
                   if (obj2 != patchProxyRe) {
                      b2 = obj2.booleanValue();
                   }else {
                      this.l();
                      f$b uob1 = this.i(this.f(this.j(p0), p0));
                      obj3 = this.a.get(p0);
                      if (obj3 == null || uob1 == null) {
                         b2 = false;
                      }else {
                         b2 = this.g(obj3, uob1);
                         if (b2) {
                            Object[] objArray3 = new Object[i];
                            b.C().t(str, "isInDisableTime = "+p0, objArray3);
                         }
                      }
                   }
                   if (!b2) {
                      b2 = true;
                   label_0104 :
                      if (b2) {
                         obj3 = PatchProxy.applyOneRefs(p0, this, uof, "9");
                         if (obj3 != patchProxyRe) {
                            b3 = obj3.booleanValue();
                         }else {
                            this.l();
                            obj3 = this.a.get(p0);
                            if (obj3 != null && !q.f(obj3.mBlackBundleVersions)) {
                               obj4 = this.j(p0);
                               String str1 = "ks =";
                               if (obj4 != null) {
                                  objArray2 = new Object[i];
                                  b.C().A(str, str1+p0+obj4.d, objArray2);
                               }else {
                                  objArray2 = new Object[i];
                                  b.C().A(str, str1+p0, objArray2);
                               }
                               if (obj4 != null && obj3.mBlackBundleVersions.contains(Integer.valueOf(obj4.d))) {
                                  b3 = false;
                               }
                            }
                         label_017d :
                            b3 = true;
                         }
                         if (b3) {
                            b3 = true;
                         label_0183 :
                            if (b3) {
                               obj4 = PatchProxy.applyOneRefs(p0, this, uof, "11");
                               b4 = (obj4 != patchProxyRe)? obj4.booleanValue(): d.a(0x256720e1).S(p0);
                               if (b4) {
                                  b4 = true;
                               label_01a3 :
                                  obj2 = new Object[i];
                                  b.C().s(str, "tk id:"+p0+", isTkRuntimeEnable:"+b+", isConfigEnable:"+b1+", isNotInDisableTime:"+b2+", isVersionOK:"+b3+", isBundleFileExist:"+b4, obj2);
                                  if (b1 && (!PatchProxy.applyVoidOneRefs(p0, this, uof, "5") && (!TextUtils.x(p0) && this.c != null))) {
                                     this.l();
                                     w ow = this.j(p0);
                                     obj = this.a.get(p0);
                                     if (ow != null && obj != null) {
                                        f$b uob = this.i(this.f(ow, p0));
                                        if (uob == null) {
                                           uob = new f$b();
                                        }
                                        obj1 = i3.f();
                                        obj1.d("bundleId", p0);
                                        obj1.c("maxErrorCount", Integer.valueOf(obj.mMaxExceptionCount));
                                        obj1.c("currentErrorCount", Integer.valueOf(uob.mCrashDayCount));
                                        obj1.c("bundleVersionCode", Integer.valueOf(ow.d));
                                        f$c mBlackBundle = obj.mBlackBundleVersions;
                                        if (mBlackBundle != null && mBlackBundle.contains(Integer.valueOf(ow.d))) {
                                           i = true;
                                        }
                                        obj1.a("isInBlacklist", Boolean.valueOf(i));
                                        obj1.a("isErrorDisable", Boolean.valueOf(this.g(obj, uob)));
                                        obj1.d("sdkVersion", d.a(0x256720e1).nr());
                                        u1.R("ug_tk_cooling_off_event", obj1.toString(), 9);
                                     }
                                  }
                               label_028e :
                                  return b4;
                               }
                            }
                            b4 = false;
                            goto label_01a3 ;
                         }
                      }
                      b3 = false;
                      goto label_0183 ;
                   }
                }
                b2 = false;
                goto label_0104 ;
             }
          }
          b1 = false;
          goto label_00b0 ;
       }
    }
    public final String e(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 <= 0) {
          return p0;
       }else {
          return p0+p1;
       }
    }
    public final String f(w p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return p1;
       }
       return p1+p0.d;
    }
    public final boolean g(f$c p0,f$b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((this.h() - p1.mDisableStartTime) - p0.mDisableDuration < 0)? true: false;
       return b;
    }
    public final long h(){
       Object obj = PatchProxy.apply(null, this, f.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis());
    }
    public final f$b i(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, f.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          return a.a.h(this.b.getString(p0, obj), f$b.class);
       }catch(java.lang.Exception e5){
          b.C().e("UgActivityTkStrategy", "getCrashInfo error ", e5);
          return obj;
       }
    }
    public final w j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x256720e1).n(p0);
    }
    public final String k(){
       Object obj = PatchProxy.apply(null, this, f.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()));
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = b.c(a.a().a(), "UgActivityTkSwitcher", 0);
       this.n();
       u1.a(this);
       return;
    }
    public final void m(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "6")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (p1 <= 0) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.l();
       f$c uoc = this.a.get(p0);
       if (uoc == null) {
          return;
       }
       f$b uob = this.i(this.e(p0, p1));
       if (uob == null) {
          uob = new f$b();
       }
       i3 oi3 = i3.f();
       oi3.d("bundleId", p0);
       oi3.a("isErrorDisable", Boolean.valueOf(this.g(uoc, uob)));
       oi3.c("bundleVersionCode", Integer.valueOf(p1));
       oi3.d("sdkVersion", d.a(0x256720e1).nr());
       u1.R("ug_tk_exception", oi3.toString(), 9);
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f uof = a.t().f("ugTkTemplateStrategy");
       if (uof != null && uof.c() != null) {
          this.c = a.t().d("ugActivityTkReportSample", false);
          Object[] objArray = new Object[false];
          b.C().s("UgActivityTkStrategy", "UgActivityTkStrategyImpl refresh", objArray);
          HashMap hashMap = new HashMap();
          List list = a.a.i(uof.c().toString(), new f$a(this).getType());
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                f$c uoc = iterator.next();
                if (uoc != null && !TextUtils.x(uoc.mTkBundleId)) {
                   hashMap.put(uoc.mTkBundleId, uoc);
                }
             }
          }
          this.a = hashMap;
       }
    label_0086 :
       return;
    }
    public final void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "16")) {
          return;
       }
       d.a(0x256720e1).q0(p0);
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (p0.a == 2) {
          this.n();
       }
       return;
    }
}
