package io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter;
import brd.j;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.n;
import brd.g;
import ird.a;
import java.lang.NullPointerException;
import java.lang.String;
import erd.f;
import crd.b;

public final class FlowableCreate$SerializedEmitter extends AtomicInteger implements j	// class@001228
{
    public boolean done;
    public final FlowableCreate$BaseEmitter emitter;
    public final AtomicThrowable error;
    public final n queue;
    public static final long serialVersionUID = 0x43c4fdd95fbcd5c6;

    public void FlowableCreate$SerializedEmitter(FlowableCreate$BaseEmitter p0){
       super();
       this.emitter = p0;
       this.error = new AtomicThrowable();
       this.queue = new a(16);
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          this.drainLoop();
       }
       return;
    }
    public void drainLoop(){
       FlowableCreate$SerializedEmitter temitter = this.emitter;
       FlowableCreate$SerializedEmitter tqueue = this.queue;
       FlowableCreate$SerializedEmitter terror = this.error;
       int i = 1;
       while (true) {
          if (temitter.isCancelled()) {
             tqueue.clear();
             return;
          }else if(terror.get() != null){
             tqueue.clear();
             temitter.onError(terror.terminate());
             return;
          }else {
             FlowableCreate$SerializedEmitter tdone = this.done;
             Object obj = tqueue.poll();
             int i1 = (obj == null)? 1: 0;
             if (tdone != null && i1) {
                temitter.onComplete();
                return;
             }else if(i1){
                i = - i;
                if (!this.addAndGet(i)) {
                   break ;
                }
             }else {
                temitter.onNext(obj);
             }
          }
       }
       return;
    }
    public boolean isCancelled(){
       return this.emitter.isCancelled();
    }
    public void onComplete(){
       if (!this.emitter.isCancelled() && this.done == null) {
          this.done = true;
          this.drain();
       }
       return;
    }
    public void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.emitter.isCancelled() || this.done != null) {
          return;
       }
       if (p0 == null) {
          this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          return;
       }else if(!this.get() && this.compareAndSet(0, 1)){
          this.emitter.onNext(p0);
          if (!this.decrementAndGet()) {
             return;
          }
       }else {
          FlowableCreate$SerializedEmitter tqueue = this.queue;
          _monitor_enter(tqueue);
          tqueue.offer(p0);
          _monitor_exit(tqueue);
          if (this.getAndIncrement()) {
             return;
          }
       }
       this.drainLoop();
       return;
    }
    public long requested(){
       return this.emitter.requested();
    }
    public j serialize(){
       return this;
    }
    public void setCancellable(f p0){
       this.emitter.setCancellable(p0);
    }
    public void setDisposable(b p0){
       this.emitter.setDisposable(p0);
    }
    public String toString(){
       return this.emitter.toString();
    }
    public boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       if (!this.emitter.isCancelled() && this.done == null) {
          if (p0 == null) {
             nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
          }
          if (this.error.addThrowable(nullPointerE)) {
             this.done = true;
             this.drain();
             return true;
          }
       }
    label_0026 :
       return false;
    }
}
