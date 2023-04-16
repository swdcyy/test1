package kotlinx.coroutines.flow.FlowKt__EmittersKt;
import jtd.e;
import msd.q;
import java.lang.Throwable;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import qrd.l1;
import qrd.i;
import jtd.d;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$2;
import jtd.f;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1;

public final class FlowKt__EmittersKt	// class@001a0f
{

    public static final Object a(e p0,q p1,Throwable p2,c p3){
       FlowKt__EmittersKt$invokeSafely$1 oinvokeSafel;
       if (p3 instanceof FlowKt__EmittersKt$invokeSafely$1) {
          oinvokeSafel = p3;
          FlowKt__EmittersKt$invokeSafely$1 label = oinvokeSafel.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oinvokeSafel.label = label - i;
          label_0018 :
             FlowKt__EmittersKt$invokeSafely$1 result = oinvokeSafel.result;
             Object obj = b.h();
             FlowKt__EmittersKt$invokeSafely$1 label1 = oinvokeSafel.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                oinvokeSafel.L$0 = p0;
                oinvokeSafel.L$1 = p1;
                oinvokeSafel.L$2 = p2;
                oinvokeSafel.label = 1;
                if (p1.invoke(p0, p2, oinvokeSafel) == obj) {
                   return obj;
                }
             }
             return l1.a;
          }
       }
       oinvokeSafel = new FlowKt__EmittersKt$invokeSafely$1(p3);
       goto label_0018 ;
    }
    public static final d b(d p0,p p1){
       return f.d1(p0, new FlowKt__EmittersKt$onCompletion$2(p1, null));
    }
    public static final d c(d p0,q p1){
       return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(p0, p1);
    }
    public static final d d(d p0,p p1){
       return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(p0, p1);
    }
    public static final d e(d p0,p p1){
       return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(p0, p1);
    }
    public static final d f(d p0,q p1){
       return f.F0(new FlowKt__EmittersKt$transform$1(p0, p1, null));
    }
    public static final d g(d p0,q p1){
       return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(p0, p1);
    }
}
