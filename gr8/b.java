package gr8.b;
import brd.x;
import brd.l;
import brd.f0;
import brd.r;
import brd.f;
import brd.t;
import java.lang.Object;
import java.lang.String;
import hr8.a;
import brd.a;
import brd.e;
import com.trello.rxlifecycle3.a;
import erd.o;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.completable.a;
import java.lang.Iterable;
import ird.a;
import brd.w;
import brd.a0;
import brd.e0;
import java.util.Objects;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import cxd.b;
import brd.h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import brd.m;
import brd.q;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe;
import java.lang.Class;
import java.lang.StringBuilder;

public final class b implements x, l, f0, r, f	// class@0024bb
{
    public final t b;

    public void b(t p0){
       super();
       a.a(p0, "observable == null");
       this.b = p0;
    }
    public e a(a p0){
       e[] uoeArray = new e[]{p0,this.b.flatMapCompletable(a.c)};
       a.c(uoeArray, "sources is null");
       return a.e(new a(uoeArray, null));
    }
    public w apply(t p0){
       return p0.takeUntil(this.b);
    }
    public e0 b(a0 p0){
       a0 uoa0 = this.b.firstOrError();
       Objects.requireNonNull(p0);
       a.c(uoa0, "other is null");
       SingleToFlowable singleToFlow = new SingleToFlowable(uoa0);
       a.c(singleToFlow, "other is null");
       return a.i(new SingleTakeUntil(p0, singleToFlow));
    }
    public b c(h p0){
       h oh = this.b.toFlowable(BackpressureStrategy.LATEST);
       Objects.requireNonNull(p0);
       a.c(oh, "other is null");
       return a.f(new FlowableTakeUntil(p0, oh));
    }
    public q d(m p0){
       m om = this.b.firstElement();
       Objects.requireNonNull(p0);
       a.c(om, "other is null");
       return a.g(new MaybeTakeUntilMaybe(p0, om));
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || b.class != p0.getClass()) {
          return false;
       }
       return this.b.equals(p0.b);
    }
    public int hashCode(){
       return this.b.hashCode();
    }
    public String toString(){
       return "LifecycleTransformer{observable="+this.b+'}';
    }
}
