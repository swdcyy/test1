package dta.y0;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;

public final class y0 implements g	// class@002559
{
    public final Runnable b;

    public void y0(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
