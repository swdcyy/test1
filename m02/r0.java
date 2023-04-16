package m02.r0;
import msd.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import qrd.l1;

public final class r0 implements a	// class@0030db
{
    public final Runnable b;

    public void r0(Runnable p0){
       this.b = p0;
    }
    public final Object invoke(){
       this.b.run();
       return l1.a;
    }
}
