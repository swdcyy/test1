package i30.a;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ConcurrentHashMap;
import i30.h;
import i30.i;
import android.content.Context;
import i30.z;
import i30.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import i30.t;
import okhttp3.OkHttpClient;
import l30.u;
import okhttp3.FormBody$Builder;
import com.kuaishou.dfp.c.c;
import u30.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import l30.e;
import java.lang.Throwable;
import com.kuaishou.dfp.c.d;
import java.lang.Boolean;
import v30.d;
import v30.a;
import u30.a;
import l30.l;
import org.json.JSONObject;
import java.util.zip.CRC32;
import android.util.Base64;
import java.lang.StringBuilder;
import java.util.Map;
import j30.b;
import java.lang.System;
import i30.n;
import java.util.concurrent.CountDownLatch;
import r30.d;
import i30.q;
import r30.a;
import i30.r;
import i30.o;
import i30.p;
import u30.c;
import l30.y;
import com.kuaishou.romid.inlet.OaidHelper;
import h30.b;
import com.google.protobuf.nano.MessageNano;
import java.util.Random;
import l30.k;
import okhttp3.Request$Builder;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.lang.Math;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.dfp.hostproxy.DfpDidTagProxy;
import com.kuaishou.dfp.hostproxy.DfpODidProxy;
import com.kuaishou.dfp.hostproxy.DfpDidProxy;

public class a	// class@00178b
{
    public String a;
    public String b;
    public String c;
    public String d;
    public ConcurrentHashMap e;
    public ConcurrentHashMap f;
    public String g;
    public String h;
    public ReentrantLock i;
    public DfpDidProxy j;
    public DfpDidTagProxy k;
    public DfpODidProxy l;
    public static String[] m;
    public static String[] n;
    public static String[] o;
    public static String[] p;
    public static String[] q;
    public static final String[] r;

    static {
       String[] stringArray = new String[]{"aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQva3VhaXNob3UvYW5kcm9pZA==","aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL2dkZnAvcmVwb3J0L2t1YWlzaG91L2FuZHJvaWQ="};
       a.m = stringArray;
       stringArray = new String[]{"aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvdW5pZmllZElkL2ZldGNoL2FuZHJvaWQ=","aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL3VuaWZpZWRJZC9mZXRjaC9hbmRyb2lk"};
       a.n = stringArray;
       stringArray = new String[]{"aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvdW5pZmllZElkL3JlcGFpci9hbmRyb2lk","aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL3VuaWZpZWRJZC9yZXBhaXIvYW5kcm9pZA=="};
       a.o = stringArray;
       stringArray = new String[]{"aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvdW5pZmllZElkL2NoZWNrUmVwYWly","aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL3VuaWZpZWRJZC9jaGVja1JlcGFpcg=="};
       a.p = stringArray;
       stringArray = new String[]{"aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvdW5pZmllZElkL2xvZ1JlcG9ydC9pZE1hcHBpbmc=","aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL3VuaWZpZWRJZC9sb2dSZXBvcnQvaWRNYXBwaW5n"};
       a.q = stringArray;
       stringArray = new String[]{"k5","k14","k22","k27","k31","k35","k36","k39","k46","k57","k64","k66","k68","k83","k86","k93","k97","k101","k102","k105","k107","k108","k109","k110","k111","k113"};
       a.r = stringArray;
    }
    public void a(){
       super();
       this.c = "0";
       this.d = "";
       this.g = "";
       this.h = "0";
       this.i = new ReentrantLock();
       this.e = new ConcurrentHashMap(200);
       this.f = new ConcurrentHashMap(100);
    }
    public void a(h p0){
       super();
       this.c = "0";
       this.d = "";
       this.g = "";
       this.h = "0";
       this.i = new ReentrantLock();
       this.e = new ConcurrentHashMap(200);
       this.f = new ConcurrentHashMap(100);
    }
    public static a a(){
       return i.a;
    }
    public void b(Context p0,z p1,c0 p2,int p3){
       FormBody$Builder this;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, a.class, "16")) {
          return;
       }
       int i = 15;
       OkHttpClient okHttpClient = (t.m)? u.b(i, false): u.a(i);
       OkHttpClient okHttpClient1 = okHttpClient;
       this = c.b(p0, p2, p3);
       if (this == null) {
          p1.onFailed(-16, "sign failed");
          return;
       }else {
          String[] p = a.p;
          if (!TextUtils.isEmpty(this.a) && ("KS_TV").equals(this.a)) {
             p = new String[]{"aHR0cHM6Ly9nZGZwLWtzYXBpc3J2LnlzdC5haXNlZS50di9yZXN0L2luZnJhL3VuaWZpZWRJZC9jaGVja1JlcGFpcg==","aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvdW5pZmllZElkL2NoZWNrUmVwYWly"};
          }
          this.j(okHttpClient1, p, p1, this, null, 3);
          return;
       }
    }
    public void c(Context p0,z p1,String p2,String p3,e p4,boolean p5,boolean p6,int p7){
       byte[] this;
       a uoa = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,oobject2,p4,Boolean.valueOf(p5),Boolean.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "15")) {
             return;
          }
       }
       int i = 15;
       OkHttpClient okHttpClient = (t.m)? u.b(i, 0): u.a(i);
       OkHttpClient okHttpClient1 = okHttpClient;
       this = this.k(p0, true, false, p6, p4, p7);
       if (this == null || !this.length) {
          p1.onFailed(-3, "deviceInfo is null");
          return;
       }else {
          String str = null;
          d.d(p0).c(a.A0, 0, str);
          FormBody$Builder uBuilder = c.c(p0, oobject1, oobject2, this);
          if (uBuilder == null) {
             p1.onFailed(-16, "encrypt failed");
             return;
          }else {
             String[] this1 = a.o;
             if (!TextUtils.isEmpty(uoa.a) && ("KS_TV").equals(uoa.a)) {
                this1 = new String[]{"aHR0cHM6Ly9nZGZwLWtzYXBpc3J2LnlzdC5haXNlZS50di9yZXN0L2luZnJhL3VuaWZpZWRJZC9yZXBhaXIvYW5kcm9pZA==","aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvdW5pZmllZElkL3JlcGFpci9hbmRyb2lk"};
             }
             d.d(p0).c(a.H0, 0, str);
             l.a("uploadDfpIdCorrect");
             this.j(okHttpClient1, this1, p1, uBuilder, p4, 1);
             return;
          }
       }
    }
    public void d(Context p0,z p1,boolean p2,e p3,int p4,boolean p5){
       Object[] objArray1;
       String str5;
       String str6;
       JSONObject jSONObject;
       CRC32 uCRC32;
       String str7;
       long l;
       n on1;
       a e1;
       n on2;
       String str8;
       String str9;
       String str10;
       String str11;
       String str12;
       long l1;
       CRC32 uCRC321;
       b uob;
       CountDownLatch uCountDownLa;
       long l2;
       CountDownLatch uCountDownLa1;
       CountDownLatch uCountDownLa2;
       q oq;
       q oq1;
       p op;
       int i8;
       Object obj = this;
       object oobject = p0;
       boolean b = p2;
       object oobject1 = p3;
       int i = p4;
       a uoa = a.class;
       int i1 = 0;
       int i2 = 3;
       int i3 = 4;
       int i4 = 5;
       int i5 = 1;
       int i6 = 2;
       int i7 = 6;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i7];
          objArray[i1] = oobject;
          objArray[i5] = p1;
          objArray[i6] = Boolean.valueOf(p2);
          objArray[i2] = oobject1;
          objArray[i3] = Integer.valueOf(p4);
          objArray[i4] = Boolean.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, obj, uoa, "6")) {
             return;
          }
       }
       String str = "azE0";
       String str1 = "KWE_OTHER";
       String str2 = ":";
       String str3 = "AND";
       String str4 = "k";
       n on = 119;
       if (b) {
          a e = obj.e;
          if (e != null && e.size() == on) {
             if (PatchProxy.isSupport(uoa)) {
                objArray1 = new Object[i7];
                objArray1[i1] = oobject;
                objArray1[i5] = p1;
                objArray1[2] = Boolean.TRUE;
                objArray1[3] = oobject1;
                objArray1[4] = Integer.valueOf(p4);
                objArray1[5] = Boolean.valueOf(p5);
                if (!PatchProxy.applyVoid(objArray1, obj, uoa, "8")) {
                }
             }else {
             }
          }else if(PatchProxy.isSupport(uoa)){
             objArray1 = new Object[i7];
             objArray1[i1] = oobject;
             objArray1[i5] = p1;
             objArray1[2] = Boolean.valueOf(p2);
             objArray1[3] = oobject1;
             objArray1[4] = Integer.valueOf(p4);
             objArray1[5] = Boolean.valueOf(p5);
             if (!PatchProxy.applyVoid(objArray1, obj, uoa, "7")) {
             }
          }else {
          }
       }else {
          goto label_014d ;
       }
       return;
    }
    public void e(Context p0,z p1,boolean p2,boolean p3,e p4,int p5,boolean p6){
       byte[] this;
       long l;
       int i1;
       OkHttpClient okHttpClient;
       FormBody$Builder uBuilder;
       String[] n;
       Object obj = this;
       object oobject = p4;
       int i = 1;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),oobject,Integer.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, a.class, "9")) {
             return;
          }
       }
       this = this.k(p0, false, p2, p3, p4, p5);
       String str = null;
       d.d(p0).a(a.B, 0, str);
       if (this != null && this.length > 0) {
          if (PatchProxy.isSupport(a.class)) {
             Object[] objArray1 = new Object[]{p1,this,oobject,Boolean.valueOf(p6),Boolean.valueOf(p3),Integer.valueOf(p5)};
             if (!PatchProxy.applyVoid(objArray1, obj, a.class, "14")) {
             }
          }else {
          }
       }else {
          l.c("getFingerPrintLite get deviceinfo failed!");
       }
    label_0107 :
       return;
    }
    public final void f(Context p0,boolean p1,ConcurrentHashMap p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "11")) {
          return;
       }
       String str = "k66";
       String str1 = p2.get(str);
       if (TextUtils.isEmpty(str1) || str1.startsWith("KWE")) {
          p2.put(str, d.e(n.s(p0, p1)));
       }
       l.c("try reget factors in request!");
       String str2 = "k57";
       str = p2.get(str2);
       if (TextUtils.isEmpty(str) || str.startsWith("KWE")) {
          p2.put(str2, d.e(n.d(p0, new y(p0))));
       }
       str2 = "k68";
       str = p2.get(str2);
       if (TextUtils.isEmpty(str) || str.startsWith("KWE")) {
          p2.put(str2, d.e(n.c(p0)));
       }
       str2 = "k86";
       str = p2.get(str2);
       if (TextUtils.isEmpty(str) || str.startsWith("KWE")) {
          p2.put(str2, d.e(n.H(p0)));
       }
       str2 = "k83";
       str = p2.get(str2);
       if (TextUtils.isEmpty(str) || str.startsWith("KWE")) {
          p2.put(str2, d.e(n.C(p0)));
       }
       String str3 = "k97";
       str2 = p2.get(str3);
       if (TextUtils.isEmpty(str2) || str2.startsWith("KWE")) {
          l.a("retry+oaid");
          OaidHelper.getSingletonInstance().waitOaidCountDownLatch();
          p2.put(str3, d.e(OaidHelper.getSingletonInstance().getOaidInner()));
       }
       p2.put("k107", d.e(a.a().o()));
       return;
    }
    public void g(b p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "13")) {
          return;
       }
       OkHttpClient okHttpClient = u.a(15);
       FormBody$Builder uBuilder = c.e(p1);
       if (uBuilder == null) {
          p0.onFailed(-16, "encrypt failed");
          return;
       }else {
          String[] q = a.q;
          if (("KS_TV").equals(this.a)) {
             q = new String[]{"aHR0cHM6Ly9nZGZwLWtzYXBpc3J2LnlzdC5haXNlZS50di9yZXN0L2luZnJhL3VuaWZpZWRJZC9sb2dSZXBvcnQvaWRNYXBwaW5n","aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvdW5pZmllZElkL2xvZ1JlcG9ydC9pZE1hcHBpbmc="};
          }
          l.a("uploadIdMappingData");
          this.i(okHttpClient, q, p0, uBuilder);
          return;
       }
    }
    public void h(z p0,b p1,e p2,boolean p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "17")) {
             return;
          }
       }
       OkHttpClient okHttpClient = u.a(15);
       FormBody$Builder uBuilder = c.d("deviceInfo", MessageNano.toByteArray(p1));
       String[] m = a.m;
       if (!TextUtils.isEmpty(this.a)) {
          if (("KS_TV").equals(this.a)) {
             m = new String[]{"aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvYW5kcm9pZA==","aHR0cHM6Ly9nZGZwLWtzYXBpc3J2LnlzdC5haXNlZS50di9yZXN0L2luZnJhL2dkZnAvcmVwb3J0L2FuZHJvaWQ="};
          }else if(!(this.a).equals("KUAISHOU") && !(this.a).equals("NEBULA")){
             m = new String[]{"aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvYW5kcm9pZA==","aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL2dkZnAvcmVwb3J0L2FuZHJvaWQ="};
          }
       }
       l.a("uploadDfpSync");
       this.j(okHttpClient, m, p0, uBuilder, p2, 2);
       return;
    }
    public final void i(OkHttpClient p0,String[] p1,b p2,FormBody$Builder p3){
       int this;
       String str;
       b uob = p2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "19")) {
          return;
       }
       Throwable throwable = null;
       int i = new Random().nextInt(2);
       int i1 = 0;
       this = 0;
       while (true) {
          int i2 = 1;
          if (this < 2) {
             try{
                if (!this) {
                   str = k.q(p1[i]);
                }else {
                   int i3 = i - 1;
                   str = k.q(p1[i3]);
                }
                l.a("ID mapping try upload :"+str);
                Response response = p0.newCall(new Request$Builder().url(str).post(p3.build()).build()).execute();
                if (!response.isSuccessful()) {
                   l.c("ID mapping fail code "+response.code()+" "+str);
                   if (this == i2) {
                      uob.onFailed(-33, "request failed "+Integer.toString(response.code()));
                   }
                label_00fc :
                   this++;
                }else {
                   String str1 = response.body().string();
                   l.a(str+" res "+response.code()+str1);
                   JSONObject jSONObject = new JSONObject(str1);
                   if (jSONObject.optInt("result") == i2) {
                      uob.onSuccess("");
                   }else {
                      uob.onFailed(-17, jSONObject.optString("error_msg"));
                   }
                   i1 = 1;
                }
             }catch(java.net.SocketTimeoutException e0){
                throwable = new SocketTimeoutException("Net Connection need reset");
             }catch(java.io.IOException e0){
                throwable = new IOException("Net Connection need reset");
             }
          }
       }
    }
    public final void j(OkHttpClient p0,String[] p1,z p2,FormBody$Builder p3,e p4,int p5){
       String str1;
       String str2;
       String str3;
       String str5;
       double d;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       int i = p5;
       a uoa = a.class;
       int i1 = 2;
       int i2 = 0;
       int i3 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,p3,oobject2,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "18")) {
             return;
          }
       }else {
          int i8 = this;
       }
       long l = System.currentTimeMillis();
       String str = null;
       int i4 = new Random().nextInt(i1);
       if (!i) {
          d.d(t.c().d()).a(a.d, i2, "");
          d.d(t.c().d()).h(i3);
       }else if(i == i3){
          d.d(t.c().d()).c(a.c0, i2, "");
          d.d(t.c().d()).h(i2);
       }
       int i5 = 0;
       while (true) {
          if (i5 < i1) {
             try{
                str1 = "Net Connection need reset";
                if (!i5) {
                   str2 = k.q(p1[i4]);
                }else {
                   int i7 = i4 - 1;
                   str2 = k.q(p1[i7]);
                }
                l.a("try upload :"+str2);
                Response response = oobject.newCall(new Request$Builder().url(str2).post(p3.build()).build()).execute();
                String str4 = " ";
                if (!response.isSuccessful()) {
                   int i6 = str;
                   l.c("fail code "+response.code()+str4+str2);
                   if (i5 == 1) {
                      if (!i) {
                         d.d(t.c().d()).a(a.U, response.code(), "");
                      }else if(i == 1){
                         d.d(t.c().d()).c(a.T0, response.code(), "");
                      }
                      oobject1.onFailed(-33, "request failed "+Integer.toString(response.code()));
                   }
                   str = i6;
                   i5 = i5 + 1;
                   i1 = 2;
                   str4 = 1;
                }else {
                   str5 = str;
                   str = response.body().string();
                   l.a(str2+" res "+response.code()+str);
                   if (!i) {
                      d.d(t.c().d()).a(a.T, response.code(), str);
                   }else if(i == 1){
                      d.d(t.c().d()).c(a.S0, response.code(), str);
                   }
                   JSONObject jSONObject = new JSONObject(str);
                   Integer integer = Integer.valueOf(jSONObject.get("result").toString());
                   if (oobject2 != null) {
                      oobject2.i = System.currentTimeMillis() - l;
                   }else {
                      String str7 = str1;
                   }
                   if (integer.intValue() == 1) {
                      oobject1.a(jSONObject);
                   }else if(integer.intValue() == -15 && i == 1){
                      l.a("yun correct be told to delay");
                      d = 1200.00f;
                      long l1 = jSONObject.optLong("latency", (long)((Math.random() * d) + d));
                      if (l1 > 0) {
                         if ((1000 * l1) - 0x6ddd00 > 0) {
                            l1 = 0x6ddd00;
                         }
                      }else {
                         l1 = (long)((Math.random() * d) + d);
                      }
                      oobject1.onFailed(-15, Long.toString(l1));
                   }else {
                      String str6 = jSONObject.optString("error_msg", "");
                      if (!TextUtils.isEmpty(str6)) {
                         oobject1.onFailed(-33, integer+str4+str6);
                      }else {
                         oobject1.onFailed(-33, integer+str4+str);
                      }
                   }
                   str = str5;
                   str3 = 1;
                label_027c :
                   if (!str3 && str != null) {
                      str3 = a.X;
                      if (!i) {
                         if (!str instanceof SocketTimeoutException) {
                            if (str instanceof IOException) {
                               str3 = a.V;
                            }
                         }else {
                            str3 = a.W;
                         }
                         d.d(t.c().d()).a(str3, 0, "net");
                         break ;
                      }else if(i == 1){
                         if (!str instanceof SocketTimeoutException) {
                            str3 = (str instanceof IOException)? a.U0: a.W0;
                         }else {
                            str3 = a.V0;
                         }
                         d.d(t.c().d()).c(str3, 0, "net");
                         break ;
                      }
                      break ;
                   }else if(str3 == null){
                      if (!i) {
                         d.d(t.c().d()).a(a.X, 0, "net");
                      }else if(i == 1){
                         d.d(t.c().d()).c(a.X, 0, "net");
                      }
                      oobject1.onFailed(-3, "error is null");
                   }
                   return;
                }
             }catch(java.net.SocketTimeoutException e0){
                str3 = str1;
                str = new SocketTimeoutException(str3);
             }catch(java.io.IOException e0){
                str = new IOException(str1);
             }
          }else {
             str5 = str;
          }
       }
       throw str;
    }
    public synchronized byte[] k(Context p0,boolean p1,boolean p2,boolean p3,e p4,int p5){
       String obj;
       long l;
       a uoa = this;
       object oobject = p0;
       boolean b = p1;
       object oobject1 = p4;
       int i = p5;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),oobject1,Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, uoa1, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "fetch:";
       if (b) {
          obj = "repair:";
       }
       String str = obj;
       uoa1 = uoa.f;
       if (uoa1 != null && uoa1.size() == a.r.length) {
          l.c("lite info reuse,isCorrectId");
          this.f(oobject, b, uoa.f);
          this.p(str);
          return MessageNano.toByteArray(d.a(uoa.f));
       }else {
          l.a("create new lite device info. isCorrect "+b);
          l = System.currentTimeMillis();
          new n(oobject, i).f(p3, p1, p2, p4, uoa.e, uoa.f);
          l.a("LEN1: "+uoa.f.size()+" LEN2: "+a.r.length);
          long l1 = System.currentTimeMillis();
          if (oobject1 != null && i == 1) {
             oobject1.g = l1 - l;
          }
          this.p(str);
          return MessageNano.toByteArray(d.a(uoa.f));
       }
    }
    public String l(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.a)) {
          return this.a;
       }
       return "KWE_N";
    }
    public String m(){
       return this.d;
    }
    public void n(String p0){
       this.a = p0;
    }
    public String o(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj != null) {
          return String.valueOf(obj.getNewDidTag());
       }
       return "0";
    }
    public final void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       CRC32 uCRC32 = new CRC32();
       int i = 0;
       String str = new String(Base64.decode("azE0", i));
       String[] r = a.r;
       int len = r.length;
       String str1 = "AND";
       while (i < len) {
          object oobject = r[i];
          String str2 = this.f.get(oobject);
          if (str.equals(oobject)) {
             uCRC32.update(str1.getBytes());
          }else if(!TextUtils.isEmpty(str2)){
             uCRC32.update(str2.getBytes());
          }
          i = i + 1;
       }
       this.f.put(str, str1+":"+String.valueOf(uCRC32.getValue()));
       return;
    }
    public String q(){
       a tb;
       String obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       a tl = this.l;
       if (tl != null) {
          obj = tl.getODid();
       }
       if (TextUtils.isEmpty(obj)) {
          tb = this.b;
       }
       return tb;
    }
    public String r(){
       String obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       a tj = this.j;
       if (tj != null) {
          obj = tj.getNewDid();
       }
       return obj;
    }
}
