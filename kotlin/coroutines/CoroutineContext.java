package kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import msd.p;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public interface abstract CoroutineContext	// class@001c7b
{

    Object fold(Object p0,p p1);
    CoroutineContext$a get(CoroutineContext$b p0);
    CoroutineContext minusKey(CoroutineContext$b p0);
    CoroutineContext plus(CoroutineContext p0);
}
