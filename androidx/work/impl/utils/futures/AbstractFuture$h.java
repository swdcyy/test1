package androidx.work.impl.utils.futures.AbstractFuture$h;
import java.lang.Object;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.lang.Thread;
import androidx.work.impl.utils.futures.AbstractFuture$b;
import java.util.concurrent.locks.LockSupport;

public final class AbstractFuture$h	// class@000a9d
{
    public Thread a;
    public AbstractFuture$h b;
    public static final AbstractFuture$h c;

    static {
       AbstractFuture$h.c = new AbstractFuture$h(false);
    }
    public void AbstractFuture$h(){
       super();
       AbstractFuture.g.e(this, Thread.currentThread());
    }
    public void AbstractFuture$h(boolean p0){
       super();
    }
    public void a(AbstractFuture$h p0){
       AbstractFuture.g.d(this, p0);
    }
    public void b(){
       AbstractFuture$h ta = this.a;
       if (ta != null) {
          this.a = null;
          LockSupport.unpark(ta);
       }
       return;
    }
}
