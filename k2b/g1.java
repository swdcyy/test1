package k2b.g1;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.n;
import q2b.i;
import java.lang.Object;
import com.yxcorp.gifshow.log.ActivityLifecycleCallbacks;

public final class g1 implements Runnable	// class@001b9c
{
    public final n b;
    public final i c;

    public void g1(n p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g1 tb = this.b;
       tb.h.j(this.c, false);
       tb.s = true;
    }
}
