package kotlinx.coroutines.AwaitKt$awaitAll$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import java.util.Collection;
import kotlinx.coroutines.AwaitKt;

public final class AwaitKt$awaitAll$2 extends ContinuationImpl	// class@001913
{
    public Object L$0;
    public int label;
    public Object result;

    public void AwaitKt$awaitAll$2(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return AwaitKt.a(null, this);
    }
}
