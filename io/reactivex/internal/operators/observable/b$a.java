package io.reactivex.internal.operators.observable.b$a;
import java.util.Iterator;
import grd.c;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import brd.s;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.c;
import java.lang.Object;
import java.util.NoSuchElementException;
import ird.a;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class b$a extends c implements Iterator	// class@0013a0
{
    public s b;
    public final Semaphore c;
    public final AtomicReference d;

    public void b$a(){
       super();
       this.c = new Semaphore(0);
       this.d = new AtomicReference();
    }
    public boolean hasNext(){
       b$a tb = this.b;
       if (tb != null && tb.g()) {
          throw ExceptionHelper.d(this.b.d());
       }
       if (this.b == null) {
          try{
             c.a();
             this.c.acquire();
             s andSet = this.d.getAndSet(null);
             this.b = andSet;
             if (andSet.g()) {
                throw ExceptionHelper.d(andSet.d());
             }
          }catch(java.lang.InterruptedException e0){
             this.dispose();
             this.b = s.b(e0);
             throw ExceptionHelper.d(e0);
          }
       }
       return this.b.h();
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = null;
       return this.b.e();
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       a.l(p0);
    }
    public void onNext(Object p0){
       p0 = (this.d.getAndSet(p0) == null)? 1: null;
       if (p0) {
          this.c.release();
       }
       return;
    }
    public void remove(){
       throw new UnsupportedOperationException("Read-only iterator.");
    }
}
