package kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import jtd.d;
import msd.p;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1;
import csd.b;
import kotlinx.coroutines.flow.internal.SafeCollector;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlin.coroutines.CoroutineContext;
import qrd.l1;

public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements d	// class@001a07
{
    public final d a;
    public final p b;

    public void FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(d p0,p p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 oonStart$$in;
       FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 l$4;
       FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 l$1;
       FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 l$0;
       if (p1 instanceof FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) {
          oonStart$$in = p1;
          FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 label = oonStart$$in.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oonStart$$in.label = label - i;
          label_0018 :
             FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 result = oonStart$$in.result;
             Object obj = b.h();
             FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 label1 = oonStart$$in.label;
             FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 oonStart$$in1 = 1;
             if (label1 != null) {
                if (label1 != oonStart$$in1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_00a0 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$4 = oonStart$$in.L$4;
                   label1 = oonStart$$in.L$3;
                   oonStart$$in1 = oonStart$$in.L$2;
                   l$1 = oonStart$$in.L$1;
                   l$0 = oonStart$$in.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                SafeCollector safeCollecto = new SafeCollector(p0, oonStart$$in.getContext());
                oonStart$$in.L$0 = this;
                oonStart$$in.L$1 = p0;
                oonStart$$in.L$2 = oonStart$$in;
                oonStart$$in.L$3 = p0;
                oonStart$$in.L$4 = safeCollecto;
                oonStart$$in.label = oonStart$$in1;
                if (this.b.invoke(safeCollecto, oonStart$$in) == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   l$1 = p0;
                   oonStart$$in1 = oonStart$$in;
                   l$4 = safeCollecto;
                   label1 = l$1;
                }
             }
             l$4.releaseIntercepted();
             oonStart$$in.L$0 = l$0;
             oonStart$$in.L$1 = l$1;
             oonStart$$in.L$2 = oonStart$$in1;
             oonStart$$in.L$3 = label1;
             oonStart$$in.L$4 = l$4;
             oonStart$$in.label = 2;
             if (l$0.a.b(label1, oonStart$$in) == obj) {
                return obj;
             }else {
                goto label_00a0 ;
             }
          }
       }
       oonStart$$in = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
