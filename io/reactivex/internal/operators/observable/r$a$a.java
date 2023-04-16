package io.reactivex.internal.operators.observable.r$a$a;
import grd.c;
import io.reactivex.internal.operators.observable.r$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.y;
import java.lang.Throwable;
import ird.a;

public final class r$a$a extends c	// class@0013f8
{
    public final long b;
    public final Object c;
    public boolean d;
    public final AtomicBoolean e;
    public final r$a parent;

    public void r$a$a(r$a p0,long p1,Object p2){
       super();
       this.e = new AtomicBoolean();
       this.parent = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(){
       if (this.e.compareAndSet(false, true)) {
          r$a$a tparent = this.parent;
          r$a$a tc = this.c;
          if (!this.b - tparent.e) {
             tparent.actual.onNext(tc);
          }
       }
       return;
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.a();
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.parent.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.dispose();
       this.a();
       return;
    }
}
