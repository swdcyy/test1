package kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collect$2;
import jtd.e;
import msd.p;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ktd.i;

public final class FlowKt__ReduceKt$firstOrNull$$inlined$collect$2 implements e	// class@001a7a
{
    public final p b;
    public final Ref$ObjectRef c;

    public void FlowKt__ReduceKt$firstOrNull$$inlined$collect$2(p p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1 uofirstOrNul;
       if (p1 instanceof FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1) {
          uofirstOrNul = p1;
          FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1 label = uofirstOrNul.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofirstOrNul.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1 result = uofirstOrNul.result;
             Object obj = b.h();
             FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1 label1 = uofirstOrNul.label;
             if (label1 != null) {
                if (label1 == 1) {
                   p0 = uofirstOrNul.L$3;
                   uofirstOrNul = uofirstOrNul.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uofirstOrNul.L$0 = this;
                uofirstOrNul.L$1 = p0;
                uofirstOrNul.L$2 = uofirstOrNul;
                uofirstOrNul.L$3 = p0;
                uofirstOrNul.label = 1;
                result = this.b.invoke(p0, uofirstOrNul);
                if (result == obj) {
                   return obj;
                }else {
                   FlowKt__ReduceKt$firstOrNull$$inlined$collect$2 uofirstOrNul1 = this;
                }
             }
             if (!result.booleanValue()) {
                return l1.a;
             }else {
                result.element = p0;
                throw new AbortFlowException(i.b);
             }
          }
       }
       uofirstOrNul = new FlowKt__ReduceKt$firstOrNull$$inlined$collect$2$1(this, p1);
       goto label_0018 ;
    }
}
