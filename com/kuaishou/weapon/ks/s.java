package com.kuaishou.weapon.ks.s;
import java.lang.Object;
import org.json.JSONObject;
import android.content.Context;
import com.kuaishou.weapon.ks.aa;
import com.kuaishou.weapon.ks.t;
import java.lang.String;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import android.content.pm.ActivityInfo;
import com.kuaishou.weapon.ks.t$a;
import java.util.HashMap;
import java.lang.Throwable;
import com.kuaishou.weapon.ks.d;
import java.util.Map;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.ks.t$b;
import java.lang.System;
import android.os.Build$VERSION;
import org.json.JSONArray;
import com.kuaishou.weapon.ks.u;
import com.kuaishou.weapon.ks.u$b;
import com.kuaishou.weapon.ks.u$b$a;
import com.kuaishou.weapon.ks.u$b$b;
import com.kuaishou.weapon.ks.u$c;
import com.kuaishou.weapon.ks.u$d;
import com.kuaishou.weapon.ks.u$d$a;

public class s	// class@001220
{

    public void s(){
       super();
    }
    public static aa a(JSONObject p0,Context p1){
       int i5;
       int i6;
       t ot1;
       ActivityInfo[] uActivityInf1;
       boolean b;
       String str = "0";
       String str1 = "1";
       aa uoaa = null;
       t ot = s.a(p0);
       if (ot == null) {
          return uoaa;
       }
       int i = ot.a();
       String str2 = ot.l();
       String str3 = ot.j();
       int i1 = 0;
       String str4 = 1;
       String str5 = (ot.d() == str4)? 1: null;
       ApplicationInfo uApplication = (ot.h() == str4)? 1: null;
       int i2 = (ot.n() == str4)? 1: 0;
       int i3 = ot.e();
       String str6 = ot.c();
       str4 = ot.f();
       String str7 = ot.b();
       PackageInfo packageInfo = new PackageInfo();
       packageInfo.packageName = str4;
       packageInfo.versionName = str2;
       int i4 = uApplication;
       uApplication = new ApplicationInfo();
       if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str7)) {
          i5 = str5;
          if (str7.startsWith(".")) {
             uApplication.name = str4+str7;
             uApplication.className = str4+str7;
          }
       }else {
          i5 = str5;
       }
       uApplication.theme = ot.i();
       packageInfo.applicationInfo = uApplication;
       List list = ot.m();
       if (list != null && list.size() > 0) {
          ArrayList uArrayList = new ArrayList();
          i6 = i2;
          int i7 = 0;
          while (i7 < list.size()) {
             ActivityInfo uActivityInf = new ActivityInfo();
             ot1 = ot;
             uActivityInf.name = list.get(i7).c();
             uActivityInf.theme = list.get(i7).b();
             uActivityInf.labelRes = list.get(i7).a();
             if (!TextUtils.isEmpty(uActivityInf.name)) {
                uArrayList.add(uActivityInf);
             }
             i7 = i7 + 1;
             ot = ot1;
          }
          ot1 = ot;
          if (uArrayList.size() > 0) {
             uActivityInf1 = new ActivityInfo[uArrayList.size()];
             packageInfo.activities = uArrayList.toArray(uActivityInf1);
          }
       }else {
          i6 = i2;
          ot1 = ot;
       }
       i2 = i4;
       aa uoaa1 = new aa(packageInfo, i, str4, str2, str3, str6);
       uActivityInf1.w = i5;
       uActivityInf1.y = i3;
       i3 = -1;
       int i8 = (ot1.k() == null)? 0: ot1.k().a();
       if (ot1.k() != null) {
          i3 = ot1.k().b();
       }
       uActivityInf1.u = i8;
       uActivityInf1.v = i3;
       uActivityInf1.t = System.currentTimeMillis();
       uActivityInf1.A = i6;
       if (Build$VERSION.SDK_INT > 29 && i2 == 1) {
          if (ot1.g() == 1) {
             i1 = 1;
          }
          b = i1;
       }else {
          b = i2;
       }
       uActivityInf1.z = b;
       return uActivityInf1;
    }
    public static t a(JSONObject p0){
       int i = 0;
       try{
          t ot = new t();
          ot.a(p0.optInt("wk"));
          ot.a(p0.optString("wan"));
          ot.b(p0.optString("wm"));
          ot.b(p0.optInt("wo"));
          ot.c(p0.optInt("wpr"));
          ot.c(p0.optString("wp"));
          ot.e(p0.optInt("ws", 1));
          int i1 = 0;
          ot.d(p0.optInt("wh", i1));
          ot.f(p0.optInt("wt"));
          ot.d(p0.optString("wu"));
          ot.e(p0.optString("wv"));
          ot.g(p0.optInt("wdm"));
          JSONArray jSONArray = p0.getJSONArray("wa");
          List list = i;
          for (; i1 < jSONArray.length(); i1 = i1 + 1) {
             t$a uoa = new t$a();
             JSONObject jSONObject = jSONArray.getJSONObject(i1);
             uoa.a(jSONObject.optInt("r"));
             uoa.b(jSONObject.optInt("t"));
             uoa.a(jSONObject.getString("n"));
             if (list == null) {
                list = new ArrayList();
             }
             list.add(uoa);
          }
          ot.a(list);
          t$b uob = new t$b();
          p0 = p0.getJSONObject("we");
          uob.a(p0.optInt("duration"));
          uob.b(p0.optInt("network"));
          ot.a(uob);
          return ot;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static u a(String p0,Context p1){
       String str = "w";
       String str1 = "r";
       u ou = new u();
       JSONObject jSONObject = new JSONObject(p0);
       ou.s(jSONObject.optInt("status", 1));
       if (ou.B() != 1) {
          return null;
       }
       ou.c(jSONObject.optString("pver"));
       ou.d(jSONObject.optString("aver"));
       ou.e(jSONObject.optString("bver"));
       ou.b(jSONObject.optString("rver"));
       ou.a(jSONObject.optString("wver"));
       ou.h(jSONObject.optInt("pd", 12));
       ou.b(jSONObject.optInt("ps", 0));
       ou.g(jSONObject.optInt("pc", 3));
       ou.r(jSONObject.optInt("pi", 15));
       ou.a(jSONObject.optInt("pp", 6));
       ou.d(jSONObject.optInt("pu", 0));
       ou.e(jSONObject.optInt("pa", 1));
       ou.f(jSONObject.optInt("pb", 1));
       ou.i(jSONObject.optInt("pg", 0));
       ou.c(jSONObject.optInt("pt", 20));
       ou.j(jSONObject.optInt("pk", 0));
       ou.k(jSONObject.optInt("ph", 0));
       ou.p(jSONObject.optInt("co", 1));
       ou.q(jSONObject.optInt("ac", 0));
       ou.l(jSONObject.optInt("lt", 0));
       ou.m(jSONObject.optInt("li", 0));
       ou.n(jSONObject.optInt("ni", 0));
       ou.o(jSONObject.optInt("ns", 0));
       u$b uob = new u$b();
       JSONObject jSONObject1 = jSONObject.getJSONObject("b");
       uob.b(jSONObject1.optInt("bc", 2));
       uob.c(jSONObject1.optInt("bi", 12));
       uob.a(jSONObject1.optInt("bs", 1));
       JSONObject jSONObject2 = jSONObject1.getJSONObject("bcl");
       u$b$a uob$a = new u$b$a();
       uob$a.a(jSONObject2.optInt("a", 1));
       uob$a.h(jSONObject2.optInt(str1, 1));
       uob$a.b(jSONObject2.optInt("c", 1));
       uob$a.i(jSONObject2.optInt("s", 1));
       uob$a.d(jSONObject2.optInt("d", 1));
       uob$a.j(jSONObject2.optInt("u", 1));
       uob$a.l(jSONObject2.optInt(str, 1));
       uob$a.f(jSONObject2.optInt("n", 1));
       uob$a.o(jSONObject2.optInt("ie", 1));
       uob$a.e(jSONObject2.optInt("is", 1));
       uob$a.m(jSONObject2.optInt("ic", 1));
       uob$a.n(jSONObject2.optInt("btm", 1));
       uob$a.k(jSONObject2.optInt("mc", 1));
       uob$a.p(jSONObject2.optInt("rp", 1));
       uob$a.g(jSONObject2.optInt("tc", 1));
       int i = jSONObject2.optInt("il", 1);
       try{
          uob$a.c(i);
          jSONObject2 = jSONObject1.getJSONObject("pry");
          u$b$b uob$b = new u$b$b();
          uob$b.e(jSONObject2.optInt("gifa", 1));
          uob$b.d(jSONObject2.optInt("gnci", 1));
          uob$b.f(jSONObject2.optInt("gsl", 1));
          uob$b.c(jSONObject2.optInt("gso", 1));
          uob$b.a(jSONObject2.optInt("gno", 1));
          uob$b.b(jSONObject2.optInt("gnon", 1));
          uob$b.g(jSONObject2.optInt("rl", 1));
          uob$b.i(jSONObject2.optInt("grs", 1));
          uob$b.h(jSONObject2.optInt("grt", 1));
          uob.a(uob$b);
          uob.a(uob$a);
          ou.a(uob);
          u$c uoc = new u$c();
          JSONObject jSONObject3 = jSONObject.getJSONObject(str1);
          uoc.b(jSONObject3.optInt("rc", 4));
          uoc.a(jSONObject3.optInt("rs", 1));
          uoc.c(jSONObject3.optInt("ri", 6));
          ou.a(uoc);
          u$d uod = new u$d();
          JSONObject jSONObject4 = jSONObject.getJSONObject(e0);
          uod.a(jSONObject4.optInt("ws", 1));
          jSONObject4 = jSONObject4.getJSONObject("wrp");
          u$d$a uod$a = new u$d$a();
          uod$a.a(jSONObject4.optInt("ue", 1));
          uod$a.b(jSONObject4.optInt("ev", 1));
          uod$a.c(jSONObject4.optInt("mnt", 1));
          uod$a.d(jSONObject4.optInt("as", 1));
          uod$a.e(jSONObject4.optInt("ad", 1));
          uod$a.f(jSONObject4.optInt("ae", 1));
          uod$a.g(jSONObject4.optInt("cnt", 1));
          uod$a.h(jSONObject4.optInt("gsv", 1));
          uod$a.i(jSONObject4.optInt("ud", 1));
          uod.a(uod$a);
          ou.a(uod);
          return ou;
       }catch(java.lang.Exception e0){
       }
    }
}
