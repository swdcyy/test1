package kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Object;
import msd.p;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext$DefaultImpls;

public final class CoroutineContext$a$a	// class@001c77
{

    public static Object a(CoroutineContext$a p0,Object p1,p p2){
       a.p(p2, "operation");
       return p2.invoke(p1, p0);
    }
    public static CoroutineContext$a b(CoroutineContext$a p0,CoroutineContext$b p1){
       a.p(p1, "key");
       if (a.g(p0.getKey(), p1)) {
       }else {
          p0 = null;
       }
       return p0;
    }
    public static CoroutineContext c(CoroutineContext$a p0,CoroutineContext$b p1){
       EmptyCoroutineContext iNSTANCE;
       a.p(p1, "key");
       if (a.g(p0.getKey(), p1)) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       return iNSTANCE;
    }
    public static CoroutineContext d(CoroutineContext$a p0,CoroutineContext p1){
       a.p(p1, "context");
       return CoroutineContext$DefaultImpls.a(p0, p1);
    }
}
