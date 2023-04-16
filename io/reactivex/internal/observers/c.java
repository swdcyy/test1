package io.reactivex.internal.observers.c;
import brd.y;
import crd.b;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import io.reactivex.internal.util.c;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;

public abstract class c extends CountDownLatch implements y, b	// class@0011e2
{
    public Object b;
    public Throwable c;
    public b d;
    public boolean e;

    public void c(){
       super(1);
    }
    public final Object a(){
       if (this.getCount()) {
          try{
             c.a();
             this.await();
          }catch(java.lang.InterruptedException e0){
             this.dispose();
             throw ExceptionHelper.d(e0);
          }
       }
       c tc = this.c;
       if (tc == null) {
          return this.b;
       }else {
          throw ExceptionHelper.d(tc);
       }
    }
    public final void dispose(){
       this.e = true;
       c td = this.d;
       if (td != null) {
          td.dispose();
       }
       return;
    }
    public final boolean isDisposed(){
       return this.e;
    }
    public final void onComplete(){
       this.countDown();
    }
    public final void onSubscribe(b p0){
       this.d = p0;
       if (this.e != null) {
          p0.dispose();
       }
       return;
    }
}
