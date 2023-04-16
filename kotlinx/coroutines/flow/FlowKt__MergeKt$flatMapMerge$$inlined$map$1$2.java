package kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.p;
import qrd.l1;

public final class FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2 implements e	// class@001a33
{
    public final e b;
    public final FlowKt__MergeKt$flatMapMerge$$inlined$map$1 c;

    public void FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2(e p0,FlowKt__MergeKt$flatMapMerge$$inlined$map$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 uoflatMapMer;
       FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 l$4;
       FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 l$3;
       FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 l$2;
       FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 l$1;
       FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 l$0;
       if (p1 instanceof FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1) {
          uoflatMapMer = p1;
          FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 label = uoflatMapMer.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoflatMapMer.label = label - i;
          label_0018 :
             FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 result = uoflatMapMer.result;
             Object obj = b.h();
             FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 label1 = uoflatMapMer.label;
             FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 uoflatMapMer1 = 1;
             if (label1 != null) {
                if (label1 != uoflatMapMer1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_00a5 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   p0 = uoflatMapMer.L$7;
                   label1 = uoflatMapMer.L$6;
                   uoflatMapMer1 = uoflatMapMer.L$5;
                   l$4 = uoflatMapMer.L$4;
                   l$3 = uoflatMapMer.L$3;
                   l$2 = uoflatMapMer.L$2;
                   l$1 = uoflatMapMer.L$1;
                   l$0 = uoflatMapMer.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2 tb = this.b;
                uoflatMapMer.L$0 = this;
                uoflatMapMer.L$1 = p0;
                uoflatMapMer.L$2 = uoflatMapMer;
                uoflatMapMer.L$3 = p0;
                uoflatMapMer.L$4 = uoflatMapMer;
                uoflatMapMer.L$5 = p0;
                uoflatMapMer.L$6 = tb;
                uoflatMapMer.L$7 = tb;
                uoflatMapMer.label = uoflatMapMer1;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2 obj1 = this.c.b.invoke(p0, uoflatMapMer);
                if (obj1 == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   uoflatMapMer1 = p0;
                   l$3 = uoflatMapMer1;
                   l$1 = l$3;
                   p0 = tb;
                   l$4 = uoflatMapMer;
                   l$2 = l$4;
                   result = obj1;
                   obj1 = p0;
                }
             }
             uoflatMapMer.L$0 = l$0;
             uoflatMapMer.L$1 = l$1;
             uoflatMapMer.L$2 = l$2;
             uoflatMapMer.L$3 = l$3;
             uoflatMapMer.L$4 = l$4;
             uoflatMapMer.L$5 = uoflatMapMer1;
             uoflatMapMer.L$6 = label1;
             uoflatMapMer.label = 2;
             if (p0.emit(result, uoflatMapMer) == obj) {
                return obj;
             }else {
                goto label_00a5 ;
             }
          }
       }
       uoflatMapMer = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1(this, p1);
       goto label_0018 ;
    }
}
