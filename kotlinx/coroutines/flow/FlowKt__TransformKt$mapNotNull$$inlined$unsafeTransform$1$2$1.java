package kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2;
import asd.c;
import java.lang.Object;

public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl	// class@001aa1
{
    public int label;
    public Object result;
    public final FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 this$0;

    public void FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1(FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.emit(null, this);
    }
}