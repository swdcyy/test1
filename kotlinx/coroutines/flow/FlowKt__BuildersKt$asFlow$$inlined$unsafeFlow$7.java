package kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Integer;
import dsd.a;
import java.lang.Number;
import qrd.l1;

public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements d	// class@0019c3
{
    public final int[] a;

    public void FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(int[] p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 uoasFlow$$in;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 l$0;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 uoasFlow$$in1;
       Object obj1;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 uoasFlow$$in2;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 uoasFlow$$in3;
       int i3;
       if (p1 instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1) {
          uoasFlow$$in = p1;
          FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 label = uoasFlow$$in.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uoasFlow$$in.label = i2;
          label_0018 :
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 result = uoasFlow$$in.result;
             Object obj = b.h();
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 label1 = uoasFlow$$in.label;
             if (label1 != null) {
                if (label1 == 1) {
                   FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 i$1 = uoasFlow$$in.I$1;
                   l$0 = uoasFlow$$in.L$0;
                   j0.n(result);
                   result = uoasFlow$$in.L$3;
                   uoasFlow$$in1 = uoasFlow$$in.L$5;
                   obj1 = obj;
                   label = uoasFlow$$in;
                   uoasFlow$$in = uoasFlow$$in.L$1;
                   uoasFlow$$in2 = uoasFlow$$in.I$0;
                   label1 = uoasFlow$$in.L$2;
                   uoasFlow$$in3 = uoasFlow$$in.L$4;
                label_0094 :
                   i3 = i$1 + 1;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 ta = this.a;
                l$0 = this;
                uoasFlow$$in1 = ta;
                uoasFlow$$in3 = uoasFlow$$in1;
                obj1 = obj;
                uoasFlow$$in2 = ta.length;
                result = p0;
                label = uoasFlow$$in;
                label1 = label;
                uoasFlow$$in = result;
                i3 = 0;
             }
             if (i3 < uoasFlow$$in2) {
                int i4 = uoasFlow$$in1[i3];
                int i5 = a.f(i4).intValue();
                label.L$0 = l$0;
                label.L$1 = uoasFlow$$in;
                label.L$2 = label1;
                label.L$3 = result;
                label.L$4 = uoasFlow$$in3;
                label.L$5 = uoasFlow$$in1;
                label.I$0 = uoasFlow$$in2;
                label.I$1 = i3;
                label.I$2 = i4;
                label.I$3 = i5;
                label.label = 1;
                if (result.emit(a.f(i5), label) == obj1) {
                   return obj1;
                }else {
                   goto label_0094 ;
                }
             }else {
                return l1.a;
             }
          }
       }
       uoasFlow$$in = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1(this, p1);
       goto label_0018 ;
    }
}
