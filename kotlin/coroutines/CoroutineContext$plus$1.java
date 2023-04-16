package kotlin.coroutines.CoroutineContext$plus$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.EmptyCoroutineContext;
import asd.d;
import kotlin.coroutines.CombinedContext;

public final class CoroutineContext$plus$1 extends Lambda implements p	// class@001c7a
{
    public static final CoroutineContext$plus$1 INSTANCE;

    static {
       CoroutineContext$plus$1.INSTANCE = new CoroutineContext$plus$1();
    }
    public void CoroutineContext$plus$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final CoroutineContext invoke(CoroutineContext p0,CoroutineContext$a p1){
       CombinedContext uCombinedCon;
       CombinedContext uCombinedCon1;
       a.p(p0, "acc");
       a.p(p1, "element");
       p0 = p0.minusKey(p1.getKey());
       EmptyCoroutineContext iNSTANCE = EmptyCoroutineContext.INSTANCE;
       if (p0 == iNSTANCE) {
       }else {
          d$b b0 = d.b0;
          d uod = p0.get(b0);
          if (uod == null) {
             uCombinedCon = new CombinedContext(p0, p1);
          }else {
             p0 = p0.minusKey(b0);
             if (p0 == iNSTANCE) {
                uCombinedCon1 = new CombinedContext(p1, uod);
             }else {
                uCombinedCon = new CombinedContext(new CombinedContext(p0, p1), uod);
             }
          }
          uCombinedCon1 = uCombinedCon;
       }
       return p1;
    }
}
