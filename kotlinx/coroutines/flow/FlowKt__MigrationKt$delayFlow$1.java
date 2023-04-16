package kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.c;

public final class FlowKt__MigrationKt$delayFlow$1 extends SuspendLambda implements p	// class@001a6c
{
    public final long $timeMillis;
    public Object L$0;
    public int label;
    public e p$;

    public void FlowKt__MigrationKt$delayFlow$1(long p0,c p1){
       this.$timeMillis = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FlowKt__MigrationKt$delayFlow$1 uodelayFlow$ = new FlowKt__MigrationKt$delayFlow$1(this.$timeMillis, p1);
       uodelayFlow$.p$ = p0;
       return uodelayFlow$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__MigrationKt$delayFlow$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (c.a(this.$timeMillis, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
