package io.reactivex.internal.operators.flowable.r;
import cxd.b;
import cxd.c;
import erd.o;
import java.util.concurrent.Callable;
import java.lang.Object;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import cxd.d;
import java.lang.Throwable;
import drd.a;

public final class r	// class@001286
{

    public static boolean a(b p0,c p1,o p2){
       if (!p0 instanceof Callable) {
          return false;
       }
       p0 = p0.call();
       if (p0 == null) {
          EmptySubscription.complete(p1);
          return true;
       }else {
          p0 = p2.apply(p0);
          a.c(p0, "The mapper returned a null Publisher");
          if (p0 instanceof Callable) {
             p0 = p0.call();
             if (p0 == null) {
                EmptySubscription.complete(p1);
                return true;
             }else {
                p1.onSubscribe(new ScalarSubscription(p1, p0));
             }
          }else {
             p0.subscribe(p1);
          }
          return true;
       }
    }
}
