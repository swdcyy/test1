package ktd.f;
import htd.v;
import kotlin.coroutines.CoroutineContext;
import htd.l;
import java.lang.Throwable;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import java.lang.Object;
import kotlinx.coroutines.JobSupport;

public final class f extends v	// class@001bdc
{

    public void f(CoroutineContext p0,l p1){
       super(p0, p1);
    }
    public boolean h0(Throwable p0){
       if (p0 instanceof ChildCancelledException) {
          return true;
       }
       return this.c0(p0);
    }
}
