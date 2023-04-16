package kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10;
import jtd.d;
import usd.n;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1;
import csd.b;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Number;
import java.lang.Long;
import dsd.a;
import qrd.l1;

public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10 implements d	// class@0019b7
{
    public final n a;

    public void FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(n p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 uoasFlow$$in;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 l$5;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 l$0;
       Object obj1;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 uoasFlow$$in1;
       if (p1 instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1) {
          uoasFlow$$in = p1;
          FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 label = uoasFlow$$in.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uoasFlow$$in.label = i2;
          label_0018 :
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 result = uoasFlow$$in.result;
             Object obj = b.h();
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 label1 = uoasFlow$$in.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$5 = uoasFlow$$in.L$5;
                   l$0 = uoasFlow$$in.L$0;
                   j0.n(result);
                   result = uoasFlow$$in.L$3;
                   obj1 = obj;
                   label = uoasFlow$$in;
                   uoasFlow$$in = uoasFlow$$in.L$1;
                   uoasFlow$$in1 = uoasFlow$$in.L$4;
                   label1 = uoasFlow$$in.L$2;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10 ta = this.a;
                Iterator iterator = ta.iterator();
                l$0 = this;
                uoasFlow$$in1 = ta;
                obj1 = obj;
                result = p0;
                label = uoasFlow$$in;
                l$5 = iterator;
                uoasFlow$$in = result;
                label1 = label;
             }
             while (true) {
                if (!l$5.hasNext()) {
                   return l1.a;
                }
                Object obj2 = l$5.next();
                long l = obj2.longValue();
                label.L$0 = l$0;
                label.L$1 = uoasFlow$$in;
                label.L$2 = label1;
                label.L$3 = result;
                label.L$4 = uoasFlow$$in1;
                label.L$5 = l$5;
                label.L$6 = obj2;
                label.J$0 = l;
                label.label = 1;
                if (result.emit(a.g(l), label) == obj1) {
                   break ;
                }
             }
             return obj1;
          }
       }
       uoasFlow$$in = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1(this, p1);
       goto label_0018 ;
    }
}
