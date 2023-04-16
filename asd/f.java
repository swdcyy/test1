package asd.f;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import asd.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

public final class f	// class@000234
{

    public static final CoroutineContext$a a(CoroutineContext$a p0,CoroutineContext$b p1){
       a.p(p0, "$this$getPolymorphicElement");
       a.p(p1, "key");
       CoroutineContext$a uoa = null;
       if (p1 instanceof b) {
          if (p1.a(p0.getKey())) {
             p0 = p1.b(p0);
             if (p0 instanceof CoroutineContext$a) {
                uoa = p0;
             }
          }
          return uoa;
       }else if(p0.getKey() == p1){
          p0 = uoa;
       }
       return p0;
    }
    public static final CoroutineContext b(CoroutineContext$a p0,CoroutineContext$b p1){
       EmptyCoroutineContext iNSTANCE;
       a.p(p0, "$this$minusPolymorphicKey");
       a.p(p1, "key");
       if (p1 instanceof b) {
          if (p1.a(p0.getKey()) && p1.b(p0) != null) {
             iNSTANCE = EmptyCoroutineContext.INSTANCE;
          }
          return iNSTANCE;
       }else if(p0.getKey() == p1){
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       return iNSTANCE;
    }
}
