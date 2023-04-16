package kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$6;
import msd.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.l;
import asd.c;
import jtd.e;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.Boolean;
import dsd.a;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__ErrorsKt$retry$6 extends SuspendLambda implements r	// class@001a1a
{
    public final l $predicate;
    public final int $retries;
    public int label;
    public e p$;
    public Throwable p$0;
    public long p$1;

    public void FlowKt__ErrorsKt$retry$6(int p0,l p1,c p2){
       this.$retries = p0;
       this.$predicate = p1;
       super(4, p2);
    }
    public final c create(e p0,Throwable p1,long p2,c p3){
       FlowKt__ErrorsKt$retry$6 oretry$6 = new FlowKt__ErrorsKt$retry$6(this.$retries, this.$predicate, p3);
       oretry$6.p$ = p0;
       oretry$6.p$0 = p1;
       oretry$6.p$1 = p2;
       return oretry$6;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       return this.create(p0, p1, p2.longValue(), p3).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       FlowKt__ErrorsKt$retry$6 tp$1 = this.p$1;
       b = (this.$predicate.invoke(this.p$0).booleanValue() && tp$1 - (long)this.$retries < 0)? true: false;
       return a.a(b);
    }
}
