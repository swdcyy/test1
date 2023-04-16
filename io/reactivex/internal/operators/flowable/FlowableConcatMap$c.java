package io.reactivex.internal.operators.flowable.FlowableConcatMap$c;
import cxd.d;
import java.lang.Object;
import cxd.c;

public final class FlowableConcatMap$c implements d	// class@00121f
{
    public final c actual;
    public final Object b;
    public boolean c;

    public void FlowableConcatMap$c(Object p0,c p1){
       super();
       this.b = p0;
       this.actual = p1;
    }
    public void cancel(){
    }
    public void request(long p0){
       if (p0 > 0 && this.c == null) {
          this.c = true;
          FlowableConcatMap$c tactual = this.actual;
          tactual.onNext(this.b);
          tactual.onComplete();
       }
       return;
    }
}
