package kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import msd.l;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 extends ContinuationImpl	// class@00186b
{
    public final l $block;
    public final c $completion;
    public final CoroutineContext $context;
    public int label;

    public void IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2(l p0,c p1,CoroutineContext p2,c p3,CoroutineContext p4){
       this.$block = p0;
       this.$completion = p1;
       this.$context = p2;
       super(p3, p4);
    }
    public Object invokeSuspend(Object p0){
       IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 tlabel = this.label;
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
