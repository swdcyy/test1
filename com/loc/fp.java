package com.loc.fp;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Throwable;
import com.loc.fj;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class fp	// class@001436
{

    public static int a(Context p0,String p1,String p2,int p3){
       p3 = o.c(p0, p1, 0).getInt(p2, p3);
       return p3;
    }
    public static long a(Context p0,String p1,String p2,long p3){
       p3 = o.c(p0, p1, 0).getLong(p2, p3);
       return p3;
    }
    public static SharedPreferences$Editor a(Context p0,String p1){
       return o.c(p0, p1, 0).edit();
    }
    public static String a(Context p0){
       if (p0 == null) {
          return "00:00:00:00:00:00";
       }
       return fp.a(p0, "pref", "smac", "00:00:00:00:00:00");
    }
    public static String a(Context p0,String p1,String p2,String p3){
       p3 = o.c(p0, p1, 0).getString(p2, p3);
       return p3;
    }
    public static void a(SharedPreferences$Editor p0){
       if (p0 == null) {
          return;
       }
       g.a(p0);
       return;
    }
    public static void a(SharedPreferences$Editor p0,String p1){
       p0.remove(p1);
    }
    public static void a(SharedPreferences$Editor p0,String p1,int p2){
       p0.putInt(p1, p2);
    }
    public static void a(SharedPreferences$Editor p0,String p1,long p2){
       p0.putLong(p1, p2);
    }
    public static void a(SharedPreferences$Editor p0,String p1,String p2){
       p0.putString(p1, p2);
    }
    public static void a(SharedPreferences$Editor p0,String p1,boolean p2){
       p0.putBoolean(p1, p2);
    }
    public static boolean a(Context p0,String p1,String p2,boolean p3){
       p3 = o.c(p0, p1, 0).getBoolean(p2, p3);
       return p3;
    }
}
