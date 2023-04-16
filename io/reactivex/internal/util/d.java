package io.reactivex.internal.util.d;
import erd.g;
import erd.a;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Throwable;

public final class d extends CountDownLatch implements g, a	// class@0014d6
{
    public Throwable b;

    public void d(){
       super(1);
    }
    public void accept(Object p0){
       this.b = p0;
       this.countDown();
    }
    public void run(){
       this.countDown();
    }
}
