package com.meizu.cloud.pushsdk.b.c.c;
import java.lang.Object;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import com.meizu.cloud.pushsdk.b.c.c$1;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Thread$UncaughtExceptionHandler;

public final class c	// class@0014ab
{
    public String a;
    public Boolean b;
    public Integer c;
    public Thread$UncaughtExceptionHandler d;
    public ThreadFactory e;

    public void c(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
    }
    public static ThreadFactory a(c p0){
       c a = p0.a;
       c b = p0.b;
       c c = p0.c;
       c d = p0.d;
       p0 = p0.e;
       if (p0 != null) {
       }else {
          ThreadFactory threadFactor = Executors.defaultThreadFactory();
       }
       c uoc = p0;
       AtomicLong uAtomicLong = (a != null)? new AtomicLong(0): null;
       c$1 u1 = new c$1(uoc, a, uAtomicLong, b, c, d);
       return uAtomicLong;
    }
    public c a(Integer p0){
       this.c = p0;
       return this;
    }
    public c a(String p0){
       Object[] objArray = new Object[]{Integer.valueOf(0)};
       String.format(p0, objArray);
       this.a = p0;
       return this;
    }
    public ThreadFactory a(){
       return c.a(this);
    }
}
