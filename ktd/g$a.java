package ktd.g$a;
import ktd.g;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import kotlin.coroutines.EmptyCoroutineContext;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class g$a	// class@001bdd
{

    public static g a(g p0,CoroutineContext p1,int p2,int p3,Object p4){
       EmptyCoroutineContext iNSTANCE;
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
       }
       if (p3 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x02) {
          p2 = -3;
       }
       return p0.a(iNSTANCE, p2);
    }
}
