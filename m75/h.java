package m75.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.base.b;
import m75.d;
import java.lang.Runnable;
import m75.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.chat.kwailink.net.NetworkChangeReceiver;
import java.lang.System;
import android.content.Context;
import m75.h$a;
import e85.a;
import org.json.JSONObject;
import com.kwai.chat.kwailink.utils.PropertyUtils;
import com.kwai.chat.kwailink.utils.Utils;
import android.os.SystemClock;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.lang.Integer;
import m75.b;
import m75.c;
import m75.e;
import m75.f;
import java.lang.Long;
import java.util.HashMap;
import ca7.f;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.chat.kwailink.utils.EventReporter;
import m75.g;
import m75.a;

public class h	// class@001e4d
{
    public static long A = 0x0;
    public static long B = 0x0;
    public static long C = 0x0;
    public static int D = 0;
    public static boolean E = false;
    public static int a;
    public static int b;
    public static boolean c = false;
    public static boolean d;
    public static String e;
    public static int f;
    public static long g;
    public static long h;
    public static long i;
    public static long j;
    public static long k;
    public static long l;
    public static long m;
    public static long n;
    public static int o;
    public static long p;
    public static long q;
    public static long r;
    public static long s;
    public static int t;
    public static long u;
    public static long v;
    public static long w;
    public static long x;
    public static int y;
    public static long z;

    public void h(){
       super();
    }
    public static void a(){
       boolean b;
       long l1;
       h oh = h.class;
       if (PatchProxy.applyVoid(null, null, oh, "2")) {
       }else {
          a.e("AliveMonitor", "tryStart");
          long l = 1000;
          if (!b.g()) {
             a.e("AliveMonitor", "tryStart failed, KwaiLinkGlobal not inited!");
             i.b(d.b, l);
          }else if(b.h() && TextUtils.isEmpty(h.e)){
             a.e("AliveMonitor", "tryStart failed, KwaiLink not login!");
             i.b(d.b, l);
          }else if(b.h()){
             NetworkChangeReceiver.b();
          }
          b = h.b();
          h.d = b;
          h.c = b;
          if (!PatchProxy.applyVoid(null, null, oh, "9")) {
             long l2 = System.currentTimeMillis();
             h.j = l2;
             if (b.b() != null) {
                _monitor_enter(oh);
                a b1 = h$a.b;
                String str = b1.d("alive_monitor_info", "");
                b1.h("alive_monitor_info");
                if (TextUtils.isEmpty(str)) {
                   _monitor_exit(oh);
                }else {
                   try{
                      JSONObject jSONObject = new JSONObject(str);
                      long longx = jSONObject.getLong("monitorStartTime");
                      if ((l2 - longx) - 0x36ee80 >= 0) {
                         h.h(str);
                         _monitor_exit(oh);
                      }else {
                         String str1 = jSONObject.getString("appVersion");
                         String str2 = jSONObject.getString("imsdkVersion");
                         String str3 = jSONObject.getString("linkVersion");
                         if (Utils.isEqualStr(jSONObject.getString("kpn"), PropertyUtils.getKpn()) && (Utils.isEqualStr(str1, PropertyUtils.getAppVersion()) && (!Utils.isEqualStr(str2, PropertyUtils.getImsdkVersion()) || !Utils.isEqualStr(str3, PropertyUtils.getLinkVersion())))) {
                            h.h(str);
                            _monitor_exit(oh);
                         }else if(longx - l2 < 0){
                            h.j = longx;
                         }
                         h.k = jSONObject.getLong("appAliveTotalTime");
                         h.l = jSONObject.getLong("netAvailableTotalTime");
                         h.n = jSONObject.getLong("klinkAliveTotalTime");
                         h.m = jSONObject.getLong("sleepTotalTime");
                         h.o = jSONObject.getInt("sleepCount");
                         h.p = jSONObject.getLong("appAliveTotalTimeForeground");
                         h.q = jSONObject.getLong("netAvailableTotalTimeForeground");
                         h.s = jSONObject.getLong("klinkAliveTotalTimeForeground");
                         h.r = jSONObject.getLong("sleepTotalTimeForeground");
                         h.t = jSONObject.getInt("sleepCountForeground");
                         h.u = jSONObject.getLong("appAliveTotalTimeBackground");
                         h.v = jSONObject.getLong("netAvailableTotalTimeBackground");
                         h.x = jSONObject.getLong("klinkAliveTotalTimeBackground");
                         h.w = jSONObject.getLong("sleepTotalTimeBackground");
                         h.y = jSONObject.getInt("sleepCountBackground");
                         h.z = jSONObject.getLong("appAliveTotalTimeOrphan");
                         h.A = jSONObject.getLong("netAvailableTotalTimeOrphan");
                         h.C = jSONObject.getLong("klinkAliveTotalTimeOrphan");
                         h.B = jSONObject.getLong("sleepTotalTimeOrphan");
                         h.D = jSONObject.getInt("sleepCountOrphan");
                         _monitor_exit(e0);
                      }
                   }catch(org.json.JSONException e0){
                   }
                }
             }
          }
       }
       return;
    }
    public static boolean b(){
       Object[] objArray1;
       Object[] objArray2;
       NetworkCapabilities networkCapab;
       Object[] objArray = null;
       ConnectivityManager obj = PatchProxy.apply(objArray, objArray, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (Build$VERSION.SDK_INT < 23) {
          return b;
       }
       try{
          obj = b.b().getSystemService("connectivity");
          try{
             objArray2 = obj.getActiveNetworkInfo();
          }catch(java.lang.Exception e0){
             objArray2 = objArray;
          }
       }catch(java.lang.Exception e0){
          objArray1 = objArray;
          goto label_002e ;
       }
       if (objArray2 != null && objArray2.isConnected()) {
          try{
             networkCapab = objArray1.getNetworkCapabilities(objArray1.getActiveNetwork());
          }catch(java.lang.Exception e0){
          }
          if (networkCapab != null && networkCapab.hasCapability(16)) {
             b = true;
          }
       }
       return b;
    }
    public static void c(int p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, oh, "4")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       i.a(new b(p1));
       return;
    }
    public static void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "11")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       i.a(new c(p0));
       return;
    }
    public static void e(){
       if (PatchProxy.applyVoid(null, null, h.class, "12")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       i.a(e.b);
       return;
    }
    public static void f(){
       if (PatchProxy.applyVoid(null, null, h.class, "5")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       i.a(f.b);
       return;
    }
    public static void g(long p0,long p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), null, h.class, "8")) {
          return;
       }
       h.g = p0;
       int c = h.c;
       long l = 1000;
       long l1 = (p2)? l: p1;
       long l2 = 0;
       long l3 = (c)? l1: l2;
       long l4 = (c && h.a == 2)? l1: l2;
       if (p2) {
          l2 = p1 - l;
       }
       h.k = h.k + l1;
       h.l = h.l + l3;
       h.n = h.n + l4;
       h.m = h.m + l2;
       h.o = h.o + p2;
       c = h.f;
       if (c != 1) {
          if (c != 2) {
             if (c == 3) {
                h.z = h.z + l1;
                h.A = h.A + l3;
                h.C = h.C + l4;
                h.B = h.B + l2;
                h.D = h.D + p2;
             }
          }else {
             h.u = h.u + l1;
             h.v = h.v + l3;
             h.x = h.x + l4;
             h.w = h.w + l2;
             h.y = h.y + p2;
          }
       }else {
          h.p = h.p + l1;
          h.q = h.q + l3;
          h.s = h.s + l4;
          h.r = h.r + l2;
          h.t = h.t + p2;
       }
       if ((p0 - h.h) - 0x7530 >= 0) {
          h.h = p0;
          if (!PatchProxy.applyVoid(null, null, h.class, "10") && b.b() != null) {
             _monitor_enter(h.class);
             HashMap hashMap = new HashMap();
             hashMap.put("monitorStartTime", Long.valueOf(h.j));
             hashMap.put("kpn", PropertyUtils.getKpn());
             hashMap.put("appVersion", PropertyUtils.getAppVersion());
             hashMap.put("imsdkVersion", PropertyUtils.getImsdkVersion());
             hashMap.put("linkVersion", PropertyUtils.getLinkVersion());
             if (b.h()) {
                hashMap.put("appAliveTotalTime", Long.valueOf(h.k));
                hashMap.put("netAvailableTotalTime", Long.valueOf(h.l));
                hashMap.put("klinkAliveTotalTime", Long.valueOf(h.n));
                hashMap.put("sleepTotalTime", Long.valueOf(h.m));
                hashMap.put("sleepCount", Integer.valueOf(h.o));
                hashMap.put("appAliveTotalTimeForeground", Long.valueOf(h.p));
                hashMap.put("netAvailableTotalTimeForeground", Long.valueOf(h.q));
                hashMap.put("klinkAliveTotalTimeForeground", Long.valueOf(h.s));
                hashMap.put("sleepTotalTimeForeground", Long.valueOf(h.r));
                hashMap.put("sleepCountForeground", Integer.valueOf(h.t));
                hashMap.put("appAliveTotalTimeBackground", Long.valueOf(h.u));
                hashMap.put("netAvailableTotalTimeBackground", Long.valueOf(h.v));
                hashMap.put("klinkAliveTotalTimeBackground", Long.valueOf(h.x));
                hashMap.put("sleepTotalTimeBackground", Long.valueOf(h.w));
                hashMap.put("sleepCountBackground", Integer.valueOf(h.y));
             }else if(b.i()){
                hashMap.put("appAliveTotalTime", Long.valueOf(h.z));
                hashMap.put("netAvailableTotalTime", Long.valueOf(h.A));
                hashMap.put("klinkAliveTotalTime", Long.valueOf(h.C));
                hashMap.put("sleepTotalTime", Long.valueOf(h.B));
                hashMap.put("sleepCount", Integer.valueOf(h.D));
                hashMap.put("appAliveTotalTimeForeground", Integer.valueOf(0));
                hashMap.put("netAvailableTotalTimeForeground", Integer.valueOf(0));
                hashMap.put("klinkAliveTotalTimeForeground", Integer.valueOf(0));
                hashMap.put("sleepTotalTimeForeground", Integer.valueOf(0));
                hashMap.put("sleepCountForeground", Integer.valueOf(0));
                hashMap.put("appAliveTotalTimeBackground", Integer.valueOf(0));
                hashMap.put("netAvailableTotalTimeBackground", Integer.valueOf(0));
                hashMap.put("klinkAliveTotalTimeBackground", Integer.valueOf(0));
                hashMap.put("sleepTotalTimeBackground", Integer.valueOf(0));
                hashMap.put("sleepCountBackground", Integer.valueOf(0));
             }
             hashMap.put("appAliveTotalTimeOrphan", Long.valueOf(h.z));
             hashMap.put("netAvailableTotalTimeOrphan", Long.valueOf(h.A));
             hashMap.put("klinkAliveTotalTimeOrphan", Long.valueOf(h.C));
             hashMap.put("sleepTotalTimeOrphan", Long.valueOf(h.B));
             hashMap.put("sleepCountOrphan", Integer.valueOf(h.D));
             h$a.b.f("alive_monitor_info", f.b.q(hashMap));
             _monitor_exit(h.class);
          }
       }
       return;
    }
    public static void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "7")) {
          return;
       }
       EventReporter.reportEvent("KLINK_ALIVE_MONITOR_START", p0);
       a.e("AliveMonitor", "loadAndReport, key="+"KLINK_ALIVE_MONITOR_START"+", value="+p0);
       return;
    }
    public static void i(){
       if (PatchProxy.applyVoid(null, null, h.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       if (!b.h()) {
          return;
       }
       a.e("AliveMonitor", "start");
       i.b(d.b, 5000);
       return;
    }
    public static void j(){
       if (PatchProxy.applyVoid(null, null, h.class, "6")) {
          return;
       }
       i.b(g.b, 1000);
       return;
    }
    public static void k(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, oh, "13")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       i.a(new a(p0));
       return;
    }
}
