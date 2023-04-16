package ftd.n3;
import ltd.a0;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import java.lang.Object;
import ftd.y;
import kotlinx.coroutines.internal.ThreadContextKt;
import qrd.l1;

public final class n3 extends a0	// class@000ead
{

    public void n3(CoroutineContext p0,c p1){
       super(p0, p1);
    }
    public void k1(Object p0){
       CoroutineContext context = this.e.getContext();
       this.e.resumeWith(y.a(p0, this.e));
       ThreadContextKt.a(context, ThreadContextKt.c(context, null));
    }
}
