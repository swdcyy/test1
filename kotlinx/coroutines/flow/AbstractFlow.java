package kotlinx.coroutines.flow.AbstractFlow;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.AbstractFlow$collect$1;
import csd.b;
import kotlinx.coroutines.flow.internal.SafeCollector;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlin.coroutines.CoroutineContext;
import qrd.l1;

public abstract class AbstractFlow implements d	// class@0019b2
{

    public void AbstractFlow(){
       super();
    }
    public final Object b(e p0,c p1){
       AbstractFlow$collect$1 uocollect$1;
       AbstractFlow$collect$1 l$2;
       if (p1 instanceof AbstractFlow$collect$1) {
          uocollect$1 = p1;
          AbstractFlow$collect$1 label = uocollect$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocollect$1.label = label - i;
          label_0018 :
             AbstractFlow$collect$1 result = uocollect$1.result;
             Object obj = b.h();
             AbstractFlow$collect$1 label1 = uocollect$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$2 = uocollect$1.L$2;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                SafeCollector safeCollecto = new SafeCollector(p0, uocollect$1.getContext());
                uocollect$1.L$0 = this;
                uocollect$1.L$1 = p0;
                uocollect$1.L$2 = safeCollecto;
                uocollect$1.label = 1;
                if (this.c(safeCollecto, uocollect$1) == obj) {
                   return obj;
                }else {
                   l$2 = safeCollecto;
                }
             }
             l$2.releaseIntercepted();
             return l1.a;
          }
       }
       uocollect$1 = new AbstractFlow$collect$1(this, p1);
       goto label_0018 ;
    }
    public abstract Object c(e p0,c p1);
}
