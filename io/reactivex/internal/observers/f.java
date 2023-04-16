package io.reactivex.internal.observers.f;
import brd.d0;
import brd.d;
import brd.p;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import io.reactivex.internal.util.c;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import crd.b;

public final class f extends CountDownLatch implements d0, d, p	// class@0011e5
{
    public Object b;
    public Throwable c;
    public b d;
    public boolean e;

    public void f(){
       super(1);
    }
    public Object a(){
       if (this.getCount()) {
          try{
             c.a();
             this.await();
          }catch(java.lang.InterruptedException e0){
             this.b();
             throw ExceptionHelper.d(e0);
          }
       }
       f tc = this.c;
       if (tc == null) {
          return this.b;
       }else {
          throw ExceptionHelper.d(tc);
       }
    }
    public void b(){
       this.e = true;
       f td = this.d;
       if (td != null) {
          td.dispose();
       }
       return;
    }
    public void onComplete(){
       this.countDown();
    }
    public void onError(Throwable p0){
       this.c = p0;
       this.countDown();
    }
    public void onSubscribe(b p0){
       this.d = p0;
       if (this.e != null) {
          p0.dispose();
       }
       return;
    }
    public void onSuccess(Object p0){
       this.b = p0;
       this.countDown();
    }
}
