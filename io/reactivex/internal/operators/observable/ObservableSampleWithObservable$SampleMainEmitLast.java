package io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainEmitLast;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver;
import brd.y;
import brd.w;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableSampleWithObservable$SampleMainEmitLast extends ObservableSampleWithObservable$SampleMainObserver	// class@00135b
{
    public boolean done;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0xd5f42546acf217d7;

    public void ObservableSampleWithObservable$SampleMainEmitLast(y p0,w p1){
       super(p0, p1);
       this.wip = new AtomicInteger();
    }
    public void completeMain(){
       this.done = true;
       if (!this.wip.getAndIncrement()) {
          this.emit();
          this.actual.onComplete();
       }
       return;
    }
    public void completeOther(){
       this.done = true;
       if (!this.wip.getAndIncrement()) {
          this.emit();
          this.actual.onComplete();
       }
       return;
    }
    public void run(){
       if (!this.wip.getAndIncrement()) {
          while (true) {
             this.emit();
             if (this.done != null) {
                this.actual.onComplete();
                return;
             }else if(!this.wip.decrementAndGet()){
             }
          }
       }
       return;
    }
}
