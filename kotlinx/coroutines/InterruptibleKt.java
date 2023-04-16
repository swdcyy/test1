package kotlinx.coroutines.InterruptibleKt;
import kotlin.coroutines.CoroutineContext;
import msd.a;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.InterruptibleKt$runInterruptible$2;
import msd.p;
import kotlinx.coroutines.a;
import kotlin.coroutines.EmptyCoroutineContext;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.a;
import ftd.i3;
import java.util.concurrent.CancellationException;
import java.lang.String;
import java.lang.Throwable;

public final class InterruptibleKt	// class@001924
{

    public static final Object a(CoroutineContext p0,a p1,c p2){
       return a.i(p0, new InterruptibleKt$runInterruptible$2(p1, null), p2);
    }
    public static Object b(CoroutineContext p0,a p1,c p2,int p3,Object p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       return InterruptibleKt.a(iNSTANCE, p1, p2);
    }
    public static final Object c(CoroutineContext p0,a p1){
       try{
          CoroutineContext$a uoa = p0.get(z1.p0);
          if (uoa == null) {
             a.L();
          }
          i3 oi3 = new i3(uoa);
          oi3.d();
          oi3.a();
          return p1.invoke();
       }catch(java.lang.InterruptedException e1){
          throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e1);
       }
    }
}
