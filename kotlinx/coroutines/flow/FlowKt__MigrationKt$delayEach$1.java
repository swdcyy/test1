package kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.c;

public final class FlowKt__MigrationKt$delayEach$1 extends SuspendLambda implements p	// class@001a6b
{
    public final long $timeMillis;
    public Object L$0;
    public int label;
    public Object p$0;

    public void FlowKt__MigrationKt$delayEach$1(long p0,c p1){
       this.$timeMillis = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FlowKt__MigrationKt$delayEach$1 uodelayEach$ = new FlowKt__MigrationKt$delayEach$1(this.$timeMillis, p1);
       uodelayEach$.p$0 = p0;
       return uodelayEach$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__MigrationKt$delayEach$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$0;
          this.label = 1;
          if (c.a(this.$timeMillis, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
