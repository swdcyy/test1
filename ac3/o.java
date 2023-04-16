package ac3.o;
import java.lang.Runnable;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import msd.a;

public final class o implements Runnable	// class@000072
{
    public final ReconnectLogic b;

    public void o(ReconnectLogic p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       o tb = this.b;
       tb.c = tb.c + 1;
       ReconnectLogic b = tb.b;
       if (b != null) {
          b.dispose();
       }
       tb = this.b;
       tb.b = tb.j.invoke();
       return;
    }
}
