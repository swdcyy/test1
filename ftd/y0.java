package ftd.y0;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Object;
import java.lang.Runnable;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext;
import java.lang.String;

public final class y0 implements Executor	// class@000edc
{
    public final CoroutineDispatcher b;

    public void y0(CoroutineDispatcher p0){
       super();
       this.b = p0;
    }
    public void execute(Runnable p0){
       this.b.u(EmptyCoroutineContext.INSTANCE, p0);
    }
    public String toString(){
       return this.b.toString();
    }
}
