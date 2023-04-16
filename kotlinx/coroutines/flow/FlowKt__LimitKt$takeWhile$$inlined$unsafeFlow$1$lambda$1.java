package kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.p;
import java.lang.Boolean;
import qrd.l1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1 implements e	// class@001a29
{
    public final e b;
    public final FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 c;

    public void FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1(e p0,FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1 otakeWhile$$;
       FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1 l$0;
       if (p1 instanceof FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1) {
          otakeWhile$$ = p1;
          FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1 label = otakeWhile$$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             otakeWhile$$.label = label - i;
          label_0018 :
             FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1 result = otakeWhile$$.result;
             Object obj = b.h();
             FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1 label1 = otakeWhile$$.label;
             FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1 otakeWhile$$1 = 1;
             if (label1 != null) {
                if (label1 != otakeWhile$$1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_0082 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   p0 = otakeWhile$$.L$3;
                   label1 = otakeWhile$$.L$2;
                   otakeWhile$$1 = otakeWhile$$.L$1;
                   l$0 = otakeWhile$$.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                otakeWhile$$.L$0 = this;
                otakeWhile$$.L$1 = p0;
                otakeWhile$$.L$2 = otakeWhile$$;
                otakeWhile$$.L$3 = p0;
                otakeWhile$$.label = otakeWhile$$1;
                result = this.c.b.invoke(p0, otakeWhile$$);
                if (result == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   otakeWhile$$1 = p0;
                   label1 = otakeWhile$$;
                }
             }
             if (result.booleanValue()) {
                otakeWhile$$.L$0 = l$0;
                otakeWhile$$.L$1 = otakeWhile$$1;
                otakeWhile$$.L$2 = label1;
                otakeWhile$$.L$3 = p0;
                otakeWhile$$.label = 2;
                if (l$0.b.emit(p0, otakeWhile$$) == obj) {
                   return obj;
                }else {
                   goto label_0082 ;
                }
             }else {
                throw new AbortFlowException(l$0.b);
             }
          }
       }
       otakeWhile$$ = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$lambda$1$1(this, p1);
       goto label_0018 ;
    }
}
