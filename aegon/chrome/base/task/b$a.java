package aegon.chrome.base.task.b$a;
import java.util.concurrent.Callable;
import aegon.chrome.base.task.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Binder;

public class b$a implements Callable	// class@000174
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public Object call(){
       this.b.e.set(true);
       Object obj = this.b.a();
       Binder.flushPendingCommands();
       this.b.c(obj);
       return obj;
    }
}
