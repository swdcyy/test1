package brd.a;
import brd.e;
import java.lang.Object;
import io.reactivex.internal.operators.completable.b;
import ird.a;
import java.lang.Iterable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.CompletableCreate;
import java.lang.Throwable;
import io.reactivex.internal.operators.completable.c;
import erd.a;
import io.reactivex.internal.operators.completable.d;
import java.lang.Runnable;
import io.reactivex.internal.operators.completable.f;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.h;
import brd.d;
import erd.c;
import drd.a;
import java.lang.NullPointerException;
import brd.w;
import brd.t;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import brd.e0;
import brd.a0;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.observers.f;
import java.util.concurrent.CountDownLatch;
import io.reactivex.internal.util.c;
import brd.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import crd.b;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.j;

public abstract class a implements e	// class@0002b8
{

    public void a(){
       super();
    }
    public static a g(){
       return a.e(b.b);
    }
    public static a i(Iterable p0){
       a.c(p0, "sources is null");
       return a.e(new CompletableConcatIterable(p0));
    }
    public static a j(e[] p0){
       a.c(p0, "sources is null");
       if (!p0.length) {
          return a.g();
       }
       if (p0.length == 1) {
          return a.z(p0[0]);
       }
       return a.e(new CompletableConcatArray(p0));
    }
    public static a k(a p0){
       a.c(p0, "source is null");
       return a.e(new CompletableCreate(p0));
    }
    public static a p(Throwable p0){
       a.c(p0, "error is null");
       return a.e(new c(p0));
    }
    public static a q(a p0){
       a.c(p0, "run is null");
       return a.e(new d(p0));
    }
    public static a r(Runnable p0){
       a.c(p0, "run is null");
       return a.e(new f(p0));
    }
    public static a y(long p0,TimeUnit p1){
       z oz = b.a();
       a.c(p1, "unit is null");
       a.c(oz, "scheduler is null");
       return a.e(new CompletableTimer(p0, p1, oz));
    }
    public static a z(e p0){
       a.c(p0, "source is null");
       if (p0 instanceof a) {
          return a.e(p0);
       }
       return a.e(new h(p0));
    }
    public final void a(d p0){
       String str = "s is null";
       try{
          a.c(p0, str);
          c w = a.w;
          if (w != null) {
             p0 = a.a(w, this, p0);
          }
          this.v(p0);
          return;
       }catch(java.lang.NullPointerException e3){
          throw e3;
       }
    }
    public final a b(e p0){
       a.c(p0, "other is null");
       e[] uoeArray = new e[]{this,p0};
       return a.j(uoeArray);
    }
    public final t d(w p0){
       a.c(p0, "next is null");
       return a.h(new CompletableAndThenObservable(this, p0));
    }
    public final a0 e(e0 p0){
       a.c(p0, "next is null");
       return a.i(new SingleDelayWithCompletable(p0, this));
    }
    public final Throwable f(){
       f c;
       f uof = new f();
       this.a(uof);
       if (uof.getCount()) {
          try{
             c.a();
             uof.await();
          }catch(java.lang.InterruptedException e1){
             uof.b();
          }
       }
       c = uof.c;
    }
    public final a h(f p0){
       a.c(p0, "transformer is null");
       return a.z(p0.a(this));
    }
    public final a l(a p0){
       a c = Functions.c;
       return this.n(Functions.d(), Functions.d(), p0, c, c, c);
    }
    public final a m(g p0){
       a c = Functions.c;
       return this.n(Functions.d(), p0, c, c, c, c);
    }
    public final a n(g p0,g p1,a p2,a p3,a p4,a p5){
       a.c(p0, "onSubscribe is null");
       a.c(p1, "onError is null");
       a.c(p2, "onComplete is null");
       a.c(p3, "onTerminate is null");
       a.c(p4, "onAfterTerminate is null");
       a.c(p5, "onDispose is null");
       i oi = new i(this, p0, p1, p2, p3, p4, p5);
       return a.e(v0);
    }
    public final a o(g p0){
       a c = Functions.c;
       return this.n(p0, Functions.d(), c, c, c, c);
    }
    public final a s(z p0){
       a.c(p0, "scheduler is null");
       return a.e(new CompletableObserveOn(this, p0));
    }
    public final b t(a p0){
       a.c(p0, "onComplete is null");
       CallbackCompletableObserver uCallbackCom = new CallbackCompletableObserver(p0);
       this.a(uCallbackCom);
       return uCallbackCom;
    }
    public final b u(a p0,g p1){
       a.c(p1, "onError is null");
       a.c(p0, "onComplete is null");
       CallbackCompletableObserver uCallbackCom = new CallbackCompletableObserver(p1, p0);
       this.a(uCallbackCom);
       return uCallbackCom;
    }
    public abstract void v(d p0);
    public final a w(z p0){
       a.c(p0, "scheduler is null");
       return a.e(new CompletableSubscribeOn(this, p0));
    }
    public final a x(long p0,TimeUnit p1){
       z oz = b.a();
       a.c(p1, "unit is null");
       a.c(oz, "scheduler is null");
       j oj = new j(this, p0, p1, oz, null);
       return a.e(v7);
    }
}
