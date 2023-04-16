package kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import qrd.l1;

public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 implements d	// class@0019ca
{
    public final Object[] a;

    public void FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(Object[] p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 uoflowOf$$in;
       FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 l$0;
       FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 uoflowOf$$in1;
       FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 uoflowOf$$in2;
       Object obj1;
       int i3;
       if (p1 instanceof FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) {
          uoflowOf$$in = p1;
          FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 label = uoflowOf$$in.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uoflowOf$$in.label = i2;
          label_0018 :
             FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 result = uoflowOf$$in.result;
             Object obj = b.h();
             FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 label1 = uoflowOf$$in.label;
             if (label1 != null) {
                if (label1 == 1) {
                   FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 i$1 = uoflowOf$$in.I$1;
                   l$0 = uoflowOf$$in.L$0;
                   j0.n(result);
                   result = uoflowOf$$in.L$3;
                   uoflowOf$$in1 = uoflowOf$$in.I$0;
                   label1 = uoflowOf$$in.L$2;
                   uoflowOf$$in2 = uoflowOf$$in.L$4;
                   obj1 = obj;
                   label = uoflowOf$$in;
                   uoflowOf$$in = uoflowOf$$in.L$1;
                label_007d :
                   i3 = i$1 + 1;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 ta = this.a;
                l$0 = this;
                uoflowOf$$in2 = ta;
                obj1 = obj;
                uoflowOf$$in1 = ta.length;
                result = p0;
                label = uoflowOf$$in;
                label1 = label;
                uoflowOf$$in = result;
                i3 = 0;
             }
             if (i3 < uoflowOf$$in1) {
                object oobject = uoflowOf$$in2[i3];
                label.L$0 = l$0;
                label.L$1 = uoflowOf$$in;
                label.L$2 = label1;
                label.L$3 = result;
                label.L$4 = uoflowOf$$in2;
                label.I$0 = uoflowOf$$in1;
                label.I$1 = i3;
                label.L$5 = oobject;
                label.label = 1;
                if (result.emit(oobject, label) == obj1) {
                   return obj1;
                }else {
                   goto label_007d ;
                }
             }else {
                return l1.a;
             }
          }
       }
       uoflowOf$$in = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
