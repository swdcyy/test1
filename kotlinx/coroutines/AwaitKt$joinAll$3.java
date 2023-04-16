package kotlinx.coroutines.AwaitKt$joinAll$3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import java.util.Collection;
import kotlinx.coroutines.AwaitKt;

public final class AwaitKt$joinAll$3 extends ContinuationImpl	// class@001915
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;

    public void AwaitKt$joinAll$3(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return AwaitKt.c(null, this);
    }
}
