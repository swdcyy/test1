package com.cmic.sso.sdk.b.b;
import java.lang.Object;
import java.lang.String;
import android.telephony.SubscriptionInfo;
import java.lang.Class;
import java.util.List;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.b.b$a;
import android.content.Context;
import android.telephony.TelephonyManager;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import com.cmic.sso.sdk.b.b$b;
import com.cmic.sso.sdk.e.n;
import android.os.Build$VERSION;
import com.cmic.sso.sdk.b.a;
import com.kwai.privacykit.interceptor.ImsiInterceptor;
import java.lang.Exception;
import java.util.Objects;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import android.telephony.SubscriptionManager;
import com.kwai.privacykit.interceptor.OtherInterceptors;
import com.cmic.sso.sdk.e.g;

public class b	// class@000417
{
    public b$b c;
    public static b a;
    public static long b;

    public void b(){
       super();
       this.c = null;
    }
    public static b a(){
       if (b.a == null) {
          b.a = new b();
       }
       return b.a;
    }
    public final SubscriptionInfo a(Object p0,String p1,Object[] p2){
       return this.a(p0, p1, p2, null);
    }
    public final SubscriptionInfo a(List p0,int p1){
       SubscriptionInfo subscription = p0.get(0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          SubscriptionInfo subscription1 = iterator.next();
          if (subscription1.getSimSlotIndex() == p1) {
             subscription = subscription1;
          }
       }
       return subscription;
    }
    public final Object a(Object p0,String p1,Object[] p2,Class[] p3){
       try{
          Class uClass = Class.forName(p0.getClass().getName());
          if (p2 != null && p3 != null) {
             return uClass.getMethod(p1, p3).invoke(p0, p2);
          }
          p3 = new Class[0];
          p2 = new Object[0];
          return uClass.getMethod(p1, p3).invoke(p0, p2);
       }catch(java.lang.Exception e0){
          c.a("UMCTelephonyManagement", p1+" 反射出错");
          throw new b$a(p1);
       }
    }
    public String a(Context p0){
       switch (this.f(p0)){
           case 1:
           case 4:
           case 7:
           case 11:
           case 16:
           case 2:
             return "1";
           case 3:
           case 6:
           case 8:
           case 9:
           case 10:
           case 12:
           case 14:
           case 15:
           case 17:
           case 5:
             return "2";
           case 13:
           case 19:
           case 18:
             return "3";
           case 20:
             return "4";
           default:
             return "0";
       }
    }
    public final String a(TelephonyManager p0,String p1,int p2){
       Object[] objArray = new Object[]{Integer.valueOf(p2)};
       Class[] uClassArray = new Class[]{Integer.TYPE};
       p0 = this.a(p0, p1, objArray, uClassArray);
       String str = (p0 != null)? p0.toString(): null;
       return str;
    }
    public final String a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       c.b("UMCTelephonyManagement", "operatorChina = "+p0);
       if (p0.contains("中国移动")) {
          return "46000";
       }
       if (p0.contains("中国联通")) {
          return "46001";
       }
       if (p0.contains("中国电信")) {
          return "46003";
       }
       return "";
    }
    public void a(Context p0,boolean p1){
       long l = System.currentTimeMillis() - b.b;
       if (l - 5000 < 0 && l > 0) {
          return;
       }
       this.c = new b$b();
       if (!n.a(p0)) {
          return;
       }
       this.b(p0, p1);
       if (n.e() && n.d()) {
          c.b("UMCTelephonyManagement", "华为手机兼容性处理");
          if (!b$b.a(this.c) || b$b.a(this.c) == 1) {
             if (b$b.b(this.c) == -1) {
                b tc = this.c;
                b$b.a(tc, b$b.a(tc));
             }
             b$b.b(this.c, -1);
          }
       }
       if (p1) {
          try{
             if (Build$VERSION.SDK_INT >= 22) {
                this.c(p0);
             }else {
                this.d(p0);
             }
          }catch(java.lang.Exception e0){
             c.a("UMCTelephonyManagement", "read sim info error");
          }
       }
    }
    public final void a(List p0,TelephonyManager p1){
       SubscriptionInfo subscription;
       int i = 0;
       int i1 = (p0 != null)? p0.size(): 0;
       int i2 = 1;
       if (i1 == i2) {
          subscription = p0.get(i);
       label_0019 :
          b$b.a(this.c, subscription.getIccId());
          this.c.c(subscription.getSimSlotIndex());
          b tc = this.c;
          b$b.b(tc, this.b(b$b.g(tc)));
          String str = "UMCTelephonyManagement";
          c.b(str, "readSim1Info1 iccid1 = "+b$b.g(this.c));
          if (b$b.b(this.c) == -1 && b$b.a(this.c) == subscription.getSubscriptionId()) {
             b$b.a(this.c, subscription.getSimSlotIndex());
             c.b(str, "readSim1Info1 dataSlotId = "+b$b.b(this.c));
          }
          if (!n.d()) {
             return;
          }else if(!a.a()){
             subscription.getSimSlotIndex();
          }else {
             subscription.getSubscriptionId();
          }
          try{
             this.c.a(this.a(p1, "getSubscriberId", subscription.getSubscriptionId()));
          }catch(com.cmic.sso.sdk.b.b$a e0){
             try{
                this.c.a(this.a(p1, "getSubscriberIdGemini", e0));
             }catch(com.cmic.sso.sdk.b.b$a e0){
                try{
                   this.c.a(ImsiInterceptor.getSubscriberId(p1));
                }catch(java.lang.Exception e1){
                   e1.printStackTrace();
                }
             }
          }
          try{
             this.c.c(this.a(p1, "getSimOperator", subscription.getSubscriptionId()));
          }catch(com.cmic.sso.sdk.b.b$a e0){
             try{
                this.c.c(this.a(p1, "getSimOperatorGemini", e0));
             }catch(com.cmic.sso.sdk.b.b$a e0){
                this.c.c(p1.getSimOperator());
             }
          }
       }else if(i1 > i2){
          subscription = this.a(p0, i);
          goto label_0019 ;
       }
    }
    public b$b b(){
       b tc = this.c;
       if (tc == null) {
          tc = new b$b();
       }
       return tc;
    }
    public final String b(String p0){
       int i = 6;
       if (TextUtils.isEmpty(p0) && p0.length() < i) {
          return "";
       }
       p0 = p0.substring(0, i);
       c.b("UMCTelephonyManagement", "operatorFlag = "+p0);
       Objects.requireNonNull(p0);
       switch (p0.hashCode()){
           case 0x62cce3ff:
             if (p0.equals("898600")) {
                i = 0;
             }else {
             }
             break;
           case 0x62cce400:
             if (p0.equals("898601")) {
                i = 1;
             }else {
             }
             break;
           case 0x62cce401:
             if (p0.equals("898602")) {
                i = 2;
             }else {
             }
             break;
           case 0x62cce402:
             if (p0.equals("898603")) {
                i = 3;
             }else {
             }
             break;
           case 0x62cce403:
             if (p0.equals("898604")) {
                i = 4;
             }else {
             }
             break;
           case 0x62cce405:
             if (p0.equals("898606")) {
                i = 5;
             }else {
             }
             break;
           case 0x62cce406:
             if (p0.equals("898607")) {
             }else {
             }
             break;
           case 0x62cce407:
             if (p0.equals("898608")) {
                i = 7;
             }else {
             }
             break;
           case 0x62cce408:
             if (p0.equals("898609")) {
                i = 8;
             }else {
             }
             break;
           case 0x62cce41f:
             if (p0.equals("898611")) {
                i = 9;
             }else {
             }
             break;
           default:
             i = -1;
       }
       switch (i){
           case 0:
           case 2:
           case 4:
           case 6:
           case 7:
             return "46000";
           case 1:
           case 5:
           case 8:
             return "46001";
           case 3:
           case 9:
             return "46003";
           default:
             return "";
       }
    }
    public final void b(Context p0){
       Cursor uCursor;
       String str6;
       String str = "0";
       c.b("UMCTelephonyManagement", "readSimInfoDbStart");
       Uri uri = Uri.parse("content://telephony/siminfo");
       ContentResolver contentResol = p0.getContentResolver();
       try{
          int i = 0;
          String[] stringArray = new String[]{"_id","icc_id","sim_id","mcc","mnc","carrier_name"};
          String[] stringArray1 = new String[]{str};
          uCursor = contentResol.query(uri, stringArray, "sim_id>=?", stringArray1, null);
          if (uCursor != null) {
             while (uCursor.moveToNext()) {
                String str1 = uCursor.getString(uCursor.getColumnIndex("icc_id"));
                int intx = uCursor.getInt(uCursor.getColumnIndex("sim_id"));
                int intx1 = uCursor.getInt(uCursor.getColumnIndex("_id"));
                String str2 = uCursor.getString(uCursor.getColumnIndex("mcc"));
                String str3 = uCursor.getString(uCursor.getColumnIndex("mnc"));
                String str4 = uCursor.getString(uCursor.getColumnIndex("carrier_name"));
                b uob = -1;
                if (b$b.b(this.c) == uob && (b$b.a(this.c) != uob && b$b.a(this.c) == intx1)) {
                   b$b.a(this.c, intx);
                   c.b("UMCTelephonyManagement", "通过读取sim db获取数据流量卡的卡槽值："+intx);
                }
             label_00a5 :
                if (b$b.b(this.c) == intx && !n.e()) {
                   b$b.b(this.c, intx1);
                }
                StringBuilder str5 = 1;
                if (!intx) {
                   b$b.a(this.c, str1);
                   if (b$b.c(this.c) == uob) {
                      b$b.c(this.c, intx);
                   }
                   if (TextUtils.isEmpty(b$b.d(this.c)) && !TextUtils.isEmpty(str4)) {
                      str6 = this.a(str4);
                      if (!TextUtils.isEmpty(str6)) {
                         b$b.b(this.c, str6);
                      }
                   }
                   if (TextUtils.isEmpty(b$b.d(this.c))) {
                      str6 = this.b(str1);
                      if (!TextUtils.isEmpty(str6)) {
                         b$b.b(this.c, str6);
                      }
                   }
                   if (TextUtils.isEmpty(b$b.d(this.c)) && (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
                      if (str3.length() == str5) {
                         str3 = str+str3;
                      }
                      b$b.b(this.c, str2+str3);
                   }
                }else if(intx == str5){
                   b$b.c(this.c, str1);
                   if (b$b.e(this.c) == uob) {
                      b$b.d(this.c, intx);
                   }
                   if (TextUtils.isEmpty(b$b.f(this.c)) && !TextUtils.isEmpty(str4)) {
                      str6 = this.a(str4);
                      if (!TextUtils.isEmpty(str6)) {
                         b$b.d(this.c, str6);
                      }
                   }
                   if (TextUtils.isEmpty(b$b.f(this.c))) {
                      str6 = this.b(str1);
                      if (!TextUtils.isEmpty(str6)) {
                         b$b.d(this.c, str6);
                      }
                   }
                   if (TextUtils.isEmpty(b$b.f(this.c)) && (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
                      if (str3.length() == str5) {
                         str3 = str+str3;
                      }
                      b$b.d(this.c, str2+str3);
                   }
                }
             label_01dd :
                c.b("UMCTelephonyManagement", "icc_id-->"+str1);
                c.b("UMCTelephonyManagement", "sim_id-->"+intx);
                c.b("UMCTelephonyManagement", "subId或者说是_id->"+intx1);
                c.b("UMCTelephonyManagement", "mcc_string--->"+str3);
                c.b("UMCTelephonyManagement", "mnc_string--->"+str2);
                c.b("UMCTelephonyManagement", "carrier_name----->"+str4);
                c.b("UMCTelephonyManagement", "---------------------------------");
             }
             if (uCursor != null) {
             }
          }else {
             goto label_025c ;
          }
          c.b("UMCTelephonyManagement", "readSimInfoDbEnd");
          return;
       }catch(java.lang.Exception e0){
          c.a("UMCTelephonyManagement", "readSimInfoDb error");
          if (uCursor) {
          }else {
             goto label_026b ;
          }
       }
       uCursor.close();
       goto label_026b ;
    }
    public final void b(Context p0,boolean p1){
       int i;
       Class[] uClassArray;
       Method method;
       Object[] objArray;
       Object[] objArray1;
       Class uClass = -1;
       if (Build$VERSION.SDK_INT >= 22) {
          SubscriptionManager subscription = SubscriptionManager.from(p0.getApplicationContext());
          if (subscription != null) {
             if (p1) {
                try{
                   SubscriptionInfo subscription1 = this.a(subscription, "getDefaultDataSubscriptionInfo", null);
                   if (subscription1 != null) {
                      b$b.a(this.c, subscription1.getSimSlotIndex());
                      b$b.b(this.c, subscription1.getSubscriptionId());
                      c.b("UMCTelephonyManagement", "getDefaultDataSubscriptionInfo适配成功: dataSlotId即sim_id = "+b$b.b(this.c));
                      c.b("UMCTelephonyManagement", "getDefaultDataSubscriptionInfo适配成功: dataSubId = "+b$b.a(this.c));
                      return;
                   }
                }catch(java.lang.Exception e0){
                   c.a(e0, "readDefaultDataSubId-->getDefaultDataSubscriptionInfo 反射出错");
                }
             }
          }
       }else {
          b$b.a(this.c, uClass);
       }
    }
    public final void b(List p0,TelephonyManager p1){
       int i = (p0 != null)? p0.size(): 0;
       int i1 = 1;
       if (i > i1) {
          SubscriptionInfo subscription = this.a(p0, i1);
          this.c.d(subscription.getSimSlotIndex());
          b$b.c(this.c, subscription.getIccId());
          b tc = this.c;
          b$b.d(tc, this.b(b$b.h(tc)));
          String str = "UMCTelephonyManagement";
          c.b(str, "readSim1Info2 iccid2 = "+b$b.h(this.c));
          if (b$b.b(this.c) == -1 && b$b.a(this.c) == subscription.getSubscriptionId()) {
             b$b.a(this.c, subscription.getSimSlotIndex());
             c.b(str, "readSim1Info2 dataSlotId = "+b$b.b(this.c));
          }
          if (!n.d()) {
             return;
          }else if(!a.a()){
             subscription.getSubscriptionId();
          }
          try{
             this.c.b(this.a(p1, "getSubscriberId", subscription.getSubscriptionId()));
          }catch(com.cmic.sso.sdk.b.b$a e0){
             try{
                this.c.b(this.a(p1, "getSubscriberIdGemini", i1));
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
          try{
             this.c.d(this.a(p1, "getSimOperator", subscription.getSubscriptionId()));
          }catch(com.cmic.sso.sdk.b.b$a e0){
             try{
                this.c.d(this.a(p1, "getSimOperatorGemini", i1));
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
             }
          }
       }
    }
    public final void c(Context p0){
       TelephonyManager systemServic = p0.getApplicationContext().getSystemService("phone");
       if (systemServic == null) {
          return;
       }
       List list = this.e(p0);
       if (list != null && list.size() > 0) {
          this.a(list, systemServic);
          this.b(list, systemServic);
       }
       return;
    }
    public final void d(Context p0){
       b tc1;
       String str = "getSimOperatorGemini";
       String str1 = "getSimOperator";
       String str2 = "getSubscriberId";
       TelephonyManager systemServic = p0.getApplicationContext().getSystemService("phone");
       this.c.c(0);
       this.c.d(1);
       b tc = this.c;
       try{
          tc.b(-1);
          this.c.a(this.a(systemServic, str2, 0));
          this.c.b(this.a(systemServic, str2, 1));
       }catch(com.cmic.sso.sdk.b.b$a e0){
          try{
             this.c.a(this.a(systemServic, "getSubscriberIdGemini", 0));
             this.c.b(this.a(systemServic, "getSubscriberIdGemini", 1));
          }catch(com.cmic.sso.sdk.b.b$a e0){
             try{
                this.c.a(ImsiInterceptor.getSubscriberId(systemServic));
             }catch(java.lang.Exception e2){
                e2.printStackTrace();
             }
          }
       }
       try{
          this.c.c(this.a(systemServic, str1, 0));
          this.c.d(this.a(systemServic, str1, 1));
       }catch(com.cmic.sso.sdk.b.b$a e0){
          try{
             this.c.c(this.a(systemServic, e0, 0));
             this.c.d(this.a(systemServic, e0, 1));
          }catch(com.cmic.sso.sdk.b.b$a e0){
             this.c.c(systemServic.getSimOperator());
          }
       }
       if (TextUtils.isEmpty(this.c.a()) && !TextUtils.isEmpty(this.c.b())) {
          tc1 = this.c;
          tc1.a(tc1.b());
          this.c.b("");
          tc1 = this.c;
          tc1.c(tc1.g());
          this.c.d(-1);
          tc1 = this.c;
          tc1.c(tc1.c());
          this.c.d("");
          tc1 = this.c;
          tc1.b(tc1.f());
       }else if(!TextUtils.isEmpty(this.c.a()) && TextUtils.isEmpty(this.c.b())){
          this.c.d(-1);
          tc1 = this.c;
          tc1.b(tc1.f());
       }else if(TextUtils.isEmpty(this.c.a()) && TextUtils.isEmpty(this.c.b())){
          this.c.c(-1);
          this.c.d(-1);
          this.c.b(-1);
       }
       return;
    }
    public final List e(Context p0){
       SubscriptionManager subscription = SubscriptionManager.from(p0.getApplicationContext());
       List activeSubscr = (subscription != null)? OtherInterceptors.getActiveSubscriptionInfoList(subscription): null;
       return activeSubscr;
    }
    public final int f(Context p0){
       if (g.a(p0, "android.permission.READ_PHONE_STATE")) {
          TelephonyManager systemServic = p0.getApplicationContext().getSystemService("phone");
          if (systemServic == null) {
             return -1;
          }
          if (!n.d()) {
             return systemServic.getDataNetworkType();
          }
          try{
             Class[] uClassArray = new Class[]{Integer.TYPE};
             c.b("UMCTelephonyManagement", "data dataNetworkType defaultDataSubId = "+b$b.a(this.c));
             Object[] objArray = new Object[]{Integer.valueOf(b$b.a(this.c))};
             int i = systemServic.getClass().getMethod("getDataNetworkType", uClassArray).invoke(systemServic, objArray).intValue();
             c.b("UMCTelephonyManagement", "data dataNetworkType ---------"+i);
             if (!i && Build$VERSION.SDK_INT >= 24) {
                c.b("UMCTelephonyManagement", "data dataNetworkType ---->=N "+i);
                i = systemServic.getDataNetworkType();
             }
             return i;
          }catch(java.lang.Exception e9){
             c.a("UMCTelephonyManagement", "data dataNetworkType ----反射出错-----");
             e9.printStackTrace();
          }
          return -1;
       }else {
          goto label_00a8 ;
       }
    }
}
