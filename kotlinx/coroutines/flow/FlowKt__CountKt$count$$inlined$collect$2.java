package kotlinx.coroutines.flow.FlowKt__CountKt$count$$inlined$collect$2;
import jtd.e;
import msd.p;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__CountKt$count$$inlined$collect$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;

public final class FlowKt__CountKt$count$$inlined$collect$2 implements e	// class@0019db
{
    public final p b;
    public final Ref$IntRef c;

    public void FlowKt__CountKt$count$$inlined$collect$2(p p0,Ref$IntRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__CountKt$count$$inlined$collect$2$1 uocount$$inl;
       if (p1 instanceof FlowKt__CountKt$count$$inlined$collect$2$1) {
          uocount$$inl = p1;
          FlowKt__CountKt$count$$inlined$collect$2$1 label = uocount$$inl.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocount$$inl.label = label - i;
          label_0018 :
             FlowKt__CountKt$count$$inlined$collect$2$1 result = uocount$$inl.result;
             Object obj = b.h();
             FlowKt__CountKt$count$$inlined$collect$2$1 label1 = uocount$$inl.label;
             if (label1 != null) {
                if (label1 == 1) {
                   p0 = uocount$$inl.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uocount$$inl.L$0 = this;
                uocount$$inl.L$1 = p0;
                uocount$$inl.L$2 = uocount$$inl;
                uocount$$inl.L$3 = p0;
                uocount$$inl.label = 1;
                result = this.b.invoke(p0, uocount$$inl);
                if (result == obj) {
                   return obj;
                }else {
                   p0 = this;
                }
             }
             if (result.booleanValue()) {
                p0 = p0.c;
                p0.element = p0.element + 1;
             }
             return l1.a;
          }
       }
       uocount$$inl = new FlowKt__CountKt$count$$inlined$collect$2$1(this, p1);
       goto label_0018 ;
    }
}
