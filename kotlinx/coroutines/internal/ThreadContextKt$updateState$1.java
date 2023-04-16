package kotlinx.coroutines.internal.ThreadContextKt$updateState$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ltd.o0;
import kotlin.coroutines.CoroutineContext$a;
import ftd.d3;
import kotlin.coroutines.CoroutineContext;

public final class ThreadContextKt$updateState$1 extends Lambda implements p	// class@001cee
{
    public static final ThreadContextKt$updateState$1 INSTANCE;

    static {
       ThreadContextKt$updateState$1.INSTANCE = new ThreadContextKt$updateState$1();
    }
    public void ThreadContextKt$updateState$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final o0 invoke(o0 p0,CoroutineContext$a p1){
       if (p1 instanceof d3) {
          p0.a(p1.V(p0.b()));
       }
       return p0;
    }
}
