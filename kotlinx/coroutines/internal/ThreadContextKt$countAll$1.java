package kotlinx.coroutines.internal.ThreadContextKt$countAll$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlin.coroutines.CoroutineContext$a;
import ftd.d3;
import java.lang.Integer;

public final class ThreadContextKt$countAll$1 extends Lambda implements p	// class@001ceb
{
    public static final ThreadContextKt$countAll$1 INSTANCE;

    static {
       ThreadContextKt$countAll$1.INSTANCE = new ThreadContextKt$countAll$1();
    }
    public void ThreadContextKt$countAll$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Object invoke(Object p0,CoroutineContext$a p1){
       if (!p1 instanceof d3) {
          return p0;
       }
       if (!p0 instanceof Integer) {
          p0 = null;
       }
       int i = (p0 != null)? p0.intValue(): 1;
       if (i) {
          Integer integer = Integer.valueOf((i + 1));
       }
       return p1;
    }
}
