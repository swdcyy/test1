package dsd.g;
import asd.c;
import java.lang.Object;
import kotlin.Result;
import qrd.j0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import qrd.l1;

public final class g implements c	// class@000cea
{
    public Result b;

    public void g(){
       super();
    }
    public final void b(){
       _monitor_enter(this);
       g tb = this.b;
       while (tb == null) {
          this.wait();
       }
       j0.n(tb.unbox-impl());
       _monitor_exit(this);
       return;
    }
    public final Result d(){
       return this.b;
    }
    public final void e(Result p0){
       this.b = p0;
    }
    public CoroutineContext getContext(){
       return EmptyCoroutineContext.INSTANCE;
    }
    public void resumeWith(Object p0){
       _monitor_enter(this);
       this.b = Result.box-impl(p0);
       this.notifyAll();
       _monitor_exit(this);
    }
}
