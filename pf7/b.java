package pf7.b;
import pf7.c;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import android.os.MessageQueue;
import android.os.Looper;
import pf7.b$a;
import android.os.MessageQueue$IdleHandler;

public final class b implements c	// class@0021b5
{
    public static boolean a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void a(DependencyTask p0){
       a.q(p0, "task");
       if (p0.priority() != Integer.MIN_VALUE || (p0.o().isEmpty() ^ 0x01)) {
          this.b(p0);
       }else {
          Looper.myQueue().addIdleHandler(new b$a(p0));
       }
       return;
    }
    public final void b(DependencyTask p0){
       p0.A(0);
       p0.run();
    }
}
