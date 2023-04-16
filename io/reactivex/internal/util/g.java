package io.reactivex.internal.util.g;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.util.AtomicThrowable;
import java.lang.Throwable;
import cxd.c;
import ird.a;
import java.lang.Object;

public final class g	// class@0014d9
{

    public static void a(y p0,AtomicInteger p1,AtomicThrowable p2){
       if (!p1.getAndIncrement()) {
          Throwable throwable = p2.terminate();
          if (throwable != null) {
             p0.onError(throwable);
          }else {
             p0.onComplete();
          }
       }
       return;
    }
    public static void b(c p0,AtomicInteger p1,AtomicThrowable p2){
       if (!p1.getAndIncrement()) {
          Throwable throwable = p2.terminate();
          if (throwable != null) {
             p0.onError(throwable);
          }else {
             p0.onComplete();
          }
       }
       return;
    }
    public static void c(y p0,Throwable p1,AtomicInteger p2,AtomicThrowable p3){
       if (p3.addThrowable(p1)) {
          if (!p2.getAndIncrement()) {
             p0.onError(p3.terminate());
          }
       }else {
          a.l(p1);
       }
       return;
    }
    public static void d(c p0,Throwable p1,AtomicInteger p2,AtomicThrowable p3){
       if (p3.addThrowable(p1)) {
          if (!p2.getAndIncrement()) {
             p0.onError(p3.terminate());
          }
       }else {
          a.l(p1);
       }
       return;
    }
    public static void e(y p0,Object p1,AtomicInteger p2,AtomicThrowable p3){
       if (!p2.get() && p2.compareAndSet(0, 1)) {
          p0.onNext(p1);
          if (p2.decrementAndGet()) {
             p1 = p3.terminate();
             if (p1 != null) {
                p0.onError(p1);
             }else {
                p0.onComplete();
             }
          }
       }
       return;
    }
    public static void f(c p0,Object p1,AtomicInteger p2,AtomicThrowable p3){
       if (!p2.get() && p2.compareAndSet(0, 1)) {
          p0.onNext(p1);
          if (p2.decrementAndGet()) {
             p1 = p3.terminate();
             if (p1 != null) {
                p0.onError(p1);
             }else {
                p0.onComplete();
             }
          }
       }
       return;
    }
}
