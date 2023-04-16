package kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import msd.l;
import kotlinx.coroutines.selects.WhileSelectKt;

public final class WhileSelectKt$whileSelect$1 extends ContinuationImpl	// class@001b48
{
    public Object L$0;
    public int label;
    public Object result;

    public void WhileSelectKt$whileSelect$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return WhileSelectKt.a(null, this);
    }
}
