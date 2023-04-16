package cjd.b;
import erd.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;

public final class b implements a	// class@000330
{
    public final AtomicInteger b;

    public void b(AtomicInteger p0){
       this.b = p0;
    }
    public final void run(){
       this.b.incrementAndGet();
    }
}
