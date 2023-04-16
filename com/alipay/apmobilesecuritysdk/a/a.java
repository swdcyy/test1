package com.alipay.apmobilesecuritysdk.a.a;
import android.content.Context;
import java.lang.Object;
import com.alipay.apmobilesecuritysdk.b.a;
import java.lang.String;
import x6.a;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.e.g;
import java.text.SimpleDateFormat;
import java.lang.Math;
import java.util.Date;
import java.lang.StringBuilder;
import java.util.Calendar;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.a;
import java.io.File;
import android.os.Environment;
import java.util.Map;
import com.alipay.apmobilesecuritysdk.c.a;
import com.alipay.apmobilesecuritysdk.common.a;
import com.alipay.apmobilesecuritysdk.d.e;
import y6.a;
import com.alipay.apmobilesecuritysdk.c.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import e6.b;
import e6.a;
import java.lang.System;
import g6.a;
import b7.d;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import a7.b;
import java.lang.Thread;
import a7.c;
import java.lang.Runnable;
import java.lang.Throwable;
import e6.c;

public final class a	// class@000e61
{
    public Context a;
    public a b;
    public int c;

    public void a(Context p0){
       super();
       this.b = a.a();
       this.c = 4;
       this.a = p0;
    }
    public static String a(Context p0){
       String str = a.b(p0);
       if (a.c(str)) {
          str = h.f(p0);
       }
       return str;
    }
    public static String a(Context p0,String p1){
       a.b();
       String str = i.a(p1);
       if (!a.c(str)) {
          return str;
       }
       String str1 = g.a(p0, p1);
       i.a(p1, str1);
       if (!a.c(str1)) {
          return str1;
       }
       return "";
    }
    public static boolean a(){
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String[] stringArray = new String[]{"2017-01-27 2017-01-28","2017-11-10 2017-11-11","2017-12-11 2017-12-12"};
       int i = (int)(((Math.random() * 24.00f) * 60.00f) * 60.00f) * 1;
       int i1 = 0;
       while (i1 < 3) {
          try{
             String[] stringArray1 = (stringArray[i1]).split(" ");
             if (stringArray1 != null && stringArray1.length == 2) {
                Date uDate = new Date();
                Calendar instance = Calendar.getInstance();
                instance.setTime(simpleDateFo.parse(stringArray1[1]+" 23:59:59"));
                instance.add(13, i);
                Date time = instance.getTime();
                if (uDate.after(simpleDateFo.parse(stringArray1[0]+" 00:00:00")) && uDate.before(time)) {
                   return 1;
                }
             }
             i1 = i1 + 1;
          }catch(java.lang.Exception e0){
          }
       }
       return 0;
    }
    public static String b(Context p0){
       String str = i.b();
       if (!a.c(str)) {
          return str;
       }
       c uoc = d.b(p0);
       if (uoc != null) {
          i.a(uoc);
          uoc = uoc.a;
          if (a.e(uoc)) {
             return uoc;
          }
       }
       b uob = a.b(p0);
       if (uob != null) {
          i.a(uob);
          uob = uob.a;
          if (a.e(uob)) {
             return uob;
          }
       }
       return "";
    }
    public static void b(){
       String[] stringArray = new String[]{"device_feature_file_name","wallet_times","wxcasxx_v3","wxcasxx_v4","wxxzyy_v1"};
       int i = 0;
       while (i < 5) {
          File uFile = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/"+stringArray[i]);
          if (uFile.exists() && uFile.canWrite()) {
             uFile.delete();
          }
          i = i + 1;
       }
       return;
    }
    public final int a(Map p0){
       int i;
       b uob;
       int i1;
       String str4;
       String str5;
       String str = "utdid";
       String str1 = "tid";
       String str2 = "";
       try{
          a.a(this.a, a.b(p0, str1, str2), a.b(p0, str, str2), a.a(this.a));
          String str3 = a.b(p0, "appName", str2);
          a.b();
          a.b(this.a);
          a.a(this.a, str3);
          i.a();
          i = 0;
          if (a.a() || a.a(this.a)) {
             if (!a.c(a.a(this.a, str3)) && !a.c(a.b(this.a))) {
             label_00bd :
                uob = null;
             label_00be :
                h.b(this.a, String.valueOf(a.i()));
                if (uob) {
                   uob = new b();
                   UmidSdkWrapper.startUmidTaskSync(this.a, a.a().b());
                   uob = this.b(p0);
                   a uoa1 = 3;
                   b uob1 = 2;
                   if (uob != null) {
                      if (uob.a != null) {
                         if (!a.c(uob.c)) {
                            uob1 = 1;
                         }
                      }else if(("APPKEY_ERROR").equals(uob.b)){
                         uob1 = 3;
                      }
                   }
                   if (uob1 != 1) {
                      if (uob1 != uoa1) {
                         str4 = (uob != null)? "Server error, result:"+uob.b: "Server error, returned null";
                         a.a(str4);
                         if (a.c(a.a(this.a, str3))) {
                            i1 = 4;
                         label_01fa :
                            this.c = i1;
                            a uoa = d.a(this.a, this.b.c());
                            a ta = this.a;
                            NetworkInfo networkInfo = null;
                            ConnectivityManager systemServic = ta.getSystemService("connectivity");
                            if (systemServic != null) {
                               networkInfo = systemServic.getActiveNetworkInfo();
                            }
                            if (networkInfo != null && (networkInfo.isConnected() && networkInfo.getType() == 1)) {
                               i = 1;
                            }
                         label_0228 :
                            if (i && h.c(ta)) {
                               new Thread(new c(new b(ta.getFilesDir().getAbsolutePath()+"/log/ap", uoa))).start();
                            }
                         }
                      }else {
                         i1 = 1;
                         goto label_01fa ;
                      }
                   }else {
                      h.a(this.a, ("1").equals(uob.e));
                      uoa1 = this.a;
                      uob1 = uob.f;
                      if (uob1 == null) {
                         str5 = "0";
                      }
                      h.d(uoa1, str5);
                      h.e(this.a, uob.g);
                      h.a(this.a, uob.h);
                      h.f(this.a, uob.i);
                      h.g(this.a, uob.k);
                      i.c(e.b(this.a, p0));
                      i.a(str3, uob.d);
                      i.b(uob.c);
                      i.d(uob.j);
                      str1 = a.b(p0, str1, str2);
                      if (a.e(str1) && !a.d(str1, i.d())) {
                         i.e(str1);
                      }else {
                         str1 = i.d();
                      }
                      i.e(str1);
                      str4 = a.b(p0, str, str2);
                      if (a.e(str4) && !a.d(str4, i.e())) {
                         i.f(str4);
                      }else {
                         str4 = i.e();
                      }
                      i.f(str4);
                      i.a();
                      d.a(this.a, i.g());
                      d.a();
                      a.a(this.a, new b(i.b(), i.c(), i.f()));
                      a.a();
                      g.a(this.a, str3, i.a(str3));
                      g.a();
                      h.a(this.a, str3, System.currentTimeMillis());
                   }
                }
                i1 = 0;
                goto label_01fa ;
             }
          }else {
             e.a();
             if (!(a.d(e.b(this.a, p0), i.c()) ^ 1)) {
                String str6 = a.b(p0, str1, str2);
                String str7 = a.b(p0, str, str2);
                if (!a.e(str6) || (a.d(str6, i.d()) && (!a.e(str7) || (a.d(str7, i.e()) && (i.a(this.a, str3) && (!a.c(a.a(this.a, str3)) && !a.c(a.b(this.a)))))))) {
                }
             }
          }
          uob = 1;
          goto label_00be ;
       }catch(java.lang.Exception e12){
          a.a(e12);
       }
    label_0260 :
       return this.c;
    }
    public final b b(Map p0){
       c a;
       b uob;
       b c;
       String str = "";
       a ta = this.a;
       c uoc = new c();
       String str1 = a.b(p0, "sessionId", str);
       String str2 = a.b(p0, "rpcVersion", str);
       String str3 = a.a(ta, a.b(p0, "appName", str));
       String securityToke = UmidSdkWrapper.getSecurityToken(ta);
       String str4 = h.d(ta);
       uoc.c = (a.e(str1))? str1: str3;
       uoc.d = securityToke;
       uoc.e = str4;
       uoc.a = "android";
       c uoc1 = d.c(ta);
       if (uoc1 != null) {
          a = uoc1.a;
          uoc1 = uoc1.c;
       }else {
          c = str;
          a = c;
       }
       if (a.c(a)) {
          uob = a.c(ta);
          if (uob != null) {
             a = uob.a;
             c = uob.c;
          }
       }
       c uoc2 = d.b();
       if (uoc2 != null) {
          str = uoc2.a;
          uoc2 = uoc2.c;
       }else {
          securityToke = str;
       }
       if (a.c(str)) {
          b uob1 = a.b();
          if (uob1 != null) {
             str = uob1.a;
             uob = uob1.c;
          }
       }
       uoc.h = a;
       uoc.g = str;
       uoc.j = str2;
       if (a.c(a)) {
          uoc.b = str;
          c = uob;
       }else {
          uoc.b = a;
       }
       uoc.i = c;
       uoc.f = e.a(ta, p0);
       return d.a(this.a, this.b.c()).a(uoc);
    }
}
