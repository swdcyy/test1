package kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

public final class SafeCollector$collectContextSize$1 extends Lambda implements p	// class@001b2a
{
    public static final SafeCollector$collectContextSize$1 INSTANCE;

    static {
       SafeCollector$collectContextSize$1.INSTANCE = new SafeCollector$collectContextSize$1();
    }
    public void SafeCollector$collectContextSize$1(){
       super(2);
    }
    public final int invoke(int p0,CoroutineContext$a p1){
       p0++;
       return p0;
    }
    public Object invoke(Object p0,Object p1){
       return Integer.valueOf(this.invoke(p0.intValue(), p1));
    }
}
