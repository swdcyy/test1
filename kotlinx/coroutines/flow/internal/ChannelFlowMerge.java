package kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import jtd.d;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import java.lang.String;
import java.lang.StringBuilder;
import htd.w;
import asd.c;
import java.lang.Object;
import ptd.e;
import kotlinx.coroutines.sync.SemaphoreKt;
import ktd.k;
import htd.c0;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1;
import jtd.e;
import csd.b;
import qrd.l1;
import ftd.k0;
import htd.y;
import msd.p;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

public final class ChannelFlowMerge extends ChannelFlow	// class@001b0b
{
    public final d c;
    public final int d;

    public void ChannelFlowMerge(d p0,int p1,CoroutineContext p2,int p3){
       super(p2, p3);
       this.c = p0;
       this.d = p1;
    }
    public void ChannelFlowMerge(d p0,int p1,CoroutineContext p2,int p3,int p4,u p5){
       EmptyCoroutineContext iNSTANCE;
       if (p4 & 0x04) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p4 & 0x08) {
          p3 = -2;
       }
       super(p0, p1, iNSTANCE, p3);
       return;
    }
    public String c(){
       return "concurrency="+this.d+", ";
    }
    public Object f(w p0,c p1){
       p0 = this.c.b(new ChannelFlowMerge$collectTo$$inlined$collect$1(p1.getContext().get(z1.p0), SemaphoreKt.g(this.d, 0, 2, null), p0, new k(p0)), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new ChannelFlowMerge(this.c, this.d, p0, p1);
    }
    public y j(k0 p0){
       return FlowCoroutineKt.a(p0, this.a, this.b, this.h());
    }
}
