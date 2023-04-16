package kotlinx.coroutines.channels.ProduceKt$awaitClose$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import htd.w;
import msd.a;
import kotlinx.coroutines.channels.ProduceKt;

public final class ProduceKt$awaitClose$1 extends ContinuationImpl	// class@00199b
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;

    public void ProduceKt$awaitClose$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return ProduceKt.a(null, null, this);
    }
}
