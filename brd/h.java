package brd.h;
import cxd.b;
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Object;
import io.reactivex.internal.operators.flowable.h;
import ird.a;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import java.lang.Iterable;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import java.util.Objects;
import io.reactivex.internal.operators.flowable.d;
import java.lang.IllegalArgumentException;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import java.lang.StringBuilder;
import io.reactivex.internal.operators.flowable.m;
import erd.g;
import crd.b;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import erd.a;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import brd.k;
import erd.c;
import cxd.c;
import java.lang.Throwable;
import drd.a;
import java.lang.NullPointerException;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import erd.r;
import io.reactivex.internal.operators.flowable.u;
import brd.a0;
import io.reactivex.internal.operators.flowable.x;
import brd.t;
import io.reactivex.internal.operators.observable.n0;
import erd.b;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.flowable.b;
import io.reactivex.internal.operators.flowable.e;
import io.reactivex.internal.operators.flowable.i;
import io.reactivex.internal.operators.flowable.g;
import erd.o;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.n;
import io.reactivex.internal.operators.flowable.o;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import hrd.a;
import java.lang.Runtime;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import java.util.Comparator;

public abstract class h implements b	// class@00033d
{
    public static final int b;

    static {
       h.b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());
    }
    public void h(){
       super();
    }
    public static int b(){
       return h.b;
    }
    public static h g(){
       return a.f(h.c);
    }
    public static h l(Object[] p0){
       a.c(p0, "items is null");
       if (!p0.length) {
          return h.g();
       }
       if (p0.length == 1) {
          return h.p(p0[0]);
       }
       return a.f(new FlowableFromArray(p0));
    }
    public static h m(Iterable p0){
       a.c(p0, "source is null");
       return a.f(new FlowableFromIterable(p0));
    }
    public static h n(long p0,long p1,TimeUnit p2){
       z oz = b.a();
       a.c(p2, "unit is null");
       a.c(oz, "scheduler is null");
       FlowableInterval uFlowableInt = new FlowableInterval(Math.max(0, p0), Math.max(0, p1), p2, oz);
       return a.f(v7);
    }
    public static h o(long p0,long p1,long p2,long p3,TimeUnit p4){
       h oh;
       long l = p1;
       long l1 = p2;
       Object obj = p4;
       z oz = b.a();
       long l2 = 0;
       if ((v6 = l - l2) < 0) {
          throw new IllegalArgumentException("count >= 0 required but it was "+l);
       }
       String str = "scheduler is null";
       if (!v6) {
          oh = h.g();
          Objects.requireNonNull(oh);
          a.c(obj, "unit is null");
          a.c(oz, str);
          d uod = new d(oh, Math.max(l2, l1), p4, oz, 0);
          oh = a.f(v1);
       }else {
          long l3 = p0 + (l - 1);
          if (p0 - l2 <= 0 || l3 - l2 >= 0) {
             a.c(obj, "unit is null");
             a.c(oz, str);
             FlowableIntervalRange uFlowableInt = new FlowableIntervalRange(p0, l3, Math.max(l2, l1), Math.max(l2, p3), p4, oz);
             oh = a.f(v13);
          }else {
             throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
          }
       }
       return oh;
    }
    public static h p(Object p0){
       a.c(p0, "item is null");
       return a.f(new m(p0));
    }
    public final b A(g p0,g p1){
       return this.B(p0, p1, Functions.c, FlowableInternalHelper$RequestMax.INSTANCE);
    }
    public final b B(g p0,g p1,a p2,g p3){
       a.c(p0, "onNext is null");
       a.c(p1, "onError is null");
       a.c(p2, "onComplete is null");
       a.c(p3, "onSubscribe is null");
       LambdaSubscriber lambdaSubscr = new LambdaSubscriber(p0, p1, p2, p3);
       this.C(lambdaSubscr);
       return lambdaSubscr;
    }
    public final void C(k p0){
       c s;
       c uoc;
       String str = "s is null";
       try{
          a.c(p0, str);
          s = a.s;
          if (s != null) {
             uoc = a.a(s, this, p0);
          }
          a.c(uoc, "Plugin returned null Subscriber");
          this.D(uoc);
          return;
       }catch(java.lang.NullPointerException e3){
          throw e3;
       }
    }
    public abstract void D(c p0);
    public final h E(z p0){
       a.c(p0, "scheduler is null");
       a.c(p0, "scheduler is null");
       return a.f(new FlowableSubscribeOn(this, p0, (this instanceof FlowableCreate ^ 0x01)));
    }
    public final h F(r p0){
       a.c(p0, "stopPredicate is null");
       return a.f(new u(this, p0));
    }
    public final a0 G(){
       return a.i(new x(this));
    }
    public final t H(){
       return a.h(new n0(this));
    }
    public final a0 c(Object p0,b p1){
       a.c(p0, "initialItem is null");
       p0 = Functions.f(p0);
       a.c(p0, "initialItemSupplier is null");
       a.c(p1, "collector is null");
       return a.i(new b(this, p0, p1));
    }
    public final h e(g p0,g p1,a p2,a p3){
       a.c(p0, "onNext is null");
       a.c(p1, "onError is null");
       a.c(p2, "onComplete is null");
       a.c(p3, "onAfterTerminate is null");
       e uoe = new e(this, p0, p1, p2, p3);
       return a.f(v0);
    }
    public final h f(g p0){
       return this.e(p0, Functions.d(), Functions.c, Functions.c);
    }
    public final h h(r p0){
       a.c(p0, "predicate is null");
       return a.f(new i(this, p0));
    }
    public final a0 i(Object p0){
       a.c(p0, "defaultItem is null");
       return a.i(new g(this, 0, p0));
    }
    public final a0 j(){
       return a.i(new g(this, 0, null));
    }
    public final h k(o p0){
       int i = h.b();
       a.c(p0, "mapper is null");
       a.d(i, "bufferSize");
       return a.f(new FlowableFlattenIterable(this, p0, i));
    }
    public final a0 q(Object p0){
       a.c(p0, "defaultItem");
       return a.i(new n(this, p0));
    }
    public final a0 r(){
       return a.i(new n(this, null));
    }
    public final h s(o p0){
       a.c(p0, "mapper is null");
       return a.f(new o(this, p0));
    }
    public final void subscribe(c p0){
       if (p0 instanceof k) {
          this.C(p0);
       }else {
          a.c(p0, "s is null");
          this.C(new StrictSubscriber(p0));
       }
       return;
    }
    public final h t(z p0){
       int i = h.b();
       a.c(p0, "scheduler is null");
       a.d(i, "bufferSize");
       return a.f(new FlowableObserveOn(this, p0, false, i));
    }
    public final h u(){
       return a.f(new FlowableOnBackpressureDrop(this));
    }
    public final a v(){
       int i = Runtime.getRuntime().availableProcessors();
       int i1 = h.b();
       a.c(this, "source");
       a.d(i, "parallelism");
       a.d(i1, "prefetch");
       return a.k(new ParallelFromPublisher(this, i, i1));
    }
    public final h w(long p0){
       return this.x(p0, Functions.a());
    }
    public final h x(long p0,r p1){
       if (p0 - null < 0) {
          throw new IllegalArgumentException("times >= 0 required but it was "+p0);
       }
       a.c(p1, "predicate is null");
       return a.f(new FlowableRetryPredicate(this, p0, p1));
    }
    public final h y(Comparator p0){
       a.c(p0, "sortFunction");
       return this.G().a0().s(Functions.h(p0)).k(Functions.e());
    }
    public final b z(g p0){
       return this.B(p0, Functions.f, Functions.c, FlowableInternalHelper$RequestMax.INSTANCE);
    }
}
