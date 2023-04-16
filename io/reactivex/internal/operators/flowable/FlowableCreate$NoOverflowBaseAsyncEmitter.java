package io.reactivex.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;
import cxd.c;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.b;

public abstract class FlowableCreate$NoOverflowBaseAsyncEmitter extends FlowableCreate$BaseEmitter	// class@001227
{
    public static final long serialVersionUID = 0x3948ba7d6479d0d1;

    public void FlowableCreate$NoOverflowBaseAsyncEmitter(c p0){
       super(p0);
    }
    public final void onNext(Object p0){
       if (this.isCancelled()) {
          return;
       }
       if (p0 == null) {
          this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          return;
       }else if(this.get()){
          this.actual.onNext(p0);
          b.c(this, 1);
       }else {
          this.onOverflow();
       }
       return;
    }
    public abstract void onOverflow();
}
