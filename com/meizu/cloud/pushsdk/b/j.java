package com.meizu.cloud.pushsdk.b.j;
import java.lang.Object;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import com.meizu.cloud.pushsdk.b.j$1;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Thread$UncaughtExceptionHandler;

public final class j	// class@0014b6
{
    public String a;
    public Boolean b;
    public Integer c;
    public Thread$UncaughtExceptionHandler d;
    public ThreadFactory e;

    public void j(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
    }
    public static ThreadFactory a(j p0){
       j a = p0.a;
       j b = p0.b;
       j c = p0.c;
       j d = p0.d;
       p0 = p0.e;
       if (p0 != null) {
       }else {
          ThreadFactory threadFactor = Executors.defaultThreadFactory();
       }
       j oj = p0;
       AtomicLong uAtomicLong = (a != null)? new AtomicLong(0): null;
       j$1 u1 = new j$1(oj, a, uAtomicLong, b, c, d);
       return uAtomicLong;
    }
    public j a(String p0){
       Object[] objArray = new Object[]{Integer.valueOf(0)};
       String.format(p0, objArray);
       this.a = p0;
       return this;
    }
    public ThreadFactory a(){
       return j.a(this);
    }
}
