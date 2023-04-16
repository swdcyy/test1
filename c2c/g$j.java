package c2c.g$j;
import erd.a;
import c2c.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class g$j implements a	// class@000508
{
    public final g b;

    public void g$j(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$j.class, "1")) {
          return;
       }
       g t = this.b.t;
       if (t != null) {
          t.dismiss();
       }
       return;
    }
}
