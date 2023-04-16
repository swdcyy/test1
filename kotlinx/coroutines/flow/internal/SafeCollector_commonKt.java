package kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlin.coroutines.CoroutineContext;
import java.lang.Integer;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1;
import java.lang.Object;
import msd.p;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import ftd.z1;
import ltd.a0;
import jtd.d;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1;

public final class SafeCollector_commonKt	// class@001b31
{

    public static final void a(SafeCollector p0,CoroutineContext p1){
       if (p1.fold(Integer.valueOf(0), new SafeCollector_commonKt$checkContext$result$1(p0)).intValue() == p0.collectContextSize) {
          return;
       }
       throw new IllegalStateException("Flow invariant is violated:\n"+"\t\tFlow was collected in "+p0.collectContext+",\n"+"\t\tbut emission happened in "+p1+".\n"+"\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead".toString());
    }
    public static final z1 b(z1 p0,z1 p1){
       while (true) {
          if (p0 == null) {
             return null;
          }
          if (p0 == p1) {
             return p0;
          }
          if (!p0 instanceof a0) {
             break ;
          }else {
             p0 = p0.s1();
          }
       }
       return p0;
    }
    public static final d c(p p0){
       return new SafeCollector_commonKt$unsafeFlow$1(p0);
    }
}
