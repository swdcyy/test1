package kotlinx.coroutines.CoroutineDispatcher$Key$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.CoroutineDispatcher;

public final class CoroutineDispatcher$Key$1 extends Lambda implements l	// class@001ccd
{
    public static final CoroutineDispatcher$Key$1 INSTANCE;

    static {
       CoroutineDispatcher$Key$1.INSTANCE = new CoroutineDispatcher$Key$1();
    }
    public void CoroutineDispatcher$Key$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final CoroutineDispatcher invoke(CoroutineContext$a p0){
       if (!p0 instanceof CoroutineDispatcher) {
          p0 = null;
       }
       return p0;
    }
}
