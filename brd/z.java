package brd.z;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import brd.z$c;
import java.lang.System;
import java.lang.Runnable;
import crd.b;
import ird.a;
import brd.z$a;
import brd.z$b;
import io.reactivex.internal.disposables.EmptyDisposable;

public abstract class z	// class@00034d
{
    public static final long a;

    static {
       z.a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }
    public void z(){
       super();
    }
    public abstract z$c b();
    public long c(TimeUnit p0){
       return p0.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    public b d(Runnable p0){
       return this.e(p0, 0, TimeUnit.NANOSECONDS);
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       z$c uoc = this.b();
       z$a uoa = new z$a(a.m(p0), uoc);
       uoc.c(uoa, p1, p2);
       return uoa;
    }
    public b f(Runnable p0,long p1,long p2,TimeUnit p3){
       z$c uoc = this.b();
       z$b uob = new z$b(a.m(p0), uoc);
       b uob1 = uoc.d(uob, p1, p2, p3);
       if (uob1 == EmptyDisposable.INSTANCE) {
          return uob1;
       }
       return uob;
    }
    public void g(){
    }
}
