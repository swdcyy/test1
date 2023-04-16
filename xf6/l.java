package xf6.l;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import vid.b;
import xf6.l$a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.IllegalArgumentException;

public final class l	// class@0027fd
{
    public static SharedPreferences a;
    public static ConcurrentHashMap b;

    static {
       l.a = b.c(a.b(), "TEST_CONFIG", 4);
    }
    public static void a(String p0,l$a p1){
       if (l.b == null) {
          l.b = new ConcurrentHashMap();
       }
       l.b.put(p0, p1);
       return;
    }
    public static void b(String p0,Object p1){
       ConcurrentHashMap b = l.b;
       if (b == null) {
          return;
       }
       l$a uoa = b.get(p0);
       if (uoa == null) {
          return;
       }
       uoa.onChanged(p1);
       return;
    }
    public static boolean c(String p0,boolean p1){
       return l.a.getBoolean(p0, p1);
    }
    public static float d(String p0,float p1){
       return l.a.getFloat(p0, p1);
    }
    public static int e(String p0,int p1){
       return l.a.getInt(p0, p1);
    }
    public static long f(String p0,long p1){
       return l.a.getLong(p0, p1);
    }
    public static String g(String p0,String p1){
       return l.a.getString(p0, p1);
    }
    public static void h(String p0,boolean p1){
       l.b(p0, Boolean.valueOf(p1));
       g.a(l.a.edit().putBoolean(p0, p1));
    }
    public static void i(String p0,int p1){
       l.b(p0, Integer.valueOf(p1));
       g.a(l.a.edit().putInt(p0, p1));
    }
    public static void j(String p0,long p1){
       l.b(p0, Long.valueOf(p1));
       g.a(l.a.edit().putLong(p0, p1));
    }
    public static void k(String p0,String p1){
       l.b(p0, p1);
       g.a(l.a.edit().putString(p0, p1));
    }
    public static void l(String p0,Object p1){
       if (p1 instanceof Boolean) {
          l.h(p0, p1.booleanValue());
       }else if(p1 instanceof Integer){
          l.i(p0, p1.intValue());
       }else if(p1 instanceof Long){
          l.j(p0, p1.longValue());
       }else if(p1 instanceof Float){
          float f = p1.floatValue();
          l.b(p0, Float.valueOf(f));
          g.a(l.a.edit().putFloat(p0, f));
       }else if(p1 instanceof String){
          l.k(p0, p1);
       }else {
          throw new IllegalArgumentException("value type not support");
       }
       return;
    }
}
