package kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import msd.q;
import jtd.d;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import jtd.e;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import msd.p;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import csd.b;
import qrd.l1;

public final class ChannelFlowTransformLatest extends ChannelFlowOperator	// class@001b12
{
    public final q d;

    public void ChannelFlowTransformLatest(q p0,d p1,CoroutineContext p2,int p3){
       super(p1, p2, p3);
       this.d = p0;
    }
    public void ChannelFlowTransformLatest(q p0,d p1,CoroutineContext p2,int p3,int p4,u p5){
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
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new ChannelFlowTransformLatest(this.d, this.c, p0, p1);
    }
    public Object n(e p0,c p1){
       p0 = FlowCoroutineKt.c(new ChannelFlowTransformLatest$flowCollect$3(this, p0, null), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
