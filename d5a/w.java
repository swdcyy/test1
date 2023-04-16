package d5a.w;
import java.lang.Runnable;
import d5a.u;
import j1b.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import qrd.l1;

public final class w implements Runnable	// class@001e93
{
    public final u b;
    public final e c;

    public void w(u p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       if (this.b.c != null) {
          return;
       }
       w tc = this.c;
       _monitor_enter(tc);
       Object[] objArray = new Object[0];
       o.C().w("WindowOrientationManager", "start enable", objArray);
       this.c.b();
       Object[] objArray1 = new Object[0];
       o.C().w("WindowOrientationManager", "end enable", objArray1);
       _monitor_exit(tc);
       return;
    }
}
