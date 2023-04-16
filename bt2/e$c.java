package bt2.e$c;
import java.lang.Runnable;
import bt2.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e$c implements Runnable	// class@000449
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       b.Z(this.b.a, "delay over");
       e$c tb = this.b;
       tb.g = "";
       tb.i();
       return;
    }
}
