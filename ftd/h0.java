package ftd.h0;
import msd.p;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ftd.h0$a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import kotlin.coroutines.CoroutineContext$a;
import ftd.g0;
import java.lang.RuntimeException;
import java.lang.String;
import qrd.i;

public final class h0	// class@000e8d
{

    public static final CoroutineExceptionHandler a(p p0){
       return new h0$a(p0, CoroutineExceptionHandler.u0);
    }
    public static final void b(CoroutineContext p0,Throwable p1){
       CoroutineExceptionHandler uCoroutineEx = p0.get(CoroutineExceptionHandler.u0);
       if (uCoroutineEx != null) {
          uCoroutineEx.handleException(p0, p1);
          return;
       }else {
          g0.a(p0, p1);
          return;
       }
    }
    public static final Throwable c(Throwable p0,Throwable p1){
       if (p0 == p1) {
          return p0;
       }
       RuntimeException runtimeExcep = new RuntimeException("Exception while trying to handle coroutine exception", p1);
       i.a(runtimeExcep, p0);
       return runtimeExcep;
    }
}
