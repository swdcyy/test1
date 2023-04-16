package kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import qrd.l1;

public final class FlowKt__ErrorsKt$catchImpl$$inlined$collect$1 implements e	// class@001a13
{
    public final e b;
    public final Ref$ObjectRef c;

    public void FlowKt__ErrorsKt$catchImpl$$inlined$collect$1(e p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 uocatchImpl$;
       if (p1 instanceof FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1) {
          uocatchImpl$ = p1;
          FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 label = uocatchImpl$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocatchImpl$.label = label - i;
          label_0018 :
             FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 result = uocatchImpl$.result;
             Object obj = b.h();
             FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1 label1 = uocatchImpl$.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                uocatchImpl$.L$0 = this;
                uocatchImpl$.L$1 = p0;
                uocatchImpl$.L$2 = uocatchImpl$;
                uocatchImpl$.L$3 = p0;
                uocatchImpl$.label = 1;
                if (this.b.emit(p0, uocatchImpl$) == obj) {
                   return obj;
                }
             }
             return l1.a;
          }
       }
       uocatchImpl$ = new FlowKt__ErrorsKt$catchImpl$$inlined$collect$1$1(this, p1);
       goto label_0018 ;
    }
}
