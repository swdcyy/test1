package ar8.f;
import java.lang.Runnable;
import com.th3rdwave.safeareacontext.SafeAreaView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;

public class f implements Runnable	// class@000316
{
    public final AtomicBoolean b;
    public final SafeAreaView c;

    public void f(SafeAreaView p0,AtomicBoolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       f tb = this.b;
       _monitor_enter(tb);
       this.b.set(true);
       this.b.notify();
       _monitor_exit(tb);
    }
}
