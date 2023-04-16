package kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import msd.l;
import asd.c;
import java.lang.Object;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 extends RestrictedContinuationImpl	// class@00186a
{
    public final l $block;
    public final c $completion;
    public int label;

    public void IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1(l p0,c p1,c p2){
       this.$block = p0;
       this.$completion = p1;
       super(p2);
    }
    public Object invokeSuspend(Object p0){
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 tlabel = this.label;
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
          p0 = this.$block.invoke(this);
       }
       return p0;
    }
}
