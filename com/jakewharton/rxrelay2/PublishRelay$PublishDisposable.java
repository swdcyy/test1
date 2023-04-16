package com.jakewharton.rxrelay2.PublishRelay$PublishDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.y;
import com.jakewharton.rxrelay2.PublishRelay;
import java.lang.Object;

public final class PublishRelay$PublishDisposable extends AtomicBoolean implements b	// class@0005d3
{
    public final y actual;
    public final PublishRelay parent;
    public static final long serialVersionUID = 0x3171d4005ebf93fe;

    public void PublishRelay$PublishDisposable(y p0,PublishRelay p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.parent.e(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
    public void onNext(Object p0){
       if (!this.get()) {
          this.actual.onNext(p0);
       }
       return;
    }
}
