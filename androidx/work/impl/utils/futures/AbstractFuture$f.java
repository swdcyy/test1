package androidx.work.impl.utils.futures.AbstractFuture$f;
import java.lang.Runnable;
import androidx.work.impl.utils.futures.AbstractFuture;
import xk.d;
import java.lang.Object;
import androidx.work.impl.utils.futures.AbstractFuture$b;

public final class AbstractFuture$f implements Runnable	// class@000a9b
{
    public final AbstractFuture b;
    public final d c;

    public void AbstractFuture$f(AbstractFuture p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       if (this.b.b != this) {
          return;
       }
       if (AbstractFuture.g.b(this.b, this, AbstractFuture.E(this.c))) {
          AbstractFuture.x(this.b);
       }
       return;
    }
}
