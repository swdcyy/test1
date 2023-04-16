package kotlinx.coroutines.flow.FlowKt__LimitKt;
import jtd.d;
import kotlinx.coroutines.flow.FlowKt__LimitKt$a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1;
import csd.b;
import java.lang.IllegalStateException;
import qrd.j0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

public final class FlowKt__LimitKt	// class@001a2b
{

    public static final d a(d p0,int p1){
       FlowKt__LimitKt$a uoa = (p1 >= 0)? 1: null;
       if (uoa) {
          return new FlowKt__LimitKt$a(p0, p1);
       }else {
          throw new IllegalArgumentException("Drop count should be non-negative, but had "+p1.toString());
       }
    }
    public static final d b(d p0,p p1){
       return new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(p0, p1);
    }
    public static final Object c(e p0,Object p1,c p2){
       FlowKt__LimitKt$emitAbort$1 uoemitAbort$;
       FlowKt__LimitKt$emitAbort$1 l$0;
       if (p2 instanceof FlowKt__LimitKt$emitAbort$1) {
          uoemitAbort$ = p2;
          FlowKt__LimitKt$emitAbort$1 label = uoemitAbort$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoemitAbort$.label = label - i;
          label_0018 :
             FlowKt__LimitKt$emitAbort$1 result = uoemitAbort$.result;
             Object obj = b.h();
             FlowKt__LimitKt$emitAbort$1 label1 = uoemitAbort$.label;
             if (label1 != null) {
                if (label1 != 1) {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }else {
                   l$0 = uoemitAbort$.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                uoemitAbort$.L$0 = p0;
                uoemitAbort$.L$1 = p1;
                uoemitAbort$.label = 1;
                if (p0.emit(p1, uoemitAbort$) == obj) {
                   return obj;
                }
             }
             throw new AbortFlowException(l$0);
          }
       }
       uoemitAbort$ = new FlowKt__LimitKt$emitAbort$1(p2);
       goto label_0018 ;
    }
    public static final d d(d p0,int p1){
       FlowKt__LimitKt$take$$inlined$unsafeFlow$1 otake$$inlin = (p1 > 0)? 1: null;
       if (otake$$inlin) {
          return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(p0, p1);
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" should be positive".toString());
       }
    }
    public static final d e(d p0,p p1){
       return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(p0, p1);
    }
}
