package com.sina.weibo.sdk.a.a;
import java.lang.Runtime;
import com.sina.weibo.sdk.a.a$1;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import com.sina.weibo.sdk.a.c;
import com.sina.weibo.sdk.a.c$b;
import com.sina.weibo.sdk.a.c$4;
import java.lang.IllegalStateException;
import java.lang.String;
import com.sina.weibo.sdk.a.c$d;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public final class a	// class@000b8c
{
    public ThreadPoolExecutor H;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final Comparator I;

    static {
       int i = Runtime.getRuntime().availableProcessors();
       a.E = i;
       a.F = i + 1;
       a.G = (i * 2) + 1;
       a.I = new a$1();
    }
    public void a(){
       super();
       if (this.H == null) {
          ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(a.F, a.G, 1, TimeUnit.SECONDS, new PriorityBlockingQueue(5, a.I));
          this.H = v0;
       }
       return;
    }
    public final void a(c p0){
       a tH = this.H;
       if (p0.L != c$b.U) {
          int i = c$4.R[(p0.L - 1)];
          if (i != 1) {
             if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed \(a task can be executed only once\)");
             }
          }else {
             throw new IllegalStateException("Cannot execute task: the task is already running.");
          }
       }
       p0.L = c$b.V;
       c m = p0.M;
       m.Y = p0.P;
       m.priority = p0.O;
       tH.execute(p0.N);
       return;
    }
}
