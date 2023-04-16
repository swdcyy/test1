package io.reactivex.internal.operators.parallel.ParallelFromPublisher;
import hrd.a;
import cxd.b;
import cxd.c;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher;

public final class ParallelFromPublisher extends a	// class@001447
{
    public final b a;
    public final int b;
    public final int c;

    public void ParallelFromPublisher(b p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public int b(){
       return this.b;
    }
    public void e(c[] p0){
       if (!this.f(p0)) {
          return;
       }
       this.a.subscribe(new ParallelFromPublisher$ParallelDispatcher(p0, this.c));
       return;
    }
}
