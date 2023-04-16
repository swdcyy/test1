package kotlin.coroutines.CombinedContext$toString$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class CombinedContext$toString$1 extends Lambda implements p	// class@001860
{
    public static final CombinedContext$toString$1 INSTANCE;

    static {
       CombinedContext$toString$1.INSTANCE = new CombinedContext$toString$1();
    }
    public void CombinedContext$toString$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final String invoke(String p0,CoroutineContext$a p1){
       a.p(p0, "acc");
       a.p(p1, "element");
       StringBuilder str = (!p0.length())? 1: null;
       p0 = (str)? p1.toString(): p0+", "+p1;
       return p0;
    }
}
