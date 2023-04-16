package kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1;
import jtd.d;
import msd.p;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1;
import csd.b;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlin.jvm.internal.Ref$BooleanRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$a;
import kotlin.coroutines.CoroutineContext;
import qrd.l1;

public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 implements d	// class@001a05
{
    public final d a;
    public final p b;

    public void FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(d p0,p p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 oonEmpty$$in;
       FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 l$5;
       FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 l$1;
       FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 l$0;
       if (p1 instanceof FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1) {
          oonEmpty$$in = p1;
          FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 label = oonEmpty$$in.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oonEmpty$$in.label = label - i;
          label_0018 :
             FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 result = oonEmpty$$in.result;
             Object obj = b.h();
             FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 label1 = oonEmpty$$in.label;
             FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 oonEmpty$$in1 = 1;
             if (label1 != null) {
                if (label1 != oonEmpty$$in1) {
                   if (label1 == 2) {
                      l$5 = oonEmpty$$in.L$5;
                      j0.n(result);
                   label_00bc :
                      l$5.releaseIntercepted();
                   label_00c6 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$5 = oonEmpty$$in.L$4;
                   label1 = oonEmpty$$in.L$3;
                   oonEmpty$$in1 = oonEmpty$$in.L$2;
                   l$1 = oonEmpty$$in.L$1;
                   l$0 = oonEmpty$$in.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                uBooleanRef.element = oonEmpty$$in1;
                FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 ta = this.a;
                oonEmpty$$in.L$0 = this;
                oonEmpty$$in.L$1 = p0;
                oonEmpty$$in.L$2 = oonEmpty$$in;
                oonEmpty$$in.L$3 = p0;
                oonEmpty$$in.L$4 = uBooleanRef;
                oonEmpty$$in.L$5 = ta;
                oonEmpty$$in.label = oonEmpty$$in1;
                if (ta.b(new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$a(p0, uBooleanRef), oonEmpty$$in) == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   e uoe = p0;
                   l$1 = uoe;
                   Ref$BooleanRef uBooleanRef1 = uBooleanRef;
                   oonEmpty$$in1 = oonEmpty$$in;
                }
             }
             if (l$5.element != null) {
                SafeCollector safeCollecto = new SafeCollector(label1, oonEmpty$$in.getContext());
                oonEmpty$$in.L$0 = l$0;
                oonEmpty$$in.L$1 = l$1;
                oonEmpty$$in.L$2 = oonEmpty$$in1;
                oonEmpty$$in.L$3 = label1;
                oonEmpty$$in.L$4 = l$5;
                oonEmpty$$in.L$5 = safeCollecto;
                oonEmpty$$in.label = 2;
                if (l$0.b.invoke(safeCollecto, oonEmpty$$in) == obj) {
                   return obj;
                }else {
                   l$5 = safeCollecto;
                   goto label_00bc ;
                }
             }else {
                goto label_00c6 ;
             }
          }
       }
       oonEmpty$$in = new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
