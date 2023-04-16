package kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1;
import jtd.e;
import ftd.z1;
import ptd.e;
import htd.w;
import ktd.k;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1$1;
import csd.b;
import jtd.d;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ftd.c2;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;
import qrd.l1;

public final class ChannelFlowMerge$collectTo$$inlined$collect$1 implements e	// class@001b0a
{
    public final z1 b;
    public final e c;
    public final w d;
    public final k e;

    public void ChannelFlowMerge$collectTo$$inlined$collect$1(z1 p0,e p1,w p2,k p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object emit(Object p0,c p1){
       ChannelFlowMerge$collectTo$$inlined$collect$1$1 uocollectTo$;
       if (p1 instanceof ChannelFlowMerge$collectTo$$inlined$collect$1$1) {
          uocollectTo$ = p1;
          ChannelFlowMerge$collectTo$$inlined$collect$1$1 label = uocollectTo$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocollectTo$.label = label - i;
          label_0018 :
             ChannelFlowMerge$collectTo$$inlined$collect$1$1 result = uocollectTo$.result;
             Object obj = b.h();
             ChannelFlowMerge$collectTo$$inlined$collect$1$1 label1 = uocollectTo$.label;
             int i1 = 1;
             if (label1 != null) {
                if (label1 == i1) {
                   p0 = uocollectTo$.L$3;
                   uocollectTo$ = uocollectTo$.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                result = p0;
                ChannelFlowMerge$collectTo$$inlined$collect$1 tb = this.b;
                if (tb != null) {
                   c2.A(tb);
                }
                uocollectTo$.L$0 = this;
                uocollectTo$.L$1 = p0;
                uocollectTo$.L$2 = uocollectTo$;
                uocollectTo$.L$3 = result;
                uocollectTo$.label = i1;
                if (this.c.a(uocollectTo$) == obj) {
                   return obj;
                }else {
                   ChannelFlowMerge$collectTo$$inlined$collect$1 uocollectTo$1 = this;
                   p0 = result;
                }
             }
             a.f(uocollectTo$.d, null, null, new ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1(p0, null, uocollectTo$), 3, null);
             return l1.a;
          }
       }
       uocollectTo$ = new ChannelFlowMerge$collectTo$$inlined$collect$1$1(this, p1);
       goto label_0018 ;
    }
}
