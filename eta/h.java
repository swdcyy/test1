package eta.h;
import java.lang.Runnable;
import eta.i;
import wq6.f;
import java.lang.Object;
import wq6.c;
import tra.b;
import java.lang.String;
import q87.c;

public final class h implements Runnable	// class@0027e0
{
    public final i b;
    public final f c;

    public void h(i p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tb = this.b;
       this.c.v(tb.f);
       tb.r();
       Object[] objArray = new Object[0];
       b.C().w("HomeTabLifecycleAwareness", "refreshTabNotifyWatcher: ", objArray);
    }
}
