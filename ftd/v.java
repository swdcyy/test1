package ftd.v;
import ftd.z1;
import ftd.u;
import kotlinx.coroutines.CompletableDeferredImpl;
import java.lang.Object;
import java.lang.Throwable;
import kotlin.Result;

public final class v	// class@000ed4
{

    public static final u a(z1 p0){
       return new CompletableDeferredImpl(p0);
    }
    public static final u b(Object p0){
       CompletableDeferredImpl uCompletable = new CompletableDeferredImpl(null);
       uCompletable.j(p0);
       return uCompletable;
    }
    public static u c(z1 p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       return v.a(p0);
    }
    public static final boolean d(u p0,Object p1){
       Throwable throwable = Result.exceptionOrNull-impl(p1);
       boolean b = (throwable == null)? p0.j(p1): p0.d(throwable);
       return b;
    }
}
