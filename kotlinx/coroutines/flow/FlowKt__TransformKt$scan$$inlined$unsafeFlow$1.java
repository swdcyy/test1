package kotlinx.coroutines.flow.FlowKt__TransformKt$scan$$inlined$unsafeFlow$1;
import jtd.d;
import java.lang.Object;
import msd.q;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1;
import qrd.l1;

public final class FlowKt__TransformKt$scan$$inlined$unsafeFlow$1 implements d	// class@001aaa
{
    public final d a;
    public final Object b;
    public final q c;

    public void FlowKt__TransformKt$scan$$inlined$unsafeFlow$1(d p0,Object p1,q p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 oscan$$inlin;
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 l$1;
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 l$0;
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 oscan$$inlin2;
       FlowKt__TransformKt$scan$$inlined$unsafeFlow$1 a;
       if (p1 instanceof FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1) {
          oscan$$inlin = p1;
          FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 label = oscan$$inlin.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oscan$$inlin.label = label - i;
          label_0018 :
             FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 result = oscan$$inlin.result;
             Object obj = b.h();
             FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 label1 = oscan$$inlin.label;
             FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1 oscan$$inlin1 = 1;
             if (label1 != null) {
                if (label1 != oscan$$inlin1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_00a4 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   oscan$$inlin1 = oscan$$inlin.L$2;
                   l$1 = oscan$$inlin.L$1;
                   l$0 = oscan$$inlin.L$0;
                   j0.n(result);
                   result = oscan$$inlin.L$4;
                   oscan$$inlin2 = oscan$$inlin.L$3;
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                a = this.b;
                objectRef.element = a;
                oscan$$inlin.L$0 = this;
                oscan$$inlin.L$1 = p0;
                oscan$$inlin.L$2 = oscan$$inlin;
                oscan$$inlin.L$3 = p0;
                oscan$$inlin.L$4 = objectRef;
                oscan$$inlin.label = oscan$$inlin1;
                if (p0.emit(a, oscan$$inlin) == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   l$1 = p0;
                   oscan$$inlin1 = oscan$$inlin;
                }
             }
             a = l$0.a;
             oscan$$inlin.L$0 = l$0;
             oscan$$inlin.L$1 = l$1;
             oscan$$inlin.L$2 = oscan$$inlin1;
             oscan$$inlin.L$3 = oscan$$inlin2;
             oscan$$inlin.L$4 = result;
             oscan$$inlin.L$5 = a;
             oscan$$inlin.label = 2;
             if (a.b(new FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$lambda$1(oscan$$inlin2, result, l$0), oscan$$inlin) == obj) {
                return obj;
             }else {
                goto label_00a4 ;
             }
          }
       }
       oscan$$inlin = new FlowKt__TransformKt$scan$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
