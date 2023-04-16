package androidx.room.e0$b;
import java.lang.Runnable;
import androidx.room.e0;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

public class e0$b implements Runnable	// class@000958
{
    public final e0 b;

    public void e0$b(e0 p0){
       this.b = p0;
       super();
    }
    public void run(){
       boolean b = this.b.hasActiveObservers();
       if (this.b.f.compareAndSet(false, true) && b) {
          this.b.q().execute(this.b.i);
       }
       return;
    }
}
