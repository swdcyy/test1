package kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import java.lang.Iterable;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import htd.w;
import asd.c;
import java.lang.Object;
import ktd.k;
import htd.c0;
import java.util.Iterator;
import jtd.d;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1;
import ftd.k0;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import qrd.l1;
import htd.y;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

public final class ChannelLimitedFlowMerge extends ChannelFlow	// class@001b14
{
    public final Iterable c;

    public void ChannelLimitedFlowMerge(Iterable p0,CoroutineContext p1,int p2){
       super(p1, p2);
       this.c = p0;
    }
    public void ChannelLimitedFlowMerge(Iterable p0,CoroutineContext p1,int p2,int p3,u p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x02) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x04) {
          p2 = -2;
       }
       super(p0, iNSTANCE, p2);
       return;
    }
    public Object f(w p0,c p1){
       k ok = new k(p0);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          a.f(p0, null, null, new ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1(iterator.next(), null, p0, ok), 3, null);
       }
       return l1.a;
    }
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new ChannelLimitedFlowMerge(this.c, p0, p1);
    }
    public y j(k0 p0){
       return FlowCoroutineKt.a(p0, this.a, this.b, this.h());
    }
}
