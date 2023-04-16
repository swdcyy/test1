package kj0.c;
import kj0.d;
import java.lang.String;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Integer;
import com.google.gson.JsonElement;
import java.lang.Long;

public final class c	// class@002d44
{

    public static boolean a(d p0,String p1,String p2,boolean p3){
       return p0.a(p1, p2, Boolean.TYPE, Boolean.valueOf(p3)).booleanValue();
    }
    public static boolean b(d p0,String p1,boolean p2){
       return p0.f(null, p1, p2);
    }
    public static int c(d p0,String p1,int p2){
       return p0.d(null, p1, p2);
    }
    public static int d(d p0,String p1,String p2,int p3){
       return p0.a(p1, p2, Integer.TYPE, Integer.valueOf(p3)).intValue();
    }
    public static JsonElement e(d p0,String p1,JsonElement p2){
       return p0.b(null, p1, p2);
    }
    public static JsonElement f(d p0,String p1,String p2,JsonElement p3){
       return p3;
    }
    public static long g(d p0,String p1,long p2){
       return p0.e(null, p1, p2);
    }
    public static long h(d p0,String p1,String p2,long p3){
       return p0.a(p1, p2, Long.TYPE, Long.valueOf(p3)).longValue();
    }
    public static String i(d p0,String p1,String p2){
       return p0.c(null, p1, p2);
    }
    public static String j(d p0,String p1,String p2,String p3){
       return p0.a(p1, p2, String.class, p3);
    }
    public static Object k(d p0,String p1,String p2,Type p3,Object p4){
       return p4;
    }
    public static Object l(d p0,String p1,Type p2,Object p3){
       return p0.a(null, p1, p2, p3);
    }
}
