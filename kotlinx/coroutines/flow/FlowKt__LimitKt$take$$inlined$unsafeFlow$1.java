package kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1;
import csd.b;
import kotlin.jvm.internal.Ref$IntRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$a;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ktd.e;
import qrd.l1;

public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements d	// class@001a26
{
    public final d a;
    public final int b;

    public void FlowKt__LimitKt$take$$inlined$unsafeFlow$1(d p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 otake$$inlin;
       if (p1 instanceof FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) {
          otake$$inlin = p1;
          FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 label = otake$$inlin.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             otake$$inlin.label = label - i;
             try{
             label_0018 :
                FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 result = otake$$inlin.result;
                Object obj = b.h();
                FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 label1 = otake$$inlin.label;
                if (label1 != null) {
                   if (label1 == 1) {
                      j0.n(result);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(result);
                   Ref$IntRef intRef = new Ref$IntRef();
                   intRef.element = 0;
                   FlowKt__LimitKt$take$$inlined$unsafeFlow$1 ta = this.a;
                   otake$$inlin.L$0 = this;
                   otake$$inlin.L$1 = p0;
                   otake$$inlin.L$2 = otake$$inlin;
                   otake$$inlin.L$3 = p0;
                   otake$$inlin.L$4 = intRef;
                   otake$$inlin.L$5 = ta;
                   otake$$inlin.label = 1;
                   if (ta.b(new FlowKt__LimitKt$take$$inlined$unsafeFlow$1$a(p0, intRef, this), otake$$inlin) == obj) {
                      return obj;
                   }
                }
             }catch(kotlinx.coroutines.flow.internal.AbortFlowException e7){
                e.b(e7, otake$$inlin.L$3);
             }
             return l1.a;
          }
       }
       otake$$inlin = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
