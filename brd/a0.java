package brd.a0;
import brd.e0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.single.k;
import ird.a;
import brd.h;
import cxd.b;
import io.reactivex.internal.operators.flowable.j;
import erd.o;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.m;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import io.reactivex.internal.operators.single.SingleTimer;
import io.reactivex.internal.operators.flowable.t;
import erd.h;
import io.reactivex.internal.functions.Functions;
import erd.c;
import java.lang.Iterable;
import io.reactivex.internal.operators.single.o;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.operators.flowable.c;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.i;
import io.reactivex.internal.operators.single.SingleCreate;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.single.h;
import io.reactivex.internal.operators.single.i;
import brd.w;
import io.reactivex.internal.operators.observable.l1;
import brd.a;
import io.reactivex.internal.operators.completable.g;
import io.reactivex.internal.operators.single.l;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.n;
import io.reactivex.internal.operators.single.b;
import java.util.Objects;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import erd.e;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import crd.b;
import erd.g;
import erd.b;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import brd.d0;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.operators.single.SingleToFlowable;
import drd.a;
import java.lang.NullPointerException;
import java.util.concurrent.Future;
import io.reactivex.internal.observers.i;
import brd.m;
import io.reactivex.internal.fuseable.c;
import io.reactivex.internal.operators.maybe.h;
import brd.t;
import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.observers.f;
import io.reactivex.internal.operators.single.SingleCache;
import brd.f0;
import io.reactivex.internal.operators.single.j;
import io.reactivex.internal.operators.single.a;
import erd.a;
import io.reactivex.internal.operators.single.c;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.internal.operators.single.d;
import io.reactivex.internal.operators.single.f;
import io.reactivex.internal.operators.single.g;
import erd.r;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;

public abstract class a0 implements e0	// class@0002b7
{

    public void a0(){
       super();
    }
    public static a0 B(Object p0){
       a.c(p0, "value is null");
       return a.i(new k(p0));
    }
    public static h D(e0 p0,e0 p1){
       a.c(p0, "source1 is null");
       a.c(p1, "source2 is null");
       e0[] uoe0Array = new e0[]{p0,p1};
       return a0.E(h.l(uoe0Array));
    }
    public static h E(b p0){
       a.c(p0, "sources is null");
       j oj = new j(p0, SingleInternalHelper.a(), false, Integer.MAX_VALUE, h.b());
       return a.f(v0);
    }
    public static a0 F(){
       return a.i(m.b);
    }
    public static a0 Y(long p0,TimeUnit p1){
       return a0.Z(p0, p1, b.a());
    }
    public static a0 Z(long p0,TimeUnit p1,z p2){
       a.c(p1, "unit is null");
       a.c(p2, "scheduler is null");
       return a.i(new SingleTimer(p0, p1, p2));
    }
    public static a0 e0(h p0){
       return a.i(new t(p0, null));
    }
    public static a0 f0(e0 p0,e0 p1,e0 p2,h p3){
       a.c(p0, "source1 is null");
       a.c(p1, "source2 is null");
       a.c(p2, "source3 is null");
       e0[] uoe0Array = new e0[]{p0,p1,p2};
       return a0.i0(Functions.k(p3), uoe0Array);
    }
    public static a0 g0(e0 p0,e0 p1,c p2){
       a.c(p0, "source1 is null");
       a.c(p1, "source2 is null");
       e0[] uoe0Array = new e0[]{p0,p1};
       return a0.i0(Functions.j(p2), uoe0Array);
    }
    public static h h(e0 p0,e0 p1){
       a.c(p0, "source1 is null");
       a.c(p1, "source2 is null");
       e0[] uoe0Array = new e0[]{p0,p1};
       return a0.j(h.l(uoe0Array));
    }
    public static a0 h0(Iterable p0,o p1){
       a.c(p1, "zipper is null");
       a.c(p0, "sources is null");
       return a.i(new o(p0, p1));
    }
    public static h i(e0 p0,e0 p1,e0 p2){
       a.c(p0, "source1 is null");
       a.c(p1, "source2 is null");
       a.c(p2, "source3 is null");
       e0[] uoe0Array = new e0[]{p0,p1,p2};
       return a0.j(h.l(uoe0Array));
    }
    public static a0 i0(o p0,e0[] p1){
       a.c(p0, "zipper is null");
       a.c(p1, "sources is null");
       if (!p1.length) {
          return a0.s(new NoSuchElementException());
       }
       return a.i(new SingleZipArray(p1, p0));
    }
    public static h j(b p0){
       a.c(p0, "sources is null");
       a.d(2, "prefetch");
       return a.f(new c(p0, SingleInternalHelper.a(), 2, ErrorMode.IMMEDIATE));
    }
    public static a0 k(i p0){
       a.c(p0, "source is null");
       return a.i(new SingleCreate(p0));
    }
    public static a0 s(Throwable p0){
       a.c(p0, "error is null");
       Callable uCallable = Functions.f(p0);
       a.c(uCallable, "errorSupplier is null");
       return a.i(new h(uCallable));
    }
    public static a0 y(Callable p0){
       a.c(p0, "callable is null");
       return a.i(new i(p0));
    }
    public static a0 z(w p0){
       a.c(p0, "observableSource is null");
       return a.i(new l1(p0, null));
    }
    public final a A(){
       return a.e(new g(this));
    }
    public final a0 C(o p0){
       a.c(p0, "mapper is null");
       return a.i(new l(this, p0));
    }
    public final a0 G(z p0){
       a.c(p0, "scheduler is null");
       return a.i(new SingleObserveOn(this, p0));
    }
    public final a0 H(o p0){
       a.c(p0, "resumeFunctionInCaseOfError is null");
       return a.i(new SingleResumeNext(this, p0));
    }
    public final a0 I(o p0){
       a.c(p0, "resumeFunction is null");
       return a.i(new n(this, p0, null));
    }
    public final a0 J(Object p0){
       a.c(p0, "value is null");
       return a.i(new n(this, null, p0));
    }
    public final a0 K(){
       return a.i(new b(this));
    }
    public final h L(){
       h oh = this.a0();
       Objects.requireNonNull(oh);
       return a.f(new FlowableRepeat(oh, Long.MAX_VALUE));
    }
    public final h M(e p0){
       h oh = this.a0();
       Objects.requireNonNull(oh);
       a.c(p0, "stop is null");
       return a.f(new FlowableRepeatUntil(oh, p0));
    }
    public final a0 N(long p0){
       return a0.e0(this.a0().w(p0));
    }
    public final b O(){
       return this.R(Functions.d(), Functions.f);
    }
    public final b P(b p0){
       a.c(p0, "onCallback is null");
       BiConsumerSingleObserver uBiConsumerS = new BiConsumerSingleObserver(p0);
       this.b(uBiConsumerS);
       return uBiConsumerS;
    }
    public final b Q(g p0){
       return this.R(p0, Functions.f);
    }
    public final b R(g p0,g p1){
       a.c(p0, "onSuccess is null");
       a.c(p1, "onError is null");
       ConsumerSingleObserver uConsumerSin = new ConsumerSingleObserver(p0, p1);
       this.b(uConsumerSin);
       return uConsumerSin;
    }
    public abstract void S(d0 p0);
    public final a0 T(z p0){
       a.c(p0, "scheduler is null");
       return a.i(new SingleSubscribeOn(this, p0));
    }
    public final a0 U(long p0,TimeUnit p1){
       return this.X(p0, p1, b.a(), null);
    }
    public final a0 V(long p0,TimeUnit p1,z p2){
       return this.X(p0, p1, p2, null);
    }
    public final a0 W(long p0,TimeUnit p1,e0 p2){
       a.c(p2, "other is null");
       return this.X(p0, p1, b.a(), p2);
    }
    public final a0 X(long p0,TimeUnit p1,z p2,e0 p3){
       a.c(p1, "unit is null");
       a.c(p2, "scheduler is null");
       SingleTimeout singleTimeou = new SingleTimeout(this, p0, p1, p2, p3);
       return a.i(v0);
    }
    public final h a0(){
       if (this instanceof b) {
          return this.d();
       }
       return a.f(new SingleToFlowable(this));
    }
    public final void b(d0 p0){
       a.c(p0, "subscriber is null");
       c v = a.v;
       if (v != null) {
          p0 = a.a(v, this, p0);
       }
       try{
          a.c(p0, "subscriber returned by the RxJavaPlugins hook is null");
          this.S(p0);
          return;
       }catch(java.lang.NullPointerException e3){
          throw e3;
       }
    }
    public final Future b0(){
       i oi = new i();
       this.b(oi);
       return oi;
    }
    public final m c0(){
       if (this instanceof c) {
          return this.a();
       }
       return a.g(new h(this));
    }
    public final t d0(){
       if (this instanceof d) {
          return this.c();
       }
       return a.h(new SingleToObservable(this));
    }
    public final Object e(){
       f uof = new f();
       this.b(uof);
       return uof.a();
    }
    public final a0 f(){
       return a.i(new SingleCache(this));
    }
    public final a0 g(f0 p0){
       a.c(p0, "transformer is null");
       e0 uoe0 = p0.b(this);
       a.c(uoe0, "source is null");
       a0 uoa0 = (uoe0 instanceof a0)? a.i(uoe0): a.i(new j(uoe0));
       return uoa0;
    }
    public final a0 j0(e0 p0,c p1){
       return a0.g0(this, p0, p1);
    }
    public final a0 l(long p0,TimeUnit p1){
       z oz = b.a();
       a.c(p1, "unit is null");
       a.c(oz, "scheduler is null");
       a uoa = new a(this, p0, p1, oz, false);
       return a.i(v7);
    }
    public final a0 m(a p0){
       a.c(p0, "onAfterTerminate is null");
       return a.i(new c(this, p0));
    }
    public final a0 n(a p0){
       a.c(p0, "onFinally is null");
       return a.i(new SingleDoFinally(this, p0));
    }
    public final a0 o(a p0){
       a.c(p0, "onDispose is null");
       return a.i(new SingleDoOnDispose(this, p0));
    }
    public final a0 p(g p0){
       a.c(p0, "onError is null");
       return a.i(new d(this, p0));
    }
    public final a0 q(g p0){
       a.c(p0, "onSubscribe is null");
       return a.i(new f(this, p0));
    }
    public final a0 r(g p0){
       a.c(p0, "onSuccess is null");
       return a.i(new g(this, p0));
    }
    public final m t(r p0){
       a.c(p0, "predicate is null");
       return a.g(new e(this, p0));
    }
    public final a0 u(o p0){
       a.c(p0, "mapper is null");
       return a.i(new SingleFlatMap(this, p0));
    }
    public final a v(o p0){
       a.c(p0, "mapper is null");
       return a.e(new SingleFlatMapCompletable(this, p0));
    }
    public final t w(o p0){
       a.c(p0, "mapper is null");
       return a.h(new SingleFlatMapObservable(this, p0));
    }
    public final t x(o p0){
       a.c(p0, "mapper is null");
       return a.h(new SingleFlatMapIterableObservable(this, p0));
    }
}
