package asd.d$a;
import asd.d;
import java.lang.Object;
import msd.p;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import asd.b;
import java.util.Objects;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import asd.c;

public final class d$a	// class@000289
{

    public static Object a(d p0,Object p1,p p2){
       a.p(p2, "operation");
       return CoroutineContext$a$a.a(p0, p1, p2);
    }
    public static CoroutineContext$a b(d p0,CoroutineContext$b p1){
       CoroutineContext$a uoa1;
       a.p(p1, "key");
       CoroutineContext$a uoa = null;
       if (p1 instanceof b) {
          if (p1.a(p0.getKey())) {
             uoa1 = p1.b(p0);
             if (uoa1 instanceof CoroutineContext$a) {
                uoa = uoa1;
             }
          }
          return uoa;
       }else if(d.b0 == p1){
          Objects.requireNonNull(p0, "null cannot be cast to non-null type E");
       }else {
          uoa1 = uoa;
       }
       return p0;
    }
    public static CoroutineContext c(d p0,CoroutineContext$b p1){
       EmptyCoroutineContext iNSTANCE;
       a.p(p1, "key");
       if (p1 instanceof b) {
          if (p1.a(p0.getKey()) && p1.b(p0) != null) {
             iNSTANCE = EmptyCoroutineContext.INSTANCE;
          }
          return iNSTANCE;
       }else if(d.b0 == p1){
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       return iNSTANCE;
    }
    public static CoroutineContext d(d p0,CoroutineContext p1){
       a.p(p1, "context");
       return CoroutineContext$a$a.d(p0, p1);
    }
    public static void e(d p0,c p1){
       a.p(p1, "continuation");
    }
}
