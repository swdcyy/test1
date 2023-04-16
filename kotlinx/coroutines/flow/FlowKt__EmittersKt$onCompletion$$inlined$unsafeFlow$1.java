package kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import jtd.d;
import msd.q;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt;
import qrd.l1;
import jtd.n;

public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements d	// class@001a01
{
    public final d a;
    public final q b;

    public void FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(d p0,q p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 oonCompletio;
       FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 l$4;
       FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 l$0;
       if (p1 instanceof FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) {
          oonCompletio = p1;
          FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 label = oonCompletio.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oonCompletio.label = label - i;
          label_0018 :
             FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 result = oonCompletio.result;
             Object obj = b.h();
             FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 label1 = oonCompletio.label;
             SafeCollector safeCollecto = 2;
             FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 oonCompletio1 = 1;
             if (label1 != null) {
                if (label1 != oonCompletio1) {
                   if (label1 != safeCollecto) {
                      if (label1 == 3) {
                         j0.n(result);
                      label_00b0 :
                         return l1.a;
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      l$4 = oonCompletio.L$4;
                      j0.n(result);
                      throw l$4;
                   }
                }else {
                   l$4 = oonCompletio.L$3;
                   label1 = oonCompletio.L$2;
                   oonCompletio1 = oonCompletio.L$1;
                   l$0 = oonCompletio.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                oonCompletio.L$0 = this;
                oonCompletio.L$1 = p0;
                oonCompletio.L$2 = oonCompletio;
                oonCompletio.L$3 = p0;
                oonCompletio.label = oonCompletio1;
                if (this.a.b(p0, oonCompletio) == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   oonCompletio1 = p0;
                   label1 = oonCompletio;
                }
             }
             oonCompletio.L$0 = l$0;
             oonCompletio.L$1 = oonCompletio1;
             oonCompletio.L$2 = label1;
             oonCompletio.L$3 = l$4;
             oonCompletio.label = 3;
             if (FlowKt__EmittersKt.a(new SafeCollector(l$4, oonCompletio.getContext()), l$0.b, null, oonCompletio) == obj) {
                return obj;
             }else {
                goto label_00b0 ;
             }
          }
       }
       oonCompletio = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
