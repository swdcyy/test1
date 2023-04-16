package brd.m;
import brd.q;
import java.lang.Object;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.e;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import java.lang.Throwable;
import io.reactivex.internal.operators.maybe.c;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.maybe.f;
import io.reactivex.internal.operators.maybe.i;
import brd.p;
import brd.z;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import brd.t;
import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import brd.a0;
import io.reactivex.internal.operators.maybe.o;
import erd.c;
import drd.a;
import java.lang.NullPointerException;
import io.reactivex.internal.observers.f;
import erd.a;
import io.reactivex.internal.operators.maybe.n;
import erd.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeDoFinally;
import erd.r;
import io.reactivex.internal.operators.maybe.d;
import erd.o;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.mixed.MaybeFlatMapObservable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement;
import io.reactivex.internal.operators.maybe.j;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.m;
import crd.b;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;

public abstract class m implements q	// class@0002ca
{

    public void m(){
       super();
    }
    public static m E(q p0){
       if (p0 instanceof m) {
          return a.g(p0);
       }
       a.c(p0, "onSubscribe is null");
       return a.g(new p(p0));
    }
    public static m f(e p0){
       a.c(p0, "onSubscribe is null");
       return a.g(new MaybeCreate(p0));
    }
    public static m l(Throwable p0){
       a.c(p0, "exception is null");
       return a.g(new c(p0));
    }
    public static m r(Callable p0){
       a.c(p0, "callable is null");
       return a.g(new f(p0));
    }
    public static m s(Object p0){
       a.c(p0, "item is null");
       return a.g(new i(p0));
    }
    public abstract void A(p p0);
    public final m B(z p0){
       a.c(p0, "scheduler is null");
       return a.g(new MaybeSubscribeOn(this, p0));
    }
    public final t C(){
       if (this instanceof d) {
          return this.c();
       }
       return a.h(new MaybeToObservable(this));
    }
    public final a0 D(){
       return a.i(new o(this, null));
    }
    public final void b(p p0){
       a.c(p0, "observer is null");
       c t = a.t;
       if (t != null) {
          p0 = a.a(t, this, p0);
       }
       try{
          a.c(p0, "observer returned by the RxJavaPlugins hook is null");
          this.A(p0);
          return;
       }catch(java.lang.NullPointerException e3){
          throw e3;
       }
    }
    public final Object e(){
       f uof = new f();
       this.b(uof);
       return uof.a();
    }
    public final m g(a p0){
       a c = Functions.c;
       a.c(p0, "onAfterTerminate is null");
       n on = new n(this, Functions.d(), Functions.d(), Functions.d(), c, p0, c);
       return a.g(v8);
    }
    public final m h(a p0){
       a.c(p0, "onFinally is null");
       return a.g(new MaybeDoFinally(this, p0));
    }
    public final m i(g p0){
       a.c(p0, "onError is null");
       a c = Functions.c;
       n on = new n(this, Functions.d(), Functions.d(), p0, c, c, c);
       return a.g(v8);
    }
    public final m j(g p0){
       a.c(p0, "onSubscribe is null");
       a c = Functions.c;
       n on = new n(this, p0, Functions.d(), Functions.d(), c, c, c);
       return a.g(v8);
    }
    public final m k(g p0){
       a.c(p0, "onSubscribe is null");
       a c = Functions.c;
       n on = new n(this, Functions.d(), p0, Functions.d(), c, c, c);
       return a.g(v8);
    }
    public final m m(r p0){
       a.c(p0, "predicate is null");
       return a.g(new d(this, p0));
    }
    public final m n(o p0){
       a.c(p0, "mapper is null");
       return a.g(new MaybeFlatten(this, p0));
    }
    public final t o(o p0){
       a.c(p0, "mapper is null");
       return a.h(new MaybeFlatMapObservable(this, p0));
    }
    public final a0 p(o p0){
       a.c(p0, "mapper is null");
       return a.i(new MaybeFlatMapSingle(this, p0));
    }
    public final m q(o p0){
       a.c(p0, "mapper is null");
       return a.g(new MaybeFlatMapSingleElement(this, p0));
    }
    public final m t(o p0){
       a.c(p0, "mapper is null");
       return a.g(new j(this, p0));
    }
    public final m u(z p0){
       a.c(p0, "scheduler is null");
       return a.g(new MaybeObserveOn(this, p0));
    }
    public final m v(Object p0){
       a.c(p0, "item is null");
       p0 = Functions.g(p0);
       a.c(p0, "valueSupplier is null");
       return a.g(new m(this, p0));
    }
    public final b w(){
       return this.z(Functions.d(), Functions.f, Functions.c);
    }
    public final b x(g p0){
       return this.z(p0, Functions.f, Functions.c);
    }
    public final b y(g p0,g p1){
       return this.z(p0, p1, Functions.c);
    }
    public final b z(g p0,g p1,a p2){
       a.c(p0, "onSuccess is null");
       a.c(p1, "onError is null");
       a.c(p2, "onComplete is null");
       MaybeCallbackObserver maybeCallbac = new MaybeCallbackObserver(p0, p1, p2);
       this.b(maybeCallbac);
       return maybeCallbac;
    }
}
