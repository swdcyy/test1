package com.meizu.cloud.pushsdk.d.f.c;
import java.lang.String;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.Object;
import com.meizu.cloud.pushsdk.d.f.b;
import com.meizu.cloud.pushinternal.DebugLogger;

public class c	// class@001528
{
    public static int a;

    public static String a(){
       return Thread.currentThread().getName();
    }
    public static String a(String p0){
       return "PushTracker->"+p0;
    }
    public static String a(String p0,Object[] p1){
       return c.a()+"|"+String.format(p0, p1);
    }
    public static void a(b p0){
       c.a = p0.a();
    }
    public static void a(String p0,String p1,Object[] p2){
       if (c.a >= b.b.a()) {
          DebugLogger.e(c.a(p0), c.a(p1, p2));
       }
       return;
    }
    public static void b(String p0,String p1,Object[] p2){
       if (c.a >= b.c.a()) {
          DebugLogger.d(c.a(p0), c.a(p1, p2));
       }
       return;
    }
    public static void c(String p0,String p1,Object[] p2){
       if (c.a >= b.d.a()) {
          DebugLogger.i(c.a(p0), c.a(p1, p2));
       }
       return;
    }
}
