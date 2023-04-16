package kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

public final class ExecutorCoroutineDispatcher$Key$1 extends Lambda implements l	// class@001cd6
{
    public static final ExecutorCoroutineDispatcher$Key$1 INSTANCE;

    static {
       ExecutorCoroutineDispatcher$Key$1.INSTANCE = new ExecutorCoroutineDispatcher$Key$1();
    }
    public void ExecutorCoroutineDispatcher$Key$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final ExecutorCoroutineDispatcher invoke(CoroutineContext$a p0){
       if (!p0 instanceof ExecutorCoroutineDispatcher) {
          p0 = null;
       }
       return p0;
    }
}
