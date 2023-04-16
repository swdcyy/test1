package c.t.m.g.ca;
import android.content.SharedPreferences;
import android.content.Context;
import c.t.m.g.be;
import java.lang.String;
import oe6.o;
import java.lang.Object;
import android.content.SharedPreferences$Editor;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;
import oe6.g;
import c.t.m.g.bi;
import c.t.m.g.by;

public class ca	// class@000c01
{
    public static SharedPreferences a;

    public static synchronized SharedPreferences a(){
       _monitor_enter(ca.class);
       if (ca.a == null) {
          ca.a = o.c(be.a(), "LocationSDK", 0);
       }
       _monitor_exit(ca.class);
       return ca.a;
    }
    public static SharedPreferences a(String p0){
       if (("LocationSDK").equals(p0)) {
          return ca.a();
       }
       int i = 0;
       if (("com.tencent.mobileqq").equals(be.a().getPackageName())) {
          i = 4;
       }
       return o.c(be.a(), p0, i);
    }
    public static void a(SharedPreferences p0,String p1,Object p2){
       SharedPreferences$Editor uEditor = p0.edit();
       if (p2 instanceof String) {
          uEditor.putString(p1, p2);
       }else if(p2 instanceof Integer){
          uEditor.putInt(p1, p2.intValue());
       }else if(p2 instanceof Boolean){
          uEditor.putBoolean(p1, p2.booleanValue());
       }else if(p2 instanceof Float){
          uEditor.putFloat(p1, p2.floatValue());
       }else if(p2 instanceof Long){
          uEditor.putLong(p1, p2.longValue());
       }else {
          uEditor.putString(p1, p2.toString());
       }
       g.a(uEditor);
       return;
    }
    public static void a(SharedPreferences p0,String p1,String p2){
       ca.a(p0, p1, bi.a(p2));
    }
    public static void a(String p0,String p1,Object p2){
       ca.a(ca.a(p0), p1, p2);
    }
    public static Object b(SharedPreferences p0,String p1,Object p2){
       if (p2 instanceof String) {
          return p0.getString(p1, p2);
       }
       if (p2 instanceof Integer) {
          return Integer.valueOf(p0.getInt(p1, p2.intValue()));
       }
       if (p2 instanceof Boolean) {
          return Boolean.valueOf(p0.getBoolean(p1, p2.booleanValue()));
       }
       if (p2 instanceof Float) {
          return Float.valueOf(p0.getFloat(p1, p2.floatValue()));
       }
       if (p2 instanceof Long) {
          return Long.valueOf(p0.getLong(p1, p2.longValue()));
       }
       return null;
    }
    public static Object b(String p0,String p1,Object p2){
       return ca.b(ca.a(p0), p1, p2);
    }
    public static String b(SharedPreferences p0,String p1,String p2){
       String str = ca.b(p0, p1, "");
       if (by.a(str)) {
          return p2;
       }
       str = bi.b(str);
       if (!by.a(str)) {
          p2 = str;
       }
       return p2;
    }
}
