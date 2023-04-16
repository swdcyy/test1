package en2.f;
import erd.a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import m0d.b;

public final class f implements a	// class@002794
{
    public final AtomicReference b;

    public void f(AtomicReference p0){
       this.b = p0;
    }
    public final void run(){
       b uob = this.b.get();
       if (uob != null) {
          uob.cancel();
       }
       return;
    }
}
