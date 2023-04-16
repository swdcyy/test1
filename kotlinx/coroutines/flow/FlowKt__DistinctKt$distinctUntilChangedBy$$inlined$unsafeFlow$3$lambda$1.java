package kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1;
import msd.l;
import ktd.j;
import msd.p;
import java.lang.Boolean;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1 implements e	// class@0019fc
{
    public final e b;
    public final Ref$ObjectRef c;
    public final FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3 d;

    public void FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1(e p0,Ref$ObjectRef p1,FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1 uodistinctUn = new FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1(this, p1);
       c0.e(5);
       Object obj = this.d.b.invoke(p0);
       Ref$ObjectRef element = this.c.element;
       if (element == j.a || !this.d.c.invoke(element, obj).booleanValue()) {
          this.c.element = obj;
          c0.e(0);
          p0 = this.b.emit(p0, p1);
          c0.e(2);
          c0.e(1);
       }
       return l1.a;
    }
    public Object emit(Object p0,c p1){
       FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1 uodistinctUn;
       if (p1 instanceof FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1) {
          uodistinctUn = p1;
          FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1 label = uodistinctUn.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodistinctUn.label = label - i;
          label_0018 :
             FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1 result = uodistinctUn.result;
             Object obj = b.h();
             FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1 label1 = uodistinctUn.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                result = this.d.b.invoke(p0);
                Ref$ObjectRef element = this.c.element;
                if (element == j.a || !this.d.c.invoke(element, result).booleanValue()) {
                   this.c.element = result;
                   uodistinctUn.L$0 = this;
                   uodistinctUn.L$1 = p0;
                   uodistinctUn.L$2 = uodistinctUn;
                   uodistinctUn.L$3 = p0;
                   uodistinctUn.L$4 = result;
                   uodistinctUn.label = 1;
                   if (this.b.emit(p0, uodistinctUn) == obj) {
                      return obj;
                   }
                }
             }
             return l1.a;
          }
       }
       uodistinctUn = new FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1$1(this, p1);
       goto label_0018 ;
    }
}
