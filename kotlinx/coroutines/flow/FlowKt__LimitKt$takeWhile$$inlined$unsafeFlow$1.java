package kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import jtd.d;
import msd.p;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ktd.e;
import qrd.l1;

public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements d	// class@001a2a
{
    public final d a;
    public final p b;

    public void FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(d p0,p p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 otakeWhile$$;
       if (p1 instanceof FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) {
          otakeWhile$$ = p1;
          FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 label = otakeWhile$$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             otakeWhile$$.label = label - i;
             try{
             label_0018 :
                FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 result = otakeWhile$$.result;
                Object obj = b.h();
                FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 label1 = otakeWhile$$.label;
                if (label1 != null) {
                   if (label1 == 1) {
                      j0.n(result);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(result);
                   FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 ta = this.a;
                   otakeWhile$$.L$0 = this;
                   otakeWhile$$.L$1 = p0;
                   otakeWhile$$.L$2 = otakeWhile$$;
                   otakeWhile$$.L$3 = p0;
                   otakeWhile$$.L$4 = ta;
                   otakeWhile$$.label = 1;
                   if (ta.b(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1(p0, this), otakeWhile$$) == obj) {
                      return obj;
                   }
                }
             }catch(kotlinx.coroutines.flow.internal.AbortFlowException e6){
                e.b(e6, otakeWhile$$.L$3);
             }
             return l1.a;
          }
       }
       otakeWhile$$ = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
