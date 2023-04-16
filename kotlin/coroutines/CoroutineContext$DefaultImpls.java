package kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext$plus$1;
import msd.p;

public final class CoroutineContext$DefaultImpls	// class@001c76
{

    public static CoroutineContext a(CoroutineContext p0,CoroutineContext p1){
       a.p(p1, "context");
       if (p1 == EmptyCoroutineContext.INSTANCE) {
       }else {
          p0 = p1.fold(p0, CoroutineContext$plus$1.INSTANCE);
       }
       return p0;
    }
}
