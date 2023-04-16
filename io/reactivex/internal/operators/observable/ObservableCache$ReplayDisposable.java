package io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableCache$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.System;
import io.reactivex.internal.util.h;
import io.reactivex.internal.util.NotificationLite;

public final class ObservableCache$ReplayDisposable extends AtomicInteger implements b	// class@0012ed
{
    public boolean cancelled;
    public final y child;
    public Object[] currentBuffer;
    public int currentIndexInBuffer;
    public int index;
    public final ObservableCache$a state;
    public static final long serialVersionUID = 0x61f4da70baa2c698;

    public void ObservableCache$ReplayDisposable(y p0,ObservableCache$a p1){
       super();
       this.child = p0;
       this.state = p1;
    }
    public void dispose(){
       ObservableCache$ReplayDisposable[] l;
       if (this.cancelled == null) {
          this.cancelled = true;
          ObservableCache$ReplayDisposable tstate = this.state;
          ObservableCache$ReplayDisposable[] replayDispos = tstate.i.get();
          int len = replayDispos.length;
          while (len) {
             ObservableCache$a uoa = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (replayDispos[i].equals(this)) {
                   label_0026 :
                      if (i >= 0) {
                         if (len == 1) {
                            l = ObservableCache$a.l;
                         }else {
                            int i1 = len - 1;
                            ObservableCache$ReplayDisposable[] replayDispos1 = new ObservableCache$ReplayDisposable[i1];
                            System.arraycopy(replayDispos, uoa, replayDispos1, uoa, i);
                            int i2 = i + 1;
                            len = len - i;
                            len = len - true;
                            System.arraycopy(replayDispos, i2, replayDispos1, i, len);
                            l = replayDispos1;
                         }
                         if (!tstate.i.compareAndSet(replayDispos, l)) {
                         }
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_0026 ;
                }
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void replay(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableCache$ReplayDisposable tchild = this.child;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
          }else {
             h e = this.state.e;
             if (e != null) {
                ObservableCache$ReplayDisposable tcurrentBuff = this.currentBuffer;
                if (tcurrentBuff == null) {
                   tcurrentBuff = this.state.b();
                   this.currentBuffer = tcurrentBuff;
                }
                int i1 = tcurrentBuff.length - 1;
                ObservableCache$ReplayDisposable tindex = this.index;
                ObservableCache$ReplayDisposable tcurrentInde = this.currentIndexInBuffer;
                while (true) {
                   if (tindex < e) {
                      if (this.cancelled != null) {
                         return;
                      }else if(tcurrentInde == i1){
                         tcurrentBuff = tcurrentBuff[i1];
                         tcurrentInde = 0;
                      }
                      if (NotificationLite.accept(tcurrentBuff[tcurrentInde], tchild)) {
                         return;
                      }else {
                         tcurrentInde = tcurrentInde + 1;
                         tindex = tindex + 1;
                      }
                   }else if(this.cancelled != null){
                      return;
                   }else {
                      this.index = tindex;
                      this.currentIndexInBuffer = tcurrentInde;
                      this.currentBuffer = tcurrentBuff;
                   }
                }
                return;
             }
             i = - i;
             if (!this.addAndGet(i)) {
             }else {
                continue ;
             }
          }
       }
       return;
    }
}
