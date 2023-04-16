package m02.t1;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import os5.l;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;

public final class t1 implements g	// class@0030e2
{
    public final Runnable b;
    public final g c;

    public void t1(Runnable p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.run();
       this.c.accept(null);
    }
}
