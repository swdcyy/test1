package com.jakewharton.rxrelay2.ReplayRelay$ReplayDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import com.jakewharton.rxrelay2.ReplayRelay;

public final class ReplayRelay$ReplayDisposable extends AtomicInteger implements b	// class@0006d4
{
    public final y actual;
    public boolean cancelled;
    public Object index;
    public final ReplayRelay state;
    public static final long serialVersionUID = 0x679849349531b12;

    public void ReplayRelay$ReplayDisposable(y p0,ReplayRelay p1){
       super();
       this.actual = p0;
       this.state = p1;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.state.d(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
}
