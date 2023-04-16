package kotlin.coroutines.CombinedContext$Serialized;
import java.io.Serializable;
import kotlin.coroutines.CombinedContext$Serialized$a;
import nsd.u;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.coroutines.EmptyCoroutineContext;

public final class CombinedContext$Serialized implements Serializable	// class@00185f
{
    public final CoroutineContext[] elements;
    public static final CombinedContext$Serialized$a Companion;
    public static final long serialVersionUID;

    static {
       CombinedContext$Serialized.Companion = new CombinedContext$Serialized$a(null);
    }
    public void CombinedContext$Serialized(CoroutineContext[] p0){
       a.p(p0, "elements");
       super();
       this.elements = p0;
    }
    public final CoroutineContext[] getElements(){
       return this.elements;
    }
    public final Object readResolve(){
       CombinedContext$Serialized telements = this.elements;
       EmptyCoroutineContext iNSTANCE = EmptyCoroutineContext.INSTANCE;
       int len = telements.length;
       for (int i = 0; i < len; i = i + 1) {
          iNSTANCE = iNSTANCE.plus(telements[i]);
       }
       return iNSTANCE;
    }
}
