package io.reactivex.internal.operators.completable.j$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.completable.j;
import java.util.concurrent.atomic.AtomicBoolean;
import crd.a;
import brd.d;
import java.lang.Object;
import java.util.concurrent.TimeoutException;
import java.lang.Throwable;
import io.reactivex.internal.operators.completable.j$a$a;
import brd.e;

public final class j$a implements Runnable	// class@00120d
{
    public final AtomicBoolean b;
    public final a c;
    public final d d;
    public final j e;

    public void j$a(j p0,AtomicBoolean p1,a p2,d p3){
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void run(){
       if (this.b.compareAndSet(false, true)) {
          this.c.d();
          j f = this.e.f;
          if (f == null) {
             this.d.onError(new TimeoutException());
          }else {
             f.a(new j$a$a(this));
          }
       }
       return;
    }
}
