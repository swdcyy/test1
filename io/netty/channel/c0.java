package io.netty.channel.c0;
import lqd.n;
import io.netty.util.concurrent.i;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.Runtime;
import java.lang.String;
import zqd.x;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Object;
import java.util.concurrent.Executor;
import io.netty.channel.d;
import io.netty.channel.r;
import io.netty.channel.e;
import lqd.m;
import yqd.e;
import java.util.concurrent.ThreadFactory;
import yqd.d;

public abstract class c0 extends i implements n	// class@00108a
{
    public static final b h;
    public static final int i;

    static {
       b uob = c.a(c0.class);
       c0.h = uob;
       int i = Math.max(1, x.d("io.netty.eventLoopThreads", (Runtime.getRuntime().availableProcessors() * 2)));
       c0.i = i;
       if (uob.isDebugEnabled()) {
          uob.debug("-Dio.netty.eventLoopThreads: {}", Integer.valueOf(i));
       }
    }
    public void c0(int p0,Executor p1,Object[] p2){
       if (!p0) {
          p0 = c0.i;
       }
       super(p0, p1, p2);
       return;
    }
    public e K0(d p0,r p1){
       return this.next().K0(p0, p1);
    }
    public e O3(d p0){
       return this.next().O3(p0);
    }
    public e b(Executor p0,Object[] p1){
       return this.m(p0, p1);
    }
    public ThreadFactory d(){
       return new d(this.getClass(), false, 10);
    }
    public abstract m m(Executor p0,Object[] p1);
    public m next(){
       return super.next();
    }
    public e next(){
       return this.next();
    }
}
