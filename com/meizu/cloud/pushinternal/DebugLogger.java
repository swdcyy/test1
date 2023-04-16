package com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.b.g;
import java.lang.Throwable;
import android.content.Context;

public class DebugLogger	// class@001485
{
    public static boolean debug;

    public void DebugLogger(){
       super();
    }
    public static void d(String p0,String p1){
       g.b().a(p0, p1);
    }
    public static void e(String p0,String p1){
       g.b().d(p0, p1);
    }
    public static void e(String p0,String p1,Throwable p2){
       g.b().a(p0, p1, p2);
    }
    public static void flush(){
       g.b().a(false);
    }
    public static void i(String p0,String p1){
       g.b().b(p0, p1);
    }
    public static void init(Context p0){
       g.b().a(p0);
    }
    public static void init(Context p0,String p1){
       g.b().a(p0, p1);
    }
    public static boolean isDebuggable(){
       return g.b().a();
    }
    public static void switchDebug(boolean p0){
       g.b().b(p0);
    }
    public static void w(String p0,String p1){
       g.b().c(p0, p1);
    }
}
