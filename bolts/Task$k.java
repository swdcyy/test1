package bolts.Task$k;
import bolts.a;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.g;
import java.lang.Object;
import bolts.Task;
import java.lang.Exception;

public final class Task$k implements a	// class@000b63
{
    public final AtomicBoolean a;
    public final g b;

    public void Task$k(AtomicBoolean p0,g p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object a(Task p0){
       if (this.a.compareAndSet(false, true)) {
          this.b.d(p0);
       }else {
          p0.getError();
       }
       return null;
    }
}
