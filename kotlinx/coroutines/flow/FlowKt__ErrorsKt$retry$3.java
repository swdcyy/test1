package kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3;
import msd.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.p;
import asd.c;
import jtd.e;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import dsd.a;

public final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements r	// class@001a18
{
    public final p $predicate;
    public final long $retries;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public e p$;
    public Throwable p$0;
    public long p$1;

    public void FlowKt__ErrorsKt$retry$3(long p0,p p1,c p2){
       this.$retries = p0;
       this.$predicate = p1;
       super(4, p2);
    }
    public final c create(e p0,Throwable p1,long p2,c p3){
       FlowKt__ErrorsKt$retry$3 oretry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, p3);
       oretry$3.p$ = p0;
       oretry$3.p$0 = p1;
       oretry$3.p$1 = p2;
       return oretry$3;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       return this.create(p0, p1, p2.longValue(), p3).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       Object obj = b.h();
       FlowKt__ErrorsKt$retry$3 tlabel = this.label;
       b = true;
       if (tlabel != null) {
          if (tlabel == b) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.p$0;
          FlowKt__ErrorsKt$retry$3 tp$1 = this.p$1;
          if (tp$1 - this.$retries < 0) {
             this.L$0 = p0;
             this.L$1 = tlabel;
             this.J$0 = tp$1;
             this.label = b;
             p0 = this.$predicate.invoke(tlabel, this);
             if (p0 == obj) {
                return obj;
             }
          }else {
          label_0048 :
             b = false;
          label_0049 :
             return a.a(b);
          }
       }
       if (p0.booleanValue()) {
          goto label_0049 ;
       }else {
          goto label_0048 ;
       }
    }
}
