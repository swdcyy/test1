package com.kwai.logger.KwaiLog;
import java.lang.Object;
import q87.d;
import r87.l;
import java.util.List;
import r87.k;
import java.lang.Runnable;
import f97.a;
import com.kwai.logger.internal.LogService;
import q87.b;
import r87.c;
import java.lang.String;
import java.lang.Throwable;
import android.content.Context;
import r87.j;
import android.util.Log;

public final class KwaiLog	// class@000d23
{
    public static b a;
    public static Context b;
    public static boolean c;
    public static long d;
    public static String e;

    public void KwaiLog(){
       super();
    }
    public static void a(d p0){
       if (KwaiLog.a != null && l.c) {
          if (!l.b.isEmpty()) {
             l.a(p0);
             a.a(k.b);
          }else {
             LogService.a(p0);
          }
          if (KwaiLog.a.a() && l.a != null) {
             String str = new String(new c().a(p0));
          }
       }else {
          l.a(p0);
       }
       return;
    }
    public static void addLog(int p0,String p1,String p2,Object[] p3){
       KwaiLog.addLogModule("KwaiLog", p0, p1, p2, p3);
    }
    public static void addLogModule(String p0,int p1,String p2,String p3,Object[] p4){
       KwaiLog.a(KwaiLog.k(p0, p1, p3, p2, p4));
    }
    public static void b(String p0,String p1,Object[] p2){
       KwaiLog.c("KwaiLog", p0, p1, p2);
    }
    public static void c(String p0,String p1,String p2,Object[] p3){
       KwaiLog.a(KwaiLog.k(p0, 2, p1, p2, p3));
    }
    public static void d(String p0,String p1,Throwable p2){
       KwaiLog.f("KwaiLog", p0, p1, p2);
    }
    public static void e(String p0,String p1,Object[] p2){
       KwaiLog.g("KwaiLog", p0, p1, p2);
    }
    public static void f(String p0,String p1,String p2,Throwable p3){
       KwaiLog.a(KwaiLog.j(p0, 16, p1, p2, p3));
    }
    public static void g(String p0,String p1,String p2,Object[] p3){
       KwaiLog.a(KwaiLog.k(p0, 16, p1, p2, p3));
    }
    public static Context h(){
       return KwaiLog.b;
    }
    public static b i(){
       return KwaiLog.a;
    }
    public static d j(String p0,int p1,String p2,String p3,Throwable p4){
       d uod = j.b(p1, p3, p2);
       uod.e = p0;
       if (p4 != null) {
          uod.f = Log.getStackTraceString(p4);
       }
       return uod;
    }
    public static d k(String p0,int p1,String p2,String p3,Object[] p4){
       return j.c(p0, p1, p2, p3, p4);
    }
    public static void l(String p0,String p1,Object[] p2){
       KwaiLog.m("KwaiLog", p0, p1, p2);
    }
    public static void m(String p0,String p1,String p2,Object[] p3){
       KwaiLog.a(KwaiLog.k(p0, 4, p1, p2, p3));
    }
    public static void n(String p0,String p1,Object[] p2){
       KwaiLog.o("KwaiLog", p0, p1, p2);
    }
    public static void o(String p0,String p1,String p2,Object[] p3){
       KwaiLog.a(KwaiLog.k(p0, 8, p1, p2, p3));
    }
}
