package zf6.k;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import q0.d;
import android.content.SharedPreferences;
import zf6.k$a;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import zf6.k$b;
import zf6.m;
import android.content.Context;
import android.content.res.Configuration;
import zf6.l;

public class k	// class@002934
{
    public static Application a;
    public static k$a b;
    public static String c;
    public static k$b d;
    public static int e;
    public static boolean f;
    public static Boolean g;
    public static Boolean h;
    public static n i;
    public static m j;
    public static boolean k;

    public static void a(boolean p0){
       Log.g("DayNightSettings", "applyDayNight: "+p0);
       if (p0) {
          d.J(2);
       }else {
          d.J(1);
       }
       return;
    }
    public static String b(String p0){
       return p0+"_"+k.c;
    }
    public static boolean c(String p0){
       String str = k.b(p0);
       SharedPreferences sharedPrefer = k.b.a("DefaultPreferenceHelper");
       if (sharedPrefer != null && sharedPrefer.contains(str)) {
          return sharedPrefer.getBoolean(str, false);
       }
       sharedPrefer = k.b.a("DayNightSettings");
       if (sharedPrefer == null) {
          return false;
       }
       boolean booleanx = sharedPrefer.getBoolean(str, false);
       k.h(p0, booleanx);
       return booleanx;
    }
    public static boolean d(){
       if (k.e == 1) {
          return false;
       }
       Boolean g = k.g;
       if (g != null) {
          return g.booleanValue();
       }
       if (k.b == null) {
          return false;
       }
       g = Boolean.valueOf(k.c("dayNightMode"));
       k.g = g;
       return g.booleanValue();
    }
    public static boolean e(){
       boolean b = (k.f && k.d())? true: false;
       return b;
    }
    public static boolean f(){
       return k.k;
    }
    public static boolean g(){
       return k.f;
    }
    public static void h(String p0,boolean p1){
       SharedPreferences sharedPrefer = k.b.a("DefaultPreferenceHelper");
       if (sharedPrefer != null) {
          g.a(sharedPrefer.edit().putBoolean(k.b(p0), p1));
       }
       return;
    }
    public static void i(boolean p0){
       k$b d = k.d;
       if (d != null) {
          k.c = d.getUid();
       }
       Boolean g = k.g;
       String str = (g != null && p0 != g.booleanValue())? 1: null;
       k.g = Boolean.valueOf(p0);
       k.h("dayNightMode", p0);
       m j = k.j;
       if (j != null && str) {
          j.a(p0);
       }
       k.a(p0);
       l.t(k.a, "12");
       return;
    }
}
