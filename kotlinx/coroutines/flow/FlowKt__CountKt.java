package kotlinx.coroutines.flow.FlowKt__CountKt;
import jtd.d;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__CountKt$count$1;
import csd.b;
import kotlin.jvm.internal.Ref$IntRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__CountKt$a;
import jtd.e;
import java.lang.Integer;
import dsd.a;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__CountKt$count$3;
import kotlinx.coroutines.flow.FlowKt__CountKt$count$$inlined$collect$2;

public final class FlowKt__CountKt	// class@0019de
{

    public static final Object a(d p0,c p1){
       FlowKt__CountKt$count$1 uocount$1;
       FlowKt__CountKt$count$1 l$1;
       if (p1 instanceof FlowKt__CountKt$count$1) {
          uocount$1 = p1;
          FlowKt__CountKt$count$1 label = uocount$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocount$1.label = label - i;
          label_0018 :
             FlowKt__CountKt$count$1 result = uocount$1.result;
             Object obj = b.h();
             FlowKt__CountKt$count$1 label1 = uocount$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = uocount$1.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$IntRef intRef = new Ref$IntRef();
                intRef.element = 0;
                uocount$1.L$0 = p0;
                uocount$1.L$1 = intRef;
                uocount$1.L$2 = p0;
                uocount$1.label = 1;
                if (p0.b(new FlowKt__CountKt$a(intRef), uocount$1) == obj) {
                   return obj;
                }else {
                   l$1 = intRef;
                }
             }
             return a.f(l$1.element);
          }
       }
       uocount$1 = new FlowKt__CountKt$count$1(p1);
       goto label_0018 ;
    }
    public static final Object b(d p0,p p1,c p2){
       FlowKt__CountKt$count$3 uocount$3;
       FlowKt__CountKt$count$3 l$2;
       if (p2 instanceof FlowKt__CountKt$count$3) {
          uocount$3 = p2;
          FlowKt__CountKt$count$3 label = uocount$3.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocount$3.label = label - i;
          label_0018 :
             FlowKt__CountKt$count$3 result = uocount$3.result;
             Object obj = b.h();
             FlowKt__CountKt$count$3 label1 = uocount$3.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$2 = uocount$3.L$2;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$IntRef intRef = new Ref$IntRef();
                intRef.element = 0;
                uocount$3.L$0 = p0;
                uocount$3.L$1 = p1;
                uocount$3.L$2 = intRef;
                uocount$3.L$3 = p0;
                uocount$3.label = 1;
                if (p0.b(new FlowKt__CountKt$count$$inlined$collect$2(p1, intRef), uocount$3) == obj) {
                   return obj;
                }else {
                   l$2 = intRef;
                }
             }
             return a.f(l$2.element);
          }
       }
       uocount$3 = new FlowKt__CountKt$count$3(p2);
       goto label_0018 ;
    }
}
