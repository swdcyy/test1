package kotlinx.coroutines.debug.internal.DebugCoroutineInfo$yieldFrames$1;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo;
import asd.c;
import java.lang.Object;
import wsd.o;
import dsd.c;

public final class DebugCoroutineInfo$yieldFrames$1 extends RestrictedContinuationImpl	// class@0019a8
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;
    public final DebugCoroutineInfo this$0;

    public void DebugCoroutineInfo$yieldFrames$1(DebugCoroutineInfo p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.i(null, null, this);
    }
}
