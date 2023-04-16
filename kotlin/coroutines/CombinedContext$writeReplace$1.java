package kotlin.coroutines.CombinedContext$writeReplace$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import qrd.l1;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class CombinedContext$writeReplace$1 extends Lambda implements p	// class@001861
{
    public final CoroutineContext[] $elements;
    public final Ref$IntRef $index;

    public void CombinedContext$writeReplace$1(CoroutineContext[] p0,Ref$IntRef p1){
       this.$elements = p0;
       this.$index = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(l1 p0,CoroutineContext$a p1){
       Ref$IntRef element;
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "element");
       CombinedContext$writeReplace$1 t$index = this.$index;
       element = t$index.element;
       t$index.element = element + 1;
       p0[element] = p1;
    }
}
