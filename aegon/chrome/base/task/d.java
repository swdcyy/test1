package aegon.chrome.base.task.d;
import java.util.concurrent.Callable;
import java.lang.Object;
import g0.c;
import android.view.Choreographer;

public final class d implements Callable	// class@00017a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object call(){
       return new c(Choreographer.getInstance());
    }
}
