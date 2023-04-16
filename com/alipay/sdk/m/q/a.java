package com.alipay.sdk.m.q.a;
import android.app.Activity;
import s6.a;
import com.alipay.sdk.m.q.a$c;
import java.lang.Object;
import com.alipay.android.app.IAlixPay;
import java.lang.String;
import u6.c;
import android.util.Pair;
import android.content.Intent;
import com.alipay.sdk.app.EnvUtils;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.SystemClock;
import java.lang.StringBuilder;
import k6.a;
import android.content.Context;
import m6.a;
import android.app.Application;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Throwable;
import com.alipay.sdk.m.q.a$b;
import android.content.ServiceConnection;
import java.lang.Boolean;
import com.alipay.sdk.m.q.a$a;
import com.alipay.android.app.IRemoteServiceCallback;
import java.util.Map;
import java.util.HashMap;
import j6.b;
import android.content.pm.PackageInfo;
import com.alipay.sdk.m.q.b;
import s6.a$a;
import u6.e;
import com.alipay.sdk.app.APayEntranceActivity;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import java.lang.Class;
import u6.i;
import com.alipay.sdk.m.f.c;
import java.util.List;
import j6.a;
import com.alipay.sdk.m.q.b$b;
import java.util.Iterator;
import java.lang.Integer;
import android.os.Build;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import java.util.concurrent.CountDownLatch;
import u6.d;
import com.alipay.sdk.app.AlipayResultActivity;
import java.lang.RuntimeException;
import android.util.Base64;
import android.os.Binder;
import android.net.Uri$Builder;
import java.lang.Thread;

public class a	// class@000e9c
{
    public Activity a;
    public IAlixPay b;
    public final Object c;
    public boolean d;
    public a$c e;
    public final a f;
    public boolean g;
    public String h;
    public String i;

    public void a(Activity p0,a p1,a$c p2){
       super();
       this.c = IAlixPay.class;
       this.g = false;
       this.h = null;
       this.i = null;
       this.a = p0;
       this.f = p1;
       this.e = p2;
       c.f("mspl", "alipaySdk");
    }
    public static IAlixPay b(a p0,IAlixPay p1){
       p0.b = p1;
       return p1;
    }
    public static a e(a p0){
       return p0.f;
    }
    public static Object h(a p0){
       return p0.c;
    }
    public static a$c i(a p0){
       return p0.e;
    }
    public static Activity j(a p0){
       return p0.a;
    }
    public final Pair a(String p0,String p1,a p2){
       int i3;
       IAlixPay iAlixPay;
       Pair pair;
       a a;
       long l1;
       a$a uoa2;
       long l2;
       a$b uob1;
       HashMap hashMap;
       String str4;
       int i4;
       a uoa = this;
       String str = p0;
       String str1 = p1;
       a uoa1 = p2;
       Intent intent = new Intent();
       intent.setPackage(str1);
       str1 = (EnvUtils.a() && TextUtils.equals(str1, "com.eg.android.AlipayGphoneRC"))? "com.eg.android.AlipayGphoneRC.IAlixPay": "com.eg.android.AlipayGphone.IAlixPay";
       intent.setAction(str1);
       long l = SystemClock.elapsedRealtime();
       str1 = "biz";
       String str2 = "PgBindStarting";
       String str3 = l+"|";
       int i = 0;
       int i1 = (str)? p0.length(): 0;
       a.c(uoa1, str1, str2, str3+i1);
       a.a(uoa.a, uoa1, str, uoa1.d);
       if (!a.A().j()) {
          ComponentName uComponentNa = a.e(uoa.a.getApplication(), intent);
          str2 = "biz";
          str3 = "stSrv";
          str1 = (uComponentNa != null)? uComponentNa.getPackageName(): "null";
          a.c(uoa1, str2, str3, str1);
       }else {
          a.c(uoa1, "biz", "stSrv", "skipped");
       }
       int i2 = 1;
       if (a.A().f()) {
          i3 = 65;
          a.c(uoa1, "biz", "bindFlg", "imp");
       }else {
          i3 = 1;
       }
       a$b uob = new a$b(uoa);
       if (a.a(uoa.a.getApplicationContext(), intent, uob, i3)) {
          a c = uoa.c;
          _monitor_enter(c);
          if (uoa.b == null) {
             try{
                uoa.c.wait((long)a.A().o());
             }catch(java.lang.InterruptedException e0){
                a.d(uoa1, "biz", "BindWaitTimeoutEx", e0);
             }
          }
       }else {
          throw new Throwable("bindService fail");
       }
    }
    public final String c(String p0,String p1,PackageInfo p2){
       c j;
       int i;
       p2 = (p2 != null)? p2.versionName: "";
       c.f("mspl", "pay payInvokeAct");
       a.c(this.f, "biz", "PgWltVer", p1+"|"+p2);
       a tf = this.f;
       a.a(this.a, tf, p0, tf.d);
       p2 = new Object();
       String str = b.c(32);
       long l = SystemClock.elapsedRealtime();
       a.c(this.f, "biz", "BSAStart", str+"|"+l);
       a$a.d(this.f, str);
       APayEntranceActivity.e.put(str, new e(this, p2));
       HashMap hashMap = a.f(this.f);
       hashMap.put("ts_intent", String.valueOf(l));
       JSONObject jSONObject = new JSONObject(hashMap);
       Intent intent = new Intent(this.a, APayEntranceActivity.class);
       intent.putExtra("ap_order_info", p0);
       intent.putExtra("ap_target_packagename", p1);
       intent.putExtra("ap_session", str);
       if (jSONObject != null) {
          intent.putExtra("ap_local_info", jSONObject.toString());
       }
       tf = this.f;
       a.a(this.a, tf, p0, tf.d);
       a ta = this.a;
       if (ta != null) {
          ta.startActivity(intent);
       }else {
          a.h(this.f, "biz", "ErrActNull", "");
          Context uContext = this.f.a();
          if (uContext != null) {
             uContext.startActivity(intent);
          }
       }
       a.A().d(this.f, this.a.getApplicationContext(), false);
       _monitor_enter(p2);
       p2.wait();
       try{
          _monitor_exit(p2);
          ta = this.i;
          String str1 = i.c(this.f, ta).get("resultStatus");
          if (str1 == null) {
             p1 = "null";
          label_0111 :
             a.b(this.f, "biz", "BSADone-"+p1);
             if (TextUtils.isEmpty(ta)) {
                a.b(this.f, "biz", "BSAEmpty");
                ta = "scheme_failed";
             }
          }else {
             p1 = str1;
             goto label_0111 ;
          }
       }catch(java.lang.InterruptedException e8){
          a.d(this.f, "biz", "BSAWaiting", e8);
          j = c.j;
          i = j.b();
          j = b.b(i, j.a(), "");
       }
       return j;
    }
    public String d(String p0,boolean p1){
       b$b a;
       JSONObject jSONObject;
       int i;
       boolean b;
       PackageInfo packageInfo2;
       String str7;
       String str8;
       String str9;
       JSONObject jSONObject3;
       object oobject1;
       a uoa = this;
       String str = p0;
       String str1 = "com.eg.android.AlipayGphone";
       String str2 = "failed";
       PackageInfo packageInfo = 1;
       String str3 = null;
       List list = a.A().p();
       if (a.A().g == null || list == null) {
          list = a.d;
       }
       b$b uob = b.a(uoa.f, uoa.a, list);
       if (uob != null && (uob.b(uoa.f) || uob.a())) {
          return str2;
       }else {
          a = uob.a;
          if (a != null) {
             PackageInfo versionName = a.versionName;
             String[] a1 = b.a;
             if (TextUtils.equals(versionName, a1[str3]) || TextUtils.equals(versionName, a1[packageInfo])) {
                a = 1;
             label_0057 :
                if (a) {
                   return str2;
                }else {
                   a = uob.a;
                   String str4 = (a == null || str1.equals(a.packageName))? b.i(): uob.a.packageName;
                   PackageInfo packageInfo1 = str4;
                   a = uob.a;
                   b$b uob1 = (a != null)? a: null;
                   str4 = a.A().g();
                   if (str4 != null && str4.length() > 0) {
                      jSONObject = new JSONObject(str4).optJSONObject(packageInfo1);
                      if (jSONObject != null && jSONObject.length() > 0) {
                         Iterator iterator = jSONObject.keys();
                         while (iterator.hasNext()) {
                            String str5 = iterator.next();
                            i = Integer.parseInt(str5);
                            if (uob1 != null) {
                               if (uob1.versionCode >= i) {
                                  try{
                                     b = a.A().e(uoa.a, Integer.parseInt(jSONObject.getString(str5)));
                                     uoa.g = b;
                                     if (!b) {
                                     }
                                  }catch(java.lang.Exception e0){
                                  }
                               }
                            }
                            packageInfo = 1;
                         }
                      }
                   }
                label_00e1 :
                   a f = uoa.f;
                   String str6 = "auth";
                   boolean b1 = (f != null && !TextUtils.isEmpty(f.g))? ((uoa.f.g).toLowerCase()).contains(str6): false;
                   if (p1 || (uoa.g != null && !b1)) {
                      return uoa.c(str, packageInfo1, uob1);
                   }else if(uob1 != null){
                      packageInfo2 = uob1.versionCode;
                   }else {
                      packageInfo2 = null;
                   }
                   versionName = (uob1 != null)? uob1.versionName: "";
                   c.f("mspl", "pay bind or scheme");
                   str3 = "|";
                   a.c(uoa.f, "biz", "PgWltVer", packageInfo1+str3+versionName);
                   f = uoa.f;
                   b = (f != null && !TextUtils.isEmpty(f.g))? ((uoa.f.g).toLowerCase()).contains(str6): false;
                   if (!b) {
                      String[] stringArray = (a.A().k()).split("\\|");
                      String mODEL = Build.MODEL;
                      if (!TextUtils.isEmpty(mODEL)) {
                         int i3 = stringArray.length;
                         int i4 = 0;
                         while (true) {
                            if (i4 < i3) {
                               int i5 = i3;
                               oobject1 = stringArray[i4];
                               if (!TextUtils.equals(mODEL, oobject1)) {
                                  String[] stringArray2 = stringArray;
                                  if (!TextUtils.equals(oobject1, "all")) {
                                     i4 = i4 + 1;
                                     i3 = i5;
                                     stringArray = stringArray2;
                                  }
                               }
                               f = 1;
                            }
                         }
                         if (f) {
                            if (uob != null && a.A().y()) {
                               uoa.g(uob);
                            }
                            a.b(uoa.f, "biz", "BindSkipByModel");
                         label_01f3 :
                            str7 = str2;
                         }else if(!b){
                            i3 = b.n(packageInfo1);
                            a.c(uoa.f, "biz", "bindExt", i3);
                            f = (a.A().s() && (i3 & 0x02) == 2)? 1: null;
                            if (f) {
                               if (uob != null && a.A().y()) {
                                  uoa.g(uob);
                               }
                               a.b(uoa.f, "biz", "BindSkipByL");
                               goto label_01f3 ;
                            }
                         }
                         if (uob != null && !a.A().t()) {
                            uoa.g(uob);
                         }
                         Pair pair = uoa.a(str, packageInfo1, uoa.f);
                         str7 = pair.first;
                         if (str2.equals(str7) && (pair.second.booleanValue() && a.A().r())) {
                            a.b(uoa.f, "biz", "BindRetry");
                            str7 = uoa.a(str, packageInfo1, uoa.f).first;
                         }
                      }
                   label_0193 :
                      f = null;
                      goto label_0194 ;
                   }else {
                      goto label_01ad ;
                   }
                label_0243 :
                   c.f("mspl", "pay bind result: "+str7);
                   a f1 = uoa.f;
                   a.a(uoa.a, f1, str, f1.d);
                   if (str2.equals(str7)) {
                      if (!a.A().m()) {
                         a.c(uoa.f, "biz", "BSPNotStartByConfig", "");
                      }else if(!str1.equals(packageInfo1) || packageInfo2 <= 125){
                         a.c(uoa.f, "biz", "BSPNotStartByPkg", packageInfo1+str3+packageInfo2);
                      }else if(a.A().q()){
                         f = uoa.f;
                         if (f != null && (f.f / 0x186a0)) {
                            a.b(f, "biz", "BSPNotStartByUsr");
                         }
                      }
                      f = uoa.a;
                      str7 = "scheme_failed";
                      if (f != null) {
                         a f2 = uoa.f;
                         str2 = "BSPDetectFail";
                         Intent intent = new Intent("android.intent.action.MAIN", null);
                         intent.setClassName(packageInfo1, "com.alipay.android.msp.ui.views.MspContainerActivity");
                         if (intent.resolveActivityInfo(f.getPackageManager(), 0) == null) {
                            a.b(f2, "biz", str2);
                            str4 = null;
                         }else {
                            str4 = 1;
                         }
                         if (str4) {
                            str4 = "sc";
                            CountDownLatch uCountDownLa = new CountDownLatch(1);
                            str2 = b.c(32);
                            long l = SystemClock.elapsedRealtime();
                            a.c(uoa.f, "biz", "BSPStart", str2+str3+l);
                            a$a.d(uoa.f, str2);
                            d uod = new d(uoa, uCountDownLa);
                            ConcurrentHashMap b2 = AlipayResultActivity.b;
                            try{
                               b2.put(str2, uod);
                               String[] stringArray1 = str.split("&", -1);
                               int len = stringArray1.length;
                               int i1 = 0;
                               try{
                                  while (true) {
                                     if (i1 < len) {
                                        object oobject = stringArray1[i1];
                                        str8 = str7;
                                        if (oobject.startsWith("bizcontext=")) {
                                           str7 = oobject.substring(oobject.indexOf("{"), (oobject.lastIndexOf("}") + 1));
                                           b = oobject.indexOf(str7);
                                           str9 = oobject.substring(0, b);
                                           JSONObject jSONObject2 = new JSONObject(str7);
                                           String str10 = oobject.substring((b + str7.length()));
                                           if ((jSONObject2.optString(str4)).equals("h5tonative")) {
                                              jSONObject2.put(str4, "h5tonative_scheme");
                                           }else {
                                              jSONObject2.put(str4, "h5tonative_sdkscheme");
                                           }
                                           jSONObject3 = jSONObject2;
                                           oobject1 = oobject;
                                           str6 = str10;
                                        label_0380 :
                                           if (!TextUtils.isEmpty(oobject1)) {
                                              if (str.indexOf(oobject1) == str.lastIndexOf(oobject1)) {
                                                 str = str.replace(oobject1, str9+jSONObject3.toString()+str6);
                                              label_03d9 :
                                                 jSONObject = new JSONObject();
                                                 jSONObject.put("sourcePid", Binder.getCallingPid());
                                                 jSONObject.put("external_info", str);
                                                 str7 = "pkgName";
                                                 jSONObject.put(str7, uoa.a.getPackageName());
                                                 jSONObject.put("session", str2);
                                                 Uri$Builder uBuilder = new Uri$Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20000125");
                                                 uBuilder.appendQueryParameter("mqpSchemePay", Base64.encodeToString((jSONObject.toString()).getBytes("UTF-8"), 2));
                                                 HashMap hashMap = a.f(uoa.f);
                                                 hashMap.put("ts_scheme", String.valueOf(l));
                                                 JSONObject jSONObject1 = new JSONObject(hashMap);
                                                 uBuilder.appendQueryParameter("mqpLoc", jSONObject1.toString());
                                                 str4 = uBuilder.build().toString();
                                                 Intent intent1 = new Intent();
                                                 intent1.setPackage(packageInfo1);
                                                 intent1.addFlags(0x10000000);
                                                 intent1.setData(Uri.parse(str4));
                                                 f1 = uoa.f;
                                                 a.a(uoa.a, f1, str, f1.d);
                                                 uoa.a.startActivity(intent1);
                                                 a.A().d(uoa.f, uoa.a.getApplicationContext(), false);
                                                 c.f("mspl", "pay scheme waiting "+str4);
                                                 uCountDownLa.await();
                                                 a h = uoa.h;
                                                 str4 = i.c(uoa.f, h).get("resultStatus");
                                                 if (str4 == null) {
                                                    str4 = "null";
                                                 }
                                                 a.b(uoa.f, "biz", "BSPDone-"+str4);
                                                 if (TextUtils.isEmpty(h)) {
                                                    a.b(uoa.f, "biz", "BSPEmpty");
                                                 label_04f2 :
                                                    str7 = str8;
                                                    break ;
                                                 }else {
                                                    str7 = h;
                                                    break ;
                                                 }
                                              }else {
                                                 throw new RuntimeException("multi ctx_args");
                                              }
                                           }else {
                                              throw new RuntimeException("empty ctx_args");
                                           }
                                        }else {
                                           i1 = i1 + 1;
                                           str7 = str8;
                                           oobject = null;
                                        }
                                     }else {
                                        str8 = str7;
                                        str6 = "";
                                        str9 = str6;
                                        oobject1 = null;
                                        jSONObject3 = null;
                                        goto label_0380 ;
                                     }
                                  }
                               }catch(java.lang.Exception e0){
                               }catch(java.lang.InterruptedException e0){
                                  a.d(uoa.f, "biz", "BSPWaiting", e0);
                                  c j = c.j;
                                  int i2 = j.b();
                                  str7 = b.b(i2, j.a(), "");
                               }
                            }catch(java.lang.Exception e0){
                               str8 = str7;
                            }
                            a.e(uoa.f, "biz", "BSPSCReplaceEx", e0, Base64.encodeToString(p0.getBytes(), 2));
                            goto label_03d9 ;
                         }
                      }
                      str8 = str7;
                      goto label_04f2 ;
                   }
                }
             }
          }
          a = null;
          goto label_0057 ;
       }
    }
    public void f(){
       this.a = null;
       this.e = null;
    }
    public final void g(b$b p0){
       p0 = p0.a;
       if (p0 == null) {
          return;
       }
       Intent intent = new Intent();
       intent.setClassName(p0.packageName, "com.alipay.android.app.TransProcessPayActivity");
       this.a.startActivity(intent);
       Thread.sleep(200);
       return;
    }
}
