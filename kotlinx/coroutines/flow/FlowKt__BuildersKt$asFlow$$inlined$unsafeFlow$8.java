package kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Long;
import dsd.a;
import java.lang.Number;
import qrd.l1;

public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 implements d	// class@0019c5
{
    public final long[] a;

    public void FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(long[] p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 uoasFlow$$in1;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 l$2;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 l$0;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 uoasFlow$$in2;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 uoasFlow$$in3;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 uoasFlow$$in4;
       Object obj1;
       int i3;
       long l1;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 a;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 uoasFlow$$in = this;
       c uoc = p1;
       if (uoc instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1) {
          uoasFlow$$in1 = uoc;
          FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 label = uoasFlow$$in1.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uoasFlow$$in1.label = i2;
          label_001c :
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 result = uoasFlow$$in1.result;
             Object obj = b.h();
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 label1 = uoasFlow$$in1.label;
             i1 = 1;
             if (label1 != null) {
                if (label1 == i1) {
                   label1 = uoasFlow$$in1.I$1;
                   l$2 = uoasFlow$$in1.L$2;
                   l$0 = uoasFlow$$in1.L$0;
                   j0.n(result);
                   result = uoasFlow$$in1.L$3;
                   uoasFlow$$in2 = uoasFlow$$in1.L$5;
                   uoasFlow$$in3 = uoasFlow$$in1.L$4;
                   uoasFlow$$in4 = uoasFlow$$in1.I$0;
                   obj1 = obj;
                   label = uoasFlow$$in1;
                   uoasFlow$$in1 = uoasFlow$$in1.L$1;
                label_00a1 :
                   i = label1 + i1;
                   i3 = i;
                   label1 = l$2;
                   l$2 = uoasFlow$$in3;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                a = uoasFlow$$in.a;
                l$0 = uoasFlow$$in;
                uoasFlow$$in2 = a;
                FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 uoasFlow$$in5 = uoasFlow$$in2;
                obj1 = obj;
                uoasFlow$$in4 = a.length;
                i3 = 0;
                result = p0;
                label = uoasFlow$$in1;
                label1 = label;
                uoasFlow$$in1 = result;
             }
             if (i3 < uoasFlow$$in4) {
                long l = uoasFlow$$in2[i3];
                l1 = a.g(l).longValue();
                Long longx = a.g(l1);
                label.L$0 = l$0;
                label.L$1 = uoasFlow$$in1;
                label.L$2 = label1;
                label.L$3 = result;
                label.L$4 = l$2;
                label.L$5 = uoasFlow$$in2;
                label.I$0 = uoasFlow$$in4;
                label.I$1 = i3;
                label.J$0 = l;
                label.J$1 = l1;
                i1 = 1;
                label.label = i1;
                obj1 = result.emit(longx, label);
                Object obj2 = obj1;
                if (obj1 == obj2) {
                   return obj2;
                }else {
                   obj1 = obj2;
                   l$2 = label1;
                   i = i3;
                   uoasFlow$$in3 = l$2;
                   goto label_00a1 ;
                }
             }else {
                return l1.a;
             }
          }
       }
       uoasFlow$$in1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1(uoasFlow$$in, uoc);
       goto label_001c ;
    }
}
