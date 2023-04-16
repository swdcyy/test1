package io.netty.util.internal.chmv8.a;
import java.lang.Thread;
import io.netty.util.internal.chmv8.ForkJoinPool;
import java.lang.String;
import io.netty.util.internal.chmv8.ForkJoinPool$g;
import java.lang.Object;
import java.util.Objects;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Throwable;

public class a extends Thread	// class@00117f
{
    public final ForkJoinPool b;
    public final ForkJoinPool$g c;

    public void a(ForkJoinPool p0){
       super("aForkJoinWorkerThread");
       this.b = p0;
       this.c = p0.r(this);
    }
    public void run(){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       tc.c();
       ForkJoinPool$g k = tc.k;
       while (!tb.u(tc, k)) {
          int i = k << 13;
          int i1 = k ^ i;
          i = i1 >> 17;
          i1 = i1 ^ i;
          i = i1 << 5;
          i1 = i1 ^ i;
       }
       this.b.g(this, null);
       return;
    }
}
