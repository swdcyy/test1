package io.reactivex.internal.operators.observable.j;
import brd.w;
import brd.y;
import java.util.concurrent.LinkedBlockingQueue;
import io.reactivex.internal.observers.BlockingObserver;
import java.util.Queue;
import crd.b;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.util.NotificationLite;
import erd.g;
import erd.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.functions.Functions;

public final class j	// class@0013ca
{

    public static void a(w p0,y p1){
       LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue();
       BlockingObserver uBlockingObs = new BlockingObserver(linkedBlocki);
       p1.onSubscribe(uBlockingObs);
       p0.subscribe(uBlockingObs);
       while (!uBlockingObs.isDisposed()) {
          Object obj = linkedBlocki.poll();
          if (obj == null) {
             try{
                obj = linkedBlocki.take();
             }catch(java.lang.InterruptedException e4){
                uBlockingObs.dispose();
                p1.onError(e4);
                return;
             }
          }
          if (!uBlockingObs.isDisposed() && (p0 == BlockingObserver.TERMINATED || NotificationLite.acceptFull(obj, p1))) {
             break ;
          }
       }
    label_003a :
       return;
    }
    public static void b(w p0,g p1,g p2,a p3){
       a.c(p1, "onNext is null");
       a.c(p2, "onError is null");
       a.c(p3, "onComplete is null");
       j.a(p0, new LambdaObserver(p1, p2, p3, Functions.d()));
    }
}
