package kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ktd.j;
import msd.p;
import java.lang.Boolean;
import qrd.l1;

public final class FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2 implements e	// class@0019ec
{
    public final e b;
    public final Ref$ObjectRef c;
    public final FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1 d;

    public void FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2(e p0,Ref$ObjectRef p1,FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1 uodistinctUn;
       if (p1 instanceof FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1) {
          uodistinctUn = p1;
          FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1 label = uodistinctUn.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodistinctUn.label = label - i;
          label_0018 :
             FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1 result = uodistinctUn.result;
             Object obj = b.h();
             FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1 label1 = uodistinctUn.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef element = this.c.element;
                if (element == j.a || !this.d.b.invoke(element, p0).booleanValue()) {
                   element.element = p0;
                   uodistinctUn.L$0 = this;
                   uodistinctUn.L$1 = p0;
                   uodistinctUn.L$2 = uodistinctUn;
                   uodistinctUn.L$3 = p0;
                   uodistinctUn.L$4 = p0;
                   uodistinctUn.label = 1;
                   if (this.b.emit(p0, uodistinctUn) == obj) {
                      return obj;
                   }
                }
             }
             return l1.a;
          }
       }
       uodistinctUn = new FlowKt__DistinctKt$distinctUntilChanged$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2$1(this, p1);
       goto label_0018 ;
    }
}