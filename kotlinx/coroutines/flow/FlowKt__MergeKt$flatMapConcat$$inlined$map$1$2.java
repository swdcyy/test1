package kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.p;
import qrd.l1;

public final class FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2 implements e	// class@001a2f
{
    public final e b;
    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 c;

    public void FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2(e p0,FlowKt__MergeKt$flatMapConcat$$inlined$map$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 uoflatMapCon;
       FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 l$4;
       FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 l$3;
       FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 l$2;
       FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 l$1;
       FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 l$0;
       if (p1 instanceof FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1) {
          uoflatMapCon = p1;
          FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 label = uoflatMapCon.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoflatMapCon.label = label - i;
          label_0018 :
             FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 result = uoflatMapCon.result;
             Object obj = b.h();
             FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 label1 = uoflatMapCon.label;
             FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 uoflatMapCon1 = 1;
             if (label1 != null) {
                if (label1 != uoflatMapCon1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_00a5 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   p0 = uoflatMapCon.L$7;
                   label1 = uoflatMapCon.L$6;
                   uoflatMapCon1 = uoflatMapCon.L$5;
                   l$4 = uoflatMapCon.L$4;
                   l$3 = uoflatMapCon.L$3;
                   l$2 = uoflatMapCon.L$2;
                   l$1 = uoflatMapCon.L$1;
                   l$0 = uoflatMapCon.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2 tb = this.b;
                uoflatMapCon.L$0 = this;
                uoflatMapCon.L$1 = p0;
                uoflatMapCon.L$2 = uoflatMapCon;
                uoflatMapCon.L$3 = p0;
                uoflatMapCon.L$4 = uoflatMapCon;
                uoflatMapCon.L$5 = p0;
                uoflatMapCon.L$6 = tb;
                uoflatMapCon.L$7 = tb;
                uoflatMapCon.label = uoflatMapCon1;
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2 obj1 = this.c.b.invoke(p0, uoflatMapCon);
                if (obj1 == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   uoflatMapCon1 = p0;
                   l$3 = uoflatMapCon1;
                   l$1 = l$3;
                   p0 = tb;
                   l$4 = uoflatMapCon;
                   l$2 = l$4;
                   result = obj1;
                   obj1 = p0;
                }
             }
             uoflatMapCon.L$0 = l$0;
             uoflatMapCon.L$1 = l$1;
             uoflatMapCon.L$2 = l$2;
             uoflatMapCon.L$3 = l$3;
             uoflatMapCon.L$4 = l$4;
             uoflatMapCon.L$5 = uoflatMapCon1;
             uoflatMapCon.L$6 = label1;
             uoflatMapCon.label = 2;
             if (p0.emit(result, uoflatMapCon) == obj) {
                return obj;
             }else {
                goto label_00a5 ;
             }
          }
       }
       uoflatMapCon = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1(this, p1);
       goto label_0018 ;
    }
}
