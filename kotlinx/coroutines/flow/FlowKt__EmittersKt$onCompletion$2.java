package kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.p;
import asd.c;
import jtd.e;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__EmittersKt$onCompletion$2 extends SuspendLambda implements q	// class@001a02
{
    public final p $action;
    public Object L$0;
    public Object L$1;
    public int label;
    public e p$;
    public Throwable p$0;

    public void FlowKt__EmittersKt$onCompletion$2(p p0,c p1){
       this.$action = p0;
       super(3, p1);
    }
    public final c create(e p0,Throwable p1,c p2){
       FlowKt__EmittersKt$onCompletion$2 oonCompletio = new FlowKt__EmittersKt$onCompletion$2(this.$action, p2);
       oonCompletio.p$ = p0;
       oonCompletio.p$0 = p1;
       return oonCompletio;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__EmittersKt$onCompletion$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tlabel = this.p$0;
          this.L$0 = this.p$;
          this.L$1 = tlabel;
          this.label = 1;
          if (this.$action.invoke(tlabel, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
