package io.reactivex.internal.operators.completable.a$a;
import brd.d;
import java.util.concurrent.atomic.AtomicBoolean;
import crd.a;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import crd.b;

public final class a$a implements d	// class@0011ff
{
    public final AtomicBoolean b;
    public final a c;
    public final d d;

    public void a$a(AtomicBoolean p0,a p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void onComplete(){
       if (this.b.compareAndSet(false, true)) {
          this.c.dispose();
          this.d.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.b.compareAndSet(false, true)) {
          this.c.dispose();
          this.d.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       this.c.c(p0);
    }
}
