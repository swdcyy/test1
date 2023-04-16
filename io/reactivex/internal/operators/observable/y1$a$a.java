package io.reactivex.internal.operators.observable.y1$a$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.y1$a;
import java.lang.Object;
import io.reactivex.internal.observers.k;
import io.reactivex.internal.fuseable.o;

public final class y1$a$a implements Runnable	// class@001437
{
    public final long b;
    public final y1$a parent;

    public void y1$a$a(long p0,y1$a p1){
       super();
       this.b = p0;
       this.parent = p1;
    }
    public void run(){
       y1$a$a tparent = this.parent;
       if (tparent.H == null) {
          tparent.G.offer(this);
       }else {
          tparent.V = true;
          tparent.i();
       }
       if (tparent.a()) {
          tparent.j();
       }
       return;
    }
}
