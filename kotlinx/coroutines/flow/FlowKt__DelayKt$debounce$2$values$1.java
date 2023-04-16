package kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$values$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import jtd.d;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$values$1$a;
import jtd.e;

public final class FlowKt__DelayKt$debounce$2$values$1 extends SuspendLambda implements p	// class@0019e2
{
    public Object L$0;
    public Object L$1;
    public int label;
    public w p$;
    public final FlowKt__DelayKt$debounce$2 this$0;

    public void FlowKt__DelayKt$debounce$2$values$1(FlowKt__DelayKt$debounce$2 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FlowKt__DelayKt$debounce$2$values$1 uodebounce$2 = new FlowKt__DelayKt$debounce$2$values$1(this.this$0, p1);
       uodebounce$2.p$ = p0;
       return uodebounce$2;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__DelayKt$debounce$2$values$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          FlowKt__DelayKt$debounce$2 $this_deboun = this.this$0.$this_debounce;
          this.L$0 = p0;
          this.L$1 = $this_deboun;
          this.label = 1;
          if ($this_deboun.b(new FlowKt__DelayKt$debounce$2$values$1$a(p0), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
