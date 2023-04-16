package ftd.o1;
import kotlinx.coroutines.CoroutineDispatcher;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.y0;
import ftd.n1;
import java.util.concurrent.ExecutorService;

public final class o1	// class@001663
{

    public static final Executor a(CoroutineDispatcher p0){
       Executor uExecutor;
       ExecutorCoroutineDispatcher uExecutorCor = (!p0 instanceof ExecutorCoroutineDispatcher)? null: p0;
       if (uExecutorCor) {
          uExecutor = uExecutorCor.A();
          if (uExecutor != null) {
          label_0017 :
             return uExecutor;
          }
       }
       uExecutor = new y0(p0);
       goto label_0017 ;
    }
    public static final CoroutineDispatcher b(Executor p0){
       y0 oy0 = (!p0 instanceof y0)? null: p0;
       if (oy0) {
          oy0 = oy0.b;
          if (oy0 != null) {
          label_0015 :
             return oy0;
          }
       }
       n1 on1 = new n1(p0);
       goto label_0015 ;
    }
    public static final ExecutorCoroutineDispatcher c(ExecutorService p0){
       return new n1(p0);
    }
}
