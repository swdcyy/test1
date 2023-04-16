package brd.z$c;
import crd.b;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import java.lang.Runnable;
import io.reactivex.internal.disposables.SequentialDisposable;
import ird.a;
import brd.z$c$a;
import io.reactivex.internal.disposables.EmptyDisposable;

public abstract class z$c implements b	// class@00034c
{

    public void z$c(){
       super();
    }
    public long a(TimeUnit p0){
       return p0.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
    public b b(Runnable p0){
       return this.c(p0, 0, TimeUnit.NANOSECONDS);
    }
    public abstract b c(Runnable p0,long p1,TimeUnit p2);
    public b d(Runnable p0,long p1,long p2,TimeUnit p3){
       z$c uoc = this;
       long l = p1;
       TimeUnit timeUnit = p3;
       SequentialDisposable sequentialDi = new SequentialDisposable();
       SequentialDisposable sequentialDi1 = new SequentialDisposable(sequentialDi);
       long l1 = uoc.a(TimeUnit.NANOSECONDS);
       z$c$a uoc$a = v7;
       SequentialDisposable sequentialDi2 = sequentialDi;
       z$c$a uoc$a1 = v7;
       uoc$a = new z$c$a(this, (l1 + timeUnit.toNanos(l)), a.m(p0), l1, sequentialDi1, timeUnit.toNanos(p2));
       b uob = uoc.c(uoc$a1, l, timeUnit);
       if (uob == EmptyDisposable.INSTANCE) {
          return uob;
       }
       sequentialDi2.replace(uob);
       return sequentialDi1;
    }
}
