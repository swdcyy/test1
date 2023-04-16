package kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import asd.c;
import msd.l;
import java.lang.Object;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Objects;
import nsd.s0;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 extends RestrictedContinuationImpl	// class@00186c
{
    public final c $completion;
    public final l $this_createCoroutineUnintercepted$inlined;
    public int label;

    public void IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(c p0,c p1,l p2){
       this.$completion = p0;
       this.$this_createCoroutineUnintercepted$inlined = p2;
       super(p1);
    }
    public Object invokeSuspend(Object p0){
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 tlabel = this.label;
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
          Objects.requireNonNull(p0, "null cannot be cast to non-null type \(kotlin.coroutines.Continuation<T>\) -> kotlin.Any?");
          p0 = s0.q(p0, 1).invoke(this);
       }
       return p0;
    }
}
