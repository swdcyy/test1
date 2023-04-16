package kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import jtd.d;
import kotlin.coroutines.CoroutineContext;
import jtd.e;
import asd.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import csd.b;
import qrd.l1;
import asd.d;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import htd.w;
import ktd.k;
import htd.c0;
import ktd.a;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2;
import msd.p;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class ChannelFlowOperator extends ChannelFlow	// class@001b0d
{
    public final d c;

    public void ChannelFlowOperator(d p0,CoroutineContext p1,int p2){
       super(p1, p2);
       this.c = p0;
    }
    public static Object k(ChannelFlowOperator p0,e p1,c p2){
       if (p0.b == -3) {
          CoroutineContext context = p2.getContext();
          CoroutineContext uCoroutineCo = context.plus(p0.a);
          if (a.g(uCoroutineCo, context)) {
             p0 = p0.n(p1, p2);
             if (p0 == b.h()) {
                return p0;
             }else {
                return l1.a;
             }
          }else {
             d$b b0 = d.b0;
             if (a.g(uCoroutineCo.get(b0), context.get(b0))) {
                p0 = p0.m(p1, uCoroutineCo, p2);
                if (p0 == b.h()) {
                   return p0;
                }else {
                   return l1.a;
                }
             }
          }
       }
       p0 = super.b(p1, p2);
       if (p0 == b.h()) {
          return p0;
       }else {
          return l1.a;
       }
    }
    public static Object l(ChannelFlowOperator p0,w p1,c p2){
       p0 = p0.n(new k(p1), p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public Object b(e p0,c p1){
       return ChannelFlowOperator.k(this, p0, p1);
    }
    public Object f(w p0,c p1){
       return ChannelFlowOperator.l(this, p0, p1);
    }
    public final Object m(e p0,CoroutineContext p1,c p2){
       p0 = a.c(p1, null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), a.d(p0, p2.getContext()), p2, 2, null);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public abstract Object n(e p0,c p1);
    public String toString(){
       return this.c+" -> "+super.toString();
    }
}
