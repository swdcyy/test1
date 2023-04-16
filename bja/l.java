package bja.l;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Boolean;

public final class l implements g	// class@0003ec
{
    public final Runnable b;

    public void l(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
