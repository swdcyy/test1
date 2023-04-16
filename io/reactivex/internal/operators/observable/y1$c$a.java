package io.reactivex.internal.operators.observable.y1$c$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.y1$c;
import io.reactivex.subjects.UnicastSubject;
import java.lang.Object;
import io.reactivex.internal.observers.k;
import io.reactivex.internal.operators.observable.y1$c$b;
import io.reactivex.internal.fuseable.o;

public final class y1$c$a implements Runnable	// class@00143a
{
    public final UnicastSubject b;
    public final y1$c c;

    public void y1$c$a(y1$c p0,UnicastSubject p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       y1$c$a tc = this.c;
       tc.G.offer(new y1$c$b(this.b, false));
       if (tc.a()) {
          tc.j();
       }
       return;
    }
}
