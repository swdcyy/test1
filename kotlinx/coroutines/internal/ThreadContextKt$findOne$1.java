package kotlinx.coroutines.internal.ThreadContextKt$findOne$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import ftd.d3;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Object;

public final class ThreadContextKt$findOne$1 extends Lambda implements p	// class@001cec
{
    public static final ThreadContextKt$findOne$1 INSTANCE;

    static {
       ThreadContextKt$findOne$1.INSTANCE = new ThreadContextKt$findOne$1();
    }
    public void ThreadContextKt$findOne$1(){
       super(2);
    }
    public final d3 invoke(d3 p0,CoroutineContext$a p1){
       if (p0 != null) {
          return p0;
       }
       if (!p1 instanceof d3) {
          p1 = null;
       }
       return p1;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
