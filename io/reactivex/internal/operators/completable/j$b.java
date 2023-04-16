package io.reactivex.internal.operators.completable.j$b;
import brd.d;
import crd.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import crd.b;

public final class j$b implements d	// class@00120e
{
    public final a b;
    public final AtomicBoolean c;
    public final d d;

    public void j$b(a p0,AtomicBoolean p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void onComplete(){
       if (this.c.compareAndSet(false, true)) {
          this.b.dispose();
          this.d.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.c.compareAndSet(false, true)) {
          this.b.dispose();
          this.d.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       this.b.c(p0);
    }
}
