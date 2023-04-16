package com.vivo.push.util.p;
import com.vivo.push.util.n;
import java.lang.String;
import com.vivo.push.util.o;
import java.lang.Throwable;
import android.content.Context;
import com.vivo.push.util.z;
import java.lang.Object;

public final class p	// class@0010be
{
    public static final o a;
    public static boolean b;
    public static boolean c;

    static {
       p.a = new n();
       p.b();
    }
    public static int a(String p0,String p1){
       return p.a.a(p0, p1);
    }
    public static int a(String p0,String p1,Throwable p2){
       return p.a.a(p0, p1, p2);
    }
    public static int a(String p0,Throwable p1){
       return p.a.a(p0, p1);
    }
    public static String a(Throwable p0){
       return p.a.a(p0);
    }
    public static void a(Context p0,String p1){
       p.a.a(p0, p1);
    }
    public static void a(boolean p0){
       p.b();
       p.c = p0;
    }
    public static boolean a(){
       if (p.b && p.c) {
          return true;
       }
       return false;
    }
    public static int b(String p0,String p1){
       return p.a.b(p0, p1);
    }
    public static int b(String p0,String p1,Throwable p2){
       return p.a.b(p0, p1, p2);
    }
    public static void b(){
       p.b = (z.b("persist.sys.log.ctrl", "no")).equals("yes");
    }
    public static void b(Context p0,String p1){
       p.a.b(p0, p1);
    }
    public static int c(String p0,String p1){
       return p.a.c(p0, p1);
    }
    public static void c(Context p0,String p1){
       p.a.c(p0, p1);
    }
    public static int d(String p0,String p1){
       return p.a.d(p0, p1);
    }
    public static int e(String p0,String p1){
       return p.a.e(p0, p1);
    }
}
