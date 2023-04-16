package io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;
import brd.j;
import cxd.d;
import java.util.concurrent.atomic.AtomicLong;
import cxd.c;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.String;
import ird.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter;
import erd.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import crd.b;
import java.lang.Object;
import java.lang.Class;

public abstract class FlowableCreate$BaseEmitter extends AtomicLong implements j, d	// class@001221
{
    public final c actual;
    public final SequentialDisposable serial;
    public static final long serialVersionUID = 0x65ac35ee8a56a4bf;

    public void FlowableCreate$BaseEmitter(c p0){
       super();
       this.actual = p0;
       this.serial = new SequentialDisposable();
    }
    public final void cancel(){
       this.serial.dispose();
       this.onUnsubscribed();
    }
    public void complete(){
       if (this.isCancelled()) {
          return;
       }
       this.actual.onComplete();
       this.serial.dispose();
       return;
    }
    public boolean error(Throwable p0){
       NullPointerException nullPointerE;
       if (p0 == null) {
          nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       }
       if (this.isCancelled()) {
          return false;
       }else {
          this.actual.onError(nullPointerE);
          this.serial.dispose();
          return true;
       }
    }
    public final boolean isCancelled(){
       return this.serial.isDisposed();
    }
    public void onComplete(){
       this.complete();
    }
    public final void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          a.l(p0);
       }
       return;
    }
    public void onRequested(){
    }
    public void onUnsubscribed(){
    }
    public final void request(long p0){
       if (SubscriptionHelper.validate(p0)) {
          b.a(this, p0);
          this.onRequested();
       }
       return;
    }
    public final long requested(){
       return this.get();
    }
    public final j serialize(){
       return new FlowableCreate$SerializedEmitter(this);
    }
    public final void setCancellable(f p0){
       this.setDisposable(new CancellableDisposable(p0));
    }
    public final void setDisposable(b p0){
       this.serial.update(p0);
    }
    public String toString(){
       Object[] objArray = new Object[]{this.getClass().getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
    public boolean tryOnError(Throwable p0){
       return this.error(p0);
    }
}
