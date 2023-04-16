package asd.b;
import kotlin.coroutines.CoroutineContext$b;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.CoroutineContext$a;

public abstract class b implements CoroutineContext$b	// class@000287
{
    public final CoroutineContext$b a;
    public final l b;

    public void b(CoroutineContext$b p0,l p1){
       b a;
       a.p(p0, "baseKey");
       a.p(p1, "safeCast");
       super();
       this.b = p1;
       if (p0 instanceof b) {
          a = p0.a;
       }
       this.a = a;
       return;
    }
    public final boolean a(CoroutineContext$b p0){
       a.p(p0, "key");
       boolean b = (p0 == this || this.a == p0)? true: false;
       return b;
    }
    public final CoroutineContext$a b(CoroutineContext$a p0){
       a.p(p0, "element");
       return this.b.invoke(p0);
    }
}
