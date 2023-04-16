package kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import jtd.e;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1;
import asd.c;
import msd.p;
import ktd.a;
import csd.b;
import qrd.l1;

public final class UndispatchedContextCollector implements e	// class@001b33
{
    public final Object b;
    public final p c;
    public final CoroutineContext d;

    public void UndispatchedContextCollector(e p0,CoroutineContext p1){
       super();
       this.d = p1;
       this.b = ThreadContextKt.b(p1);
       this.c = new UndispatchedContextCollector$emitRef$1(p0, null);
    }
    public Object emit(Object p0,c p1){
       p0 = a.b(this.d, this.b, this.c, p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
