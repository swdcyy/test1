package kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1;
import jtd.e;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import ftd.k0;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1;
import csd.b;
import ftd.z1;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;
import qrd.l1;

public final class ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 implements e	// class@001b10
{
    public final ChannelFlowTransformLatest$flowCollect$3 b;
    public final k0 c;
    public final Ref$ObjectRef d;

    public void ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1(ChannelFlowTransformLatest$flowCollect$3 p0,k0 p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1 uoflowCollec;
       if (p1 instanceof ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1) {
          uoflowCollec = p1;
          ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1 label = uoflowCollec.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoflowCollec.label = label - i;
          label_0018 :
             ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1 result = uoflowCollec.result;
             Object obj = b.h();
             ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1 label1 = uoflowCollec.label;
             CoroutineStart uCoroutineSt = 1;
             if (label1 != null) {
                if (label1 == uCoroutineSt) {
                   p0 = uoflowCollec.L$3;
                   uoflowCollec = uoflowCollec.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef element = this.d.element;
                if (element != null) {
                   element.b(new ChildCancelledException());
                   uoflowCollec.L$0 = this;
                   uoflowCollec.L$1 = p0;
                   uoflowCollec.L$2 = uoflowCollec;
                   uoflowCollec.L$3 = p0;
                   uoflowCollec.L$4 = element;
                   uoflowCollec.L$5 = element;
                   uoflowCollec.label = uCoroutineSt;
                   if (element.p(uoflowCollec) == obj) {
                      return obj;
                   }
                }
                ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 uoflowCollec1 = this;
             }
             result.element = a.f(uoflowCollec.c, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1(p0, null, uoflowCollec), 1, null);
             return l1.a;
          }
       }
       uoflowCollec = new ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$1(this, p1);
       goto label_0018 ;
    }
}
