package i8a.f;
import java.lang.Runnable;
import i8a.g;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;

public final class f implements Runnable	// class@0027c5
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       tb.r.set(0);
       tb.j();
    }
}
