package kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import java.lang.Object;
import asd.c;
import msd.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2;
import java.lang.String;
import kotlin.jvm.internal.a;
import dsd.e;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2;
import msd.p;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.Objects;
import nsd.s0;
import msd.q;

public class IntrinsicsKt__IntrinsicsJvmKt	// class@001c84
{

    public void IntrinsicsKt__IntrinsicsJvmKt(){
       super();
    }
    public static final c a(c p0,l p1){
       CoroutineContext context = p0.getContext();
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 uocreateCoro = (context == EmptyCoroutineContext.INSTANCE)? new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1(p1, p0, p0): new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2(p1, p0, context, p0, context);
       return uocreateCoro;
    }
    public static final c b(l p0,c p1){
       c uoc1;
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 uocreateCoro;
       a.p(p0, "$this$createCoroutineUnintercepted");
       a.p(p1, "completion");
       c uoc = e.a(p1);
       if (p0 instanceof BaseContinuationImpl) {
          uoc1 = p0.create(uoc);
       }else {
          CoroutineContext context = uoc.getContext();
          if (context == EmptyCoroutineContext.INSTANCE) {
             uocreateCoro = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(uoc, uoc, p0);
          }else {
             IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 uocreateCoro1 = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(uoc, context, uoc, context, p0);
          }
          uoc1 = uocreateCoro;
       }
       return uoc1;
    }
    public static final c c(p p0,Object p1,c p2){
       c uoc1;
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 uocreateCoro;
       a.p(p0, "$this$createCoroutineUnintercepted");
       a.p(p2, "completion");
       c uoc = e.a(p2);
       if (p0 instanceof BaseContinuationImpl) {
          uoc1 = p0.create(p1, uoc);
       }else {
          CoroutineContext context = uoc.getContext();
          if (context == EmptyCoroutineContext.INSTANCE) {
             uocreateCoro = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(uoc, uoc, p0, p1);
          }else {
             IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 uocreateCoro1 = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(uoc, context, uoc, context, p0, p1);
          }
          uoc1 = uocreateCoro;
       }
       return uoc1;
    }
    public static final c d(c p0){
       a.p(p0, "$this$intercepted");
       ContinuationImpl uContinuatio = (!p0 instanceof ContinuationImpl)? null: p0;
       if (uContinuatio) {
          c uoc = uContinuatio.intercepted();
          if (uoc != null) {
             p0 = uoc;
          }
       }
       return p0;
    }
    public static final Object e(l p0,c p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type \(kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       return s0.q(p0, 1).invoke(p1);
    }
    public static final Object f(p p0,Object p1,c p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       return s0.q(p0, 2).invoke(p1, p2);
    }
    public static final Object g(q p0,Object p1,Object p2,c p3){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type \(R, P, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
       return s0.q(p0, 3).invoke(p1, p2, p3);
    }
}
