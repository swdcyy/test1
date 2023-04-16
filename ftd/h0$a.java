package ftd.h0$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import asd.a;
import msd.p;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import java.lang.Object;

public final class h0$a extends a implements CoroutineExceptionHandler	// class@000e8c
{
    public final p b;

    public void h0$a(p p0,CoroutineContext$b p1){
       this.b = p0;
       super(p1);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       this.b.invoke(p0, p1);
    }
}
