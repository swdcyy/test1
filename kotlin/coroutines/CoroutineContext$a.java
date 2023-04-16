package kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import msd.p;
import kotlin.coroutines.CoroutineContext$b;

public interface abstract CoroutineContext$a implements CoroutineContext	// class@001c78
{

    Object fold(Object p0,p p1);
    CoroutineContext$a get(CoroutineContext$b p0);
    CoroutineContext$b getKey();
    CoroutineContext minusKey(CoroutineContext$b p0);
}
