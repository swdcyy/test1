package io.reactivex.internal.operators.observable.x1$b;
import grd.c;
import io.reactivex.internal.operators.observable.x1$c;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.observers.k;
import io.reactivex.internal.operators.observable.x1$d;
import io.reactivex.subjects.UnicastSubject;
import io.reactivex.internal.fuseable.o;

public final class x1$b extends c	// class@001430
{
    public final x1$c parent;

    public void x1$b(x1$c p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       this.parent.onComplete();
    }
    public void onError(Throwable p0){
       this.parent.k(p0);
    }
    public void onNext(Object p0){
       x1$b tparent = this.parent;
       tparent.G.offer(new x1$d(null, p0));
       if (tparent.a()) {
          tparent.j();
       }
       return;
    }
}
