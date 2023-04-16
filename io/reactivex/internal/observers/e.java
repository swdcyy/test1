package io.reactivex.internal.observers.e;
import io.reactivex.internal.observers.c;
import java.lang.Throwable;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;

public final class e extends c	// class@0011e4
{

    public void e(){
       super();
    }
    public void onError(Throwable p0){
       this.b = null;
       this.c = p0;
       this.countDown();
    }
    public void onNext(Object p0){
       this.b = p0;
    }
}
