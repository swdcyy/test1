package dnc.a2;
import erd.r;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Throwable;

public final class a2 implements r	// class@002288
{
    public final AtomicInteger b;

    public void a2(AtomicInteger p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       boolean b = (this.b.getAndIncrement() <= 3)? true: false;
       return b;
    }
}
