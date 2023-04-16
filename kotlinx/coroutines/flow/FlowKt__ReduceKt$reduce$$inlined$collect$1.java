package kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$$inlined$collect$1;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import msd.q;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$$inlined$collect$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ktd.j;
import qrd.l1;

public final class FlowKt__ReduceKt$reduce$$inlined$collect$1 implements e	// class@001a83
{
    public final Ref$ObjectRef b;
    public final q c;

    public void FlowKt__ReduceKt$reduce$$inlined$collect$1(Ref$ObjectRef p0,q p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__ReduceKt$reduce$$inlined$collect$1$1 oreduce$$inl;
       if (p1 instanceof FlowKt__ReduceKt$reduce$$inlined$collect$1$1) {
          oreduce$$inl = p1;
          FlowKt__ReduceKt$reduce$$inlined$collect$1$1 label = oreduce$$inl.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oreduce$$inl.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$reduce$$inlined$collect$1$1 result = oreduce$$inl.result;
             Object obj = b.h();
             FlowKt__ReduceKt$reduce$$inlined$collect$1$1 label1 = oreduce$$inl.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                   result = oreduce$$inl.L$4;
                   p0 = result;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                FlowKt__ReduceKt$reduce$$inlined$collect$1 tb = this.b;
                Ref$ObjectRef element = tb.element;
                if (element != j.a) {
                   oreduce$$inl.L$0 = this;
                   oreduce$$inl.L$1 = p0;
                   oreduce$$inl.L$2 = oreduce$$inl;
                   oreduce$$inl.L$3 = p0;
                   oreduce$$inl.L$4 = tb;
                   oreduce$$inl.label = 1;
                   p0 = this.c.invoke(element, p0, oreduce$$inl);
                   if (p0 == obj) {
                      return obj;
                   }
                }
             }
             result.element = p0;
             return l1.a;
          }
       }
       oreduce$$inl = new FlowKt__ReduceKt$reduce$$inlined$collect$1$1(this, p1);
       goto label_0018 ;
    }
}
