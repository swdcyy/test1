package kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2;
import asd.c;
import java.lang.Object;

public final class FlowKt__CollectKt$collectIndexed$2$emit$1 extends ContinuationImpl	// class@0019d2
{
    public int label;
    public Object result;
    public final FlowKt__CollectKt$collectIndexed$2 this$0;

    public void FlowKt__CollectKt$collectIndexed$2$emit$1(FlowKt__CollectKt$collectIndexed$2 p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.emit(null, this);
    }
}