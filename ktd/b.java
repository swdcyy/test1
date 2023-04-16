package ktd.b;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import jtd.d;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import jtd.e;
import asd.c;
import java.lang.Object;
import csd.b;
import qrd.l1;

public final class b extends ChannelFlowOperator	// class@001bd7
{

    public void b(d p0,CoroutineContext p1,int p2){
       super(p0, p1, p2);
    }
    public void b(d p0,CoroutineContext p1,int p2,int p3,u p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x02) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x04) {
          p2 = -3;
       }
       super(p0, iNSTANCE, p2);
       return;
    }
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new b(this.c, p0, p1);
    }
    public Object n(e p0,c p1){
       p0 = this.c.b(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
