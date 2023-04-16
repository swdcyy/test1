package com.yxcorp.retrofit.f;
import com.yxcorp.retrofit.c$a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.System;
import ekd.k1;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.Request;
import com.yxcorp.retrofit.c$b;
import android.util.Pair;
import android.content.Context;
import ir4.a$a;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import ekd.p0;
import android.os.Build$VERSION;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import vk7.g0;
import java.lang.Boolean;
import java.lang.Double;

public class f implements c$a	// class@0013ca
{
    public static final DecimalFormat a;

    static {
       f.a = new DecimalFormat("00000", new DecimalFormatSymbols(Locale.US));
    }
    public void f(){
       super();
    }
    public static String f(){
       return System.currentTimeMillis()+f.a.format((long)k1.b.nextInt(0x186a0));
    }
    public Map a(){
       String str;
       HashMap hashMap = new HashMap();
       hashMap.put("User-Agent", e.h().g().getUserAgent());
       hashMap.put("Accept-Language", e.h().g().o());
       hashMap.put("X-REQUESTID", f.f());
       hashMap.put("Connection", "keep-alive");
       HashMap hashMap1 = new HashMap();
       this.j(hashMap1);
       if (hashMap1.isEmpty()) {
          str = "";
       }else {
          StringBuilder str1 = "";
          Iterator iterator = hashMap1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str1 = str1+uEntry.getKey()+'='+uEntry.getValue()+';';
          }
          str1.deleteCharAt((str1.length() - 1));
          str = str1;
       }
       if (!TextUtils.isEmpty(str)) {
          hashMap.put("Cookie", str);
       }
       return hashMap;
    }
    public void b(Map p0){
       this.e(p0, "os", "android");
       this.e(p0, "client_key", e.h().g().n());
       d uod = e.h().g();
       String str = uod.a();
       String str1 = uod.F();
       String str2 = uod.G();
       if (uod.f()) {
          if (!TextUtils.isEmpty(str)) {
             this.e(p0, "token", str);
          }
          if (!TextUtils.isEmpty(str2)) {
             this.e(p0, "kuaishou.api_st", str2);
          }
          this.e(p0, "client_salt", str1);
       }
       return;
    }
    public void c(Request p0,Map p1,Map p2,String p3,String p4){
       c$b uob = e.h().g().createRetrofitConfigSignature();
       if (uob == null) {
          return;
       }
       Pair pair = uob.a(p0, p1, p2, p4);
       boolean b = this.h(p0);
       if (!TextUtils.isEmpty(pair.first) && !TextUtils.isEmpty(pair.second)) {
          if (!TextUtils.isEmpty(p4)) {
             p1.put(pair.first, pair.second);
          }else if(b){
             p1.put(pair.first, pair.second);
          }
          p2.put(pair.first, pair.second);
       }
       if (!TextUtils.isEmpty(p3)) {
          Pair pair1 = uob.b(pair.second, p3);
          if (!TextUtils.isEmpty(pair1.first) && !TextUtils.isEmpty(pair1.second)) {
             if (!TextUtils.isEmpty(p4)) {
                p1.put(pair1.first, pair1.second);
             }else if(b){
                p1.put(pair1.first, pair1.second);
             }
             p2.put(pair1.first, pair1.second);
          }
       }
       return;
    }
    public void d(Map p0){
       d uod = e.h().g();
       this.e(p0, "ud", uod.R());
       this.e(p0, "ver", uod.getVersion());
       this.e(p0, "sys", uod.p());
       this.e(p0, "c", uod.getChannel());
       this.e(p0, "oc", uod.j());
       this.e(p0, "did", uod.b());
       this.e(p0, "rdid", uod.T());
       this.e(p0, "did_tag", uod.q());
       this.e(p0, "cdid_tag", uod.M());
       this.e(p0, "egid", uod.C());
       this.e(p0, "mod", uod.g());
       this.e(p0, "app", uod.D());
       this.e(p0, "country_code", uod.i());
       this.e(p0, "appver", uod.getAppVersion());
       Context uContext = e.h().f();
       if (this.g(uContext)) {
          this.e(p0, "lat", uod.getLatitude());
          this.e(p0, "lon", uod.getLongitude());
          this.e(p0, "ll_client_time", uod.l());
          a$a uoa = new a$a();
          uoa.a = this.i(uod.getLatitude(), 0);
          uoa.b = this.i(uod.getLongitude(), 0);
          this.e(p0, "ll", Base64.encodeToString(MessageNano.toByteArray(uoa), 2));
          this.e(p0, "lkvr", uod.P());
       }
       this.e(p0, "hotfix_ver", uod.h());
       this.e(p0, "language", e.h().g().o());
       this.e(p0, "kpn", uod.getKpn());
       this.e(p0, "kpf", uod.A());
       this.e(p0, "net", (p0.d(uContext)).toUpperCase(Locale.US));
       this.e(p0, "androidApiLevel", String.valueOf(Build$VERSION.SDK_INT));
       return;
    }
    public void e(Map p0,String p1,String p2){
       if (p0.containsKey(p1) && !TextUtils.equals(p2, p0.get(p1))) {
          Log.c("RetrofitParams", "看到这个日志，请联系Android网络库同学，网络库公参和业务公参冲突，有相同的key = "+p1+" 不同的value，网络库中value = "+p2+"  业务中value = "+p0.get(p1), new Exception());
       }
       p0.put(p1, p2);
       return;
    }
    public final boolean g(Context p0){
       boolean b = true;
       if (Build$VERSION.SDK_INT >= 31) {
          if (g0.a(p0, "android.permission.ACCESS_FINE_LOCATION") && g0.a(p0, "android.permission.ACCESS_COARSE_LOCATION")) {
             b = false;
          }
          return b;
       }else if(!g0.a(p0, "android.permission.ACCESS_FINE_LOCATION")){
          b = false;
       }
       return b;
    }
    public final boolean h(Request p0){
       boolean b = (p0 != null && Boolean.parseBoolean(p0.header("useSig3")))? true: false;
       return b;
    }
    public final double i(String p0,double p1){
       if (p0 == null) {
          return p1;
       }
       try{
          return Double.parseDouble(p0);
       }catch(java.lang.NumberFormatException e0){
          return p1;
       }
    }
    public void j(Map p0){
       String str = e.h().g().a();
       if (!TextUtils.isEmpty(str)) {
          p0.put("token", str);
       }
       return;
    }
}
