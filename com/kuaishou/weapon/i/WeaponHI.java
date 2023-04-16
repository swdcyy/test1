package com.kuaishou.weapon.i.WeaponHI;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.i.WeaponHI$6;
import java.lang.Runnable;
import com.kuaishou.weapon.i.WeaponHI$4;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import com.kuaishou.weapon.ks.bw;
import com.kuaishou.weapon.i.WeaponHI$3;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.i.WeaponHI$5;
import com.kuaishou.weapon.i.WeaponL;
import com.kuaishou.weapon.ks.cc;
import com.kuaishou.weapon.ks.x;
import java.lang.System;
import com.kuaishou.weapon.i.WeaponHI$11;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData$Item;
import android.os.Build$VERSION;
import android.content.ClipDescription;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Long;
import com.kuaishou.weapon.ks.bq;
import com.kuaishou.weapon.i.WeaponN;
import org.json.JSONObject;
import java.util.HashMap;
import java.lang.Exception;
import java.util.Map;
import com.kuaishou.weapon.i.WeaponHI$7;
import com.kuaishou.weapon.i.WeaponHI$13;
import com.kuaishou.weapon.i.WeaponHI$12;
import com.kuaishou.weapon.i.WeaponHI$2;
import com.kuaishou.weapon.i.WeaponHI$1;
import com.kuaishou.weapon.i.WeaponHI$9;
import com.kuaishou.weapon.i.WeaponHI$8;
import com.kuaishou.weapon.i.WeaponHI$10;

public class WeaponHI	// class@000963
{
    public static int c = 0;
    public static int count = 0;
    public static int cp = 0;
    public static int cs = 0;
    public static String i;
    public static boolean ia;
    public static boolean isClipClose;
    public static float lp;
    public static float ls;
    public static String lt;
    public static Context mContext;
    public static WeaponL mWeaponL;
    public static WeaponN mWeaponN;
    public static int num;
    public static long pl;
    public static boolean ps;
    public static String pt;
    public static long st;
    public static int t;
    public static long t1;
    public static long t2;
    public static long t3;
    public static long t4;
    public static long t5;
    public static long t6;
    public static long t7;
    public static long t8;
    public static long t9;
    public static long ts;
    public static int type;

    public void WeaponHI(){
       super();
    }
    public static void b(String p0,String p1,String p2,String p3,String p4){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p2)) {
          WeaponHI$6 u6 = new WeaponHI$6(p0, p1, p2, p3, p4);
          r.a().a(v7);
       }
       return;
    }
    public static void bl(String p0){
       try{
          if (WeaponHI.mContext == null) {
             return;
          }
          r.a().a(new WeaponHI$4(p0));
          Context mContext = WeaponHI.mContext;
          bw.a(mContext, (long)d.a(mContext).b("plc001_pd_l_i", 600));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void cp(Context p0){
       try{
          if (WeaponHI.mContext == null) {
             return;
          }
          r.a().a(new WeaponHI$3(p0));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static String d(){
       return bs.e(WeaponHI.mContext);
    }
    public static void deRegiLiveCB(){
       WeaponHI.mWeaponL = null;
    }
    public static void el(String p0){
       try{
          if (WeaponHI.mContext == null) {
             return;
          }
          r.a().a(new WeaponHI$5(p0));
          bw.a();
          WeaponHI.deRegiLiveCB();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getF(){
       if (WeaponHI.mWeaponL != null && !TextUtils.isEmpty(WeaponHI.lt)) {
          WeaponHI.mWeaponL.l(WeaponHI.lt);
       }
       return WeaponHI.lt;
    }
    public static String getT(){
       Context mContext = WeaponHI.mContext;
       if (mContext == null) {
          return "";
       }
       return cc.a(mContext).c();
    }
    public static void i(String p0,String p1){
       x ox = x.a(WeaponHI.mContext);
       if (ox == null) {
          return;
       }
       ox.e();
       return;
    }
    public static void init(Context p0,String p1,String p2,boolean p3,long p4,long p5,int[] p6){
       WeaponHI.t1 = System.currentTimeMillis();
       WeaponHI.init(p0, p1, p2, p3, p6);
    }
    public static void init(Context p0,String p1,String p2,boolean p3,int[] p4){
       WeaponHI.ps = p3;
       WeaponHI$11 u11 = new WeaponHI$11(p0, p3, p4, p1, p2);
       r.a().a(v7);
    }
    public static String ip(Context p0){
       long timestamp;
       String str = null;
       if (WeaponHI.isClipClose) {
          return str;
       }
       if (!d.a(WeaponHI.mContext).b("plc001_pd_ph_pc", 0)) {
          WeaponHI.pl = 0;
          WeaponHI.pt = str;
          return str;
       }else {
          d uod = d.a(WeaponHI.mContext);
          boolean b = uod.f("a1_p_s_p_s");
          boolean b1 = uod.f("a1_p_s_p_s_c_b");
          if (!b && !b1) {
             WeaponHI.pl = 0;
             WeaponHI.pt = str;
             return str;
          }else {
             ClipboardManager systemServic = p0.getSystemService("clipboard");
             if (systemServic != null && systemServic.hasPrimaryClip()) {
                ClipData primaryClip = ClipboardInterceptor.getPrimaryClip(systemServic);
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                   String str1 = String.valueOf(primaryClip.getItemAt(0).getText());
                   if (!TextUtils.isEmpty(str1)) {
                      if (Build$VERSION.SDK_INT >= 26) {
                         timestamp = primaryClip.getDescription().getTimestamp();
                      }else {
                         ClipDescription description = primaryClip.getDescription();
                         Field declaredFiel = description.getClass().getDeclaredField("mTimeStamp");
                         declaredFiel.setAccessible(true);
                         timestamp = declaredFiel.get(description).longValue();
                      }
                      if (timestamp > 0) {
                         WeaponHI.pl = timestamp;
                      }
                      WeaponHI.pt = str1;
                      return str1;
                   }
                }
             }
             return "";
          }
       }
    }
    public static void liveReportCB(String p0){
    }
    public static String n(String p0){
       return bq.a(p0, WeaponHI.mContext);
    }
    public static void rc(WeaponN p0){
       WeaponHI.mWeaponN = p0;
    }
    public static void recordJSScene(String p0){
       try{
          JSONObject jSONObject = new JSONObject(p0);
          String str = null;
          p0 = jSONObject.optString("bussType", str);
          String str1 = jSONObject.optString("jsVersion", str);
          String str2 = jSONObject.optString("taskType", str);
          String str3 = jSONObject.optString("subTaskType", str);
          WeaponHI.b(p0, str1, str2, str3, jSONObject.optString("reserve", str));
       }catch(java.lang.Exception e6){
          HashMap hashMap = new HashMap();
          hashMap.put("e", e6.getMessage());
          hashMap.put("l", "js");
          bs.a(WeaponHI.mContext, "1002001", hashMap);
       }
       return;
    }
    public static void regiLiveCB(WeaponL p0){
       WeaponHI.mWeaponL = p0;
    }
    public static void setClipClose(boolean p0){
       WeaponHI.isClipClose = p0;
    }
    public static void setG(String p0){
       if (WeaponHI.mContext == null) {
          return;
       }
       r.a().a(new WeaponHI$7());
       return;
    }
    public static void setI(String p0){
       WeaponHI.i = p0;
    }
    public static void setI(String p0,boolean p1){
       WeaponHI.i = p0;
       WeaponHI.ia = p1;
       WeaponHI.st = System.currentTimeMillis();
    }
    public static void setM(float p0,float p1){
       try{
          r.a().a(new WeaponHI$13(p1, p0));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void setN(int p0){
       try{
          if (WeaponHI.mContext == null) {
             return;
          }
          r.a().a(new WeaponHI$12(p0));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void setP(int p0,boolean p1,int p2){
       try{
          if (WeaponHI.mContext == null) {
             return;
          }
          r.a().a(new WeaponHI$2(p1, p0, p2));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void setPS(boolean p0){
       WeaponHI.ps = p0;
       r.a().a(new WeaponHI$1(p0));
    }
    public static void setT(int p0,int p1){
       int type = WeaponHI.type;
       int i = 0;
       if (type != p0 && (p0 == 6 || p0 == 3)) {
          WeaponHI.c = i;
          WeaponHI.cs = i;
          WeaponHI.cp = i;
       }
       if (!p1) {
          WeaponHI.ts = System.currentTimeMillis();
          WeaponHI.type = p0;
          WeaponHI.count = i;
          WeaponHI.num = i;
          return;
       }else if(!type || (WeaponHI.ts > 0 && type == p0)){
          if (p1 > WeaponHI.num) {
             WeaponHI.num = p1;
          }
          WeaponHI.count = WeaponHI.count + 1;
       }
       WeaponHI.ts = System.currentTimeMillis();
       WeaponHI.type = p0;
       return;
    }
    public static void t(int p0){
       r.a().a(new WeaponHI$9(p0));
    }
    public static void t(int p0,boolean p1){
       r.a().a(new WeaponHI$8(p0, p1));
    }
    public static void u(String p0){
       r.a().a(new WeaponHI$10(p0));
    }
}
