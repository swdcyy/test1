package io.reactivex.internal.observers.d;
import io.reactivex.internal.observers.c;
import java.lang.Throwable;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import crd.b;

public final class d extends c	// class@0011e3
{

    public void d(){
       super();
    }
    public void onError(Throwable p0){
       if (this.b == null) {
          this.c = p0;
       }
       this.countDown();
       return;
    }
    public void onNext(Object p0){
       if (this.b == null) {
          this.b = p0;
          this.d.dispose();
          this.countDown();
       }
       return;
    }
}
