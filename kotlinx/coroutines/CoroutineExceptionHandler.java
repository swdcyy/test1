package kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.CoroutineExceptionHandler$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;

public interface abstract CoroutineExceptionHandler implements CoroutineContext$a	// class@001cd2
{
    public static final CoroutineExceptionHandler$b u0;

    static {
       CoroutineExceptionHandler.u0 = CoroutineExceptionHandler$b.a;
    }
    void handleException(CoroutineContext p0,Throwable p1);
}
