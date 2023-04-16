package kotlinx.coroutines.sync.SemaphoreKt$withPermit$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import ptd.e;
import msd.a;
import kotlinx.coroutines.sync.SemaphoreKt;

public final class SemaphoreKt$withPermit$1 extends ContinuationImpl	// class@001b4c
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;

    public void SemaphoreKt$withPermit$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return SemaphoreKt.k(null, null, this);
    }
}
