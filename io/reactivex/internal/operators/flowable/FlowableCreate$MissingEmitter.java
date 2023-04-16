package io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;
import cxd.c;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;

public final class FlowableCreate$MissingEmitter extends FlowableCreate$BaseEmitter	// class@001226
{
    public static final long serialVersionUID = 0x34699b00190316f1;

    public void FlowableCreate$MissingEmitter(c p0){
       super(p0);
    }
    public void onNext(Object p0){
       if (this.isCancelled()) {
          return;
       }
       if (p0 != null) {
          this.actual.onNext(p0);
          long l = this.get();
          while (l) {
             long l1 = l - 1;
             if (this.compareAndSet(l, l1)) {
                break ;
             }
          }
          return;
       }else {
          this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          return;
       }
    }
}
