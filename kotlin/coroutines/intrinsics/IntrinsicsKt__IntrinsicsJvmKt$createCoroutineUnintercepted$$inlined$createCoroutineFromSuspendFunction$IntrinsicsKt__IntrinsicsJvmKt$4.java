package kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import java.lang.Object;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Objects;
import nsd.s0;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 extends ContinuationImpl	// class@00186f
{
    public final c $completion;
    public final CoroutineContext $context;
    public final Object $receiver$inlined;
    public final p $this_createCoroutineUnintercepted$inlined;
    public int label;

    public void IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(c p0,CoroutineContext p1,c p2,CoroutineContext p3,p p4,Object p5){
       this.$completion = p0;
       this.$context = p1;
       this.$this_createCoroutineUnintercepted$inlined = p4;
       this.$receiver$inlined = p5;
       super(p2, p3);
    }
    public Object invokeSuspend(Object p0){
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 tlabel = this.label;
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
