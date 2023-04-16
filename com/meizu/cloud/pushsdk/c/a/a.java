package com.meizu.cloud.pushsdk.c.a.a;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;

public class a	// class@0014b8
{
    public static boolean a = false;
    public static String b;

    public static void a(){
       a.a = true;
    }
    public static void a(String p0){
       if (a.a) {
          DebugLogger.d(a.b, p0);
       }
       return;
    }
    public static void b(String p0){
       if (a.a) {
          DebugLogger.i(a.b, p0);
       }
       return;
    }
}
