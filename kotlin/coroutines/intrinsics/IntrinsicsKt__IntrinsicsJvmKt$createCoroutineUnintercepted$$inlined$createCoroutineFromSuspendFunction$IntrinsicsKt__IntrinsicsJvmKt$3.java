package kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import asd.c;
import msd.p;
import java.lang.Object;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Objects;
import nsd.s0;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 extends RestrictedContinuationImpl	// class@00186e
{
    public final c $completion;
    public final Object $receiver$inlined;
    public final p $this_createCoroutineUnintercepted$inlined;
    public int label;

    public void IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(c p0,c p1,p p2,Object p3){
       this.$completion = p0;
       this.$this_createCoroutineUnintercepted$inlined = p2;
       this.$receiver$inlined = p3;
       super(p1);
    }
    public Object invokeSuspend(Object p0){
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             this.label = 2;
             j0.n(p0);
          }else {
             throw new IllegalStateException("This coroutine had already completed".toString());
          }
       }else {
          this.label = 1;
          j0.n(p0);
          p0 = this.$this_createCoroutineUnintercepted$inlined;
          Objects.requireNonNull(p0, "null cannot be cast to non-null type \(R, kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
          p0 = s0.q(p0, 2).invoke(this.$receiver$inlined, this);
       }
       return p0;
    }
}
