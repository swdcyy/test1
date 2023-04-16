package com.cmic.sso.sdk.e.k;
import java.lang.String;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import com.cmic.sso.sdk.e.d;
import com.cmic.sso.sdk.e.k$a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class k	// class@000f65
{
    public static Context a;

    public static int a(String p0,int p1){
       return o.c(k.a, "ssoconfigs", 0).getInt(d.a(p0), p1);
    }
    public static int a(String p0,String p1,int p2){
       return o.c(k.a, p0, 0).getInt(d.a(p1), p2);
    }
    public static long a(String p0,long p1){
       return o.c(k.a, "ssoconfigs", 0).getLong(d.a(p0), p1);
    }
    public static long a(String p0,String p1,long p2){
       return o.c(k.a, p0, 0).getLong(d.a(p1), p2);
    }
    public static k$a a(){
       return new k$a(o.c(k.a, "ssoconfigs", 0).edit());
    }
    public static k$a a(String p0){
       return new k$a(o.c(k.a, p0, 0).edit());
    }
    public static String a(String p0,String p1,String p2){
       return o.c(k.a, p0, 0).getString(d.a(p1), p2);
    }
    public static void a(Context p0){
       k.a = p0.getApplicationContext();
    }
    public static void a(String p0,String p1){
       g.b(o.c(k.a, "ssoconfigs", 0).edit().putString(d.a(p0), p1));
    }
    public static String b(String p0,String p1){
       return o.c(k.a, "ssoconfigs", 0).getString(d.a(p0), p1);
    }
}
