package c.t.m.g.cb;
import java.util.HashMap;
import c.t.m.g.cb$1;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import c.t.m.g.be;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.StringBuilder;
import android.os.Build;
import android.os.Build$VERSION;
import java.lang.System;
import java.lang.Long;
import java.lang.Math;
import c.t.m.g.bt;
import android.os.HandlerThread;
import c.t.m.g.bn;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import c.t.m.g.bp;

public class cb	// class@000c03
{
    public static boolean a = false;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;
    public static HashMap j;
    public static long k;
    public static Runnable l;

    static {
       cb.j = new HashMap();
       cb.k = 0;
       cb.l = new cb$1();
    }
    public static long a(long p0){
       cb.k = p0;
       return p0;
    }
    public static synchronized Object a(String p0){
       _monitor_enter(cb.class);
       Object obj = cb.j.get(p0);
       if (obj == null) {
          obj = be.a().getSystemService(p0);
          if (obj != null) {
             cb.j.put(p0, obj);
          }
       }
       _monitor_exit(cb.class);
       return obj;
    }
    public static String a(Context p0){
       cb.m();
       if (TextUtils.isEmpty(cb.b) || "0123456789ABCDEF".equals(cb.b)) {
          cb.b = ca.b(ca.a(), "loc_id_imei", "0123456789ABCDEF");
       }
       return cb.b(cb.b);
    }
    public static synchronized void a(boolean p0){
       _monitor_enter(cb.class);
       cb.a = p0;
       _monitor_exit(cb.class);
    }
    public static synchronized boolean a(){
       _monitor_enter(cb.class);
       _monitor_exit(cb.class);
       return cb.a;
    }
    public static String b(){
       return cb.a(be.a());
    }
    public static String b(Context p0){
       cb.m();
       if (TextUtils.isEmpty(cb.d) || "0123456789ABCDEF".equals(cb.d)) {
          cb.d = ca.b(ca.a(), "loc_id_imsi", "0123456789ABCDEF");
       }
       return cb.b(cb.d);
    }
    public static String b(String p0){
       if (TextUtils.isEmpty(p0)) {
          p0 = "0123456789ABCDEF";
       }
       return p0;
    }
    public static String c(){
       return cb.b(be.a());
    }
    public static String c(Context p0){
       cb.m();
       if (TextUtils.isEmpty(cb.g) || "0123456789ABCDEF".equals(cb.g)) {
          cb.g = ca.b(ca.a(), "loc_id_androidId", "0123456789ABCDEF");
       }
       return cb.b(cb.g);
    }
    public static String c(String p0){
       cb.g = p0;
       return p0;
    }
    public static String d(){
       return cb.c(be.a());
    }
    public static String d(Context p0){
       return p0.getPackageName();
    }
    public static String d(String p0){
       cb.i = p0;
       return p0;
    }
    public static String e(){
       cb.m();
       if (TextUtils.isEmpty(cb.f) || "0123456789ABCDEF".equals(cb.f)) {
          cb.f = ca.b(ca.a(), "loc_id_sn", "0123456789ABCDEF");
       }
       return cb.b(cb.f);
    }
    public static String e(Context p0){
       CharSequence uCharSequenc = p0.getApplicationInfo().loadLabel(p0.getPackageManager());
       String str = "";
       String str1 = (uCharSequenc == null)? "UNKNOWN": (uCharSequenc.toString()).replaceAll("_", str);
       PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0x4000);
       return str1+"_"+(p0.getPackageName()).replaceAll("_", str)+"_"+packageInfo.versionCode+"_"+packageInfo.versionName;
    }
    public static String e(String p0){
       cb.f = p0;
       return p0;
    }
    public static String f(){
       cb.m();
       if (TextUtils.isEmpty(cb.e) || "0123456789ABCDEF".equals(cb.e)) {
          cb.e = ca.b(ca.a(), "loc_id_mac", "0123456789ABCDEF");
       }
       return cb.b(cb.e);
    }
    public static String g(){
       cb.m();
       if (TextUtils.isEmpty(cb.i)) {
          cb.i = ca.b(ca.a(), "loc_build_model", "");
          if (TextUtils.isEmpty(cb.i)) {
             cb.i = Build.MODEL;
          }
       }
       return cb.i;
    }
    public static String h(){
       return cb.d(be.a());
    }
    public static String i(){
       Context uContext = be.a();
       ApplicationInfo applicationI = uContext.getApplicationInfo();
       CharSequence uCharSequenc = applicationI.loadLabel(uContext.getPackageManager());
       String str = (uCharSequenc == null)? "UNKNOWN": uCharSequenc.toString();
       return str;
    }
    public static String j(){
       Context uContext = be.a();
       String packageName = uContext.getPackageName();
       return uContext.getPackageManager().getPackageInfo(packageName, 0x4000).versionName;
    }
    public static boolean k(){
       return cb.l();
    }
    public static boolean l(){
       boolean b = (be.a && Build$VERSION.SDK_INT > 28)? true: false;
       return b;
    }
    public static synchronized void m(){
       _monitor_enter(cb.class);
       if (cb.a) {
          _monitor_exit(cb.class);
          return;
       }else {
          long l = System.currentTimeMillis();
          if (!cb.k) {
             cb.k = ca.b(ca.a(), "loc_id_update_time", Long.valueOf(0)).longValue();
          }
          if (Math.abs((l - cb.k)) - 0x5265c00 > 0) {
             bt.a("SystemUtil", "update info in runnable");
             bp.a(new Handler(bn.a("th_loc_extra").getLooper()), cb.l);
             bn.b("th_loc_extra");
          }
          if (!cb.k) {
             cb.k = l;
          }
          _monitor_exit(cb.class);
          return;
       }
    }
}
