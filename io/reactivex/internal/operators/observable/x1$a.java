package io.reactivex.internal.operators.observable.x1$a;
import grd.c;
import io.reactivex.internal.operators.observable.x1$c;
import io.reactivex.subjects.UnicastSubject;
import crd.b;
import crd.a;
import io.reactivex.internal.observers.k;
import io.reactivex.internal.operators.observable.x1$d;
import java.lang.Object;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import ird.a;

public final class x1$a extends c	// class@00142f
{
    public final UnicastSubject b;
    public boolean c;
    public final x1$c parent;

    public void x1$a(x1$c p0,UnicastSubject p1){
       super();
       this.parent = p0;
       this.b = p1;
    }
    public void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       x1$a tparent = this.parent;
       tparent.N.b(this);
       tparent.G.offer(new x1$d(this.b, null));
       if (tparent.a()) {
          tparent.j();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.c != null) {
          a.l(p0);
          return;
       }else {
          this.c = true;
          this.parent.k(p0);
          return;
       }
    }
    public void onNext(Object p0){
       this.dispose();
       this.onComplete();
    }
}
