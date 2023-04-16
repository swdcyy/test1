package kotlinx.coroutines.internal.ThreadContextKt$restoreState$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ltd.o0;
import kotlin.coroutines.CoroutineContext$a;
import ftd.d3;
import kotlin.coroutines.CoroutineContext;

public final class ThreadContextKt$restoreState$1 extends Lambda implements p	// class@001ced
{
    public static final ThreadContextKt$restoreState$1 INSTANCE;

    static {
       ThreadContextKt$restoreState$1.INSTANCE = new ThreadContextKt$restoreState$1();
    }
    public void ThreadContextKt$restoreState$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final o0 invoke(o0 p0,CoroutineContext$a p1){
       if (p1 instanceof d3) {
          p1.i(p0.b(), p0.d());
       }
       return p0;
    }
}
