package kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import ftd.z1;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Integer;

public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements p	// class@001b2e
{
    public final SafeCollector $this_checkContext;

    public void SafeCollector_commonKt$checkContext$result$1(SafeCollector p0){
       this.$this_checkContext = p0;
       super(2);
    }
    public final int invoke(int p0,CoroutineContext$a p1){
       CoroutineContext$b key = p1.getKey();
       CoroutineContext$a uoa = this.$this_checkContext.collectContext.get(key);
       if (key != z1.p0) {
          if (p1 != uoa) {
             p0 = Integer.MIN_VALUE;
          }else {
             p0++;
          }
          return p0;
       }else {
          z1 oz1 = SafeCollector_commonKt.b(p1, uoa);
          if (oz1 != uoa) {
             throw new IllegalStateException("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n"+"\t\tChild of "+oz1+", expected child of "+uoa+".\n"+"\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n"+"\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'".toString());
          }
          if (uoa != null) {
             p0++;
          }
          return p0;
       }
    }
    public Object invoke(Object p0,Object p1){
       return Integer.valueOf(this.invoke(p0.intValue(), p1));
    }
}
