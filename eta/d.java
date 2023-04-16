package eta.d;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;

public final class d implements g	// class@0027dc
{
    public final Runnable b;

    public void d(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
