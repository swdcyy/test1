package a96.q;
import java.util.TimerTask;
import com.kwai.framework.krn.init.preload.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class q extends TimerTask	// class@000053
{
    public final e b;

    public void q(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.b.j();
       return;
    }
}
