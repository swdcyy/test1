package com.loc.ci$a;
import java.lang.Object;
import com.loc.ci;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Thread$UncaughtExceptionHandler;

public final class ci$a	// class@0013bb
{
    public ThreadFactory a;
    public Thread$UncaughtExceptionHandler b;
    public String c;
    public Integer d;
    public Boolean e;
    public int f;
    public int g;
    public int h;
    public BlockingQueue i;

    public void ci$a(){
       super();
       this.f = ci.e();
       this.g = ci.f();
       this.h = 30;
    }
    public static ThreadFactory a(ci$a p0){
       return p0.a;
    }
    public static int b(ci$a p0){
       return p0.f;
    }
    public static int c(ci$a p0){
       return p0.h;
    }
    public static BlockingQueue d(ci$a p0){
       return p0.i;
    }
    public static String e(ci$a p0){
       return p0.c;
    }
    public static Integer f(ci$a p0){
       return p0.d;
    }
    public static Boolean g(ci$a p0){
       return p0.e;
    }
    public static Thread$UncaughtExceptionHandler h(ci$a p0){
       return p0.b;
    }
    public final ci$a a(String p0){
       this.c = p0;
       return this;
    }
    public final ci a(){
       this.b();
       return new ci(this, 0);
    }
    public final void b(){
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
    }
}
