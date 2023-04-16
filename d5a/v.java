package d5a.v;
import java.lang.Runnable;
import j1b.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import qrd.l1;

public final class v implements Runnable	// class@001e92
{
    public final e b;

    public void v(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       v tb = this.b;
       _monitor_enter(tb);
       Object[] objArray = new Object[0];
       o.C().w("WindowOrientationManager", "start disable", objArray);
       this.b.a();
       Object[] objArray1 = new Object[0];
       o.C().w("WindowOrientationManager", "end disable", objArray1);
       _monitor_exit(tb);
       return;
    }
}
