package kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5;
import jtd.d;
import wsd.m;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1;
import csd.b;
import java.util.Iterator;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import qrd.l1;

public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5 implements d	// class@0019bf
{
    public final m a;

    public void FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(m p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 uoasFlow$$in;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 l$5;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 l$0;
       Object obj1;
       FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 uoasFlow$$in1;
       if (p1 instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1) {
          uoasFlow$$in = p1;
          FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 label = uoasFlow$$in.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uoasFlow$$in.label = i2;
          label_0018 :
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 result = uoasFlow$$in.result;
             Object obj = b.h();
             FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 label1 = uoasFlow$$in.label;
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
                FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5 ta = this.a;
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
                label.L$0 = l$0;
                label.L$1 = uoasFlow$$in;
                label.L$2 = label1;
                label.L$3 = result;
                label.L$4 = uoasFlow$$in1;
                label.L$5 = l$5;
                label.L$6 = obj2;
                label.L$7 = obj2;
                label.label = 1;
                if (result.emit(obj2, label) == obj1) {
                   break ;
                }
             }
             return obj1;
          }
       }
       uoasFlow$$in = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1(this, p1);
       goto label_0018 ;
    }
}
