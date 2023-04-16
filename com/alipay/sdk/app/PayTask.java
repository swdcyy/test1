package com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.q.a;
import android.app.Activity;
import java.lang.Object;
import java.util.HashMap;
import s6.b;
import android.content.Context;
import v6.a;
import java.lang.String;
import s6.a;
import java.util.List;
import com.alipay.sdk.m.q.b$b;
import com.alipay.sdk.m.q.b;
import android.content.pm.PackageInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import u6.c;
import com.alipay.sdk.app.PayResultActivity;
import android.content.Intent;
import java.lang.Class;
import s6.a$a;
import com.alipay.sdk.app.PayResultActivity$b;
import java.lang.StringBuilder;
import j6.b;
import android.os.SystemClock;
import m6.a;
import java.lang.Throwable;
import java.util.Map;
import com.alipay.sdk.app.PayTask$b;
import java.net.URLDecoder;
import j6.a;
import b6.c;
import com.alipay.sdk.m.q.a$c;
import com.alipay.sdk.m.f.c;
import k6.a;
import q6.f;
import p6.b;
import p6.e;
import org.json.JSONObject;
import r6.a;
import java.util.ArrayList;
import com.alipay.sdk.m.n.a;
import java.util.Locale;
import l6.a;
import u6.f;
import u6.i;
import com.alipay.sdk.app.H5PayActivity;
import android.os.Bundle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.alipay.sdk.app.PayTask$a;
import com.alipay.sdk.app.EnvUtils;
import android.net.Uri;
import u6.g;
import n6.a;
import java.lang.Integer;
import java.util.Arrays;
import t6.a;
import d7.a;
import com.alipay.sdk.app.H5PayCallback;
import java.lang.Thread;
import java.lang.Runnable;

public class PayTask	// class@000e96
{
    public Activity a;
    public a b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public Map g;
    public static final Object h;
    public static long i;
    public static long k;

    static {
       PayTask.h = a.class;
    }
    public void PayTask(Activity p0){
       super();
       this.c = "wappaygw.alipay.com/service/rest.htm";
       this.d = "mclient.alipay.com/service/rest.htm";
       this.e = "mclient.alipay.com/home/exterfaceAssign.htm";
       this.f = "mclient.alipay.com/cashier/mobilepay.htm";
       this.g = new HashMap();
       this.a = p0;
       b.d().a(this.a);
       this.b = new a(p0, "È¥Ö§¸¶±¦¸¶¿î");
    }
    public static Activity a(PayTask p0){
       return p0.a;
    }
    public static String a(a p0,String p1,List p2,String p3,Activity p4){
       HashMap c;
       String b;
       b$b uob = b.a(p0, p4, p2);
       if (uob != null && (!uob.b(p0) && (uob.a() || !TextUtils.equals(uob.a.packageName, "hk.alipay.wallet")))) {
          return p3;
       }
       c.e("mspl", "PayTask not_login");
       String str = String.valueOf(p1.hashCode());
       c = PayResultActivity.c;
       c.put(str, new Object());
       Intent intent = new Intent(p4, PayResultActivity.class);
       intent.putExtra("orderSuffix", p1);
       intent.putExtra("externalPkgName", p4.getPackageName());
       intent.putExtra("phonecashier.pay.hash", str);
       a$a.c(p0, intent);
       p4.startActivity(intent);
       p0 = c.get(str);
       try{
          _monitor_enter(p0);
          c.e("mspl", "PayTask wait");
          c.get(str).wait();
          _monitor_exit(p0);
          b = PayResultActivity$b.b;
          c.e("mspl", "PayTask ret: "+b);
          return b;
       }catch(java.lang.InterruptedException e0){
          c.e("mspl", "PayTask interrupted");
          _monitor_exit(b);
          return b.a();
       }
    }
    public static final String a(String[] p0){
       object oobject;
       if (p0 == null) {
          return "";
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return "";
          }
          oobject = p0[i];
          if (!TextUtils.isEmpty(oobject)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static boolean b(){
       long l = SystemClock.elapsedRealtime();
       if ((l - PayTask.k) - 3000 < 0) {
          return true;
       }
       PayTask.k = l;
       return false;
    }
    public static synchronized boolean fetchSdkConfig(Context p0){
       _monitor_enter(PayTask.class);
       boolean b = false;
       try{
          b.d().a(p0);
          long l = SystemClock.elapsedRealtime() / 1000;
          if ((l - PayTask.i) - (long)a.A().h() < 0) {
             _monitor_exit(PayTask.class);
             return b;
          }else {
             PayTask.i = l;
             a.A().d(null, p0.getApplicationContext(), b);
             _monitor_exit(PayTask.class);
             return true;
          }
       }catch(java.lang.Exception e9){
          c.c(e9);
          _monitor_exit(PayTask.class);
          return b;
       }
    }
    public final String b(String p0,Map p1){
       PayTask$b a;
       String str3;
       boolean b = ("9000").equals(p1.get("resultStatus"));
       String str = p1.get("result");
       PayTask$b uob = this.g.remove(p0);
       int i = 2;
       String[] stringArray = new String[i];
       PayTask$b c = (uob != null)? uob.c: "";
       int i1 = 0;
       stringArray[i1] = c;
       c = (uob != null)? uob.d: "";
       int i2 = 1;
       stringArray[i2] = c;
       PayTask.a(stringArray);
       String str1 = "callBackUrl";
       if (p1.containsKey(str1)) {
          return p1.get(str1);
       }else if(str.length() > 15){
          String[] stringArray1 = new String[]{b.d("&callBackUrl=\"", "\"", str),b.d("&call_back_url=\"", "\"", str),b.d("&return_url=\"", "\"", str),URLDecoder.decode(b.d("&return_url=", "&", str), "utf-8"),URLDecoder.decode(b.d("&callBackUrl=", "&", str), "utf-8"),b.d("call_back_url=\"", "\"", str)};
          String str2 = PayTask.a(stringArray1);
          if (!TextUtils.isEmpty(str2)) {
             return str2;
          }
       }
       if (uob != null) {
          a = (b)? uob.a: uob.b;
          if (!TextUtils.isEmpty(a)) {
             return a;
          }
       }
       if (uob != null) {
          return a.A().u();
       }else {
          return "";
       }
    }
    public final String c(String p0,a p1){
       p0 = p1.b(p0);
       if (p0.contains("paymethod=\"expressGateway\"")) {
          return this.d(p1, p0);
       }
       List list = a.A().p();
       if (a.A().g == null || list == null) {
          list = a.d;
       }
       if (b.l(p1, this.a, list)) {
          a uoa = new a(this.a, p1, new c(this));
          c.f("mspl", "pay inner started: "+p0);
          String str = uoa.d(p0, false);
          if (!TextUtils.isEmpty(str)) {
             String str1 = "resultStatus={";
             c g = c.g;
             if (str.contains(str1+g.b()+"}")) {
                str = (a.A().x())? uoa.d(p0, true): str.replace(str1+g.b()+"}", str1+c.e.b()+"}");
             }
          }
          c.f("mspl", "pay inner raw result: "+str);
          uoa.f();
          if (TextUtils.equals(str, "failed") || TextUtils.equals(str, "scheme_failed")) {
             a.b(p1, "biz", "LogBindCalledH5");
             return this.d(p1, p0);
          }else if(TextUtils.isEmpty(str)){
             return b.a();
          }else if(str.contains("{\"isLogin\":\"false\"}")){
             a.b(p1, "biz", "LogHkLoginByIntent");
             return PayTask.a(p1, p0, list, str, this.a);
          }else {
             return str;
          }
       }else {
          a.b(p1, "biz", "LogCalledH5");
          return this.d(p1, p0);
       }
    }
    public final String d(a p0,String p1){
       c uoc;
       this.showLoading();
       try{
          int i = 0;
          JSONObject jSONObject = new f().h(p0, this.a.getApplicationContext(), p1).c();
          String str = jSONObject.optString("end_code", i);
          List list = a.b(jSONObject.optJSONObject("form").optJSONObject("onload"));
          int i1 = 0;
          int i2 = 0;
          List list1 = list;
          while (i2 < list1.size()) {
             if (list1.get(i2).a() == a.d) {
                a.c(list1.get(i2));
             }
             i2 = i2 + 1;
          }
          this.h(p0, jSONObject);
          this.dismissLoading();
          a.a(this.a, p0, p1, p0.d);
          while (true) {
             if (i1 < list1.size()) {
                a uoa = list1.get(i1);
                if (uoa.a() == a.c) {
                   this.dismissLoading();
                   a.a(this.a, p0, p1, p0.d);
                   return this.f(p0, uoa);
                }else if(uoa.a() == a.e){
                   this.dismissLoading();
                   a.a(this.a, p0, p1, p0.d);
                   return this.g(p0, uoa, str);
                }else {
                   i1 = i1 + 1;
                }
             }else {
                this.dismissLoading();
                a.a(this.a, p0, p1, p0.d);
             }
          }
       }catch(java.io.IOException e0){
          a.f(p0, "net", e0);
          this.dismissLoading();
          a.a(this.a, p0, p1, p0.d);
          uoc = c.b(c.f.b());
       }
       if (uoc == null) {
          uoc = c.b(c.d.b());
       }
       return b.b(uoc.b(), uoc.a(), "");
    }
    public void dismissLoading(){
       PayTask tb = this.b;
       if (tb != null) {
          tb.b();
          this.b = null;
       }
       return;
    }
    public synchronized final String e(a p0,String p1,boolean p2){
       int i;
       String str;
       if (PayTask.b()) {
          a.h(p0, "biz", "RepPay", "");
          c uoc = c.b(c.i.b());
          i = uoc.b();
          return b.b(i, uoc.a(), "");
       }else if(p2){
          this.showLoading();
       }
       int i1 = 0;
       if (p1.contains("payment_inst=")) {
          str = p1.substring((p1.indexOf("payment_inst=") + 13));
          int i2 = str.indexOf(38);
          if (i2 > 0) {
             str = str.substring(i1, i2);
          }
          a.a(((str.replaceAll("\"", "")).toLowerCase(Locale.getDefault())).replaceAll("alipay", ""));
       }else {
          a.a("");
       }
       if (p1.contains("service=alipay.acquire.mr.ord.createandpay")) {
          a.c = true;
       }
       if (a.c) {
          if (p1.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
             p1 = p1.substring((p1.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53));
          }else if(p1.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")){
             p1 = p1.substring((p1.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52));
          }
       }
       c.f("mspl", "pay prepared: "+p1);
       str = this.c(p1, p0);
       c.f("mspl", "pay raw result: "+str);
       f.b(p0, this.a.getApplicationContext(), str);
       a.c(p0, "biz", "PgReturn", SystemClock.elapsedRealtime());
       a.c(p0, "biz", "PgReturnV", i.a(str, "resultStatus")+"|"+i.a(str, "memo"));
       if (!a.A().v()) {
          a.A().d(p0, this.a.getApplicationContext(), i1);
       }
       this.dismissLoading();
       a.g(this.a.getApplicationContext(), p0, p1, p0.d);
       c.f("mspl", "pay returning: "+str);
       return str;
    }
    public final String f(a p0,a p1){
       String str;
       String[] stringArray = p1.d();
       Intent intent = new Intent(this.a, H5PayActivity.class);
       Bundle uBundle = new Bundle();
       uBundle.putString("url", stringArray[0]);
       if (stringArray.length == 2) {
          uBundle.putString("cookie", stringArray[1]);
       }
       intent.putExtras(uBundle);
       a$a.c(p0, intent);
       this.a.startActivity(intent);
       p0 = PayTask.h;
       try{
          _monitor_enter(p0);
          p0.wait();
          _monitor_exit(p0);
          str = b.e();
          if (TextUtils.isEmpty(str)) {
             str = b.a();
          }
          return str;
       }catch(java.lang.InterruptedException e6){
          c.c(e6);
          _monitor_exit(str);
          return b.a();
       }
    }
    public synchronized String fetchOrderInfoFromH5PayUrl(String p0){
       String str1;
       String str2;
       String[] stringArray;
       PayTask payTask = this;
       String obj = p0;
       if (!TextUtils.isEmpty(p0)) {
          String str = p0.trim();
          if (str.startsWith("https://wappaygw.alipay.com/service/rest.htm") || str.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
             str1 = (str.replaceFirst("\(http|https\)://wappaygw.alipay.com/service/rest.htm\\?", "")).trim();
             if (!TextUtils.isEmpty(str1)) {
                return "_input_charset=\"utf-8\"&ordertoken=\""+b.d("<request_token>", "</request_token>", b.j(str1).get("req_data"))+"\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\""+new a(payTask.a, "", "").c("sc", "h5tonative")+"\"";
             }
          }
          if (str.startsWith("https://mclient.alipay.com/service/rest.htm") || str.startsWith("http://mclient.alipay.com/service/rest.htm")) {
             str1 = (str.replaceFirst("\(http|https\)://mclient.alipay.com/service/rest.htm\\?", "")).trim();
             if (!TextUtils.isEmpty(str1)) {
                return "_input_charset=\"utf-8\"&ordertoken=\""+b.d("<request_token>", "</request_token>", b.j(str1).get("req_data"))+"\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\""+new a(payTask.a, "", "").c("sc", "h5tonative")+"\"";
             }
          }
          if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || (str.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm") && (str.contains("alipay.wap.create.direct.pay.by.user") || (str.contains("create_forex_trade_wap") && !TextUtils.isEmpty((str.replaceFirst("\(http|https\)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "")).trim()))))) {
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("url", obj);
             jSONObject.put("bizcontext", new a(payTask.a, "", "").c("sc", "h5tonative"));
             return "new_external_info=="+jSONObject.toString();
          }else {
             PayTask$a uoa = null;
             if (Pattern.compile("^\(http|https\)://\(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?\)").matcher(obj).find()) {
                obj = b.d("?", "", obj);
                if (!TextUtils.isEmpty(obj)) {
                   Map map = b.j(obj);
                   str2 = "";
                   stringArray = new String[]{"trade_no","alipay_trade_no"};
                   if (this.i(false, true, "trade_no", str2, map, stringArray)) {
                      stringArray = new String[]{"payPhaseId","pay_phase_id","out_relation_id"};
                      this.i(true, false, "pay_phase_id", str2, map, stringArray);
                      str2 = str2+"&biz_sub_type=\"TRADE\""+"&biz_type=\"trade\"";
                      Map map1 = map;
                      str1 = map1.get("app_name");
                      if (TextUtils.isEmpty(str1) && !TextUtils.isEmpty(map1.get("cid"))) {
                         str1 = "ali1688";
                      }else if(TextUtils.isEmpty(str1) && (!TextUtils.isEmpty(map1.get("sid")) || !TextUtils.isEmpty(map1.get("s_id")))){
                         str1 = "tb";
                      }
                      str2 = str2+"&app_name=\""+str1+"\"";
                      stringArray = new String[]{"extern_token","cid","sid","s_id"};
                      if (!this.i(true, true, "extern_token", str2, map, stringArray)) {
                         return "";
                      }else {
                         stringArray = new String[]{"appenv"};
                         this.i(true, false, "appenv", str2, map, stringArray);
                         PayTask$b uob = new PayTask$b(payTask, uoa);
                         uob.b(map1.get("return_url"));
                         uob.c(map1.get("show_url"));
                         uob.a(map1.get("pay_order_id"));
                         str1 = str2+"&pay_channel_id=\"alipay_sdk\""+"&bizcontext=\""+new a(payTask.a, "", "").c("sc", "h5tonative")+"\"";
                         payTask.g.put(str1, uob);
                         return str1;
                      }
                   }
                }
             }
             int i = 0;
             int i1 = 1;
             if (!str.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && (str.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") || (EnvUtils.a() && str.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm")))) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("url", str);
                jSONObject1.put("bizcontext", new a(payTask.a, "", "").c("sc", "h5tonative"));
                Object[] objArray = new Object[i1];
                objArray[i] = jSONObject1.toString();
                return String.format("new_external_info==%s", objArray);
             }else if(a.A().l() && Pattern.compile("^https?://\(maliprod\\.alipay\\.com|mali\\.alipay\\.com\)/batch_payment\\.do\\?").matcher(str).find()){
                Uri uri = Uri.parse(str);
                String queryParamet = uri.getQueryParameter("return_url");
                String queryParamet1 = uri.getQueryParameter("show_url");
                String queryParamet2 = uri.getQueryParameter("pay_order_id");
                stringArray = new String[]{uri.getQueryParameter("trade_nos"),uri.getQueryParameter("alipay_trade_no")};
                String str3 = PayTask.a(stringArray);
                int i2 = 3;
                String[] stringArray1 = new String[i2];
                stringArray1[i] = uri.getQueryParameter("payPhaseId");
                stringArray1[i1] = uri.getQueryParameter("pay_phase_id");
                stringArray1[2] = uri.getQueryParameter("out_relation_id");
                str2 = PayTask.a(stringArray1);
                int i3 = 4;
                String[] stringArray2 = new String[i3];
                stringArray2[i] = uri.getQueryParameter("app_name");
                String str4 = (!TextUtils.isEmpty(uri.getQueryParameter("cid")))? "ali1688": "";
                stringArray2[i1] = str4;
                str4 = (!TextUtils.isEmpty(uri.getQueryParameter("sid")))? "tb": "";
                stringArray2[2] = str4;
                str4 = (!TextUtils.isEmpty(uri.getQueryParameter("s_id")))? "tb": "";
                stringArray2[i2] = str4;
                String str5 = PayTask.a(stringArray2);
                String[] stringArray3 = new String[i3];
                stringArray3[i] = uri.getQueryParameter("extern_token");
                stringArray3[i1] = uri.getQueryParameter("cid");
                stringArray3[2] = uri.getQueryParameter("sid");
                stringArray3[i2] = uri.getQueryParameter("s_id");
                str4 = PayTask.a(stringArray3);
                String[] stringArray4 = new String[i1];
                stringArray4[i] = uri.getQueryParameter("appenv");
                obj = PayTask.a(stringArray4);
                if (!TextUtils.isEmpty(str3) && (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4))) {
                   Object[] objArray1 = new Object[]{str3,str2,str5,str4,obj,new a(payTask.a, "", "").c("sc", "h5tonative")};
                   obj = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", objArray1);
                   PayTask$b i4 = new PayTask$b(payTask, null);
                   i4.b(queryParamet);
                   i4.c(queryParamet1);
                   i4.a(queryParamet2);
                   i4.d = str3;
                   payTask.g.put(obj, i4);
                   return obj;
                }
             }
          }
       }
    label_042c :
       return "";
    }
    public synchronized String fetchTradeToken(){
       String str = g.b(new a(this.a, "", "fetchTradeToken"), this.a.getApplicationContext(), "pref_trade_token", "");
       c.e("mspl", "get trade token: "+str);
       return str;
    }
    public final String g(a p0,a p1,String p2){
       String[] stringArray = p1.d();
       Intent intent = new Intent(this.a, H5PayActivity.class);
       int i = 0;
       intent.putExtra("url", stringArray[i]);
       intent.putExtra("title", stringArray[1]);
       intent.putExtra("version", "v2");
       intent.putExtra("method", b.u(new String(a.c(stringArray[2]))).optString("method", "POST"));
       b.d(i);
       String str = null;
       b.c(str);
       a$a.c(p0, intent);
       this.a.startActivity(intent);
       List h = PayTask.h;
       try{
          _monitor_enter(h);
          h.wait();
          String str1 = b.e();
          b.d(i);
          b.c(str);
          _monitor_exit(h);
          str = "";
          if (b.a) {
             h = a.b(b.u(new String(a.c(str1))));
             int i1 = 0;
             List list = h;
             while (i1 < list.size()) {
                a uoa = list.get(i1);
                if (uoa.a() == a.f) {
                   String[] stringArray1 = uoa.d();
                   str = b.b(Integer.valueOf(stringArray1[1]).intValue(), stringArray1[i], b.p(p0, stringArray1[2]));
                   break ;
                }
                i1 = i1 + 1;
             }
          }
          if (TextUtils.isEmpty(str)) {
             str = b.b(Integer.valueOf(p2).intValue(), "", "");
          }
          return str;
       }catch(java.lang.InterruptedException e10){
          c.c(e10);
          _monitor_exit(h);
          return b.a();
       }
    }
    public String getVersion(){
       return "15.8.05";
    }
    public final void h(a p0,JSONObject p1){
       String str = p1.optString("tid");
       String str1 = p1.optString("client_key");
       if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str1)) {
          a.a(b.d().b()).b(str, str1);
       }
    label_0030 :
       return;
    }
    public synchronized a h5Pay(a p0,String p1,boolean p2){
       a uoa = new a();
       String[] stringArray = (this.e(p0, p1, p2)).split(";");
       HashMap hashMap = new HashMap();
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          int i1 = oobject.indexOf("={");
          if (i1 >= 0) {
             String str = oobject.substring(0, i1);
             String str1 = str+"={";
             int i2 = oobject.indexOf(str1);
             i2 = i2 + str1.length();
             hashMap.put(str, oobject.substring(i2, oobject.lastIndexOf("}")));
          }
          i = i + 1;
       }
       if (hashMap.containsKey("resultStatus")) {
          uoa.b = hashMap.get("resultStatus");
       }
       uoa.a = this.b(p1, hashMap);
       if (TextUtils.isEmpty(uoa.b())) {
          a.h(p0, "biz", "H5CbUrlEmpty", "");
       }
       return uoa;
    }
    public final boolean i(boolean p0,boolean p1,String p2,StringBuilder p3,Map p4,String[] p5){
       String str;
       int len = p5.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p5[i];
             if (TextUtils.isEmpty(p4.get(oobject))) {
                i = i + 1;
             }else {
                str = p4.get(oobject);
             label_001f :
                if (TextUtils.isEmpty(str)) {
                   if (p1) {
                      return false;
                   }
                }else if(p0){
                   p3+"&"+p2+"=\""+str+"\"";
                   break ;
                }else {
                   p3+p2+"=\""+str+"\"";
                   break ;
                }
                break ;
             }
          }else {
             str = "";
             goto label_001f ;
          }
       }
       return true;
    }
    public synchronized String pay(String p0,boolean p1){
       return this.e(new a(this.a, p0, "pay"), p0, p1);
    }
    public synchronized boolean payInterceptorWithUrl(String p0,boolean p1,H5PayCallback p2){
       p0 = this.fetchOrderInfoFromH5PayUrl(p0);
       if (!TextUtils.isEmpty(p0)) {
          c.f("mspl", "intercepted: "+p0);
          new Thread(new PayTask$a(this, p0, p1, p2)).start();
       }
       return (TextUtils.isEmpty(p0) ^ 0x01);
    }
    public synchronized Map payV2(String p0,boolean p1){
       a uoa = new a(this.a, p0, "payV2");
       return i.c(uoa, this.e(uoa, p0, p1));
    }
    public void showLoading(){
       PayTask tb = this.b;
       if (tb != null) {
          tb.e();
       }
       return;
    }
}
