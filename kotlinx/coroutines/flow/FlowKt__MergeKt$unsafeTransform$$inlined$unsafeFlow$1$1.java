package kotlinx.coroutines.flow.FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1;
import asd.c;
import java.lang.Object;
import jtd.e;

public final class FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1$1 extends ContinuationImpl	// class@001a3e
{
    public int label;
    public Object result;
    public final FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1 this$0;

    public void FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1$1(FlowKt__MergeKt$unsafeTransform$$inlined$unsafeFlow$1 p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.b(null, this);
    }
}