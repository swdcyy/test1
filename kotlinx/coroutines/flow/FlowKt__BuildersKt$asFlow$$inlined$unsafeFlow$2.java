package kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2;
import jtd.d;
import msd.l;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import qrd.l1;

public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2 implements d	// class@0019b9
{
    public final l a;

    public void FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(l p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 uoasFlow$$in;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 l$4;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 l$1;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 l$0;
       if (p1 instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1) {
          uoasFlow$$in = p1;
          FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 label = uoasFlow$$in.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoasFlow$$in.label = label - i;
          label_0018 :
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 result = uoasFlow$$in.result;
             Object obj = b.h();
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 label1 = uoasFlow$$in.label;
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 uoasFlow$$in1 = 1;
             if (label1 != null) {
                if (label1 != uoasFlow$$in1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_0089 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$4 = uoasFlow$$in.L$4;
                   label1 = uoasFlow$$in.L$3;
                   uoasFlow$$in1 = uoasFlow$$in.L$2;
                   l$1 = uoasFlow$$in.L$1;
                   l$0 = uoasFlow$$in.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                uoasFlow$$in.L$0 = this;
                uoasFlow$$in.L$1 = p0;
                uoasFlow$$in.L$2 = uoasFlow$$in;
                uoasFlow$$in.L$3 = p0;
                uoasFlow$$in.L$4 = p0;
                uoasFlow$$in.label = uoasFlow$$in1;
                result = this.a.invoke(uoasFlow$$in);
                if (result == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   label1 = p0;
                   l$1 = label1;
                   uoasFlow$$in1 = uoasFlow$$in;
                }
             }
             uoasFlow$$in.L$0 = l$0;
             uoasFlow$$in.L$1 = l$1;
             uoasFlow$$in.L$2 = uoasFlow$$in1;
             uoasFlow$$in.L$3 = label1;
             uoasFlow$$in.label = 2;
             if (l$4.emit(result, uoasFlow$$in) == obj) {
                return obj;
             }else {
                goto label_0089 ;
             }
          }
       }
       uoasFlow$$in = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1(this, p1);
       goto label_0018 ;
    }
}
