package kotlinx.coroutines.flow.FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scan$$inlined$unsafeFlow$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.q;
import qrd.l1;

public final class FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1 implements e	// class@001aa9
{
    public final e b;
    public final Ref$ObjectRef c;
    public final FlowKt__TransformKt$scan$$inlined$unsafeFlow$1 d;

    public void FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1(e p0,Ref$ObjectRef p1,FlowKt__TransformKt$scan$$inlined$unsafeFlow$1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 oscan$$inlin;
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 l$1;
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 l$0;
       if (p1 instanceof FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1) {
          oscan$$inlin = p1;
          FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 label = oscan$$inlin.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oscan$$inlin.label = label - i;
          label_0018 :
             FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 result = oscan$$inlin.result;
             Object obj = b.h();
             FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 label1 = oscan$$inlin.label;
             FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1 oscan$$inlin1 = 1;
             if (label1 != null) {
                if (label1 != oscan$$inlin1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_008d :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   p0 = oscan$$inlin.L$4;
                   label1 = oscan$$inlin.L$3;
                   oscan$$inlin1 = oscan$$inlin.L$2;
                   l$1 = oscan$$inlin.L$1;
                   l$0 = oscan$$inlin.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1 tc = this.c;
                oscan$$inlin.L$0 = this;
                oscan$$inlin.L$1 = p0;
                oscan$$inlin.L$2 = oscan$$inlin;
                oscan$$inlin.L$3 = p0;
                oscan$$inlin.L$4 = tc;
                oscan$$inlin.label = oscan$$inlin1;
                Object obj1 = this.d.c.invoke(tc.element, p0, oscan$$inlin);
                if (obj1 == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   l$1 = p0;
                   oscan$$inlin1 = oscan$$inlin;
                   p0 = tc;
                   result = obj1;
                   label1 = l$1;
                }
             }
             p0.element = result;
             oscan$$inlin.L$0 = l$0;
             oscan$$inlin.L$1 = l$1;
             oscan$$inlin.L$2 = oscan$$inlin1;
             oscan$$inlin.L$3 = label1;
             oscan$$inlin.label = 2;
             if (l$0.b.emit(l$0.c.element, oscan$$inlin) == obj) {
                return obj;
             }else {
                goto label_008d ;
             }
          }
       }
       oscan$$inlin = new FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1$1(this, p1);
       goto label_0018 ;
    }
}
