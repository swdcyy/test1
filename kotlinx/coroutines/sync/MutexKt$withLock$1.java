package kotlinx.coroutines.sync.MutexKt$withLock$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import ptd.c;
import msd.a;
import kotlinx.coroutines.sync.MutexKt;

public final class MutexKt$withLock$1 extends ContinuationImpl	// class@001b4a
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;

    public void MutexKt$withLock$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return MutexKt.k(null, null, null, this);
    }
}
