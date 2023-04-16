package kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$$inlined$collect$1;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import msd.q;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$$inlined$collect$1$1;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__ReduceKt$fold$$inlined$collect$1 implements e	// class@001a7e
{
    public final Ref$ObjectRef b;
    public final q c;

    public void FlowKt__ReduceKt$fold$$inlined$collect$1(Ref$ObjectRef p0,q p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__ReduceKt$fold$$inlined$collect$1$1 uofold$$inli = new FlowKt__ReduceKt$fold$$inlined$collect$1$1(this, p1);
       c0.e(5);
       FlowKt__ReduceKt$fold$$inlined$collect$1 tb = this.b;
       tb.element = this.c.invoke(tb.element, p0, p1);
       return l1.a;
    }
    public Object emit(Object p0,c p1){
       FlowKt__ReduceKt$fold$$inlined$collect$1$1 uofold$$inli;
       if (p1 instanceof FlowKt__ReduceKt$fold$$inlined$collect$1$1) {
          uofold$$inli = p1;
          FlowKt__ReduceKt$fold$$inlined$collect$1$1 label = uofold$$inli.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofold$$inli.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$fold$$inlined$collect$1$1 result = uofold$$inli.result;
             Object obj = b.h();
             FlowKt__ReduceKt$fold$$inlined$collect$1$1 label1 = uofold$$inli.label;
             if (label1 != null) {
                if (label1 == 1) {
                   p0 = uofold$$inli.L$4;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                FlowKt__ReduceKt$fold$$inlined$collect$1 tb = this.b;
                uofold$$inli.L$0 = this;
                uofold$$inli.L$1 = p0;
                uofold$$inli.L$2 = uofold$$inli;
                uofold$$inli.L$3 = p0;
                uofold$$inli.L$4 = tb;
                uofold$$inli.label = 1;
                p0 = this.c.invoke(tb.element, p0, uofold$$inli);
                if (p0 == obj) {
                   return obj;
                }else {
                   result = p0;
                   p0 = tb;
                }
             }
             p0.element = result;
             return l1.a;
          }
       }
       uofold$$inli = new FlowKt__ReduceKt$fold$$inlined$collect$1$1(this, p1);
       goto label_0018 ;
    }
}
