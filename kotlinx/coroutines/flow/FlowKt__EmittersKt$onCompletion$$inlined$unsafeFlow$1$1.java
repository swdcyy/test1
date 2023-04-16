package kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import asd.c;
import java.lang.Object;
import jtd.e;

public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 extends ContinuationImpl	// class@001a00
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;
    public final FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 this$0;

    public void FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.b(null, this);
    }
}
