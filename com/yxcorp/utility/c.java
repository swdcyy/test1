package com.yxcorp.utility.c;
import ekd.e0;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import android.telephony.TelephonyManager;
import skd.a;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.yxcorp.utility.b;
import com.yxcorp.utility.NetworkUtilsCached$a;
import com.yxcorp.utility.NetworkUtilsCached;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import android.telephony.CellLocation;
import android.os.Binder;
import com.yxcorp.utility.c$b;
import com.yxcorp.utility.c$a;
import android.telephony.PhoneStateListener;
import skd.a$a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class c	// class@00140b
{
    public static final String a = "c";
    public static TelephonyManager b;
    public static CellLocation c;
    public static List d;
    public static boolean e;
    public static c$b f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static final Map j;

    static {
       String str = "ENABLE_CELL_CACHE";
       try{
          c.b = e0.b.getSystemService("phone");
          c.e = a.b(e0.b, str).getBoolean(str, false);
       }catch(java.lang.Exception e0){
          Log.e(c.a, "static initializer: ", e0);
       }
       NetworkUtilsCached.m(b.b);
       c.j = new ConcurrentHashMap();
    }
    public static List a(Context p0){
       if (!NetworkUtilsCached.j()) {
          return null;
       }
       if (c.d != null && (!c.e || !c.g)) {
          TelephonyManager b = c.b;
          if (b != null) {
             c.d = LocationInterceptor.getAllCellInfo(b);
          }
       }
       return c.d;
    }
    public static CellLocation b(Context p0){
       if (!NetworkUtilsCached.j()) {
          return null;
       }
       if (c.c != null && (!c.e || !c.g)) {
          TelephonyManager b = c.b;
          if (b != null) {
             try{
                c.c = LocationInterceptor.getCellLocation(b);
             }catch(java.lang.Exception e2){
                Log.h(c.a, "getCellLocation exception:", e2);
             }catch(java.lang.ExceptionInInitializerError e2){
             }catch(java.lang.NoClassDefFoundError e2){
             }
             Log.h(c.a, "getCellLocation error:", e2);
          }
       }
    }
    public static void c(){
       if (c.e && NetworkUtilsCached.j()) {
          if (!c.g) {
             String str = 1040;
             try{
                if (c.b != null) {
                   Binder.clearCallingIdentity();
                   if (c.f == null) {
                      c.f = new c$b(null);
                   }
                   c.b.listen(c.f, str);
                   c.g = true;
                }
             }catch(java.lang.Exception e0){
                Log.d(c.a, "TelephonyManager start listen error!!");
             }
          }
       }else if(c.g && c.b != null){
          Binder.clearCallingIdentity();
          c.b.listen(c.f, 0);
          c.g = false;
          c.h = false;
          c.i = false;
       }
    }
    public static void d(boolean p0){
       c.e = p0;
       c.c();
       a$a uoa = a.b(e0.b, "ENABLE_CELL_CACHE").a();
       uoa.putBoolean("ENABLE_CELL_CACHE", p0);
       g.a(uoa);
    }
}
