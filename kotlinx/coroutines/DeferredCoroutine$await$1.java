package kotlinx.coroutines.DeferredCoroutine$await$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DeferredCoroutine;
import asd.c;
import java.lang.Object;

public final class DeferredCoroutine$await$1 extends ContinuationImpl	// class@001920
{
    public Object L$0;
    public int label;
    public Object result;
    public final DeferredCoroutine this$0;

    public void DeferredCoroutine$await$1(DeferredCoroutine p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return DeferredCoroutine.s1(this.this$0, this);
    }
}
