package kotlinx.coroutines.flow.FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ktd.j;
import msd.q;
import qrd.l1;

public final class FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1 implements e	// class@001aac
{
    public final e b;
    public final Ref$ObjectRef c;
    public final FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1 d;

    public void FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1(e p0,Ref$ObjectRef p1,FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 oscanReduce$;
       FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 l$1;
       FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 l$0;
       if (p1 instanceof FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1) {
          oscanReduce$ = p1;
          FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 label = oscanReduce$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oscanReduce$.label = label - i;
          label_0018 :
             FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 result = oscanReduce$.result;
             Object obj = b.h();
             FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 label1 = oscanReduce$.label;
             FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1 oscanReduce$1 = 1;
             if (label1 != null) {
                if (label1 != oscanReduce$1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_0099 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   label1 = oscanReduce$.L$3;
                   oscanReduce$1 = oscanReduce$.L$2;
                   l$1 = oscanReduce$.L$1;
                   l$0 = oscanReduce$.L$0;
                   j0.n(result);
                   result = oscanReduce$.L$4;
                   p0 = result;
                }
             }else {
                j0.n(result);
                FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1 tc = this.c;
                Ref$ObjectRef element = tc.element;
                if (element == j.a) {
                   l$0 = this;
                   label1 = p0;
                   l$1 = label1;
                   oscanReduce$1 = oscanReduce$;
                }else {
                   oscanReduce$.L$0 = this;
                   oscanReduce$.L$1 = p0;
                   oscanReduce$.L$2 = oscanReduce$;
                   oscanReduce$.L$3 = p0;
                   oscanReduce$.L$4 = tc;
                   oscanReduce$.label = oscanReduce$1;
                   Object obj1 = this.d.b.invoke(element, p0, oscanReduce$);
                   if (obj1 == obj) {
                      return obj;
                   }else {
                      l$0 = this;
                      l$1 = p0;
                      oscanReduce$1 = oscanReduce$;
                      p0 = obj1;
                      label1 = l$1;
                   }
                }
             }
             result.element = p0;
             oscanReduce$.L$0 = l$0;
             oscanReduce$.L$1 = l$1;
             oscanReduce$.L$2 = oscanReduce$1;
             oscanReduce$.L$3 = label1;
             oscanReduce$.label = 2;
             if (l$0.b.emit(l$0.c.element, oscanReduce$) == obj) {
                return obj;
             }else {
                goto label_0099 ;
             }
          }
       }
       oscanReduce$ = new FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1$1(this, p1);
       goto label_0018 ;
    }
}
