package kotlinx.coroutines.CompletableDeferredImpl$await$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import asd.c;
import java.lang.Object;

public final class CompletableDeferredImpl$await$1 extends ContinuationImpl	// class@001917
{
    public Object L$0;
    public int label;
    public Object result;
    public final CompletableDeferredImpl this$0;

    public void CompletableDeferredImpl$await$1(CompletableDeferredImpl p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.C(this);
    }
}
