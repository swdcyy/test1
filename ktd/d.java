package ktd.d;
import ltd.a0;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import java.lang.Throwable;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import java.lang.Object;
import kotlinx.coroutines.JobSupport;

public final class d extends a0	// class@001bda
{

    public void d(CoroutineContext p0,c p1){
       super(p0, p1);
    }
    public boolean h0(Throwable p0){
       if (p0 instanceof ChildCancelledException) {
          return true;
       }
       return this.c0(p0);
    }
}
