package com.loc.fo;
import java.util.ArrayList;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.String;
import java.lang.StringBuffer;
import com.loc.fq;
import com.loc.fi;
import java.lang.Math;
import android.content.Context;
import java.util.List;
import java.util.Collection;
import com.loc.bs;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.Long;
import com.amap.api.location.AMapLocation;
import org.json.JSONArray;
import org.json.JSONObject;
import com.loc.ei;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.br;
import android.location.Location;
import java.lang.StringBuilder;
import com.loc.w;
import com.loc.an;
import com.loc.k;
import com.loc.bp;
import com.loc.bq;
import com.loc.fp;
import com.amap.api.location.AMapLocationClientOption;
import com.loc.fo$1;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.Enum;
import android.content.SharedPreferences$Editor;

public final class fo	// class@001435
{
    public SparseArray a;
    public int b;
    public long c;
    public String[] d;
    public int e;
    public long f;
    public static AMapLocation g;
    public static boolean h;
    public static List i;
    public static JSONArray j;

    static {
       fo.i = new ArrayList();
       fo.j = null;
       fo.g = null;
       fo.h = false;
    }
    public void fo(){
       super();
       this.a = new SparseArray();
       this.b = -1;
       this.c = 0;
       String[] stringArray = new String[]{"ol","cl","gl","ha","bs","ds"};
       this.d = stringArray;
       this.e = -1;
       this.f = -1;
    }
    public static String a(int p0){
       String str;
       if (p0 != 2011) {
          if (p0 != 2031) {
             if (p0 != 2041) {
                if (p0 != 2081) {
                   if (p0 != 2091) {
                      if (p0 != 2111) {
                         if (p0 != 2121) {
                            if (p0 != 2141) {
                               if (p0 != 2021) {
                                  if (p0 != 2022) {
                                     if (p0 != 2061) {
                                        if (p0 != 2062) {
                                           switch (p0){
                                               case 2051:
                                                 str = "NeedLoginNetWork\t";
                                                 break;
                                               case 2052:
                                                 str = "MaybeIntercepted";
                                                 break;
                                               case 2053:
                                                 str = "DecryptResponseException";
                                                 break;
                                               case 2054:
                                                 str = "ParserDataException";
                                                 break;
                                               default:
                                                 switch (p0){
                                                     case 2101:
                                                       str = "BindAPSServiceException";
                                                       break;
                                                     case 2102:
                                                       str = "AuthClientScodeFail";
                                                       break;
                                                     case 2103:
                                                       str = "NotConfigAPSService";
                                                       break;
                                                     default:
                                                       switch (p0){
                                                           case 2131:
                                                             str = "NoCgiOAndWifiInfo";
                                                             break;
                                                           case 2132:
                                                             str = "AirPlaneModeAndWifiOff";
                                                             break;
                                                           case 2133:
                                                             str = "NoCgiAndWifiOff";
                                                             break;
                                                           default:
                                                             switch (p0){
                                                                 case 2151:
                                                                   str = "MaybeMockNetLoc";
                                                                   break;
                                                                 case 2152:
                                                                   str = "MaybeMockGPSLoc";
                                                                   break;
                                                                 case 2153:
                                                                   str = "UNSUPPORT_COARSE_LBSLOC";
                                                                   break;
                                                                 case 2154:
                                                                   str = "UNSUPPORT_CONTINUE_LOC";
                                                                   break;
                                                                 default:
                                                                   str = "";
                                                             }
                                                       }
                                                 }
                                           }
                                        }else {
                                           str = "ServerLocFail";
                                        }
                                     }else {
                                        str = "ServerRetypeError";
                                     }
                                  }else {
                                     str = "OnlyOneWifiButNotMain";
                                  }
                               }else {
                                  str = "OnlyMainWifi";
                               }
                            }else {
                               str = "NoEnoughStatellites";
                            }
                         }else {
                            str = "NotLocPermission";
                         }
                      }else {
                         str = "ErrorCgiInfo";
                      }
                   }else {
                      str = "InitException";
                   }
                }else {
                   str = "LocalLocException";
                }
             }else {
                str = "ResponseResultIsNull";
             }
          }else {
             str = "CreateApsReqException";
          }
       }else {
          str = "ContextIsNull";
       }
       return str;
    }
    public static void a(long p0,long p1){
       String str = ",";
       String str1 = "yyyy-MM-dd HH:mm:ss.SSS";
       if (fo.h) {
          return;
       }
       StringBuffer str2 = "gpsTime:"+fq.a(p0, str1)+str+"sysTime:"+fq.a(p1, str1)+str;
       p1 = fi.t();
       str = "0";
       if (v5 = 0 - p1) {
          str = fq.a(p1, str1);
       }
       str2 = str2+"serverTime:"+str;
       fo.a("checkgpstime", str2);
       if (v5 && Math.abs((p0 - p1)) - 0x757b12c00 < 0) {
          str2 = str2+", correctError";
          fo.a("checkgpstimeerror", str2);
       }
       str2.delete(0, str2.length());
       fo.h = true;
       return;
    }
    public static synchronized void a(Context p0){
       _monitor_enter(fo.class);
       if (p0 == null || !fi.a()) {
          _monitor_exit(fo.class);
          return;
       }else {
          List i = fo.i;
          if (i != null && i.size() > 0) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(fo.i);
             bs.b(uArrayList, p0);
             fo.i.clear();
          }
          fo.f(p0);
          _monitor_exit(fo.class);
          return;
       }
    }
    public static void a(Context p0,int p1,int p2,long p3,long p4){
       if (p1 == -1 || p2 == -1) {
          return;
       }
       fo.a(p0, "O012", p1, p2, p3, p4);
       return;
    }
    public static void a(Context p0,long p1,boolean p2){
       if (p0 == null || !fi.a()) {
          return;
       }
       fo.a(p0, p1, p2, "O015");
       return;
    }
    public static void a(Context p0,long p1,boolean p2,String p3){
       int i = Long.valueOf(p1).intValue();
       String str = (!p2)? "abroad": "domestic";
       fo.a(p0, p3, str, i);
       return;
    }
    public static synchronized void a(Context p0,AMapLocation p1){
       _monitor_enter(fo.class);
       if (!fq.a(p1)) {
          _monitor_exit(fo.class);
          return;
       }else {
          int locationType = p1.getLocationType();
          JSONArray jSONArray = 4;
          int i = 0;
          float f = 0.00f;
          if (locationType != 1) {
             if (locationType != f && locationType != jSONArray) {
                if (locationType != -99688433780870170000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
                   if (locationType != -11401553444062571000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
                      if (locationType != -99400376158404480000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
                         locationType = 0;
                      label_0032 :
                         if (i) {
                            i = fi.c();
                            if (i) {
                               if (!locationType || locationType == jSONArray) {
                                  if (i == f) {
                                     _monitor_exit(fo.class);
                                     return;
                                  }
                               }else if(i == 1){
                                  _monitor_exit(fo.class);
                                  return;
                               }
                            }
                            if (fo.j == null) {
                               fo.j = new JSONArray();
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("lon", fq.b(p1.getLongitude()));
                            jSONObject.put("lat", fq.b(p1.getLatitude()));
                            jSONObject.put("type", locationType);
                            jSONObject.put("timestamp", fq.a());
                            if ((p1.getCoordType()).equalsIgnoreCase("WGS84")) {
                               jSONObject.put("coordType", 1);
                            }else {
                               jSONObject.put("coordType", f);
                            }
                            if (!locationType) {
                               JSONObject jSONObject1 = new JSONObject();
                               jSONObject1.put("accuracy", fq.c((double)p1.getAccuracy()));
                               jSONObject1.put("altitude", fq.c(p1.getAltitude()));
                               jSONObject1.put("bearing", fq.c((double)p1.getBearing()));
                               jSONObject1.put("speed", fq.c((double)p1.getSpeed()));
                               jSONObject.put("extension", jSONObject1);
                            }
                            JSONArray jSONArray1 = fo.j.put(jSONObject);
                            fo.j = jSONArray1;
                            if (jSONArray1.length() >= fi.b()) {
                               fo.f(p0);
                            }
                         }
                         _monitor_exit(fo.class);
                         return;
                      }else {
                         locationType = 2;
                      }
                   }else {
                      locationType = 3;
                   }
                }else {
                   locationType = 4;
                }
             }else {
                locationType = 1;
             }
          }else {
             locationType = 0;
          }
          i = 1;
          goto label_0032 ;
       }
    }
    public static void a(Context p0,AMapLocation p1,ei p2){
       int errorCode;
       int i2;
       if (p1 == null) {
          return;
       }
       if (!("gps").equalsIgnoreCase(p1.getProvider()) && p1.getLocationType() != 1) {
          String str = "domestic";
          if (fo.a(p1)) {
             str = "abroad";
          }
          String str1 = str;
          String str2 = "cache";
          String str3 = "net";
          int i = 6;
          int i1 = 5;
          if (p1.getErrorCode()) {
             errorCode = p1.getErrorCode();
             if (errorCode == 4 || (errorCode == i1 || (errorCode == i || errorCode == 11))) {
                str2 = str3;
             }
             i2 = 0;
          }else {
             errorCode = p1.getLocationType();
             if (errorCode == i1 || errorCode == i) {
                str2 = str3;
             }
             i2 = 1;
          }
          fo.a(p0, "O016", str2, str1, i2, p1.getErrorCode(), p2);
       }
       return;
    }
    public static void a(Context p0,String p1,int p2,int p3,long p4,long p5){
       if (p0 == null || !fi.a()) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("param_int_first", p2);
       jSONObject.put("param_int_second", p3);
       jSONObject.put("param_long_first", p4);
       jSONObject.put("param_long_second", p5);
       fo.a(p0, p1, jSONObject);
       return;
    }
    public static void a(Context p0,String p1,String p2,int p3){
       if (p0 == null || !fi.a()) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       if (!TextUtils.isEmpty(p2)) {
          jSONObject.put("param_string_first", p2);
       }
       CharSequence uCharSequenc = null;
       if (!TextUtils.isEmpty(uCharSequenc)) {
          jSONObject.put("param_string_second", uCharSequenc);
       }
       if (p3 != Integer.MAX_VALUE) {
          jSONObject.put("param_int_first", p3);
       }
       fo.a(p0, p1, jSONObject);
       return;
    }
    public static void a(Context p0,String p1,String p2,String p3,int p4,int p5,ei p6){
       if (p0 == null || !fi.a()) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       if (!TextUtils.isEmpty(p2)) {
          jSONObject.put("param_string_first", p2);
       }
       if (!TextUtils.isEmpty(p3)) {
          jSONObject.put("param_string_second", p3);
       }
       int i = Integer.MAX_VALUE;
       if (p4 != i) {
          jSONObject.put("param_int_first", p4);
       }
       if (p5 != i) {
          jSONObject.put("param_int_second", p5);
       }
       if (p6 != null) {
          if (!TextUtils.isEmpty(p6.d())) {
             jSONObject.put("dns", p6.d());
          }
          if (!TextUtils.isEmpty(p6.e())) {
             jSONObject.put("domain", p6.e());
          }
          if (!TextUtils.isEmpty(p6.f())) {
             jSONObject.put("type", p6.f());
          }
          if (!TextUtils.isEmpty(p6.g())) {
             jSONObject.put("reason", p6.g());
          }
          if (!TextUtils.isEmpty(p6.c())) {
             jSONObject.put("ip", p6.c());
          }
          if (!TextUtils.isEmpty(p6.b())) {
             jSONObject.put("stack", p6.b());
          }
          if (p6.h() > 0) {
             jSONObject.put("ctime", String.valueOf(p6.h()));
          }
          if (p6.a() > 0) {
             jSONObject.put("ntime", String.valueOf(p6.a()));
          }
       }
       fo.a(p0, p1, jSONObject);
       return;
    }
    public static synchronized void a(Context p0,String p1,JSONObject p2){
       _monitor_enter(fo.class);
       if (p0 == null || !fi.a()) {
          _monitor_exit(fo.class);
          return;
       }else {
          br uobr = new br(p0, "loc", "6.1.0", p1);
          if (p2 != null) {
             uobr.a(p2.toString());
          }
          fo.i.add(uobr);
          if (fo.i.size() >= 30) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(fo.i);
             bs.b(uArrayList, p0);
             fo.i.clear();
          }
          _monitor_exit(fo.class);
          return;
       }
    }
    public static void a(AMapLocation p0,AMapLocation p1){
       StringBuilder str = "gps";
       String str1 = ",";
       if (fo.g == null) {
          if (!fq.a(p0)) {
             fo.g = p1;
             return;
          }else {
             fo.g = p0.clone();
          }
       }
       if (fq.a(fo.g) && fq.a(p1)) {
          p1 = p1.clone();
          int i = 1;
          if (fo.g.getLocationType() != i) {
             long l = 9;
             if (fo.g.getLocationType() != l && (!str.equalsIgnoreCase(fo.g.getProvider()) && (fo.g.getLocationType() != 7 && (p1.getLocationType() != i && (p1.getLocationType() != l && (!str.equalsIgnoreCase(p1.getProvider()) && p1.getLocationType() != 7)))))) {
                long l1 = Math.abs((p1.getTime() - fo.g.getTime())) / 1000;
                if (l1 <= 0) {
                   l1 = 1;
                }
                if (l1 - 1800 <= 0) {
                   float f = fq.a(fo.g, p1);
                   float f1 = f / (float)l1;
                   if (f - 0x46ea6000 > 0 && f1 - 0x447a0000 > 0) {
                      str = fo.g.getLatitude()+str1+fo.g.getLongitude()+str1+fo.g.getAccuracy()+str1+fo.g.getLocationType()+str1;
                      String str2 = "yyyyMMdd_HH:mm:ss:SS";
                      str = (p0.getTime())? str+fq.a(fo.g.getTime(), str2): str+fo.g.getTime();
                      str = str+"#"+p1.getLatitude()+str1+p1.getLongitude()+str1+p1.getAccuracy()+str1+p1.getLocationType()+str1;
                      str = (p1.getTime())? str+fq.a(p1.getTime(), str2): str+p1.getTime();
                      fo.a("bigshiftstatistics", str);
                      str.delete(0, str.length());
                   }
                }
             }
          }
       label_0152 :
          fo.g = p1;
       }
       return;
    }
    public static void a(String p0,int p1){
       fo.a(p0, String.valueOf(p1), fo.a(p1));
    }
    public static void a(String p0,String p1){
       an.b(fj.c(), p1, p0);
    }
    public static void a(String p0,String p1,String p2){
       an.a(fj.c(), "/mobile/binary", p2, p0, p1);
    }
    public static void a(String p0,Throwable p1){
       if (p1 instanceof k) {
          an.a(fj.c(), p0, p1);
       }
       return;
    }
    public static boolean a(AMapLocation p0){
       if (fq.a(p0)) {
          if (fj.a(p0.getLatitude(), p0.getLongitude())) {
             return false;
          }
          return true;
       }else if(("http://abroad.apilocate.amap.com/mobile/binary").equals(fj.c)){
          return true;
       }else {
          return false;
       }
    }
    public static void b(Context p0,long p1,boolean p2){
       if (p0 == null || !fi.a()) {
          return;
       }
       fo.a(p0, p1, p2, "O024");
       return;
    }
    public static void f(Context p0){
       JSONArray j = fo.j;
       if (j != null && j.length() > 0) {
          bq.a(new bp(p0, fj.c(), fo.j.toString()), p0);
          fo.j = null;
       }
       return;
    }
    public final void a(Context p0,int p1){
       fo tb = this.b;
       if (tb == p1) {
          return;
       }
       long l = 0;
       if (tb != -1 && tb != p1) {
          this.a.append(this.b, Long.valueOf(((fq.b() - this.c) + this.a.get(this.b, Long.valueOf(l)).longValue())));
       }
       this.c = fq.b() - fp.a(p0, "pref1", this.d[p1], l);
       this.b = p1;
       return;
    }
    public final void a(Context p0,AMapLocationClientOption p1){
       int i = fo$1.a[p1.getLocationMode().ordinal()];
       int i1 = 3;
       Long longx = -1;
       if (i != 1) {
          if (i != 2) {
             if (i != i1) {
                i1 = -1;
             }
          }else {
             i1 = 5;
          }
       }else {
          i1 = 4;
       }
       fo te = this.e;
       if (te == i1) {
          return;
       }else if(te != longx && te != i1){
          this.a.append(this.e, Long.valueOf(((fq.b() - this.f) + this.a.get(this.e, Long.valueOf(0)).longValue())));
       }
       this.f = fq.b() - fp.a(p0, "pref1", this.d[i1], 0);
       this.e = i1;
       return;
    }
    public final void b(Context p0){
       long l = fq.b() - this.c;
       fo tb = this.b;
       fo uofo = -1;
       if (tb != uofo) {
          this.a.append(this.b, Long.valueOf((l + this.a.get(tb, Long.valueOf(0)).longValue())));
       }
       l = fq.b() - this.f;
       tb = this.e;
       if (tb != uofo) {
          this.a.append(this.e, Long.valueOf((l + this.a.get(tb, Long.valueOf(0)).longValue())));
       }
       SharedPreferences$Editor uEditor = fp.a(p0, "pref1");
       int i = 0;
       while (i < this.d.length) {
          long l1 = this.a.get(i, Long.valueOf(0)).longValue();
          if (l1 > 0 && l1 - fp.a(p0, "pref1", this.d[i], 0) > 0) {
             fp.a(uEditor, this.d[i], l1);
          }
          i = i + 1;
       }
       fp.a(uEditor);
       return;
    }
    public final int c(Context p0){
       long l = fp.a(p0, "pref1", this.d[2], 0);
       long l1 = fp.a(p0, "pref1", this.d[0], 0);
       long l2 = fp.a(p0, "pref1", this.d[1], 0);
       if (!l && (!l1 && !l2)) {
          return -1;
       }
       l1 = l1 - l;
       l2 = l2 - l;
       if (l - l1 > 0) {
          if (l - l2 > 0) {
             return 2;
          }
          return 1;
       }else if(l1 - l2 > 0){
          return 0;
       }else {
          return 1;
       }
    }
    public final int d(Context p0){
       long l = fp.a(p0, "pref1", this.d[3], 0);
       long l1 = fp.a(p0, "pref1", this.d[4], 0);
       long l2 = fp.a(p0, "pref1", this.d[5], 0);
       if (!l && (!l1 && !l2)) {
          return -1;
       }
       if (l - l1 > 0) {
          if (l - l2 > 0) {
             return 3;
          }
          return 5;
       }else if(l1 - l2 > 0){
          return 4;
       }else {
          return 5;
       }
    }
    public final void e(Context p0){
       SharedPreferences$Editor uEditor = fp.a(p0, "pref1");
       int i = 0;
       fo td = this.d;
       while (i < td.length) {
          fp.a(uEditor, td[i], 0);
          i = i + 1;
       }
       fp.a(uEditor);
       return;
    }
}
