package kotlinx.coroutines.flow.FlowKt__MigrationKt$combine$$inlined$combine$3$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__MigrationKt$combine$$inlined$combine$3;
import asd.c;
import java.lang.Object;
import jtd.e;

public final class FlowKt__MigrationKt$combine$$inlined$combine$3$1 extends ContinuationImpl	// class@001a4f
{
    public int label;
    public Object result;
    public final FlowKt__MigrationKt$combine$$inlined$combine$3 this$0;

    public void FlowKt__MigrationKt$combine$$inlined$combine$3$1(FlowKt__MigrationKt$combine$$inlined$combine$3 p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.b(null, this);
    }
}